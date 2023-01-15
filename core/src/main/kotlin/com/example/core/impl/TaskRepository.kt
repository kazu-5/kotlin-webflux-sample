package com.example.core.impl

import com.example.core.domain.ITaskRepository
import com.example.core.domain.Task
import com.example.core.domain.TaskId
import com.example.core.domain.TaskName
import com.example.core.shared.exception.ValidationException
import com.sample.jooq.tables.Tasks
import com.sample.jooq.tables.references.TASKS
import org.jooq.DSLContext
import org.springframework.stereotype.Repository

@Repository
class TaskRepository(private val create: DSLContext) : ITaskRepository {

    // https://www.jooq.org/doc/3.16/manual-single-page/#select-clause-asterisk
    override fun findAll(): List<Task>? {
        return create.select().from(TASKS).fetch().map {
            Task(
                TaskId(it.get(TASKS.TASK_ID)!!), TaskName(it.get(TASKS.NAME)!!)
            )
        }
    }

    override fun find(id: TaskId): Task {
        return create.select()
            .from(TASKS)
            .where(Tasks.TASKS.TASK_ID.eq(id.value))
            .firstOrNull()
            ?.let {
                Task(
                    TaskId(it.get(TASKS.TASK_ID)!!), TaskName(it.get(TASKS.NAME)!!)
                )
            } ?: throw ValidationException("存在しないIDです。")
    }

    override fun create(task: Task): Task {
        // https://www.jooq.org/doc/3.16/manual-single-page/#insert-returning
        return create
            .insertInto(TASKS, TASKS.TASK_ID, TASKS.NAME)
            .values(task.id!!.value, task.name.value)
            .returning()
            .fetchOne()?.let {
                Task(
                    TaskId(it.get(TASKS.TASK_ID)!!), TaskName(it.get(TASKS.NAME)!!)
                )
            } ?: throw ValidationException("存在しないIDです。")
    }

    override fun update(task: Task): Task {
        // https://www.jooq.org/doc/3.16/manual-single-page/#update-statement
        return create
            .update(TASKS)
            .set(TASKS.NAME, task.name.value)
            .where(TASKS.TASK_ID.eq(task.id!!.value))
            .returning()
            .fetchOne()?.let {
                Task(
                    TaskId(it.get(TASKS.TASK_ID)!!), TaskName(it.get(TASKS.NAME)!!)
                )
            } ?: throw ValidationException("存在しないIDです。")
    }
}

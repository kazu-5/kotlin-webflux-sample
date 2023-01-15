package com.example.core.impl

import com.example.core.domain.ITaskRepository
import com.example.core.domain.Task
import com.example.core.domain.TaskId
import com.example.core.domain.TaskName
import com.example.core.shared.exception.ValidationException
import com.sample.jooq.tables.Tasks
import com.sample.jooq.tables.references.TASKS
import org.jooq.*
import org.springframework.stereotype.Repository
import java.sql.Timestamp

@Repository
class TaskRepository(private val ctx: DSLContext) : ITaskRepository {

    override fun findAll(): List<Task>? {
        ctx.select().from(TASKS).fetch().map {
            it.get(TASKS.TASK_ID)
        }
//        val result: Result<Record6<Int, String, Int, Int, Timestamp, Timestamp>> = ctx.select(
//            Tasks.TASKS.TASK_ID,
//            Tasks.TASKS.NAME,
//        )
//            .from(Tasks.TASKS)
//            .fetch()
//
//        result?.let{
//            return result.map { r ->
//                r.get(Tasks.TASKS.NAME)
//                Task(TaskId(r.get(Tasks.TASKS.TASK_ID)), TaskName(r.get(Tasks.TASKS.NAME)))
//            }
//        }?: return null
    }

    override fun find(id: TaskId): Task {
        val result: Record6<Int, String, Int, Int, Timestamp, Timestamp>? = ctx.select(
            Tasks.TASKS.TASK_ID,
            Tasks.TASKS.NAME,
        )
            .from(Tasks.TASKS)
            .where(Tasks.TASKS.TASK_ID.eq(id.value))
            .firstOrNull()

        result?.let{
            return Task(TaskId(result.get(Tasks.TASKS.ID)), TaskName(result.get(Tasks.TASKS.NAME)),result.get(Tasks.TASKS.USER_ID),result.get(Tasks.TASKS.GROUP_ID))
        } ?: throw ValidationException("存在しないIDです。")
    }

    override fun save(task: Task): TaskId {
        val record = ctx.newRecord(Tasks.TASKS)
        record.name = task.name.value
        return TaskId(record.id)
    }
}

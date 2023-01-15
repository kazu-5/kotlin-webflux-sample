/*
 * This file is generated by jOOQ.
 */
package com.sample.jooq.keys


import com.sample.jooq.tables.Tasks
import com.sample.jooq.tables.records.TasksRecord

import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal



// -------------------------------------------------------------------------
// UNIQUE and PRIMARY KEY definitions
// -------------------------------------------------------------------------

val TASKS_PKEY: UniqueKey<TasksRecord> = Internal.createUniqueKey(Tasks.TASKS, DSL.name("tasks_pkey"), arrayOf(Tasks.TASKS.TASK_ID), true)

/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.tables


import com.sample.pg_catalog.PgCatalog

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgStatDatabaseConflicts(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, Record>?,
    aliased: Table<Record>?,
    parameters: Array<Field<*>?>?
): TableImpl<Record>(
    alias,
    PgCatalog.PG_CATALOG,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("create view \"pg_stat_database_conflicts\" as  SELECT d.oid AS datid,\n    d.datname,\n    pg_stat_get_db_conflict_tablespace(d.oid) AS confl_tablespace,\n    pg_stat_get_db_conflict_lock(d.oid) AS confl_lock,\n    pg_stat_get_db_conflict_snapshot(d.oid) AS confl_snapshot,\n    pg_stat_get_db_conflict_bufferpin(d.oid) AS confl_bufferpin,\n    pg_stat_get_db_conflict_startup_deadlock(d.oid) AS confl_deadlock\n   FROM pg_database d;")
) {
    companion object {

        /**
         * The reference instance of
         * <code>pg_catalog.pg_stat_database_conflicts</code>
         */
        val PG_STAT_DATABASE_CONFLICTS: PgStatDatabaseConflicts = PgStatDatabaseConflicts()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_stat_database_conflicts.datid</code>.
     */
    val DATID: TableField<Record, Long?> = createField(DSL.name("datid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_database_conflicts.datname</code>.
     */
    val DATNAME: TableField<Record, String?> = createField(DSL.name("datname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_database_conflicts.confl_tablespace</code>.
     */
    val CONFL_TABLESPACE: TableField<Record, Long?> = createField(DSL.name("confl_tablespace"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_database_conflicts.confl_lock</code>.
     */
    val CONFL_LOCK: TableField<Record, Long?> = createField(DSL.name("confl_lock"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_database_conflicts.confl_snapshot</code>.
     */
    val CONFL_SNAPSHOT: TableField<Record, Long?> = createField(DSL.name("confl_snapshot"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_database_conflicts.confl_bufferpin</code>.
     */
    val CONFL_BUFFERPIN: TableField<Record, Long?> = createField(DSL.name("confl_bufferpin"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_database_conflicts.confl_deadlock</code>.
     */
    val CONFL_DEADLOCK: TableField<Record, Long?> = createField(DSL.name("confl_deadlock"), SQLDataType.BIGINT, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_stat_database_conflicts</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_stat_database_conflicts</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_stat_database_conflicts</code> table
     * reference
     */
    constructor(): this(DSL.name("pg_stat_database_conflicts"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PG_STAT_DATABASE_CONFLICTS, null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgStatDatabaseConflicts = PgStatDatabaseConflicts(DSL.name(alias), this)
    override fun `as`(alias: Name): PgStatDatabaseConflicts = PgStatDatabaseConflicts(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgStatDatabaseConflicts = PgStatDatabaseConflicts(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgStatDatabaseConflicts = PgStatDatabaseConflicts(name, null)
}
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
open class PgStatProgressVacuum(
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
    TableOptions.view("create view \"pg_stat_progress_vacuum\" as  SELECT s.pid,\n    s.datid,\n    d.datname,\n    s.relid,\n        CASE s.param1\n            WHEN 0 THEN 'initializing'::text\n            WHEN 1 THEN 'scanning heap'::text\n            WHEN 2 THEN 'vacuuming indexes'::text\n            WHEN 3 THEN 'vacuuming heap'::text\n            WHEN 4 THEN 'cleaning up indexes'::text\n            WHEN 5 THEN 'truncating heap'::text\n            WHEN 6 THEN 'performing final cleanup'::text\n            ELSE NULL::text\n        END AS phase,\n    s.param2 AS heap_blks_total,\n    s.param3 AS heap_blks_scanned,\n    s.param4 AS heap_blks_vacuumed,\n    s.param5 AS index_vacuum_count,\n    s.param6 AS max_dead_tuples,\n    s.param7 AS num_dead_tuples\n   FROM (pg_stat_get_progress_info('VACUUM'::text) s(pid, datid, relid, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20)\n     LEFT JOIN pg_database d ON ((s.datid = d.oid)));")
) {
    companion object {

        /**
         * The reference instance of
         * <code>pg_catalog.pg_stat_progress_vacuum</code>
         */
        val PG_STAT_PROGRESS_VACUUM: PgStatProgressVacuum = PgStatProgressVacuum()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_stat_progress_vacuum.pid</code>.
     */
    val PID: TableField<Record, Int?> = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_progress_vacuum.datid</code>.
     */
    val DATID: TableField<Record, Long?> = createField(DSL.name("datid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_progress_vacuum.datname</code>.
     */
    val DATNAME: TableField<Record, String?> = createField(DSL.name("datname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_progress_vacuum.relid</code>.
     */
    val RELID: TableField<Record, Long?> = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_progress_vacuum.phase</code>.
     */
    val PHASE: TableField<Record, String?> = createField(DSL.name("phase"), SQLDataType.CLOB, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_vacuum.heap_blks_total</code>.
     */
    val HEAP_BLKS_TOTAL: TableField<Record, Long?> = createField(DSL.name("heap_blks_total"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_vacuum.heap_blks_scanned</code>.
     */
    val HEAP_BLKS_SCANNED: TableField<Record, Long?> = createField(DSL.name("heap_blks_scanned"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_vacuum.heap_blks_vacuumed</code>.
     */
    val HEAP_BLKS_VACUUMED: TableField<Record, Long?> = createField(DSL.name("heap_blks_vacuumed"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_vacuum.index_vacuum_count</code>.
     */
    val INDEX_VACUUM_COUNT: TableField<Record, Long?> = createField(DSL.name("index_vacuum_count"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_vacuum.max_dead_tuples</code>.
     */
    val MAX_DEAD_TUPLES: TableField<Record, Long?> = createField(DSL.name("max_dead_tuples"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_vacuum.num_dead_tuples</code>.
     */
    val NUM_DEAD_TUPLES: TableField<Record, Long?> = createField(DSL.name("num_dead_tuples"), SQLDataType.BIGINT, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_stat_progress_vacuum</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_stat_progress_vacuum</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_stat_progress_vacuum</code> table reference
     */
    constructor(): this(DSL.name("pg_stat_progress_vacuum"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PG_STAT_PROGRESS_VACUUM, null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgStatProgressVacuum = PgStatProgressVacuum(DSL.name(alias), this)
    override fun `as`(alias: Name): PgStatProgressVacuum = PgStatProgressVacuum(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgStatProgressVacuum = PgStatProgressVacuum(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgStatProgressVacuum = PgStatProgressVacuum(name, null)
}

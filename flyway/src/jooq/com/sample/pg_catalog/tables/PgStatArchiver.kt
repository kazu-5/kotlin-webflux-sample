/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.tables


import com.sample.pg_catalog.PgCatalog

import java.time.OffsetDateTime

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
open class PgStatArchiver(
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
    TableOptions.view("create view \"pg_stat_archiver\" as  SELECT s.archived_count,\n    s.last_archived_wal,\n    s.last_archived_time,\n    s.failed_count,\n    s.last_failed_wal,\n    s.last_failed_time,\n    s.stats_reset\n   FROM pg_stat_get_archiver() s(archived_count, last_archived_wal, last_archived_time, failed_count, last_failed_wal, last_failed_time, stats_reset);")
) {
    companion object {

        /**
         * The reference instance of <code>pg_catalog.pg_stat_archiver</code>
         */
        val PG_STAT_ARCHIVER: PgStatArchiver = PgStatArchiver()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_stat_archiver.archived_count</code>.
     */
    val ARCHIVED_COUNT: TableField<Record, Long?> = createField(DSL.name("archived_count"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_archiver.last_archived_wal</code>.
     */
    val LAST_ARCHIVED_WAL: TableField<Record, String?> = createField(DSL.name("last_archived_wal"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_archiver.last_archived_time</code>.
     */
    val LAST_ARCHIVED_TIME: TableField<Record, OffsetDateTime?> = createField(DSL.name("last_archived_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>pg_catalog.pg_stat_archiver.failed_count</code>.
     */
    val FAILED_COUNT: TableField<Record, Long?> = createField(DSL.name("failed_count"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_archiver.last_failed_wal</code>.
     */
    val LAST_FAILED_WAL: TableField<Record, String?> = createField(DSL.name("last_failed_wal"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_archiver.last_failed_time</code>.
     */
    val LAST_FAILED_TIME: TableField<Record, OffsetDateTime?> = createField(DSL.name("last_failed_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>pg_catalog.pg_stat_archiver.stats_reset</code>.
     */
    val STATS_RESET: TableField<Record, OffsetDateTime?> = createField(DSL.name("stats_reset"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_stat_archiver</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_stat_archiver</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_stat_archiver</code> table reference
     */
    constructor(): this(DSL.name("pg_stat_archiver"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PG_STAT_ARCHIVER, null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgStatArchiver = PgStatArchiver(DSL.name(alias), this)
    override fun `as`(alias: Name): PgStatArchiver = PgStatArchiver(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgStatArchiver = PgStatArchiver(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgStatArchiver = PgStatArchiver(name, null)
}

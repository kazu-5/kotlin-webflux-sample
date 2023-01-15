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
open class PgStatUserIndexes(
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
    TableOptions.view("create view \"pg_stat_user_indexes\" as  SELECT pg_stat_all_indexes.relid,\n    pg_stat_all_indexes.indexrelid,\n    pg_stat_all_indexes.schemaname,\n    pg_stat_all_indexes.relname,\n    pg_stat_all_indexes.indexrelname,\n    pg_stat_all_indexes.idx_scan,\n    pg_stat_all_indexes.idx_tup_read,\n    pg_stat_all_indexes.idx_tup_fetch\n   FROM pg_stat_all_indexes\n  WHERE ((pg_stat_all_indexes.schemaname <> ALL (ARRAY['pg_catalog'::name, 'information_schema'::name])) AND (pg_stat_all_indexes.schemaname !~ '^pg_toast'::text));")
) {
    companion object {

        /**
         * The reference instance of
         * <code>pg_catalog.pg_stat_user_indexes</code>
         */
        val PG_STAT_USER_INDEXES: PgStatUserIndexes = PgStatUserIndexes()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_stat_user_indexes.relid</code>.
     */
    val RELID: TableField<Record, Long?> = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_user_indexes.indexrelid</code>.
     */
    val INDEXRELID: TableField<Record, Long?> = createField(DSL.name("indexrelid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_user_indexes.schemaname</code>.
     */
    val SCHEMANAME: TableField<Record, String?> = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_user_indexes.relname</code>.
     */
    val RELNAME: TableField<Record, String?> = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_user_indexes.indexrelname</code>.
     */
    val INDEXRELNAME: TableField<Record, String?> = createField(DSL.name("indexrelname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_user_indexes.idx_scan</code>.
     */
    val IDX_SCAN: TableField<Record, Long?> = createField(DSL.name("idx_scan"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_user_indexes.idx_tup_read</code>.
     */
    val IDX_TUP_READ: TableField<Record, Long?> = createField(DSL.name("idx_tup_read"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_user_indexes.idx_tup_fetch</code>.
     */
    val IDX_TUP_FETCH: TableField<Record, Long?> = createField(DSL.name("idx_tup_fetch"), SQLDataType.BIGINT, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_stat_user_indexes</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_stat_user_indexes</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_stat_user_indexes</code> table reference
     */
    constructor(): this(DSL.name("pg_stat_user_indexes"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PG_STAT_USER_INDEXES, null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgStatUserIndexes = PgStatUserIndexes(DSL.name(alias), this)
    override fun `as`(alias: Name): PgStatUserIndexes = PgStatUserIndexes(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgStatUserIndexes = PgStatUserIndexes(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgStatUserIndexes = PgStatUserIndexes(name, null)
}
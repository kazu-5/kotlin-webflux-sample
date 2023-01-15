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
open class PgStatioAllIndexes(
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
    TableOptions.view("create view \"pg_statio_all_indexes\" as  SELECT c.oid AS relid,\n    i.oid AS indexrelid,\n    n.nspname AS schemaname,\n    c.relname,\n    i.relname AS indexrelname,\n    (pg_stat_get_blocks_fetched(i.oid) - pg_stat_get_blocks_hit(i.oid)) AS idx_blks_read,\n    pg_stat_get_blocks_hit(i.oid) AS idx_blks_hit\n   FROM (((pg_class c\n     JOIN pg_index x ON ((c.oid = x.indrelid)))\n     JOIN pg_class i ON ((i.oid = x.indexrelid)))\n     LEFT JOIN pg_namespace n ON ((n.oid = c.relnamespace)))\n  WHERE (c.relkind = ANY (ARRAY['r'::\"char\", 't'::\"char\", 'm'::\"char\"]));")
) {
    companion object {

        /**
         * The reference instance of
         * <code>pg_catalog.pg_statio_all_indexes</code>
         */
        val PG_STATIO_ALL_INDEXES: PgStatioAllIndexes = PgStatioAllIndexes()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_statio_all_indexes.relid</code>.
     */
    val RELID: TableField<Record, Long?> = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_all_indexes.indexrelid</code>.
     */
    val INDEXRELID: TableField<Record, Long?> = createField(DSL.name("indexrelid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_all_indexes.schemaname</code>.
     */
    val SCHEMANAME: TableField<Record, String?> = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_all_indexes.relname</code>.
     */
    val RELNAME: TableField<Record, String?> = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_all_indexes.indexrelname</code>.
     */
    val INDEXRELNAME: TableField<Record, String?> = createField(DSL.name("indexrelname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_all_indexes.idx_blks_read</code>.
     */
    val IDX_BLKS_READ: TableField<Record, Long?> = createField(DSL.name("idx_blks_read"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_all_indexes.idx_blks_hit</code>.
     */
    val IDX_BLKS_HIT: TableField<Record, Long?> = createField(DSL.name("idx_blks_hit"), SQLDataType.BIGINT, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_statio_all_indexes</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_statio_all_indexes</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_statio_all_indexes</code> table reference
     */
    constructor(): this(DSL.name("pg_statio_all_indexes"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PG_STATIO_ALL_INDEXES, null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgStatioAllIndexes = PgStatioAllIndexes(DSL.name(alias), this)
    override fun `as`(alias: Name): PgStatioAllIndexes = PgStatioAllIndexes(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgStatioAllIndexes = PgStatioAllIndexes(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgStatioAllIndexes = PgStatioAllIndexes(name, null)
}
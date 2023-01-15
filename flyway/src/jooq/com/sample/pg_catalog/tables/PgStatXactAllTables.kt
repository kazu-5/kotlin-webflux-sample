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
open class PgStatXactAllTables(
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
    TableOptions.view("create view \"pg_stat_xact_all_tables\" as  SELECT c.oid AS relid,\n    n.nspname AS schemaname,\n    c.relname,\n    pg_stat_get_xact_numscans(c.oid) AS seq_scan,\n    pg_stat_get_xact_tuples_returned(c.oid) AS seq_tup_read,\n    (sum(pg_stat_get_xact_numscans(i.indexrelid)))::bigint AS idx_scan,\n    ((sum(pg_stat_get_xact_tuples_fetched(i.indexrelid)))::bigint + pg_stat_get_xact_tuples_fetched(c.oid)) AS idx_tup_fetch,\n    pg_stat_get_xact_tuples_inserted(c.oid) AS n_tup_ins,\n    pg_stat_get_xact_tuples_updated(c.oid) AS n_tup_upd,\n    pg_stat_get_xact_tuples_deleted(c.oid) AS n_tup_del,\n    pg_stat_get_xact_tuples_hot_updated(c.oid) AS n_tup_hot_upd\n   FROM ((pg_class c\n     LEFT JOIN pg_index i ON ((c.oid = i.indrelid)))\n     LEFT JOIN pg_namespace n ON ((n.oid = c.relnamespace)))\n  WHERE (c.relkind = ANY (ARRAY['r'::\"char\", 't'::\"char\", 'm'::\"char\"]))\n  GROUP BY c.oid, n.nspname, c.relname;")
) {
    companion object {

        /**
         * The reference instance of
         * <code>pg_catalog.pg_stat_xact_all_tables</code>
         */
        val PG_STAT_XACT_ALL_TABLES: PgStatXactAllTables = PgStatXactAllTables()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.relid</code>.
     */
    val RELID: TableField<Record, Long?> = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.schemaname</code>.
     */
    val SCHEMANAME: TableField<Record, String?> = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.relname</code>.
     */
    val RELNAME: TableField<Record, String?> = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.seq_scan</code>.
     */
    val SEQ_SCAN: TableField<Record, Long?> = createField(DSL.name("seq_scan"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.seq_tup_read</code>.
     */
    val SEQ_TUP_READ: TableField<Record, Long?> = createField(DSL.name("seq_tup_read"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.idx_scan</code>.
     */
    val IDX_SCAN: TableField<Record, Long?> = createField(DSL.name("idx_scan"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.idx_tup_fetch</code>.
     */
    val IDX_TUP_FETCH: TableField<Record, Long?> = createField(DSL.name("idx_tup_fetch"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.n_tup_ins</code>.
     */
    val N_TUP_INS: TableField<Record, Long?> = createField(DSL.name("n_tup_ins"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.n_tup_upd</code>.
     */
    val N_TUP_UPD: TableField<Record, Long?> = createField(DSL.name("n_tup_upd"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.n_tup_del</code>.
     */
    val N_TUP_DEL: TableField<Record, Long?> = createField(DSL.name("n_tup_del"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.n_tup_hot_upd</code>.
     */
    val N_TUP_HOT_UPD: TableField<Record, Long?> = createField(DSL.name("n_tup_hot_upd"), SQLDataType.BIGINT, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_stat_xact_all_tables</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_stat_xact_all_tables</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_stat_xact_all_tables</code> table reference
     */
    constructor(): this(DSL.name("pg_stat_xact_all_tables"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PG_STAT_XACT_ALL_TABLES, null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgStatXactAllTables = PgStatXactAllTables(DSL.name(alias), this)
    override fun `as`(alias: Name): PgStatXactAllTables = PgStatXactAllTables(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgStatXactAllTables = PgStatXactAllTables(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgStatXactAllTables = PgStatXactAllTables(name, null)
}

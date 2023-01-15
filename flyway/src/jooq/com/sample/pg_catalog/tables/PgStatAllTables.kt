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
open class PgStatAllTables(
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
    TableOptions.view("create view \"pg_stat_all_tables\" as  SELECT c.oid AS relid,\n    n.nspname AS schemaname,\n    c.relname,\n    pg_stat_get_numscans(c.oid) AS seq_scan,\n    pg_stat_get_tuples_returned(c.oid) AS seq_tup_read,\n    (sum(pg_stat_get_numscans(i.indexrelid)))::bigint AS idx_scan,\n    ((sum(pg_stat_get_tuples_fetched(i.indexrelid)))::bigint + pg_stat_get_tuples_fetched(c.oid)) AS idx_tup_fetch,\n    pg_stat_get_tuples_inserted(c.oid) AS n_tup_ins,\n    pg_stat_get_tuples_updated(c.oid) AS n_tup_upd,\n    pg_stat_get_tuples_deleted(c.oid) AS n_tup_del,\n    pg_stat_get_tuples_hot_updated(c.oid) AS n_tup_hot_upd,\n    pg_stat_get_live_tuples(c.oid) AS n_live_tup,\n    pg_stat_get_dead_tuples(c.oid) AS n_dead_tup,\n    pg_stat_get_mod_since_analyze(c.oid) AS n_mod_since_analyze,\n    pg_stat_get_ins_since_vacuum(c.oid) AS n_ins_since_vacuum,\n    pg_stat_get_last_vacuum_time(c.oid) AS last_vacuum,\n    pg_stat_get_last_autovacuum_time(c.oid) AS last_autovacuum,\n    pg_stat_get_last_analyze_time(c.oid) AS last_analyze,\n    pg_stat_get_last_autoanalyze_time(c.oid) AS last_autoanalyze,\n    pg_stat_get_vacuum_count(c.oid) AS vacuum_count,\n    pg_stat_get_autovacuum_count(c.oid) AS autovacuum_count,\n    pg_stat_get_analyze_count(c.oid) AS analyze_count,\n    pg_stat_get_autoanalyze_count(c.oid) AS autoanalyze_count\n   FROM ((pg_class c\n     LEFT JOIN pg_index i ON ((c.oid = i.indrelid)))\n     LEFT JOIN pg_namespace n ON ((n.oid = c.relnamespace)))\n  WHERE (c.relkind = ANY (ARRAY['r'::\"char\", 't'::\"char\", 'm'::\"char\"]))\n  GROUP BY c.oid, n.nspname, c.relname;")
) {
    companion object {

        /**
         * The reference instance of <code>pg_catalog.pg_stat_all_tables</code>
         */
        val PG_STAT_ALL_TABLES: PgStatAllTables = PgStatAllTables()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.relid</code>.
     */
    val RELID: TableField<Record, Long?> = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.schemaname</code>.
     */
    val SCHEMANAME: TableField<Record, String?> = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.relname</code>.
     */
    val RELNAME: TableField<Record, String?> = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.seq_scan</code>.
     */
    val SEQ_SCAN: TableField<Record, Long?> = createField(DSL.name("seq_scan"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.seq_tup_read</code>.
     */
    val SEQ_TUP_READ: TableField<Record, Long?> = createField(DSL.name("seq_tup_read"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.idx_scan</code>.
     */
    val IDX_SCAN: TableField<Record, Long?> = createField(DSL.name("idx_scan"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.idx_tup_fetch</code>.
     */
    val IDX_TUP_FETCH: TableField<Record, Long?> = createField(DSL.name("idx_tup_fetch"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.n_tup_ins</code>.
     */
    val N_TUP_INS: TableField<Record, Long?> = createField(DSL.name("n_tup_ins"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.n_tup_upd</code>.
     */
    val N_TUP_UPD: TableField<Record, Long?> = createField(DSL.name("n_tup_upd"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.n_tup_del</code>.
     */
    val N_TUP_DEL: TableField<Record, Long?> = createField(DSL.name("n_tup_del"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.n_tup_hot_upd</code>.
     */
    val N_TUP_HOT_UPD: TableField<Record, Long?> = createField(DSL.name("n_tup_hot_upd"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.n_live_tup</code>.
     */
    val N_LIVE_TUP: TableField<Record, Long?> = createField(DSL.name("n_live_tup"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.n_dead_tup</code>.
     */
    val N_DEAD_TUP: TableField<Record, Long?> = createField(DSL.name("n_dead_tup"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_all_tables.n_mod_since_analyze</code>.
     */
    val N_MOD_SINCE_ANALYZE: TableField<Record, Long?> = createField(DSL.name("n_mod_since_analyze"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.n_ins_since_vacuum</code>.
     */
    val N_INS_SINCE_VACUUM: TableField<Record, Long?> = createField(DSL.name("n_ins_since_vacuum"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.last_vacuum</code>.
     */
    val LAST_VACUUM: TableField<Record, OffsetDateTime?> = createField(DSL.name("last_vacuum"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.last_autovacuum</code>.
     */
    val LAST_AUTOVACUUM: TableField<Record, OffsetDateTime?> = createField(DSL.name("last_autovacuum"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.last_analyze</code>.
     */
    val LAST_ANALYZE: TableField<Record, OffsetDateTime?> = createField(DSL.name("last_analyze"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.last_autoanalyze</code>.
     */
    val LAST_AUTOANALYZE: TableField<Record, OffsetDateTime?> = createField(DSL.name("last_autoanalyze"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.vacuum_count</code>.
     */
    val VACUUM_COUNT: TableField<Record, Long?> = createField(DSL.name("vacuum_count"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.autovacuum_count</code>.
     */
    val AUTOVACUUM_COUNT: TableField<Record, Long?> = createField(DSL.name("autovacuum_count"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.analyze_count</code>.
     */
    val ANALYZE_COUNT: TableField<Record, Long?> = createField(DSL.name("analyze_count"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.autoanalyze_count</code>.
     */
    val AUTOANALYZE_COUNT: TableField<Record, Long?> = createField(DSL.name("autoanalyze_count"), SQLDataType.BIGINT, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_stat_all_tables</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_stat_all_tables</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_stat_all_tables</code> table reference
     */
    constructor(): this(DSL.name("pg_stat_all_tables"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PG_STAT_ALL_TABLES, null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgStatAllTables = PgStatAllTables(DSL.name(alias), this)
    override fun `as`(alias: Name): PgStatAllTables = PgStatAllTables(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgStatAllTables = PgStatAllTables(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgStatAllTables = PgStatAllTables(name, null)
}

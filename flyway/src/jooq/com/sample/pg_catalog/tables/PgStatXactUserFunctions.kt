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
open class PgStatXactUserFunctions(
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
    TableOptions.view("create view \"pg_stat_xact_user_functions\" as  SELECT p.oid AS funcid,\n    n.nspname AS schemaname,\n    p.proname AS funcname,\n    pg_stat_get_xact_function_calls(p.oid) AS calls,\n    pg_stat_get_xact_function_total_time(p.oid) AS total_time,\n    pg_stat_get_xact_function_self_time(p.oid) AS self_time\n   FROM (pg_proc p\n     LEFT JOIN pg_namespace n ON ((n.oid = p.pronamespace)))\n  WHERE ((p.prolang <> (12)::oid) AND (pg_stat_get_xact_function_calls(p.oid) IS NOT NULL));")
) {
    companion object {

        /**
         * The reference instance of
         * <code>pg_catalog.pg_stat_xact_user_functions</code>
         */
        val PG_STAT_XACT_USER_FUNCTIONS: PgStatXactUserFunctions = PgStatXactUserFunctions()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_functions.funcid</code>.
     */
    val FUNCID: TableField<Record, Long?> = createField(DSL.name("funcid"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_xact_user_functions.schemaname</code>.
     */
    val SCHEMANAME: TableField<Record, String?> = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_functions.funcname</code>.
     */
    val FUNCNAME: TableField<Record, String?> = createField(DSL.name("funcname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_functions.calls</code>.
     */
    val CALLS: TableField<Record, Long?> = createField(DSL.name("calls"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_xact_user_functions.total_time</code>.
     */
    val TOTAL_TIME: TableField<Record, Double?> = createField(DSL.name("total_time"), SQLDataType.DOUBLE, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_functions.self_time</code>.
     */
    val SELF_TIME: TableField<Record, Double?> = createField(DSL.name("self_time"), SQLDataType.DOUBLE, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_stat_xact_user_functions</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_stat_xact_user_functions</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_stat_xact_user_functions</code> table
     * reference
     */
    constructor(): this(DSL.name("pg_stat_xact_user_functions"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PG_STAT_XACT_USER_FUNCTIONS, null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgStatXactUserFunctions = PgStatXactUserFunctions(DSL.name(alias), this)
    override fun `as`(alias: Name): PgStatXactUserFunctions = PgStatXactUserFunctions(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgStatXactUserFunctions = PgStatXactUserFunctions(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgStatXactUserFunctions = PgStatXactUserFunctions(name, null)
}

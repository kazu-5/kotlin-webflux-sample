/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.tables


import com.sample.pg_catalog.PgCatalog

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.JSONB
import org.jooq.Name
import org.jooq.Record
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class JsonbPathQueryTz(
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
    TableOptions.function()
) {
    companion object {

        /**
         * The reference instance of <code>pg_catalog.jsonb_path_query_tz</code>
         */
        val JSONB_PATH_QUERY_TZ: JsonbPathQueryTz = JsonbPathQueryTz()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column
     * <code>pg_catalog.jsonb_path_query_tz.jsonb_path_query_tz</code>.
     */
    val JSONB_PATH_QUERY_TZ_: TableField<Record, JSONB?> = createField(DSL.name("jsonb_path_query_tz"), SQLDataType.JSONB, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, arrayOf(
        DSL.value(null, SQLDataType.JSONB),
        DSL.value(null, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"jsonpath\"")),
        DSL.value(null, SQLDataType.JSONB.defaultValue(DSL.field("'{}'::jsonb", SQLDataType.JSONB))),
        DSL.value(null, SQLDataType.BOOLEAN.defaultValue(DSL.field("false", SQLDataType.BOOLEAN)))
    ))
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.jsonb_path_query_tz</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.jsonb_path_query_tz</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.jsonb_path_query_tz</code> table reference
     */
    constructor(): this(DSL.name("jsonb_path_query_tz"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): JsonbPathQueryTz = JsonbPathQueryTz(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): JsonbPathQueryTz = JsonbPathQueryTz(alias, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): JsonbPathQueryTz = JsonbPathQueryTz(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): JsonbPathQueryTz = JsonbPathQueryTz(name, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(
          target: JSONB?
        , path: Any?
        , vars: JSONB?
        , silent: Boolean?
    ): JsonbPathQueryTz = JsonbPathQueryTz(DSL.name("jsonb_path_query_tz"), null, arrayOf(
        DSL.value(target, SQLDataType.JSONB),
        DSL.value(path, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"jsonpath\"")),
        DSL.value(vars, SQLDataType.JSONB.defaultValue(DSL.field("'{}'::jsonb", SQLDataType.JSONB))),
        DSL.value(silent, SQLDataType.BOOLEAN.defaultValue(DSL.field("false", SQLDataType.BOOLEAN)))
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          target: Field<JSONB?>
        , path: Field<Any?>
        , vars: Field<JSONB?>
        , silent: Field<Boolean?>
    ): JsonbPathQueryTz = JsonbPathQueryTz(DSL.name("jsonb_path_query_tz"), null, arrayOf(
        target,
        path,
        vars,
        silent
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}

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
open class JsonbEach(
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
         * The reference instance of <code>pg_catalog.jsonb_each</code>
         */
        val JSONB_EACH: JsonbEach = JsonbEach()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.jsonb_each.key</code>.
     */
    val KEY: TableField<Record, String?> = createField(DSL.name("key"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.jsonb_each.value</code>.
     */
    val VALUE: TableField<Record, JSONB?> = createField(DSL.name("value"), SQLDataType.JSONB, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, arrayOf(
        DSL.value(null, SQLDataType.JSONB)
    ))
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.jsonb_each</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.jsonb_each</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.jsonb_each</code> table reference
     */
    constructor(): this(DSL.name("jsonb_each"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): JsonbEach = JsonbEach(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): JsonbEach = JsonbEach(alias, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): JsonbEach = JsonbEach(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): JsonbEach = JsonbEach(name, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(
          fromJson: JSONB?
    ): JsonbEach = JsonbEach(DSL.name("jsonb_each"), null, arrayOf(
        DSL.value(fromJson, SQLDataType.JSONB)
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          fromJson: Field<JSONB?>
    ): JsonbEach = JsonbEach(DSL.name("jsonb_each"), null, arrayOf(
        fromJson
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}

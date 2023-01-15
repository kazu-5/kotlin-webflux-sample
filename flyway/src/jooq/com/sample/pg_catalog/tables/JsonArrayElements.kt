/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.tables


import com.sample.pg_catalog.PgCatalog

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.JSON
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
open class JsonArrayElements(
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
         * The reference instance of <code>pg_catalog.json_array_elements</code>
         */
        val JSON_ARRAY_ELEMENTS: JsonArrayElements = JsonArrayElements()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.json_array_elements.value</code>.
     */
    val VALUE: TableField<Record, JSON?> = createField(DSL.name("value"), SQLDataType.JSON, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, arrayOf(
        DSL.value(null, SQLDataType.JSON)
    ))
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.json_array_elements</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.json_array_elements</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.json_array_elements</code> table reference
     */
    constructor(): this(DSL.name("json_array_elements"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): JsonArrayElements = JsonArrayElements(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): JsonArrayElements = JsonArrayElements(alias, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): JsonArrayElements = JsonArrayElements(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): JsonArrayElements = JsonArrayElements(name, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(
          fromJson: JSON?
    ): JsonArrayElements = JsonArrayElements(DSL.name("json_array_elements"), null, arrayOf(
        DSL.value(fromJson, SQLDataType.JSON)
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          fromJson: Field<JSON?>
    ): JsonArrayElements = JsonArrayElements(DSL.name("json_array_elements"), null, arrayOf(
        fromJson
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}

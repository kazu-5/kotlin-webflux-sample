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
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Unnest(
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
         * The reference instance of <code>pg_catalog.unnest</code>
         */
        val UNNEST: Unnest = Unnest()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val UNNEST_: TableField<Record, Any?> = createField(DSL.name("unnest"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"anyelement\""), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, arrayOf(
        DSL.value(null, SQLDataType.OTHER.getArrayDataType())
    ))
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.unnest</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.unnest</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.unnest</code> table reference
     */
    constructor(): this(DSL.name("unnest"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): Unnest = Unnest(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): Unnest = Unnest(alias, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): Unnest = Unnest(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Unnest = Unnest(name, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(
          __1: Array<Any?>?
    ): Unnest = Unnest(DSL.name("unnest"), null, arrayOf(
        DSL.value(__1, SQLDataType.OTHER.getArrayDataType())
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          __1: Field<Array<Any?>?>
    ): Unnest = Unnest(DSL.name("unnest"), null, arrayOf(
        __1
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}

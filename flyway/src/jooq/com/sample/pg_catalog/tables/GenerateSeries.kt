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
open class GenerateSeries(
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
         * The reference instance of <code>pg_catalog.generate_series</code>
         */
        val GENERATE_SERIES: GenerateSeries = GenerateSeries()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.generate_series.generate_series</code>.
     */
    val GENERATE_SERIES_: TableField<Record, Int?> = createField(DSL.name("generate_series"), SQLDataType.INTEGER, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, arrayOf(
        DSL.value(null, SQLDataType.INTEGER),
        DSL.value(null, SQLDataType.INTEGER),
        DSL.value(null, SQLDataType.INTEGER)
    ))
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.generate_series</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.generate_series</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.generate_series</code> table reference
     */
    constructor(): this(DSL.name("generate_series"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): GenerateSeries = GenerateSeries(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): GenerateSeries = GenerateSeries(alias, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): GenerateSeries = GenerateSeries(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): GenerateSeries = GenerateSeries(name, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(
          __1: Int?
        , __2: Int?
        , __3: Int?
    ): GenerateSeries = GenerateSeries(DSL.name("generate_series"), null, arrayOf(
        DSL.value(__1, SQLDataType.INTEGER),
        DSL.value(__2, SQLDataType.INTEGER),
        DSL.value(__3, SQLDataType.INTEGER)
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          __1: Field<Int?>
        , __2: Field<Int?>
        , __3: Field<Int?>
    ): GenerateSeries = GenerateSeries(DSL.name("generate_series"), null, arrayOf(
        __1,
        __2,
        __3
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}

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
open class PgOptionsToTable(
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
         * The reference instance of <code>pg_catalog.pg_options_to_table</code>
         */
        val PG_OPTIONS_TO_TABLE: PgOptionsToTable = PgOptionsToTable()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_options_to_table.option_name</code>.
     */
    val OPTION_NAME: TableField<Record, String?> = createField(DSL.name("option_name"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_options_to_table.option_value</code>.
     */
    val OPTION_VALUE: TableField<Record, String?> = createField(DSL.name("option_value"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, arrayOf(
        DSL.value(null, SQLDataType.CLOB.getArrayDataType())
    ))
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_options_to_table</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_options_to_table</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_options_to_table</code> table reference
     */
    constructor(): this(DSL.name("pg_options_to_table"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgOptionsToTable = PgOptionsToTable(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): PgOptionsToTable = PgOptionsToTable(alias, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgOptionsToTable = PgOptionsToTable(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgOptionsToTable = PgOptionsToTable(name, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(
          optionsArray: Array<String?>?
    ): PgOptionsToTable = PgOptionsToTable(DSL.name("pg_options_to_table"), null, arrayOf(
        DSL.value(optionsArray, SQLDataType.CLOB.getArrayDataType())
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          optionsArray: Field<Array<String?>?>
    ): PgOptionsToTable = PgOptionsToTable(DSL.name("pg_options_to_table"), null, arrayOf(
        optionsArray
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}
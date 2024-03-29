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
open class RegexpSplitToTable(
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
         * The reference instance of
         * <code>pg_catalog.regexp_split_to_table</code>
         */
        val REGEXP_SPLIT_TO_TABLE: RegexpSplitToTable = RegexpSplitToTable()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column
     * <code>pg_catalog.regexp_split_to_table.regexp_split_to_table</code>.
     */
    val REGEXP_SPLIT_TO_TABLE_: TableField<Record, String?> = createField(DSL.name("regexp_split_to_table"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, arrayOf(
        DSL.value(null, SQLDataType.CLOB),
        DSL.value(null, SQLDataType.CLOB)
    ))
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.regexp_split_to_table</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.regexp_split_to_table</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.regexp_split_to_table</code> table reference
     */
    constructor(): this(DSL.name("regexp_split_to_table"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): RegexpSplitToTable = RegexpSplitToTable(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): RegexpSplitToTable = RegexpSplitToTable(alias, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): RegexpSplitToTable = RegexpSplitToTable(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): RegexpSplitToTable = RegexpSplitToTable(name, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(
          __1: String?
        , __2: String?
    ): RegexpSplitToTable = RegexpSplitToTable(DSL.name("regexp_split_to_table"), null, arrayOf(
        DSL.value(__1, SQLDataType.CLOB),
        DSL.value(__2, SQLDataType.CLOB)
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          __1: Field<String?>
        , __2: Field<String?>
    ): RegexpSplitToTable = RegexpSplitToTable(DSL.name("regexp_split_to_table"), null, arrayOf(
        __1,
        __2
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}

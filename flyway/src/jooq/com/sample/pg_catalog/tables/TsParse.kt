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
open class TsParse(
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
         * The reference instance of <code>pg_catalog.ts_parse</code>
         */
        val TS_PARSE: TsParse = TsParse()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.ts_parse.tokid</code>.
     */
    val TOKID: TableField<Record, Int?> = createField(DSL.name("tokid"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>pg_catalog.ts_parse.token</code>.
     */
    val TOKEN: TableField<Record, String?> = createField(DSL.name("token"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, arrayOf(
        DSL.value(null, SQLDataType.CLOB),
        DSL.value(null, SQLDataType.CLOB)
    ))
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.ts_parse</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.ts_parse</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.ts_parse</code> table reference
     */
    constructor(): this(DSL.name("ts_parse"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): TsParse = TsParse(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): TsParse = TsParse(alias, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): TsParse = TsParse(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): TsParse = TsParse(name, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(
          parserName: String?
        , txt: String?
    ): TsParse = TsParse(DSL.name("ts_parse"), null, arrayOf(
        DSL.value(parserName, SQLDataType.CLOB),
        DSL.value(txt, SQLDataType.CLOB)
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          parserName: Field<String?>
        , txt: Field<String?>
    ): TsParse = TsParse(DSL.name("ts_parse"), null, arrayOf(
        parserName,
        txt
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}

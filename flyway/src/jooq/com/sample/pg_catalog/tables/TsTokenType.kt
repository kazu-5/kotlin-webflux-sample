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
open class TsTokenType(
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
         * The reference instance of <code>pg_catalog.ts_token_type</code>
         */
        val TS_TOKEN_TYPE: TsTokenType = TsTokenType()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.ts_token_type.tokid</code>.
     */
    val TOKID: TableField<Record, Int?> = createField(DSL.name("tokid"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>pg_catalog.ts_token_type.alias</code>.
     */
    val ALIAS: TableField<Record, String?> = createField(DSL.name("alias"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.ts_token_type.description</code>.
     */
    val DESCRIPTION: TableField<Record, String?> = createField(DSL.name("description"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, arrayOf(
        DSL.value(null, SQLDataType.CLOB)
    ))
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.ts_token_type</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.ts_token_type</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.ts_token_type</code> table reference
     */
    constructor(): this(DSL.name("ts_token_type"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): TsTokenType = TsTokenType(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): TsTokenType = TsTokenType(alias, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): TsTokenType = TsTokenType(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): TsTokenType = TsTokenType(name, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(
          parserName: String?
    ): TsTokenType = TsTokenType(DSL.name("ts_token_type"), null, arrayOf(
        DSL.value(parserName, SQLDataType.CLOB)
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          parserName: Field<String?>
    ): TsTokenType = TsTokenType(DSL.name("ts_token_type"), null, arrayOf(
        parserName
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}
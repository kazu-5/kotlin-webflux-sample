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
open class PgGetKeywords(
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
         * The reference instance of <code>pg_catalog.pg_get_keywords</code>
         */
        val PG_GET_KEYWORDS: PgGetKeywords = PgGetKeywords()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_get_keywords.word</code>.
     */
    val WORD: TableField<Record, String?> = createField(DSL.name("word"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_get_keywords.catcode</code>.
     */
    val CATCODE: TableField<Record, String?> = createField(DSL.name("catcode"), SQLDataType.CHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_get_keywords.catdesc</code>.
     */
    val CATDESC: TableField<Record, String?> = createField(DSL.name("catdesc"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, arrayOf(
    ))
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_get_keywords</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_get_keywords</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_get_keywords</code> table reference
     */
    constructor(): this(DSL.name("pg_get_keywords"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgGetKeywords = PgGetKeywords(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): PgGetKeywords = PgGetKeywords(alias, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgGetKeywords = PgGetKeywords(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgGetKeywords = PgGetKeywords(name, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(): PgGetKeywords = PgGetKeywords(DSL.name("pg_get_keywords"), null, arrayOf()).let { if (aliased()) it.`as`(unqualifiedName) else it }
}

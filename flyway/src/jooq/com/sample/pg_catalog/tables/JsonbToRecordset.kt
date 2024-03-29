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
open class JsonbToRecordset(
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
         * The reference instance of <code>pg_catalog.jsonb_to_recordset</code>
         */
        val JSONB_TO_RECORDSET: JsonbToRecordset = JsonbToRecordset()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.jsonb_to_recordset.jsonb_to_recordset</code>.
     */
    val JSONB_TO_RECORDSET_: TableField<Record, Record?> = createField(DSL.name("jsonb_to_recordset"), SQLDataType.RECORD, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, arrayOf(
        DSL.value(null, SQLDataType.JSONB)
    ))
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.jsonb_to_recordset</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.jsonb_to_recordset</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.jsonb_to_recordset</code> table reference
     */
    constructor(): this(DSL.name("jsonb_to_recordset"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): JsonbToRecordset = JsonbToRecordset(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): JsonbToRecordset = JsonbToRecordset(alias, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): JsonbToRecordset = JsonbToRecordset(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): JsonbToRecordset = JsonbToRecordset(name, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(
          __1: JSONB?
    ): JsonbToRecordset = JsonbToRecordset(DSL.name("jsonb_to_recordset"), null, arrayOf(
        DSL.value(__1, SQLDataType.JSONB)
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          __1: Field<JSONB?>
    ): JsonbToRecordset = JsonbToRecordset(DSL.name("jsonb_to_recordset"), null, arrayOf(
        __1
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}

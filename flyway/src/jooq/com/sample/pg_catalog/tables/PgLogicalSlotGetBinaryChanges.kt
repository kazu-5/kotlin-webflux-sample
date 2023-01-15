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
open class PgLogicalSlotGetBinaryChanges(
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
         * <code>pg_catalog.pg_logical_slot_get_binary_changes</code>
         */
        val PG_LOGICAL_SLOT_GET_BINARY_CHANGES: PgLogicalSlotGetBinaryChanges = PgLogicalSlotGetBinaryChanges()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val LSN: TableField<Record, Any?> = createField(DSL.name("lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "")

    /**
     * The column
     * <code>pg_catalog.pg_logical_slot_get_binary_changes.xid</code>.
     */
    val XID: TableField<Record, Long?> = createField(DSL.name("xid"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_logical_slot_get_binary_changes.data</code>.
     */
    val DATA: TableField<Record, ByteArray?> = createField(DSL.name("data"), SQLDataType.BLOB, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, arrayOf(
        DSL.value(null, SQLDataType.VARCHAR),
        DSL.value(null, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\"")),
        DSL.value(null, SQLDataType.INTEGER),
        DSL.value(null, SQLDataType.CLOB.getArrayDataType())
    ))
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased
     * <code>pg_catalog.pg_logical_slot_get_binary_changes</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>pg_catalog.pg_logical_slot_get_binary_changes</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_logical_slot_get_binary_changes</code> table
     * reference
     */
    constructor(): this(DSL.name("pg_logical_slot_get_binary_changes"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgLogicalSlotGetBinaryChanges = PgLogicalSlotGetBinaryChanges(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): PgLogicalSlotGetBinaryChanges = PgLogicalSlotGetBinaryChanges(alias, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgLogicalSlotGetBinaryChanges = PgLogicalSlotGetBinaryChanges(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgLogicalSlotGetBinaryChanges = PgLogicalSlotGetBinaryChanges(name, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(
          slotName: String?
        , uptoLsn: Any?
        , uptoNchanges: Int?
        , options: Array<String?>?
    ): PgLogicalSlotGetBinaryChanges = PgLogicalSlotGetBinaryChanges(DSL.name("pg_logical_slot_get_binary_changes"), null, arrayOf(
        DSL.value(slotName, SQLDataType.VARCHAR),
        DSL.value(uptoLsn, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\"")),
        DSL.value(uptoNchanges, SQLDataType.INTEGER),
        DSL.value(options, SQLDataType.CLOB.getArrayDataType())
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          slotName: Field<String?>
        , uptoLsn: Field<Any?>
        , uptoNchanges: Field<Int?>
        , options: Field<Array<String?>?>
    ): PgLogicalSlotGetBinaryChanges = PgLogicalSlotGetBinaryChanges(DSL.name("pg_logical_slot_get_binary_changes"), null, arrayOf(
        slotName,
        uptoLsn,
        uptoNchanges,
        options
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}

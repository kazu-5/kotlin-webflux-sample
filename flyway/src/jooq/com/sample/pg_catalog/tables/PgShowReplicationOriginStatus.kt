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
open class PgShowReplicationOriginStatus(
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
         * <code>pg_catalog.pg_show_replication_origin_status</code>
         */
        val PG_SHOW_REPLICATION_ORIGIN_STATUS: PgShowReplicationOriginStatus = PgShowReplicationOriginStatus()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column
     * <code>pg_catalog.pg_show_replication_origin_status.local_id</code>.
     */
    val LOCAL_ID: TableField<Record, Long?> = createField(DSL.name("local_id"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_show_replication_origin_status.external_id</code>.
     */
    val EXTERNAL_ID: TableField<Record, String?> = createField(DSL.name("external_id"), SQLDataType.CLOB, this, "")
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val REMOTE_LSN: TableField<Record, Any?> = createField(DSL.name("remote_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "")
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val LOCAL_LSN: TableField<Record, Any?> = createField(DSL.name("local_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, arrayOf(
    ))
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased
     * <code>pg_catalog.pg_show_replication_origin_status</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>pg_catalog.pg_show_replication_origin_status</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_show_replication_origin_status</code> table
     * reference
     */
    constructor(): this(DSL.name("pg_show_replication_origin_status"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgShowReplicationOriginStatus = PgShowReplicationOriginStatus(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): PgShowReplicationOriginStatus = PgShowReplicationOriginStatus(alias, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgShowReplicationOriginStatus = PgShowReplicationOriginStatus(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgShowReplicationOriginStatus = PgShowReplicationOriginStatus(name, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(): PgShowReplicationOriginStatus = PgShowReplicationOriginStatus(DSL.name("pg_show_replication_origin_status"), null, arrayOf()).let { if (aliased()) it.`as`(unqualifiedName) else it }
}

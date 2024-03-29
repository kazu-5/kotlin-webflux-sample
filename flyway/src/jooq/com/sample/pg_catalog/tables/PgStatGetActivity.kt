/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.tables


import com.sample.pg_catalog.PgCatalog

import java.math.BigDecimal
import java.time.OffsetDateTime

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
open class PgStatGetActivity(
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
         * <code>pg_catalog.pg_stat_get_activity</code>
         */
        val PG_STAT_GET_ACTIVITY: PgStatGetActivity = PgStatGetActivity()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.datid</code>.
     */
    val DATID: TableField<Record, Long?> = createField(DSL.name("datid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.pid</code>.
     */
    val PID: TableField<Record, Int?> = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.usesysid</code>.
     */
    val USESYSID: TableField<Record, Long?> = createField(DSL.name("usesysid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.application_name</code>.
     */
    val APPLICATION_NAME: TableField<Record, String?> = createField(DSL.name("application_name"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.state</code>.
     */
    val STATE: TableField<Record, String?> = createField(DSL.name("state"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.query</code>.
     */
    val QUERY: TableField<Record, String?> = createField(DSL.name("query"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.wait_event_type</code>.
     */
    val WAIT_EVENT_TYPE: TableField<Record, String?> = createField(DSL.name("wait_event_type"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.wait_event</code>.
     */
    val WAIT_EVENT: TableField<Record, String?> = createField(DSL.name("wait_event"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.xact_start</code>.
     */
    val XACT_START: TableField<Record, OffsetDateTime?> = createField(DSL.name("xact_start"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.query_start</code>.
     */
    val QUERY_START: TableField<Record, OffsetDateTime?> = createField(DSL.name("query_start"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.backend_start</code>.
     */
    val BACKEND_START: TableField<Record, OffsetDateTime?> = createField(DSL.name("backend_start"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.state_change</code>.
     */
    val STATE_CHANGE: TableField<Record, OffsetDateTime?> = createField(DSL.name("state_change"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val CLIENT_ADDR: TableField<Record, Any?> = createField(DSL.name("client_addr"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"inet\""), this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.client_hostname</code>.
     */
    val CLIENT_HOSTNAME: TableField<Record, String?> = createField(DSL.name("client_hostname"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.client_port</code>.
     */
    val CLIENT_PORT: TableField<Record, Int?> = createField(DSL.name("client_port"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.backend_xid</code>.
     */
    val BACKEND_XID: TableField<Record, Long?> = createField(DSL.name("backend_xid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.backend_xmin</code>.
     */
    val BACKEND_XMIN: TableField<Record, Long?> = createField(DSL.name("backend_xmin"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.backend_type</code>.
     */
    val BACKEND_TYPE: TableField<Record, String?> = createField(DSL.name("backend_type"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.ssl</code>.
     */
    val SSL: TableField<Record, Boolean?> = createField(DSL.name("ssl"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.sslversion</code>.
     */
    val SSLVERSION: TableField<Record, String?> = createField(DSL.name("sslversion"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.sslcipher</code>.
     */
    val SSLCIPHER: TableField<Record, String?> = createField(DSL.name("sslcipher"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.sslbits</code>.
     */
    val SSLBITS: TableField<Record, Int?> = createField(DSL.name("sslbits"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.sslcompression</code>.
     */
    val SSLCOMPRESSION: TableField<Record, Boolean?> = createField(DSL.name("sslcompression"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.ssl_client_dn</code>.
     */
    val SSL_CLIENT_DN: TableField<Record, String?> = createField(DSL.name("ssl_client_dn"), SQLDataType.CLOB, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_get_activity.ssl_client_serial</code>.
     */
    val SSL_CLIENT_SERIAL: TableField<Record, BigDecimal?> = createField(DSL.name("ssl_client_serial"), SQLDataType.NUMERIC, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.ssl_issuer_dn</code>.
     */
    val SSL_ISSUER_DN: TableField<Record, String?> = createField(DSL.name("ssl_issuer_dn"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.gss_auth</code>.
     */
    val GSS_AUTH: TableField<Record, Boolean?> = createField(DSL.name("gss_auth"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.gss_princ</code>.
     */
    val GSS_PRINC: TableField<Record, String?> = createField(DSL.name("gss_princ"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.gss_enc</code>.
     */
    val GSS_ENC: TableField<Record, Boolean?> = createField(DSL.name("gss_enc"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.leader_pid</code>.
     */
    val LEADER_PID: TableField<Record, Int?> = createField(DSL.name("leader_pid"), SQLDataType.INTEGER, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, arrayOf(
        DSL.value(null, SQLDataType.INTEGER)
    ))
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_stat_get_activity</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_stat_get_activity</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_stat_get_activity</code> table reference
     */
    constructor(): this(DSL.name("pg_stat_get_activity"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgStatGetActivity = PgStatGetActivity(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): PgStatGetActivity = PgStatGetActivity(alias, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgStatGetActivity = PgStatGetActivity(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgStatGetActivity = PgStatGetActivity(name, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(
          pid: Int?
    ): PgStatGetActivity = PgStatGetActivity(DSL.name("pg_stat_get_activity"), null, arrayOf(
        DSL.value(pid, SQLDataType.INTEGER)
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          pid: Field<Int?>
    ): PgStatGetActivity = PgStatGetActivity(DSL.name("pg_stat_get_activity"), null, arrayOf(
        pid
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}

/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.tables


import com.sample.pg_catalog.PgCatalog

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
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgStatActivity(
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
    TableOptions.view("create view \"pg_stat_activity\" as  SELECT s.datid,\n    d.datname,\n    s.pid,\n    s.leader_pid,\n    s.usesysid,\n    u.rolname AS usename,\n    s.application_name,\n    s.client_addr,\n    s.client_hostname,\n    s.client_port,\n    s.backend_start,\n    s.xact_start,\n    s.query_start,\n    s.state_change,\n    s.wait_event_type,\n    s.wait_event,\n    s.state,\n    s.backend_xid,\n    s.backend_xmin,\n    s.query,\n    s.backend_type\n   FROM ((pg_stat_get_activity(NULL::integer) s(datid, pid, usesysid, application_name, state, query, wait_event_type, wait_event, xact_start, query_start, backend_start, state_change, client_addr, client_hostname, client_port, backend_xid, backend_xmin, backend_type, ssl, sslversion, sslcipher, sslbits, sslcompression, ssl_client_dn, ssl_client_serial, ssl_issuer_dn, gss_auth, gss_princ, gss_enc, leader_pid)\n     LEFT JOIN pg_database d ON ((s.datid = d.oid)))\n     LEFT JOIN pg_authid u ON ((s.usesysid = u.oid)));")
) {
    companion object {

        /**
         * The reference instance of <code>pg_catalog.pg_stat_activity</code>
         */
        val PG_STAT_ACTIVITY: PgStatActivity = PgStatActivity()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_stat_activity.datid</code>.
     */
    val DATID: TableField<Record, Long?> = createField(DSL.name("datid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_activity.datname</code>.
     */
    val DATNAME: TableField<Record, String?> = createField(DSL.name("datname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_activity.pid</code>.
     */
    val PID: TableField<Record, Int?> = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_activity.leader_pid</code>.
     */
    val LEADER_PID: TableField<Record, Int?> = createField(DSL.name("leader_pid"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_activity.usesysid</code>.
     */
    val USESYSID: TableField<Record, Long?> = createField(DSL.name("usesysid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_activity.usename</code>.
     */
    val USENAME: TableField<Record, String?> = createField(DSL.name("usename"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_activity.application_name</code>.
     */
    val APPLICATION_NAME: TableField<Record, String?> = createField(DSL.name("application_name"), SQLDataType.CLOB, this, "")
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val CLIENT_ADDR: TableField<Record, Any?> = createField(DSL.name("client_addr"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"inet\""), this, "")

    /**
     * The column <code>pg_catalog.pg_stat_activity.client_hostname</code>.
     */
    val CLIENT_HOSTNAME: TableField<Record, String?> = createField(DSL.name("client_hostname"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_activity.client_port</code>.
     */
    val CLIENT_PORT: TableField<Record, Int?> = createField(DSL.name("client_port"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_activity.backend_start</code>.
     */
    val BACKEND_START: TableField<Record, OffsetDateTime?> = createField(DSL.name("backend_start"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>pg_catalog.pg_stat_activity.xact_start</code>.
     */
    val XACT_START: TableField<Record, OffsetDateTime?> = createField(DSL.name("xact_start"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>pg_catalog.pg_stat_activity.query_start</code>.
     */
    val QUERY_START: TableField<Record, OffsetDateTime?> = createField(DSL.name("query_start"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>pg_catalog.pg_stat_activity.state_change</code>.
     */
    val STATE_CHANGE: TableField<Record, OffsetDateTime?> = createField(DSL.name("state_change"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>pg_catalog.pg_stat_activity.wait_event_type</code>.
     */
    val WAIT_EVENT_TYPE: TableField<Record, String?> = createField(DSL.name("wait_event_type"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_activity.wait_event</code>.
     */
    val WAIT_EVENT: TableField<Record, String?> = createField(DSL.name("wait_event"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_activity.state</code>.
     */
    val STATE: TableField<Record, String?> = createField(DSL.name("state"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_activity.backend_xid</code>.
     */
    val BACKEND_XID: TableField<Record, Long?> = createField(DSL.name("backend_xid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_activity.backend_xmin</code>.
     */
    val BACKEND_XMIN: TableField<Record, Long?> = createField(DSL.name("backend_xmin"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_activity.query</code>.
     */
    val QUERY: TableField<Record, String?> = createField(DSL.name("query"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_activity.backend_type</code>.
     */
    val BACKEND_TYPE: TableField<Record, String?> = createField(DSL.name("backend_type"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_stat_activity</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_stat_activity</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_stat_activity</code> table reference
     */
    constructor(): this(DSL.name("pg_stat_activity"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PG_STAT_ACTIVITY, null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgStatActivity = PgStatActivity(DSL.name(alias), this)
    override fun `as`(alias: Name): PgStatActivity = PgStatActivity(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgStatActivity = PgStatActivity(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgStatActivity = PgStatActivity(name, null)
}

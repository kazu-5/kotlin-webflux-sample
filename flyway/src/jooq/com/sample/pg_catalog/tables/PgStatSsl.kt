/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.tables


import com.sample.pg_catalog.PgCatalog

import java.math.BigDecimal

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
open class PgStatSsl(
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
    TableOptions.view("create view \"pg_stat_ssl\" as  SELECT s.pid,\n    s.ssl,\n    s.sslversion AS version,\n    s.sslcipher AS cipher,\n    s.sslbits AS bits,\n    s.sslcompression AS compression,\n    s.ssl_client_dn AS client_dn,\n    s.ssl_client_serial AS client_serial,\n    s.ssl_issuer_dn AS issuer_dn\n   FROM pg_stat_get_activity(NULL::integer) s(datid, pid, usesysid, application_name, state, query, wait_event_type, wait_event, xact_start, query_start, backend_start, state_change, client_addr, client_hostname, client_port, backend_xid, backend_xmin, backend_type, ssl, sslversion, sslcipher, sslbits, sslcompression, ssl_client_dn, ssl_client_serial, ssl_issuer_dn, gss_auth, gss_princ, gss_enc, leader_pid)\n  WHERE (s.client_port IS NOT NULL);")
) {
    companion object {

        /**
         * The reference instance of <code>pg_catalog.pg_stat_ssl</code>
         */
        val PG_STAT_SSL: PgStatSsl = PgStatSsl()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_stat_ssl.pid</code>.
     */
    val PID: TableField<Record, Int?> = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_ssl.ssl</code>.
     */
    val SSL: TableField<Record, Boolean?> = createField(DSL.name("ssl"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_ssl.version</code>.
     */
    val VERSION: TableField<Record, String?> = createField(DSL.name("version"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_ssl.cipher</code>.
     */
    val CIPHER: TableField<Record, String?> = createField(DSL.name("cipher"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_ssl.bits</code>.
     */
    val BITS: TableField<Record, Int?> = createField(DSL.name("bits"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_ssl.compression</code>.
     */
    val COMPRESSION: TableField<Record, Boolean?> = createField(DSL.name("compression"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_ssl.client_dn</code>.
     */
    val CLIENT_DN: TableField<Record, String?> = createField(DSL.name("client_dn"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_ssl.client_serial</code>.
     */
    val CLIENT_SERIAL: TableField<Record, BigDecimal?> = createField(DSL.name("client_serial"), SQLDataType.NUMERIC, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_ssl.issuer_dn</code>.
     */
    val ISSUER_DN: TableField<Record, String?> = createField(DSL.name("issuer_dn"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_stat_ssl</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_stat_ssl</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_stat_ssl</code> table reference
     */
    constructor(): this(DSL.name("pg_stat_ssl"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PG_STAT_SSL, null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgStatSsl = PgStatSsl(DSL.name(alias), this)
    override fun `as`(alias: Name): PgStatSsl = PgStatSsl(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgStatSsl = PgStatSsl(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgStatSsl = PgStatSsl(name, null)
}

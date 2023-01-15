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
open class PgStatSubscription(
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
    TableOptions.view("create view \"pg_stat_subscription\" as  SELECT su.oid AS subid,\n    su.subname,\n    st.pid,\n    st.relid,\n    st.received_lsn,\n    st.last_msg_send_time,\n    st.last_msg_receipt_time,\n    st.latest_end_lsn,\n    st.latest_end_time\n   FROM (pg_subscription su\n     LEFT JOIN pg_stat_get_subscription(NULL::oid) st(subid, relid, pid, received_lsn, last_msg_send_time, last_msg_receipt_time, latest_end_lsn, latest_end_time) ON ((st.subid = su.oid)));")
) {
    companion object {

        /**
         * The reference instance of
         * <code>pg_catalog.pg_stat_subscription</code>
         */
        val PG_STAT_SUBSCRIPTION: PgStatSubscription = PgStatSubscription()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_stat_subscription.subid</code>.
     */
    val SUBID: TableField<Record, Long?> = createField(DSL.name("subid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_subscription.subname</code>.
     */
    val SUBNAME: TableField<Record, String?> = createField(DSL.name("subname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_subscription.pid</code>.
     */
    val PID: TableField<Record, Int?> = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_subscription.relid</code>.
     */
    val RELID: TableField<Record, Long?> = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "")
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val RECEIVED_LSN: TableField<Record, Any?> = createField(DSL.name("received_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_subscription.last_msg_send_time</code>.
     */
    val LAST_MSG_SEND_TIME: TableField<Record, OffsetDateTime?> = createField(DSL.name("last_msg_send_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_subscription.last_msg_receipt_time</code>.
     */
    val LAST_MSG_RECEIPT_TIME: TableField<Record, OffsetDateTime?> = createField(DSL.name("last_msg_receipt_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val LATEST_END_LSN: TableField<Record, Any?> = createField(DSL.name("latest_end_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "")

    /**
     * The column <code>pg_catalog.pg_stat_subscription.latest_end_time</code>.
     */
    val LATEST_END_TIME: TableField<Record, OffsetDateTime?> = createField(DSL.name("latest_end_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_stat_subscription</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_stat_subscription</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_stat_subscription</code> table reference
     */
    constructor(): this(DSL.name("pg_stat_subscription"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PG_STAT_SUBSCRIPTION, null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgStatSubscription = PgStatSubscription(DSL.name(alias), this)
    override fun `as`(alias: Name): PgStatSubscription = PgStatSubscription(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgStatSubscription = PgStatSubscription(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgStatSubscription = PgStatSubscription(name, null)
}

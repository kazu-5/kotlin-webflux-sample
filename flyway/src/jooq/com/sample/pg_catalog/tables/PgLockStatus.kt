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
open class PgLockStatus(
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
         * The reference instance of <code>pg_catalog.pg_lock_status</code>
         */
        val PG_LOCK_STATUS: PgLockStatus = PgLockStatus()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_lock_status.locktype</code>.
     */
    val LOCKTYPE: TableField<Record, String?> = createField(DSL.name("locktype"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_lock_status.database</code>.
     */
    val DATABASE: TableField<Record, Long?> = createField(DSL.name("database"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_lock_status.relation</code>.
     */
    val RELATION: TableField<Record, Long?> = createField(DSL.name("relation"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_lock_status.page</code>.
     */
    val PAGE: TableField<Record, Int?> = createField(DSL.name("page"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>pg_catalog.pg_lock_status.tuple</code>.
     */
    val TUPLE: TableField<Record, Short?> = createField(DSL.name("tuple"), SQLDataType.SMALLINT, this, "")

    /**
     * The column <code>pg_catalog.pg_lock_status.virtualxid</code>.
     */
    val VIRTUALXID: TableField<Record, String?> = createField(DSL.name("virtualxid"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_lock_status.transactionid</code>.
     */
    val TRANSACTIONID: TableField<Record, Long?> = createField(DSL.name("transactionid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_lock_status.classid</code>.
     */
    val CLASSID: TableField<Record, Long?> = createField(DSL.name("classid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_lock_status.objid</code>.
     */
    val OBJID: TableField<Record, Long?> = createField(DSL.name("objid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_lock_status.objsubid</code>.
     */
    val OBJSUBID: TableField<Record, Short?> = createField(DSL.name("objsubid"), SQLDataType.SMALLINT, this, "")

    /**
     * The column <code>pg_catalog.pg_lock_status.virtualtransaction</code>.
     */
    val VIRTUALTRANSACTION: TableField<Record, String?> = createField(DSL.name("virtualtransaction"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_lock_status.pid</code>.
     */
    val PID: TableField<Record, Int?> = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>pg_catalog.pg_lock_status.mode</code>.
     */
    val MODE: TableField<Record, String?> = createField(DSL.name("mode"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_lock_status.granted</code>.
     */
    val GRANTED: TableField<Record, Boolean?> = createField(DSL.name("granted"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column <code>pg_catalog.pg_lock_status.fastpath</code>.
     */
    val FASTPATH: TableField<Record, Boolean?> = createField(DSL.name("fastpath"), SQLDataType.BOOLEAN, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, arrayOf(
    ))
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_lock_status</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_lock_status</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_lock_status</code> table reference
     */
    constructor(): this(DSL.name("pg_lock_status"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgLockStatus = PgLockStatus(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): PgLockStatus = PgLockStatus(alias, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgLockStatus = PgLockStatus(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgLockStatus = PgLockStatus(name, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(): PgLockStatus = PgLockStatus(DSL.name("pg_lock_status"), null, arrayOf()).let { if (aliased()) it.`as`(unqualifiedName) else it }
}
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
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgLsLogdir(
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
         * The reference instance of <code>pg_catalog.pg_ls_logdir</code>
         */
        val PG_LS_LOGDIR: PgLsLogdir = PgLsLogdir()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_ls_logdir.name</code>.
     */
    val NAME: TableField<Record, String?> = createField(DSL.name("name"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_ls_logdir.size</code>.
     */
    val SIZE: TableField<Record, Long?> = createField(DSL.name("size"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_ls_logdir.modification</code>.
     */
    val MODIFICATION: TableField<Record, OffsetDateTime?> = createField(DSL.name("modification"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, arrayOf(
    ))
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_ls_logdir</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_ls_logdir</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_ls_logdir</code> table reference
     */
    constructor(): this(DSL.name("pg_ls_logdir"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgLsLogdir = PgLsLogdir(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): PgLsLogdir = PgLsLogdir(alias, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgLsLogdir = PgLsLogdir(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgLsLogdir = PgLsLogdir(name, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(): PgLsLogdir = PgLsLogdir(DSL.name("pg_ls_logdir"), null, arrayOf()).let { if (aliased()) it.`as`(unqualifiedName) else it }
}

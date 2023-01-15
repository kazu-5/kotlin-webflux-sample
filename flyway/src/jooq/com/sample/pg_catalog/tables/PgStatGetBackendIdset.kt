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
open class PgStatGetBackendIdset(
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
         * <code>pg_catalog.pg_stat_get_backend_idset</code>
         */
        val PG_STAT_GET_BACKEND_IDSET: PgStatGetBackendIdset = PgStatGetBackendIdset()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column
     * <code>pg_catalog.pg_stat_get_backend_idset.pg_stat_get_backend_idset</code>.
     */
    val PG_STAT_GET_BACKEND_IDSET_: TableField<Record, Int?> = createField(DSL.name("pg_stat_get_backend_idset"), SQLDataType.INTEGER, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, arrayOf(
    ))
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_stat_get_backend_idset</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_stat_get_backend_idset</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_stat_get_backend_idset</code> table
     * reference
     */
    constructor(): this(DSL.name("pg_stat_get_backend_idset"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgStatGetBackendIdset = PgStatGetBackendIdset(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): PgStatGetBackendIdset = PgStatGetBackendIdset(alias, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgStatGetBackendIdset = PgStatGetBackendIdset(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgStatGetBackendIdset = PgStatGetBackendIdset(name, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(): PgStatGetBackendIdset = PgStatGetBackendIdset(DSL.name("pg_stat_get_backend_idset"), null, arrayOf()).let { if (aliased()) it.`as`(unqualifiedName) else it }
}

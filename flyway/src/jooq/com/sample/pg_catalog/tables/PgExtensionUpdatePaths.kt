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
open class PgExtensionUpdatePaths(
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
         * <code>pg_catalog.pg_extension_update_paths</code>
         */
        val PG_EXTENSION_UPDATE_PATHS: PgExtensionUpdatePaths = PgExtensionUpdatePaths()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_extension_update_paths.source</code>.
     */
    val SOURCE: TableField<Record, String?> = createField(DSL.name("source"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_extension_update_paths.target</code>.
     */
    val TARGET: TableField<Record, String?> = createField(DSL.name("target"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_extension_update_paths.path</code>.
     */
    val PATH: TableField<Record, String?> = createField(DSL.name("path"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, arrayOf(
        DSL.value(null, SQLDataType.VARCHAR)
    ))
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_extension_update_paths</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_extension_update_paths</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_extension_update_paths</code> table
     * reference
     */
    constructor(): this(DSL.name("pg_extension_update_paths"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgExtensionUpdatePaths = PgExtensionUpdatePaths(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): PgExtensionUpdatePaths = PgExtensionUpdatePaths(alias, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgExtensionUpdatePaths = PgExtensionUpdatePaths(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgExtensionUpdatePaths = PgExtensionUpdatePaths(name, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(
          name: String?
    ): PgExtensionUpdatePaths = PgExtensionUpdatePaths(DSL.name("pg_extension_update_paths"), null, arrayOf(
        DSL.value(name, SQLDataType.VARCHAR)
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          name: Field<String?>
    ): PgExtensionUpdatePaths = PgExtensionUpdatePaths(DSL.name("pg_extension_update_paths"), null, arrayOf(
        name
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}
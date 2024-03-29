/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.tables


import com.sample.pg_catalog.PgCatalog
import com.sample.pg_catalog.indexes.PG_REPLICATION_ORIGIN_ROIIDENT_INDEX
import com.sample.pg_catalog.indexes.PG_REPLICATION_ORIGIN_RONAME_INDEX

import kotlin.collections.List

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Index
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
open class PgReplicationOrigin(
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
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of
         * <code>pg_catalog.pg_replication_origin</code>
         */
        val PG_REPLICATION_ORIGIN: PgReplicationOrigin = PgReplicationOrigin()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_replication_origin.roident</code>.
     */
    val ROIDENT: TableField<Record, Long?> = createField(DSL.name("roident"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_replication_origin.roname</code>.
     */
    val RONAME: TableField<Record, String?> = createField(DSL.name("roname"), SQLDataType.CLOB.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_replication_origin</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_replication_origin</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_replication_origin</code> table reference
     */
    constructor(): this(DSL.name("pg_replication_origin"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PG_REPLICATION_ORIGIN, null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getIndexes(): List<Index> = listOf(PG_REPLICATION_ORIGIN_ROIIDENT_INDEX, PG_REPLICATION_ORIGIN_RONAME_INDEX)
    override fun `as`(alias: String): PgReplicationOrigin = PgReplicationOrigin(DSL.name(alias), this)
    override fun `as`(alias: Name): PgReplicationOrigin = PgReplicationOrigin(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgReplicationOrigin = PgReplicationOrigin(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgReplicationOrigin = PgReplicationOrigin(name, null)
}

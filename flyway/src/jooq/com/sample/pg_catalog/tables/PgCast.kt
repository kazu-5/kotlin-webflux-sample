/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.tables


import com.sample.pg_catalog.PgCatalog
import com.sample.pg_catalog.indexes.PG_CAST_OID_INDEX
import com.sample.pg_catalog.indexes.PG_CAST_SOURCE_TARGET_INDEX

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
open class PgCast(
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
         * The reference instance of <code>pg_catalog.pg_cast</code>
         */
        val PG_CAST: PgCast = PgCast()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_cast.oid</code>.
     */
    val OID: TableField<Record, Long?> = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_cast.castsource</code>.
     */
    val CASTSOURCE: TableField<Record, Long?> = createField(DSL.name("castsource"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_cast.casttarget</code>.
     */
    val CASTTARGET: TableField<Record, Long?> = createField(DSL.name("casttarget"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_cast.castfunc</code>.
     */
    val CASTFUNC: TableField<Record, Long?> = createField(DSL.name("castfunc"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_cast.castcontext</code>.
     */
    val CASTCONTEXT: TableField<Record, String?> = createField(DSL.name("castcontext"), SQLDataType.CHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_cast.castmethod</code>.
     */
    val CASTMETHOD: TableField<Record, String?> = createField(DSL.name("castmethod"), SQLDataType.CHAR.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_cast</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_cast</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_cast</code> table reference
     */
    constructor(): this(DSL.name("pg_cast"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PG_CAST, null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getIndexes(): List<Index> = listOf(PG_CAST_OID_INDEX, PG_CAST_SOURCE_TARGET_INDEX)
    override fun `as`(alias: String): PgCast = PgCast(DSL.name(alias), this)
    override fun `as`(alias: Name): PgCast = PgCast(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgCast = PgCast(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgCast = PgCast(name, null)
}

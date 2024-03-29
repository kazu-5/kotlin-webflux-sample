/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.tables


import com.sample.pg_catalog.PgCatalog
import com.sample.pg_catalog.indexes.PG_AMOP_FAM_STRAT_INDEX
import com.sample.pg_catalog.indexes.PG_AMOP_OID_INDEX
import com.sample.pg_catalog.indexes.PG_AMOP_OPR_FAM_INDEX

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
open class PgAmop(
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
         * The reference instance of <code>pg_catalog.pg_amop</code>
         */
        val PG_AMOP: PgAmop = PgAmop()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_amop.oid</code>.
     */
    val OID: TableField<Record, Long?> = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_amop.amopfamily</code>.
     */
    val AMOPFAMILY: TableField<Record, Long?> = createField(DSL.name("amopfamily"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_amop.amoplefttype</code>.
     */
    val AMOPLEFTTYPE: TableField<Record, Long?> = createField(DSL.name("amoplefttype"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_amop.amoprighttype</code>.
     */
    val AMOPRIGHTTYPE: TableField<Record, Long?> = createField(DSL.name("amoprighttype"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_amop.amopstrategy</code>.
     */
    val AMOPSTRATEGY: TableField<Record, Short?> = createField(DSL.name("amopstrategy"), SQLDataType.SMALLINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_amop.amoppurpose</code>.
     */
    val AMOPPURPOSE: TableField<Record, String?> = createField(DSL.name("amoppurpose"), SQLDataType.CHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_amop.amopopr</code>.
     */
    val AMOPOPR: TableField<Record, Long?> = createField(DSL.name("amopopr"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_amop.amopmethod</code>.
     */
    val AMOPMETHOD: TableField<Record, Long?> = createField(DSL.name("amopmethod"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_amop.amopsortfamily</code>.
     */
    val AMOPSORTFAMILY: TableField<Record, Long?> = createField(DSL.name("amopsortfamily"), SQLDataType.BIGINT.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_amop</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_amop</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_amop</code> table reference
     */
    constructor(): this(DSL.name("pg_amop"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PG_AMOP, null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getIndexes(): List<Index> = listOf(PG_AMOP_FAM_STRAT_INDEX, PG_AMOP_OID_INDEX, PG_AMOP_OPR_FAM_INDEX)
    override fun `as`(alias: String): PgAmop = PgAmop(DSL.name(alias), this)
    override fun `as`(alias: Name): PgAmop = PgAmop(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgAmop = PgAmop(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgAmop = PgAmop(name, null)
}

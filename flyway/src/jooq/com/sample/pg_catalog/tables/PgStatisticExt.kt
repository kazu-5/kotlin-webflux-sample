/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.tables


import com.sample.pg_catalog.PgCatalog
import com.sample.pg_catalog.indexes.PG_STATISTIC_EXT_NAME_INDEX
import com.sample.pg_catalog.indexes.PG_STATISTIC_EXT_OID_INDEX
import com.sample.pg_catalog.indexes.PG_STATISTIC_EXT_RELID_INDEX

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
open class PgStatisticExt(
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
         * The reference instance of <code>pg_catalog.pg_statistic_ext</code>
         */
        val PG_STATISTIC_EXT: PgStatisticExt = PgStatisticExt()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_statistic_ext.oid</code>.
     */
    val OID: TableField<Record, Long?> = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_statistic_ext.stxrelid</code>.
     */
    val STXRELID: TableField<Record, Long?> = createField(DSL.name("stxrelid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_statistic_ext.stxname</code>.
     */
    val STXNAME: TableField<Record, String?> = createField(DSL.name("stxname"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_statistic_ext.stxnamespace</code>.
     */
    val STXNAMESPACE: TableField<Record, Long?> = createField(DSL.name("stxnamespace"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_statistic_ext.stxowner</code>.
     */
    val STXOWNER: TableField<Record, Long?> = createField(DSL.name("stxowner"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_statistic_ext.stxstattarget</code>.
     */
    val STXSTATTARGET: TableField<Record, Int?> = createField(DSL.name("stxstattarget"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_statistic_ext.stxkeys</code>.
     */
    val STXKEYS: TableField<Record, Array<Any?>?> = createField(DSL.name("stxkeys"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"int2vector\"").getArrayDataType(), this, "")

    /**
     * The column <code>pg_catalog.pg_statistic_ext.stxkind</code>.
     */
    val STXKIND: TableField<Record, Array<String?>?> = createField(DSL.name("stxkind"), SQLDataType.CHAR.getArrayDataType(), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_statistic_ext</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_statistic_ext</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_statistic_ext</code> table reference
     */
    constructor(): this(DSL.name("pg_statistic_ext"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PG_STATISTIC_EXT, null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getIndexes(): List<Index> = listOf(PG_STATISTIC_EXT_NAME_INDEX, PG_STATISTIC_EXT_OID_INDEX, PG_STATISTIC_EXT_RELID_INDEX)
    override fun `as`(alias: String): PgStatisticExt = PgStatisticExt(DSL.name(alias), this)
    override fun `as`(alias: Name): PgStatisticExt = PgStatisticExt(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgStatisticExt = PgStatisticExt(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgStatisticExt = PgStatisticExt(name, null)
}

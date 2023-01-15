/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.tables


import com.sample.pg_catalog.PgCatalog
import com.sample.pg_catalog.indexes.PG_AGGREGATE_FNOID_INDEX

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
open class PgAggregate(
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
         * The reference instance of <code>pg_catalog.pg_aggregate</code>
         */
        val PG_AGGREGATE: PgAggregate = PgAggregate()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_aggregate.aggfnoid</code>.
     */
    val AGGFNOID: TableField<Record, String?> = createField(DSL.name("aggfnoid"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggkind</code>.
     */
    val AGGKIND: TableField<Record, String?> = createField(DSL.name("aggkind"), SQLDataType.CHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggnumdirectargs</code>.
     */
    val AGGNUMDIRECTARGS: TableField<Record, Short?> = createField(DSL.name("aggnumdirectargs"), SQLDataType.SMALLINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggtransfn</code>.
     */
    val AGGTRANSFN: TableField<Record, String?> = createField(DSL.name("aggtransfn"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggfinalfn</code>.
     */
    val AGGFINALFN: TableField<Record, String?> = createField(DSL.name("aggfinalfn"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggcombinefn</code>.
     */
    val AGGCOMBINEFN: TableField<Record, String?> = createField(DSL.name("aggcombinefn"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggserialfn</code>.
     */
    val AGGSERIALFN: TableField<Record, String?> = createField(DSL.name("aggserialfn"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggdeserialfn</code>.
     */
    val AGGDESERIALFN: TableField<Record, String?> = createField(DSL.name("aggdeserialfn"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggmtransfn</code>.
     */
    val AGGMTRANSFN: TableField<Record, String?> = createField(DSL.name("aggmtransfn"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggminvtransfn</code>.
     */
    val AGGMINVTRANSFN: TableField<Record, String?> = createField(DSL.name("aggminvtransfn"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggmfinalfn</code>.
     */
    val AGGMFINALFN: TableField<Record, String?> = createField(DSL.name("aggmfinalfn"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggfinalextra</code>.
     */
    val AGGFINALEXTRA: TableField<Record, Boolean?> = createField(DSL.name("aggfinalextra"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggmfinalextra</code>.
     */
    val AGGMFINALEXTRA: TableField<Record, Boolean?> = createField(DSL.name("aggmfinalextra"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggfinalmodify</code>.
     */
    val AGGFINALMODIFY: TableField<Record, String?> = createField(DSL.name("aggfinalmodify"), SQLDataType.CHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggmfinalmodify</code>.
     */
    val AGGMFINALMODIFY: TableField<Record, String?> = createField(DSL.name("aggmfinalmodify"), SQLDataType.CHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggsortop</code>.
     */
    val AGGSORTOP: TableField<Record, Long?> = createField(DSL.name("aggsortop"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggtranstype</code>.
     */
    val AGGTRANSTYPE: TableField<Record, Long?> = createField(DSL.name("aggtranstype"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggtransspace</code>.
     */
    val AGGTRANSSPACE: TableField<Record, Int?> = createField(DSL.name("aggtransspace"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggmtranstype</code>.
     */
    val AGGMTRANSTYPE: TableField<Record, Long?> = createField(DSL.name("aggmtranstype"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggmtransspace</code>.
     */
    val AGGMTRANSSPACE: TableField<Record, Int?> = createField(DSL.name("aggmtransspace"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.agginitval</code>.
     */
    val AGGINITVAL: TableField<Record, String?> = createField(DSL.name("agginitval"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggminitval</code>.
     */
    val AGGMINITVAL: TableField<Record, String?> = createField(DSL.name("aggminitval"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_aggregate</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_aggregate</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_aggregate</code> table reference
     */
    constructor(): this(DSL.name("pg_aggregate"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PG_AGGREGATE, null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getIndexes(): List<Index> = listOf(PG_AGGREGATE_FNOID_INDEX)
    override fun `as`(alias: String): PgAggregate = PgAggregate(DSL.name(alias), this)
    override fun `as`(alias: Name): PgAggregate = PgAggregate(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgAggregate = PgAggregate(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgAggregate = PgAggregate(name, null)
}
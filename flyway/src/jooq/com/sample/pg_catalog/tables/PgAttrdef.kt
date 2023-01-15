/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.tables


import com.sample.pg_catalog.PgCatalog
import com.sample.pg_catalog.indexes.PG_ATTRDEF_ADRELID_ADNUM_INDEX
import com.sample.pg_catalog.indexes.PG_ATTRDEF_OID_INDEX

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
open class PgAttrdef(
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
         * The reference instance of <code>pg_catalog.pg_attrdef</code>
         */
        val PG_ATTRDEF: PgAttrdef = PgAttrdef()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_attrdef.oid</code>.
     */
    val OID: TableField<Record, Long?> = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_attrdef.adrelid</code>.
     */
    val ADRELID: TableField<Record, Long?> = createField(DSL.name("adrelid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_attrdef.adnum</code>.
     */
    val ADNUM: TableField<Record, Short?> = createField(DSL.name("adnum"), SQLDataType.SMALLINT.nullable(false), this, "")
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val ADBIN: TableField<Record, Any?> = createField(DSL.name("adbin"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\"").nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_attrdef</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_attrdef</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_attrdef</code> table reference
     */
    constructor(): this(DSL.name("pg_attrdef"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PG_ATTRDEF, null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getIndexes(): List<Index> = listOf(PG_ATTRDEF_ADRELID_ADNUM_INDEX, PG_ATTRDEF_OID_INDEX)
    override fun `as`(alias: String): PgAttrdef = PgAttrdef(DSL.name(alias), this)
    override fun `as`(alias: Name): PgAttrdef = PgAttrdef(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgAttrdef = PgAttrdef(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgAttrdef = PgAttrdef(name, null)
}

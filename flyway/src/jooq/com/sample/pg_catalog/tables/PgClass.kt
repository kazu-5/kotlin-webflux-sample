/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.tables


import com.sample.pg_catalog.PgCatalog
import com.sample.pg_catalog.indexes.PG_CLASS_OID_INDEX
import com.sample.pg_catalog.indexes.PG_CLASS_RELNAME_NSP_INDEX
import com.sample.pg_catalog.indexes.PG_CLASS_TBLSPC_RELFILENODE_INDEX

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
open class PgClass(
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
         * The reference instance of <code>pg_catalog.pg_class</code>
         */
        val PG_CLASS: PgClass = PgClass()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_class.oid</code>.
     */
    val OID: TableField<Record, Long?> = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relname</code>.
     */
    val RELNAME: TableField<Record, String?> = createField(DSL.name("relname"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relnamespace</code>.
     */
    val RELNAMESPACE: TableField<Record, Long?> = createField(DSL.name("relnamespace"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.reltype</code>.
     */
    val RELTYPE: TableField<Record, Long?> = createField(DSL.name("reltype"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.reloftype</code>.
     */
    val RELOFTYPE: TableField<Record, Long?> = createField(DSL.name("reloftype"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relowner</code>.
     */
    val RELOWNER: TableField<Record, Long?> = createField(DSL.name("relowner"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relam</code>.
     */
    val RELAM: TableField<Record, Long?> = createField(DSL.name("relam"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relfilenode</code>.
     */
    val RELFILENODE: TableField<Record, Long?> = createField(DSL.name("relfilenode"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.reltablespace</code>.
     */
    val RELTABLESPACE: TableField<Record, Long?> = createField(DSL.name("reltablespace"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relpages</code>.
     */
    val RELPAGES: TableField<Record, Int?> = createField(DSL.name("relpages"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.reltuples</code>.
     */
    val RELTUPLES: TableField<Record, Float?> = createField(DSL.name("reltuples"), SQLDataType.REAL.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relallvisible</code>.
     */
    val RELALLVISIBLE: TableField<Record, Int?> = createField(DSL.name("relallvisible"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.reltoastrelid</code>.
     */
    val RELTOASTRELID: TableField<Record, Long?> = createField(DSL.name("reltoastrelid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relhasindex</code>.
     */
    val RELHASINDEX: TableField<Record, Boolean?> = createField(DSL.name("relhasindex"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relisshared</code>.
     */
    val RELISSHARED: TableField<Record, Boolean?> = createField(DSL.name("relisshared"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relpersistence</code>.
     */
    val RELPERSISTENCE: TableField<Record, String?> = createField(DSL.name("relpersistence"), SQLDataType.CHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relkind</code>.
     */
    val RELKIND: TableField<Record, String?> = createField(DSL.name("relkind"), SQLDataType.CHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relnatts</code>.
     */
    val RELNATTS: TableField<Record, Short?> = createField(DSL.name("relnatts"), SQLDataType.SMALLINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relchecks</code>.
     */
    val RELCHECKS: TableField<Record, Short?> = createField(DSL.name("relchecks"), SQLDataType.SMALLINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relhasrules</code>.
     */
    val RELHASRULES: TableField<Record, Boolean?> = createField(DSL.name("relhasrules"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relhastriggers</code>.
     */
    val RELHASTRIGGERS: TableField<Record, Boolean?> = createField(DSL.name("relhastriggers"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relhassubclass</code>.
     */
    val RELHASSUBCLASS: TableField<Record, Boolean?> = createField(DSL.name("relhassubclass"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relrowsecurity</code>.
     */
    val RELROWSECURITY: TableField<Record, Boolean?> = createField(DSL.name("relrowsecurity"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relforcerowsecurity</code>.
     */
    val RELFORCEROWSECURITY: TableField<Record, Boolean?> = createField(DSL.name("relforcerowsecurity"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relispopulated</code>.
     */
    val RELISPOPULATED: TableField<Record, Boolean?> = createField(DSL.name("relispopulated"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relreplident</code>.
     */
    val RELREPLIDENT: TableField<Record, String?> = createField(DSL.name("relreplident"), SQLDataType.CHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relispartition</code>.
     */
    val RELISPARTITION: TableField<Record, Boolean?> = createField(DSL.name("relispartition"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relrewrite</code>.
     */
    val RELREWRITE: TableField<Record, Long?> = createField(DSL.name("relrewrite"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relfrozenxid</code>.
     */
    val RELFROZENXID: TableField<Record, Long?> = createField(DSL.name("relfrozenxid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relminmxid</code>.
     */
    val RELMINMXID: TableField<Record, Long?> = createField(DSL.name("relminmxid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relacl</code>.
     */
    val RELACL: TableField<Record, Array<String?>?> = createField(DSL.name("relacl"), SQLDataType.VARCHAR.getArrayDataType(), this, "")

    /**
     * The column <code>pg_catalog.pg_class.reloptions</code>.
     */
    val RELOPTIONS: TableField<Record, Array<String?>?> = createField(DSL.name("reloptions"), SQLDataType.CLOB.getArrayDataType(), this, "")
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val RELPARTBOUND: TableField<Record, Any?> = createField(DSL.name("relpartbound"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_class</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_class</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_class</code> table reference
     */
    constructor(): this(DSL.name("pg_class"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PG_CLASS, null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getIndexes(): List<Index> = listOf(PG_CLASS_OID_INDEX, PG_CLASS_RELNAME_NSP_INDEX, PG_CLASS_TBLSPC_RELFILENODE_INDEX)
    override fun `as`(alias: String): PgClass = PgClass(DSL.name(alias), this)
    override fun `as`(alias: Name): PgClass = PgClass(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgClass = PgClass(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgClass = PgClass(name, null)
}

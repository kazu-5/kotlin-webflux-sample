/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.tables


import com.sample.pg_catalog.PgCatalog
import com.sample.pg_catalog.indexes.PG_TRIGGER_OID_INDEX
import com.sample.pg_catalog.indexes.PG_TRIGGER_TGCONSTRAINT_INDEX
import com.sample.pg_catalog.indexes.PG_TRIGGER_TGRELID_TGNAME_INDEX

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
open class PgTrigger(
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
         * The reference instance of <code>pg_catalog.pg_trigger</code>
         */
        val PG_TRIGGER: PgTrigger = PgTrigger()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_trigger.oid</code>.
     */
    val OID: TableField<Record, Long?> = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_trigger.tgrelid</code>.
     */
    val TGRELID: TableField<Record, Long?> = createField(DSL.name("tgrelid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_trigger.tgparentid</code>.
     */
    val TGPARENTID: TableField<Record, Long?> = createField(DSL.name("tgparentid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_trigger.tgname</code>.
     */
    val TGNAME: TableField<Record, String?> = createField(DSL.name("tgname"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_trigger.tgfoid</code>.
     */
    val TGFOID: TableField<Record, Long?> = createField(DSL.name("tgfoid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_trigger.tgtype</code>.
     */
    val TGTYPE: TableField<Record, Short?> = createField(DSL.name("tgtype"), SQLDataType.SMALLINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_trigger.tgenabled</code>.
     */
    val TGENABLED: TableField<Record, String?> = createField(DSL.name("tgenabled"), SQLDataType.CHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_trigger.tgisinternal</code>.
     */
    val TGISINTERNAL: TableField<Record, Boolean?> = createField(DSL.name("tgisinternal"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_trigger.tgconstrrelid</code>.
     */
    val TGCONSTRRELID: TableField<Record, Long?> = createField(DSL.name("tgconstrrelid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_trigger.tgconstrindid</code>.
     */
    val TGCONSTRINDID: TableField<Record, Long?> = createField(DSL.name("tgconstrindid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_trigger.tgconstraint</code>.
     */
    val TGCONSTRAINT: TableField<Record, Long?> = createField(DSL.name("tgconstraint"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_trigger.tgdeferrable</code>.
     */
    val TGDEFERRABLE: TableField<Record, Boolean?> = createField(DSL.name("tgdeferrable"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_trigger.tginitdeferred</code>.
     */
    val TGINITDEFERRED: TableField<Record, Boolean?> = createField(DSL.name("tginitdeferred"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_trigger.tgnargs</code>.
     */
    val TGNARGS: TableField<Record, Short?> = createField(DSL.name("tgnargs"), SQLDataType.SMALLINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_trigger.tgattr</code>.
     */
    val TGATTR: TableField<Record, Array<Any?>?> = createField(DSL.name("tgattr"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"int2vector\"").getArrayDataType(), this, "")

    /**
     * The column <code>pg_catalog.pg_trigger.tgargs</code>.
     */
    val TGARGS: TableField<Record, ByteArray?> = createField(DSL.name("tgargs"), SQLDataType.BLOB.nullable(false), this, "")
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val TGQUAL: TableField<Record, Any?> = createField(DSL.name("tgqual"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "")

    /**
     * The column <code>pg_catalog.pg_trigger.tgoldtable</code>.
     */
    val TGOLDTABLE: TableField<Record, String?> = createField(DSL.name("tgoldtable"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_trigger.tgnewtable</code>.
     */
    val TGNEWTABLE: TableField<Record, String?> = createField(DSL.name("tgnewtable"), SQLDataType.VARCHAR, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_trigger</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_trigger</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_trigger</code> table reference
     */
    constructor(): this(DSL.name("pg_trigger"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PG_TRIGGER, null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getIndexes(): List<Index> = listOf(PG_TRIGGER_OID_INDEX, PG_TRIGGER_TGCONSTRAINT_INDEX, PG_TRIGGER_TGRELID_TGNAME_INDEX)
    override fun `as`(alias: String): PgTrigger = PgTrigger(DSL.name(alias), this)
    override fun `as`(alias: Name): PgTrigger = PgTrigger(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgTrigger = PgTrigger(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgTrigger = PgTrigger(name, null)
}

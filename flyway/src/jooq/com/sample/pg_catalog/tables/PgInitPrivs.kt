/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.tables


import com.sample.pg_catalog.PgCatalog
import com.sample.pg_catalog.indexes.PG_INIT_PRIVS_O_C_O_INDEX

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
open class PgInitPrivs(
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
         * The reference instance of <code>pg_catalog.pg_init_privs</code>
         */
        val PG_INIT_PRIVS: PgInitPrivs = PgInitPrivs()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_init_privs.objoid</code>.
     */
    val OBJOID: TableField<Record, Long?> = createField(DSL.name("objoid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_init_privs.classoid</code>.
     */
    val CLASSOID: TableField<Record, Long?> = createField(DSL.name("classoid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_init_privs.objsubid</code>.
     */
    val OBJSUBID: TableField<Record, Int?> = createField(DSL.name("objsubid"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_init_privs.privtype</code>.
     */
    val PRIVTYPE: TableField<Record, String?> = createField(DSL.name("privtype"), SQLDataType.CHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_init_privs.initprivs</code>.
     */
    val INITPRIVS: TableField<Record, Array<String?>?> = createField(DSL.name("initprivs"), SQLDataType.VARCHAR.getArrayDataType(), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_init_privs</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_init_privs</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_init_privs</code> table reference
     */
    constructor(): this(DSL.name("pg_init_privs"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PG_INIT_PRIVS, null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getIndexes(): List<Index> = listOf(PG_INIT_PRIVS_O_C_O_INDEX)
    override fun `as`(alias: String): PgInitPrivs = PgInitPrivs(DSL.name(alias), this)
    override fun `as`(alias: Name): PgInitPrivs = PgInitPrivs(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgInitPrivs = PgInitPrivs(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgInitPrivs = PgInitPrivs(name, null)
}

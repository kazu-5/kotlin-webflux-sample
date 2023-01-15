/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.tables


import com.sample.pg_catalog.PgCatalog
import com.sample.pg_catalog.indexes.PG_AUTH_MEMBERS_MEMBER_ROLE_INDEX
import com.sample.pg_catalog.indexes.PG_AUTH_MEMBERS_ROLE_MEMBER_INDEX

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
open class PgAuthMembers(
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
         * The reference instance of <code>pg_catalog.pg_auth_members</code>
         */
        val PG_AUTH_MEMBERS: PgAuthMembers = PgAuthMembers()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_auth_members.roleid</code>.
     */
    val ROLEID: TableField<Record, Long?> = createField(DSL.name("roleid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_auth_members.member</code>.
     */
    val MEMBER: TableField<Record, Long?> = createField(DSL.name("member"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_auth_members.grantor</code>.
     */
    val GRANTOR: TableField<Record, Long?> = createField(DSL.name("grantor"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_auth_members.admin_option</code>.
     */
    val ADMIN_OPTION: TableField<Record, Boolean?> = createField(DSL.name("admin_option"), SQLDataType.BOOLEAN.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_auth_members</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_auth_members</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_auth_members</code> table reference
     */
    constructor(): this(DSL.name("pg_auth_members"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PG_AUTH_MEMBERS, null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getIndexes(): List<Index> = listOf(PG_AUTH_MEMBERS_MEMBER_ROLE_INDEX, PG_AUTH_MEMBERS_ROLE_MEMBER_INDEX)
    override fun `as`(alias: String): PgAuthMembers = PgAuthMembers(DSL.name(alias), this)
    override fun `as`(alias: Name): PgAuthMembers = PgAuthMembers(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgAuthMembers = PgAuthMembers(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgAuthMembers = PgAuthMembers(name, null)
}
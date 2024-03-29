/*
 * This file is generated by jOOQ.
 */
package com.sample.information_schema.tables


import com.sample.information_schema.InformationSchema

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ForeignServers(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, Record>?,
    aliased: Table<Record>?,
    parameters: Array<Field<*>?>?
): TableImpl<Record>(
    alias,
    InformationSchema.INFORMATION_SCHEMA,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("create view \"foreign_servers\" as  SELECT _pg_foreign_servers.foreign_server_catalog,\n    _pg_foreign_servers.foreign_server_name,\n    _pg_foreign_servers.foreign_data_wrapper_catalog,\n    _pg_foreign_servers.foreign_data_wrapper_name,\n    _pg_foreign_servers.foreign_server_type,\n    _pg_foreign_servers.foreign_server_version,\n    _pg_foreign_servers.authorization_identifier\n   FROM information_schema._pg_foreign_servers;")
) {
    companion object {

        /**
         * The reference instance of
         * <code>information_schema.foreign_servers</code>
         */
        val FOREIGN_SERVERS: ForeignServers = ForeignServers()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column
     * <code>information_schema.foreign_servers.foreign_server_catalog</code>.
     */
    val FOREIGN_SERVER_CATALOG: TableField<Record, String?> = createField(DSL.name("foreign_server_catalog"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.foreign_servers.foreign_server_name</code>.
     */
    val FOREIGN_SERVER_NAME: TableField<Record, String?> = createField(DSL.name("foreign_server_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.foreign_servers.foreign_data_wrapper_catalog</code>.
     */
    val FOREIGN_DATA_WRAPPER_CATALOG: TableField<Record, String?> = createField(DSL.name("foreign_data_wrapper_catalog"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.foreign_servers.foreign_data_wrapper_name</code>.
     */
    val FOREIGN_DATA_WRAPPER_NAME: TableField<Record, String?> = createField(DSL.name("foreign_data_wrapper_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.foreign_servers.foreign_server_type</code>.
     */
    val FOREIGN_SERVER_TYPE: TableField<Record, String?> = createField(DSL.name("foreign_server_type"), com.sample.information_schema.domains.CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.foreign_servers.foreign_server_version</code>.
     */
    val FOREIGN_SERVER_VERSION: TableField<Record, String?> = createField(DSL.name("foreign_server_version"), com.sample.information_schema.domains.CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.foreign_servers.authorization_identifier</code>.
     */
    val AUTHORIZATION_IDENTIFIER: TableField<Record, String?> = createField(DSL.name("authorization_identifier"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.foreign_servers</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.foreign_servers</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.foreign_servers</code> table reference
     */
    constructor(): this(DSL.name("foreign_servers"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, FOREIGN_SERVERS, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): ForeignServers = ForeignServers(DSL.name(alias), this)
    override fun `as`(alias: Name): ForeignServers = ForeignServers(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): ForeignServers = ForeignServers(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): ForeignServers = ForeignServers(name, null)
}

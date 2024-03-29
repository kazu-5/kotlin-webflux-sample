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
open class UserMappingOptions(
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
    TableOptions.view("create view \"user_mapping_options\" as  SELECT um.authorization_identifier,\n    um.foreign_server_catalog,\n    um.foreign_server_name,\n    (opts.option_name)::information_schema.sql_identifier AS option_name,\n    (\n        CASE\n            WHEN (((um.umuser <> (0)::oid) AND ((um.authorization_identifier)::name = CURRENT_USER)) OR ((um.umuser = (0)::oid) AND pg_has_role((um.srvowner)::name, 'USAGE'::text)) OR ( SELECT pg_authid.rolsuper\n               FROM pg_authid\n              WHERE (pg_authid.rolname = CURRENT_USER))) THEN opts.option_value\n            ELSE NULL::text\n        END)::information_schema.character_data AS option_value\n   FROM information_schema._pg_user_mappings um,\n    LATERAL pg_options_to_table(um.umoptions) opts(option_name, option_value);")
) {
    companion object {

        /**
         * The reference instance of
         * <code>information_schema.user_mapping_options</code>
         */
        val USER_MAPPING_OPTIONS: UserMappingOptions = UserMappingOptions()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column
     * <code>information_schema.user_mapping_options.authorization_identifier</code>.
     */
    val AUTHORIZATION_IDENTIFIER: TableField<Record, String?> = createField(DSL.name("authorization_identifier"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_mapping_options.foreign_server_catalog</code>.
     */
    val FOREIGN_SERVER_CATALOG: TableField<Record, String?> = createField(DSL.name("foreign_server_catalog"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_mapping_options.foreign_server_name</code>.
     */
    val FOREIGN_SERVER_NAME: TableField<Record, String?> = createField(DSL.name("foreign_server_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_mapping_options.option_name</code>.
     */
    val OPTION_NAME: TableField<Record, String?> = createField(DSL.name("option_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_mapping_options.option_value</code>.
     */
    val OPTION_VALUE: TableField<Record, String?> = createField(DSL.name("option_value"), com.sample.information_schema.domains.CHARACTER_DATA.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.user_mapping_options</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.user_mapping_options</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.user_mapping_options</code> table
     * reference
     */
    constructor(): this(DSL.name("user_mapping_options"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, USER_MAPPING_OPTIONS, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): UserMappingOptions = UserMappingOptions(DSL.name(alias), this)
    override fun `as`(alias: Name): UserMappingOptions = UserMappingOptions(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): UserMappingOptions = UserMappingOptions(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): UserMappingOptions = UserMappingOptions(name, null)
}

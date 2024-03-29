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
open class RoleColumnGrants(
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
    TableOptions.view("create view \"role_column_grants\" as  SELECT column_privileges.grantor,\n    column_privileges.grantee,\n    column_privileges.table_catalog,\n    column_privileges.table_schema,\n    column_privileges.table_name,\n    column_privileges.column_name,\n    column_privileges.privilege_type,\n    column_privileges.is_grantable\n   FROM information_schema.column_privileges\n  WHERE (((column_privileges.grantor)::name IN ( SELECT enabled_roles.role_name\n           FROM information_schema.enabled_roles)) OR ((column_privileges.grantee)::name IN ( SELECT enabled_roles.role_name\n           FROM information_schema.enabled_roles)));")
) {
    companion object {

        /**
         * The reference instance of
         * <code>information_schema.role_column_grants</code>
         */
        val ROLE_COLUMN_GRANTS: RoleColumnGrants = RoleColumnGrants()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>information_schema.role_column_grants.grantor</code>.
     */
    val GRANTOR: TableField<Record, String?> = createField(DSL.name("grantor"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.role_column_grants.grantee</code>.
     */
    val GRANTEE: TableField<Record, String?> = createField(DSL.name("grantee"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.role_column_grants.table_catalog</code>.
     */
    val TABLE_CATALOG: TableField<Record, String?> = createField(DSL.name("table_catalog"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.role_column_grants.table_schema</code>.
     */
    val TABLE_SCHEMA: TableField<Record, String?> = createField(DSL.name("table_schema"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.role_column_grants.table_name</code>.
     */
    val TABLE_NAME: TableField<Record, String?> = createField(DSL.name("table_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.role_column_grants.column_name</code>.
     */
    val COLUMN_NAME: TableField<Record, String?> = createField(DSL.name("column_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.role_column_grants.privilege_type</code>.
     */
    val PRIVILEGE_TYPE: TableField<Record, String?> = createField(DSL.name("privilege_type"), com.sample.information_schema.domains.CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.role_column_grants.is_grantable</code>.
     */
    val IS_GRANTABLE: TableField<Record, String?> = createField(DSL.name("is_grantable"), com.sample.information_schema.domains.YES_OR_NO.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.role_column_grants</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.role_column_grants</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.role_column_grants</code> table
     * reference
     */
    constructor(): this(DSL.name("role_column_grants"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, ROLE_COLUMN_GRANTS, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): RoleColumnGrants = RoleColumnGrants(DSL.name(alias), this)
    override fun `as`(alias: Name): RoleColumnGrants = RoleColumnGrants(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): RoleColumnGrants = RoleColumnGrants(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): RoleColumnGrants = RoleColumnGrants(name, null)
}

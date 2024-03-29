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
open class AdministrableRoleAuthorizations(
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
    TableOptions.view("create view \"administrable_role_authorizations\" as  SELECT applicable_roles.grantee,\n    applicable_roles.role_name,\n    applicable_roles.is_grantable\n   FROM information_schema.applicable_roles\n  WHERE ((applicable_roles.is_grantable)::text = 'YES'::text);")
) {
    companion object {

        /**
         * The reference instance of
         * <code>information_schema.administrable_role_authorizations</code>
         */
        val ADMINISTRABLE_ROLE_AUTHORIZATIONS: AdministrableRoleAuthorizations = AdministrableRoleAuthorizations()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column
     * <code>information_schema.administrable_role_authorizations.grantee</code>.
     */
    val GRANTEE: TableField<Record, String?> = createField(DSL.name("grantee"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.administrable_role_authorizations.role_name</code>.
     */
    val ROLE_NAME: TableField<Record, String?> = createField(DSL.name("role_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.administrable_role_authorizations.is_grantable</code>.
     */
    val IS_GRANTABLE: TableField<Record, String?> = createField(DSL.name("is_grantable"), com.sample.information_schema.domains.YES_OR_NO.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased
     * <code>information_schema.administrable_role_authorizations</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>information_schema.administrable_role_authorizations</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a
     * <code>information_schema.administrable_role_authorizations</code> table
     * reference
     */
    constructor(): this(DSL.name("administrable_role_authorizations"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, ADMINISTRABLE_ROLE_AUTHORIZATIONS, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): AdministrableRoleAuthorizations = AdministrableRoleAuthorizations(DSL.name(alias), this)
    override fun `as`(alias: Name): AdministrableRoleAuthorizations = AdministrableRoleAuthorizations(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): AdministrableRoleAuthorizations = AdministrableRoleAuthorizations(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): AdministrableRoleAuthorizations = AdministrableRoleAuthorizations(name, null)
}

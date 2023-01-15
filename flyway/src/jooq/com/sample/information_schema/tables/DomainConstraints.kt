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
open class DomainConstraints(
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
    TableOptions.view("create view \"domain_constraints\" as  SELECT (current_database())::information_schema.sql_identifier AS constraint_catalog,\n    (rs.nspname)::information_schema.sql_identifier AS constraint_schema,\n    (con.conname)::information_schema.sql_identifier AS constraint_name,\n    (current_database())::information_schema.sql_identifier AS domain_catalog,\n    (n.nspname)::information_schema.sql_identifier AS domain_schema,\n    (t.typname)::information_schema.sql_identifier AS domain_name,\n    (\n        CASE\n            WHEN con.condeferrable THEN 'YES'::text\n            ELSE 'NO'::text\n        END)::information_schema.yes_or_no AS is_deferrable,\n    (\n        CASE\n            WHEN con.condeferred THEN 'YES'::text\n            ELSE 'NO'::text\n        END)::information_schema.yes_or_no AS initially_deferred\n   FROM pg_namespace rs,\n    pg_namespace n,\n    pg_constraint con,\n    pg_type t\n  WHERE ((rs.oid = con.connamespace) AND (n.oid = t.typnamespace) AND (t.oid = con.contypid) AND (pg_has_role(t.typowner, 'USAGE'::text) OR has_type_privilege(t.oid, 'USAGE'::text)));")
) {
    companion object {

        /**
         * The reference instance of
         * <code>information_schema.domain_constraints</code>
         */
        val DOMAIN_CONSTRAINTS: DomainConstraints = DomainConstraints()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column
     * <code>information_schema.domain_constraints.constraint_catalog</code>.
     */
    val CONSTRAINT_CATALOG: TableField<Record, String?> = createField(DSL.name("constraint_catalog"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.domain_constraints.constraint_schema</code>.
     */
    val CONSTRAINT_SCHEMA: TableField<Record, String?> = createField(DSL.name("constraint_schema"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.domain_constraints.constraint_name</code>.
     */
    val CONSTRAINT_NAME: TableField<Record, String?> = createField(DSL.name("constraint_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.domain_constraints.domain_catalog</code>.
     */
    val DOMAIN_CATALOG: TableField<Record, String?> = createField(DSL.name("domain_catalog"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.domain_constraints.domain_schema</code>.
     */
    val DOMAIN_SCHEMA: TableField<Record, String?> = createField(DSL.name("domain_schema"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.domain_constraints.domain_name</code>.
     */
    val DOMAIN_NAME: TableField<Record, String?> = createField(DSL.name("domain_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.domain_constraints.is_deferrable</code>.
     */
    val IS_DEFERRABLE: TableField<Record, String?> = createField(DSL.name("is_deferrable"), com.sample.information_schema.domains.YES_OR_NO.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.domain_constraints.initially_deferred</code>.
     */
    val INITIALLY_DEFERRED: TableField<Record, String?> = createField(DSL.name("initially_deferred"), com.sample.information_schema.domains.YES_OR_NO.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.domain_constraints</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.domain_constraints</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.domain_constraints</code> table
     * reference
     */
    constructor(): this(DSL.name("domain_constraints"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, DOMAIN_CONSTRAINTS, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): DomainConstraints = DomainConstraints(DSL.name(alias), this)
    override fun `as`(alias: Name): DomainConstraints = DomainConstraints(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): DomainConstraints = DomainConstraints(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): DomainConstraints = DomainConstraints(name, null)
}

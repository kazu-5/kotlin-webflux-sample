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
open class DomainUdtUsage(
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
    TableOptions.view("create view \"domain_udt_usage\" as  SELECT (current_database())::information_schema.sql_identifier AS udt_catalog,\n    (nbt.nspname)::information_schema.sql_identifier AS udt_schema,\n    (bt.typname)::information_schema.sql_identifier AS udt_name,\n    (current_database())::information_schema.sql_identifier AS domain_catalog,\n    (nt.nspname)::information_schema.sql_identifier AS domain_schema,\n    (t.typname)::information_schema.sql_identifier AS domain_name\n   FROM pg_type t,\n    pg_namespace nt,\n    pg_type bt,\n    pg_namespace nbt\n  WHERE ((t.typnamespace = nt.oid) AND (t.typbasetype = bt.oid) AND (bt.typnamespace = nbt.oid) AND (t.typtype = 'd'::\"char\") AND pg_has_role(bt.typowner, 'USAGE'::text));")
) {
    companion object {

        /**
         * The reference instance of
         * <code>information_schema.domain_udt_usage</code>
         */
        val DOMAIN_UDT_USAGE: DomainUdtUsage = DomainUdtUsage()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>information_schema.domain_udt_usage.udt_catalog</code>.
     */
    val UDT_CATALOG: TableField<Record, String?> = createField(DSL.name("udt_catalog"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.domain_udt_usage.udt_schema</code>.
     */
    val UDT_SCHEMA: TableField<Record, String?> = createField(DSL.name("udt_schema"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.domain_udt_usage.udt_name</code>.
     */
    val UDT_NAME: TableField<Record, String?> = createField(DSL.name("udt_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.domain_udt_usage.domain_catalog</code>.
     */
    val DOMAIN_CATALOG: TableField<Record, String?> = createField(DSL.name("domain_catalog"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.domain_udt_usage.domain_schema</code>.
     */
    val DOMAIN_SCHEMA: TableField<Record, String?> = createField(DSL.name("domain_schema"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.domain_udt_usage.domain_name</code>.
     */
    val DOMAIN_NAME: TableField<Record, String?> = createField(DSL.name("domain_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.domain_udt_usage</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.domain_udt_usage</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.domain_udt_usage</code> table reference
     */
    constructor(): this(DSL.name("domain_udt_usage"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, DOMAIN_UDT_USAGE, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): DomainUdtUsage = DomainUdtUsage(DSL.name(alias), this)
    override fun `as`(alias: Name): DomainUdtUsage = DomainUdtUsage(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): DomainUdtUsage = DomainUdtUsage(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): DomainUdtUsage = DomainUdtUsage(name, null)
}
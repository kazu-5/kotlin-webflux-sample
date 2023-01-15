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
open class Domains(
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
    TableOptions.view("create view \"domains\" as  SELECT (current_database())::information_schema.sql_identifier AS domain_catalog,\n    (nt.nspname)::information_schema.sql_identifier AS domain_schema,\n    (t.typname)::information_schema.sql_identifier AS domain_name,\n    (\n        CASE\n            WHEN ((t.typelem <> (0)::oid) AND (t.typlen = '-1'::integer)) THEN 'ARRAY'::text\n            WHEN (nbt.nspname = 'pg_catalog'::name) THEN format_type(t.typbasetype, NULL::integer)\n            ELSE 'USER-DEFINED'::text\n        END)::information_schema.character_data AS data_type,\n    (information_schema._pg_char_max_length(t.typbasetype, t.typtypmod))::information_schema.cardinal_number AS character_maximum_length,\n    (information_schema._pg_char_octet_length(t.typbasetype, t.typtypmod))::information_schema.cardinal_number AS character_octet_length,\n    (NULL::name)::information_schema.sql_identifier AS character_set_catalog,\n    (NULL::name)::information_schema.sql_identifier AS character_set_schema,\n    (NULL::name)::information_schema.sql_identifier AS character_set_name,\n    (\n        CASE\n            WHEN (nco.nspname IS NOT NULL) THEN current_database()\n            ELSE NULL::name\n        END)::information_schema.sql_identifier AS collation_catalog,\n    (nco.nspname)::information_schema.sql_identifier AS collation_schema,\n    (co.collname)::information_schema.sql_identifier AS collation_name,\n    (information_schema._pg_numeric_precision(t.typbasetype, t.typtypmod))::information_schema.cardinal_number AS numeric_precision,\n    (information_schema._pg_numeric_precision_radix(t.typbasetype, t.typtypmod))::information_schema.cardinal_number AS numeric_precision_radix,\n    (information_schema._pg_numeric_scale(t.typbasetype, t.typtypmod))::information_schema.cardinal_number AS numeric_scale,\n    (information_schema._pg_datetime_precision(t.typbasetype, t.typtypmod))::information_schema.cardinal_number AS datetime_precision,\n    (information_schema._pg_interval_type(t.typbasetype, t.typtypmod))::information_schema.character_data AS interval_type,\n    (NULL::integer)::information_schema.cardinal_number AS interval_precision,\n    (t.typdefault)::information_schema.character_data AS domain_default,\n    (current_database())::information_schema.sql_identifier AS udt_catalog,\n    (nbt.nspname)::information_schema.sql_identifier AS udt_schema,\n    (bt.typname)::information_schema.sql_identifier AS udt_name,\n    (NULL::name)::information_schema.sql_identifier AS scope_catalog,\n    (NULL::name)::information_schema.sql_identifier AS scope_schema,\n    (NULL::name)::information_schema.sql_identifier AS scope_name,\n    (NULL::integer)::information_schema.cardinal_number AS maximum_cardinality,\n    (1)::information_schema.sql_identifier AS dtd_identifier\n   FROM (((pg_type t\n     JOIN pg_namespace nt ON ((t.typnamespace = nt.oid)))\n     JOIN (pg_type bt\n     JOIN pg_namespace nbt ON ((bt.typnamespace = nbt.oid))) ON (((t.typbasetype = bt.oid) AND (t.typtype = 'd'::\"char\"))))\n     LEFT JOIN (pg_collation co\n     JOIN pg_namespace nco ON ((co.collnamespace = nco.oid))) ON (((t.typcollation = co.oid) AND ((nco.nspname <> 'pg_catalog'::name) OR (co.collname <> 'default'::name)))))\n  WHERE (pg_has_role(t.typowner, 'USAGE'::text) OR has_type_privilege(t.oid, 'USAGE'::text));")
) {
    companion object {

        /**
         * The reference instance of <code>information_schema.domains</code>
         */
        val DOMAINS: Domains = Domains()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>information_schema.domains.domain_catalog</code>.
     */
    val DOMAIN_CATALOG: TableField<Record, String?> = createField(DSL.name("domain_catalog"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.domains.domain_schema</code>.
     */
    val DOMAIN_SCHEMA: TableField<Record, String?> = createField(DSL.name("domain_schema"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.domains.domain_name</code>.
     */
    val DOMAIN_NAME: TableField<Record, String?> = createField(DSL.name("domain_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.domains.data_type</code>.
     */
    val DATA_TYPE: TableField<Record, String?> = createField(DSL.name("data_type"), com.sample.information_schema.domains.CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.domains.character_maximum_length</code>.
     */
    val CHARACTER_MAXIMUM_LENGTH: TableField<Record, Int?> = createField(DSL.name("character_maximum_length"), com.sample.information_schema.domains.CARDINAL_NUMBER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.domains.character_octet_length</code>.
     */
    val CHARACTER_OCTET_LENGTH: TableField<Record, Int?> = createField(DSL.name("character_octet_length"), com.sample.information_schema.domains.CARDINAL_NUMBER.getDataType(), this, "")

    /**
     * The column <code>information_schema.domains.character_set_catalog</code>.
     */
    val CHARACTER_SET_CATALOG: TableField<Record, String?> = createField(DSL.name("character_set_catalog"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.domains.character_set_schema</code>.
     */
    val CHARACTER_SET_SCHEMA: TableField<Record, String?> = createField(DSL.name("character_set_schema"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.domains.character_set_name</code>.
     */
    val CHARACTER_SET_NAME: TableField<Record, String?> = createField(DSL.name("character_set_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.domains.collation_catalog</code>.
     */
    val COLLATION_CATALOG: TableField<Record, String?> = createField(DSL.name("collation_catalog"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.domains.collation_schema</code>.
     */
    val COLLATION_SCHEMA: TableField<Record, String?> = createField(DSL.name("collation_schema"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.domains.collation_name</code>.
     */
    val COLLATION_NAME: TableField<Record, String?> = createField(DSL.name("collation_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.domains.numeric_precision</code>.
     */
    val NUMERIC_PRECISION: TableField<Record, Int?> = createField(DSL.name("numeric_precision"), com.sample.information_schema.domains.CARDINAL_NUMBER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.domains.numeric_precision_radix</code>.
     */
    val NUMERIC_PRECISION_RADIX: TableField<Record, Int?> = createField(DSL.name("numeric_precision_radix"), com.sample.information_schema.domains.CARDINAL_NUMBER.getDataType(), this, "")

    /**
     * The column <code>information_schema.domains.numeric_scale</code>.
     */
    val NUMERIC_SCALE: TableField<Record, Int?> = createField(DSL.name("numeric_scale"), com.sample.information_schema.domains.CARDINAL_NUMBER.getDataType(), this, "")

    /**
     * The column <code>information_schema.domains.datetime_precision</code>.
     */
    val DATETIME_PRECISION: TableField<Record, Int?> = createField(DSL.name("datetime_precision"), com.sample.information_schema.domains.CARDINAL_NUMBER.getDataType(), this, "")

    /**
     * The column <code>information_schema.domains.interval_type</code>.
     */
    val INTERVAL_TYPE: TableField<Record, String?> = createField(DSL.name("interval_type"), com.sample.information_schema.domains.CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column <code>information_schema.domains.interval_precision</code>.
     */
    val INTERVAL_PRECISION: TableField<Record, Int?> = createField(DSL.name("interval_precision"), com.sample.information_schema.domains.CARDINAL_NUMBER.getDataType(), this, "")

    /**
     * The column <code>information_schema.domains.domain_default</code>.
     */
    val DOMAIN_DEFAULT: TableField<Record, String?> = createField(DSL.name("domain_default"), com.sample.information_schema.domains.CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column <code>information_schema.domains.udt_catalog</code>.
     */
    val UDT_CATALOG: TableField<Record, String?> = createField(DSL.name("udt_catalog"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.domains.udt_schema</code>.
     */
    val UDT_SCHEMA: TableField<Record, String?> = createField(DSL.name("udt_schema"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.domains.udt_name</code>.
     */
    val UDT_NAME: TableField<Record, String?> = createField(DSL.name("udt_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.domains.scope_catalog</code>.
     */
    val SCOPE_CATALOG: TableField<Record, String?> = createField(DSL.name("scope_catalog"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.domains.scope_schema</code>.
     */
    val SCOPE_SCHEMA: TableField<Record, String?> = createField(DSL.name("scope_schema"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.domains.scope_name</code>.
     */
    val SCOPE_NAME: TableField<Record, String?> = createField(DSL.name("scope_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.domains.maximum_cardinality</code>.
     */
    val MAXIMUM_CARDINALITY: TableField<Record, Int?> = createField(DSL.name("maximum_cardinality"), com.sample.information_schema.domains.CARDINAL_NUMBER.getDataType(), this, "")

    /**
     * The column <code>information_schema.domains.dtd_identifier</code>.
     */
    val DTD_IDENTIFIER: TableField<Record, String?> = createField(DSL.name("dtd_identifier"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.domains</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.domains</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.domains</code> table reference
     */
    constructor(): this(DSL.name("domains"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, DOMAINS, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): Domains = Domains(DSL.name(alias), this)
    override fun `as`(alias: Name): Domains = Domains(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Domains = Domains(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Domains = Domains(name, null)
}

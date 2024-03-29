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
open class Transforms(
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
    TableOptions.view("create view \"transforms\" as  SELECT (current_database())::information_schema.sql_identifier AS udt_catalog,\n    (nt.nspname)::information_schema.sql_identifier AS udt_schema,\n    (t.typname)::information_schema.sql_identifier AS udt_name,\n    (current_database())::information_schema.sql_identifier AS specific_catalog,\n    (np.nspname)::information_schema.sql_identifier AS specific_schema,\n    (nameconcatoid(p.proname, p.oid))::information_schema.sql_identifier AS specific_name,\n    (l.lanname)::information_schema.sql_identifier AS group_name,\n    ('FROM SQL'::character varying)::information_schema.character_data AS transform_type\n   FROM (((((pg_type t\n     JOIN pg_transform x ON ((t.oid = x.trftype)))\n     JOIN pg_language l ON ((x.trflang = l.oid)))\n     JOIN pg_proc p ON (((x.trffromsql)::oid = p.oid)))\n     JOIN pg_namespace nt ON ((t.typnamespace = nt.oid)))\n     JOIN pg_namespace np ON ((p.pronamespace = np.oid)))\nUNION\n SELECT (current_database())::information_schema.sql_identifier AS udt_catalog,\n    (nt.nspname)::information_schema.sql_identifier AS udt_schema,\n    (t.typname)::information_schema.sql_identifier AS udt_name,\n    (current_database())::information_schema.sql_identifier AS specific_catalog,\n    (np.nspname)::information_schema.sql_identifier AS specific_schema,\n    (nameconcatoid(p.proname, p.oid))::information_schema.sql_identifier AS specific_name,\n    (l.lanname)::information_schema.sql_identifier AS group_name,\n    ('TO SQL'::character varying)::information_schema.character_data AS transform_type\n   FROM (((((pg_type t\n     JOIN pg_transform x ON ((t.oid = x.trftype)))\n     JOIN pg_language l ON ((x.trflang = l.oid)))\n     JOIN pg_proc p ON (((x.trftosql)::oid = p.oid)))\n     JOIN pg_namespace nt ON ((t.typnamespace = nt.oid)))\n     JOIN pg_namespace np ON ((p.pronamespace = np.oid)))\n  ORDER BY 1, 2, 3, 7, 8;")
) {
    companion object {

        /**
         * The reference instance of <code>information_schema.transforms</code>
         */
        val TRANSFORMS: Transforms = Transforms()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>information_schema.transforms.udt_catalog</code>.
     */
    val UDT_CATALOG: TableField<Record, String?> = createField(DSL.name("udt_catalog"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.transforms.udt_schema</code>.
     */
    val UDT_SCHEMA: TableField<Record, String?> = createField(DSL.name("udt_schema"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.transforms.udt_name</code>.
     */
    val UDT_NAME: TableField<Record, String?> = createField(DSL.name("udt_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.transforms.specific_catalog</code>.
     */
    val SPECIFIC_CATALOG: TableField<Record, String?> = createField(DSL.name("specific_catalog"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.transforms.specific_schema</code>.
     */
    val SPECIFIC_SCHEMA: TableField<Record, String?> = createField(DSL.name("specific_schema"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.transforms.specific_name</code>.
     */
    val SPECIFIC_NAME: TableField<Record, String?> = createField(DSL.name("specific_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.transforms.group_name</code>.
     */
    val GROUP_NAME: TableField<Record, String?> = createField(DSL.name("group_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.transforms.transform_type</code>.
     */
    val TRANSFORM_TYPE: TableField<Record, String?> = createField(DSL.name("transform_type"), com.sample.information_schema.domains.CHARACTER_DATA.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.transforms</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.transforms</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.transforms</code> table reference
     */
    constructor(): this(DSL.name("transforms"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, TRANSFORMS, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): Transforms = Transforms(DSL.name(alias), this)
    override fun `as`(alias: Name): Transforms = Transforms(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Transforms = Transforms(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Transforms = Transforms(name, null)
}

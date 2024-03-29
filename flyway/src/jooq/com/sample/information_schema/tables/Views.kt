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
open class Views(
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
    TableOptions.view("create view \"views\" as  SELECT (current_database())::information_schema.sql_identifier AS table_catalog,\n    (nc.nspname)::information_schema.sql_identifier AS table_schema,\n    (c.relname)::information_schema.sql_identifier AS table_name,\n    (\n        CASE\n            WHEN pg_has_role(c.relowner, 'USAGE'::text) THEN pg_get_viewdef(c.oid)\n            ELSE NULL::text\n        END)::information_schema.character_data AS view_definition,\n    (\n        CASE\n            WHEN ('check_option=cascaded'::text = ANY (c.reloptions)) THEN 'CASCADED'::text\n            WHEN ('check_option=local'::text = ANY (c.reloptions)) THEN 'LOCAL'::text\n            ELSE 'NONE'::text\n        END)::information_schema.character_data AS check_option,\n    (\n        CASE\n            WHEN ((pg_relation_is_updatable((c.oid)::regclass, false) & 20) = 20) THEN 'YES'::text\n            ELSE 'NO'::text\n        END)::information_schema.yes_or_no AS is_updatable,\n    (\n        CASE\n            WHEN ((pg_relation_is_updatable((c.oid)::regclass, false) & 8) = 8) THEN 'YES'::text\n            ELSE 'NO'::text\n        END)::information_schema.yes_or_no AS is_insertable_into,\n    (\n        CASE\n            WHEN (EXISTS ( SELECT 1\n               FROM pg_trigger\n              WHERE ((pg_trigger.tgrelid = c.oid) AND (((pg_trigger.tgtype)::integer & 81) = 81)))) THEN 'YES'::text\n            ELSE 'NO'::text\n        END)::information_schema.yes_or_no AS is_trigger_updatable,\n    (\n        CASE\n            WHEN (EXISTS ( SELECT 1\n               FROM pg_trigger\n              WHERE ((pg_trigger.tgrelid = c.oid) AND (((pg_trigger.tgtype)::integer & 73) = 73)))) THEN 'YES'::text\n            ELSE 'NO'::text\n        END)::information_schema.yes_or_no AS is_trigger_deletable,\n    (\n        CASE\n            WHEN (EXISTS ( SELECT 1\n               FROM pg_trigger\n              WHERE ((pg_trigger.tgrelid = c.oid) AND (((pg_trigger.tgtype)::integer & 69) = 69)))) THEN 'YES'::text\n            ELSE 'NO'::text\n        END)::information_schema.yes_or_no AS is_trigger_insertable_into\n   FROM pg_namespace nc,\n    pg_class c\n  WHERE ((c.relnamespace = nc.oid) AND (c.relkind = 'v'::\"char\") AND (NOT pg_is_other_temp_schema(nc.oid)) AND (pg_has_role(c.relowner, 'USAGE'::text) OR has_table_privilege(c.oid, 'SELECT, INSERT, UPDATE, DELETE, TRUNCATE, REFERENCES, TRIGGER'::text) OR has_any_column_privilege(c.oid, 'SELECT, INSERT, UPDATE, REFERENCES'::text)));")
) {
    companion object {

        /**
         * The reference instance of <code>information_schema.views</code>
         */
        val VIEWS: Views = Views()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>information_schema.views.table_catalog</code>.
     */
    val TABLE_CATALOG: TableField<Record, String?> = createField(DSL.name("table_catalog"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.views.table_schema</code>.
     */
    val TABLE_SCHEMA: TableField<Record, String?> = createField(DSL.name("table_schema"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.views.table_name</code>.
     */
    val TABLE_NAME: TableField<Record, String?> = createField(DSL.name("table_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.views.view_definition</code>.
     */
    val VIEW_DEFINITION: TableField<Record, String?> = createField(DSL.name("view_definition"), com.sample.information_schema.domains.CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column <code>information_schema.views.check_option</code>.
     */
    val CHECK_OPTION: TableField<Record, String?> = createField(DSL.name("check_option"), com.sample.information_schema.domains.CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column <code>information_schema.views.is_updatable</code>.
     */
    val IS_UPDATABLE: TableField<Record, String?> = createField(DSL.name("is_updatable"), com.sample.information_schema.domains.YES_OR_NO.getDataType(), this, "")

    /**
     * The column <code>information_schema.views.is_insertable_into</code>.
     */
    val IS_INSERTABLE_INTO: TableField<Record, String?> = createField(DSL.name("is_insertable_into"), com.sample.information_schema.domains.YES_OR_NO.getDataType(), this, "")

    /**
     * The column <code>information_schema.views.is_trigger_updatable</code>.
     */
    val IS_TRIGGER_UPDATABLE: TableField<Record, String?> = createField(DSL.name("is_trigger_updatable"), com.sample.information_schema.domains.YES_OR_NO.getDataType(), this, "")

    /**
     * The column <code>information_schema.views.is_trigger_deletable</code>.
     */
    val IS_TRIGGER_DELETABLE: TableField<Record, String?> = createField(DSL.name("is_trigger_deletable"), com.sample.information_schema.domains.YES_OR_NO.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.views.is_trigger_insertable_into</code>.
     */
    val IS_TRIGGER_INSERTABLE_INTO: TableField<Record, String?> = createField(DSL.name("is_trigger_insertable_into"), com.sample.information_schema.domains.YES_OR_NO.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.views</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.views</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.views</code> table reference
     */
    constructor(): this(DSL.name("views"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, VIEWS, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): Views = Views(DSL.name(alias), this)
    override fun `as`(alias: Name): Views = Views(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Views = Views(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Views = Views(name, null)
}

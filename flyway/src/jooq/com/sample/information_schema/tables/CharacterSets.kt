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
open class CharacterSets(
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
    TableOptions.view("create view \"character_sets\" as  SELECT (NULL::name)::information_schema.sql_identifier AS character_set_catalog,\n    (NULL::name)::information_schema.sql_identifier AS character_set_schema,\n    (getdatabaseencoding())::information_schema.sql_identifier AS character_set_name,\n    (\n        CASE\n            WHEN (getdatabaseencoding() = 'UTF8'::name) THEN 'UCS'::name\n            ELSE getdatabaseencoding()\n        END)::information_schema.sql_identifier AS character_repertoire,\n    (getdatabaseencoding())::information_schema.sql_identifier AS form_of_use,\n    (current_database())::information_schema.sql_identifier AS default_collate_catalog,\n    (nc.nspname)::information_schema.sql_identifier AS default_collate_schema,\n    (c.collname)::information_schema.sql_identifier AS default_collate_name\n   FROM (pg_database d\n     LEFT JOIN (pg_collation c\n     JOIN pg_namespace nc ON ((c.collnamespace = nc.oid))) ON (((d.datcollate = c.collcollate) AND (d.datctype = c.collctype))))\n  WHERE (d.datname = current_database())\n  ORDER BY (char_length((c.collname)::text)) DESC, c.collname\n LIMIT 1;")
) {
    companion object {

        /**
         * The reference instance of
         * <code>information_schema.character_sets</code>
         */
        val CHARACTER_SETS: CharacterSets = CharacterSets()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column
     * <code>information_schema.character_sets.character_set_catalog</code>.
     */
    val CHARACTER_SET_CATALOG: TableField<Record, String?> = createField(DSL.name("character_set_catalog"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.character_sets.character_set_schema</code>.
     */
    val CHARACTER_SET_SCHEMA: TableField<Record, String?> = createField(DSL.name("character_set_schema"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.character_sets.character_set_name</code>.
     */
    val CHARACTER_SET_NAME: TableField<Record, String?> = createField(DSL.name("character_set_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.character_sets.character_repertoire</code>.
     */
    val CHARACTER_REPERTOIRE: TableField<Record, String?> = createField(DSL.name("character_repertoire"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.character_sets.form_of_use</code>.
     */
    val FORM_OF_USE: TableField<Record, String?> = createField(DSL.name("form_of_use"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.character_sets.default_collate_catalog</code>.
     */
    val DEFAULT_COLLATE_CATALOG: TableField<Record, String?> = createField(DSL.name("default_collate_catalog"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.character_sets.default_collate_schema</code>.
     */
    val DEFAULT_COLLATE_SCHEMA: TableField<Record, String?> = createField(DSL.name("default_collate_schema"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.character_sets.default_collate_name</code>.
     */
    val DEFAULT_COLLATE_NAME: TableField<Record, String?> = createField(DSL.name("default_collate_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.character_sets</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.character_sets</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.character_sets</code> table reference
     */
    constructor(): this(DSL.name("character_sets"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, CHARACTER_SETS, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): CharacterSets = CharacterSets(DSL.name(alias), this)
    override fun `as`(alias: Name): CharacterSets = CharacterSets(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): CharacterSets = CharacterSets(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): CharacterSets = CharacterSets(name, null)
}

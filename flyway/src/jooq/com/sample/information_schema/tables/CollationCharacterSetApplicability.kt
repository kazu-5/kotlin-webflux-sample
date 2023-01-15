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
open class CollationCharacterSetApplicability(
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
    TableOptions.view("create view \"collation_character_set_applicability\" as  SELECT (current_database())::information_schema.sql_identifier AS collation_catalog,\n    (nc.nspname)::information_schema.sql_identifier AS collation_schema,\n    (c.collname)::information_schema.sql_identifier AS collation_name,\n    (NULL::name)::information_schema.sql_identifier AS character_set_catalog,\n    (NULL::name)::information_schema.sql_identifier AS character_set_schema,\n    (getdatabaseencoding())::information_schema.sql_identifier AS character_set_name\n   FROM pg_collation c,\n    pg_namespace nc\n  WHERE ((c.collnamespace = nc.oid) AND (c.collencoding = ANY (ARRAY['-1'::integer, ( SELECT pg_database.encoding\n           FROM pg_database\n          WHERE (pg_database.datname = current_database()))])));")
) {
    companion object {

        /**
         * The reference instance of
         * <code>information_schema.collation_character_set_applicability</code>
         */
        val COLLATION_CHARACTER_SET_APPLICABILITY: CollationCharacterSetApplicability = CollationCharacterSetApplicability()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column
     * <code>information_schema.collation_character_set_applicability.collation_catalog</code>.
     */
    val COLLATION_CATALOG: TableField<Record, String?> = createField(DSL.name("collation_catalog"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.collation_character_set_applicability.collation_schema</code>.
     */
    val COLLATION_SCHEMA: TableField<Record, String?> = createField(DSL.name("collation_schema"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.collation_character_set_applicability.collation_name</code>.
     */
    val COLLATION_NAME: TableField<Record, String?> = createField(DSL.name("collation_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.collation_character_set_applicability.character_set_catalog</code>.
     */
    val CHARACTER_SET_CATALOG: TableField<Record, String?> = createField(DSL.name("character_set_catalog"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.collation_character_set_applicability.character_set_schema</code>.
     */
    val CHARACTER_SET_SCHEMA: TableField<Record, String?> = createField(DSL.name("character_set_schema"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.collation_character_set_applicability.character_set_name</code>.
     */
    val CHARACTER_SET_NAME: TableField<Record, String?> = createField(DSL.name("character_set_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased
     * <code>information_schema.collation_character_set_applicability</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>information_schema.collation_character_set_applicability</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a
     * <code>information_schema.collation_character_set_applicability</code>
     * table reference
     */
    constructor(): this(DSL.name("collation_character_set_applicability"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, COLLATION_CHARACTER_SET_APPLICABILITY, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): CollationCharacterSetApplicability = CollationCharacterSetApplicability(DSL.name(alias), this)
    override fun `as`(alias: Name): CollationCharacterSetApplicability = CollationCharacterSetApplicability(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): CollationCharacterSetApplicability = CollationCharacterSetApplicability(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): CollationCharacterSetApplicability = CollationCharacterSetApplicability(name, null)
}
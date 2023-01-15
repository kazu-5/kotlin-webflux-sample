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
open class InformationSchemaCatalogName(
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
    TableOptions.view("create view \"information_schema_catalog_name\" as  SELECT (current_database())::information_schema.sql_identifier AS catalog_name;")
) {
    companion object {

        /**
         * The reference instance of
         * <code>information_schema.information_schema_catalog_name</code>
         */
        val INFORMATION_SCHEMA_CATALOG_NAME: InformationSchemaCatalogName = InformationSchemaCatalogName()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column
     * <code>information_schema.information_schema_catalog_name.catalog_name</code>.
     */
    val CATALOG_NAME: TableField<Record, String?> = createField(DSL.name("catalog_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased
     * <code>information_schema.information_schema_catalog_name</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>information_schema.information_schema_catalog_name</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.information_schema_catalog_name</code>
     * table reference
     */
    constructor(): this(DSL.name("information_schema_catalog_name"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, INFORMATION_SCHEMA_CATALOG_NAME, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): InformationSchemaCatalogName = InformationSchemaCatalogName(DSL.name(alias), this)
    override fun `as`(alias: Name): InformationSchemaCatalogName = InformationSchemaCatalogName(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): InformationSchemaCatalogName = InformationSchemaCatalogName(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): InformationSchemaCatalogName = InformationSchemaCatalogName(name, null)
}

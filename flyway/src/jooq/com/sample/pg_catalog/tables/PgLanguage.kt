/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.tables


import com.sample.pg_catalog.PgCatalog
import com.sample.pg_catalog.indexes.PG_LANGUAGE_NAME_INDEX
import com.sample.pg_catalog.indexes.PG_LANGUAGE_OID_INDEX

import kotlin.collections.List

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Index
import org.jooq.Name
import org.jooq.Record
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgLanguage(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, Record>?,
    aliased: Table<Record>?,
    parameters: Array<Field<*>?>?
): TableImpl<Record>(
    alias,
    PgCatalog.PG_CATALOG,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>pg_catalog.pg_language</code>
         */
        val PG_LANGUAGE: PgLanguage = PgLanguage()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_language.oid</code>.
     */
    val OID: TableField<Record, Long?> = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_language.lanname</code>.
     */
    val LANNAME: TableField<Record, String?> = createField(DSL.name("lanname"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_language.lanowner</code>.
     */
    val LANOWNER: TableField<Record, Long?> = createField(DSL.name("lanowner"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_language.lanispl</code>.
     */
    val LANISPL: TableField<Record, Boolean?> = createField(DSL.name("lanispl"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_language.lanpltrusted</code>.
     */
    val LANPLTRUSTED: TableField<Record, Boolean?> = createField(DSL.name("lanpltrusted"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_language.lanplcallfoid</code>.
     */
    val LANPLCALLFOID: TableField<Record, Long?> = createField(DSL.name("lanplcallfoid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_language.laninline</code>.
     */
    val LANINLINE: TableField<Record, Long?> = createField(DSL.name("laninline"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_language.lanvalidator</code>.
     */
    val LANVALIDATOR: TableField<Record, Long?> = createField(DSL.name("lanvalidator"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_language.lanacl</code>.
     */
    val LANACL: TableField<Record, Array<String?>?> = createField(DSL.name("lanacl"), SQLDataType.VARCHAR.getArrayDataType(), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_language</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_language</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_language</code> table reference
     */
    constructor(): this(DSL.name("pg_language"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PG_LANGUAGE, null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getIndexes(): List<Index> = listOf(PG_LANGUAGE_NAME_INDEX, PG_LANGUAGE_OID_INDEX)
    override fun `as`(alias: String): PgLanguage = PgLanguage(DSL.name(alias), this)
    override fun `as`(alias: Name): PgLanguage = PgLanguage(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgLanguage = PgLanguage(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgLanguage = PgLanguage(name, null)
}
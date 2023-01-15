/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.tables


import com.sample.pg_catalog.PgCatalog

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
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgStatioUserSequences(
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
    TableOptions.view("create view \"pg_statio_user_sequences\" as  SELECT pg_statio_all_sequences.relid,\n    pg_statio_all_sequences.schemaname,\n    pg_statio_all_sequences.relname,\n    pg_statio_all_sequences.blks_read,\n    pg_statio_all_sequences.blks_hit\n   FROM pg_statio_all_sequences\n  WHERE ((pg_statio_all_sequences.schemaname <> ALL (ARRAY['pg_catalog'::name, 'information_schema'::name])) AND (pg_statio_all_sequences.schemaname !~ '^pg_toast'::text));")
) {
    companion object {

        /**
         * The reference instance of
         * <code>pg_catalog.pg_statio_user_sequences</code>
         */
        val PG_STATIO_USER_SEQUENCES: PgStatioUserSequences = PgStatioUserSequences()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_statio_user_sequences.relid</code>.
     */
    val RELID: TableField<Record, Long?> = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_user_sequences.schemaname</code>.
     */
    val SCHEMANAME: TableField<Record, String?> = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_user_sequences.relname</code>.
     */
    val RELNAME: TableField<Record, String?> = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_user_sequences.blks_read</code>.
     */
    val BLKS_READ: TableField<Record, Long?> = createField(DSL.name("blks_read"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_user_sequences.blks_hit</code>.
     */
    val BLKS_HIT: TableField<Record, Long?> = createField(DSL.name("blks_hit"), SQLDataType.BIGINT, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_statio_user_sequences</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_statio_user_sequences</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_statio_user_sequences</code> table reference
     */
    constructor(): this(DSL.name("pg_statio_user_sequences"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PG_STATIO_USER_SEQUENCES, null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgStatioUserSequences = PgStatioUserSequences(DSL.name(alias), this)
    override fun `as`(alias: Name): PgStatioUserSequences = PgStatioUserSequences(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgStatioUserSequences = PgStatioUserSequences(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgStatioUserSequences = PgStatioUserSequences(name, null)
}

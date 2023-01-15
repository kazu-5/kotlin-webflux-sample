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
open class PgSequences(
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
    TableOptions.view("create view \"pg_sequences\" as  SELECT n.nspname AS schemaname,\n    c.relname AS sequencename,\n    pg_get_userbyid(c.relowner) AS sequenceowner,\n    (s.seqtypid)::regtype AS data_type,\n    s.seqstart AS start_value,\n    s.seqmin AS min_value,\n    s.seqmax AS max_value,\n    s.seqincrement AS increment_by,\n    s.seqcycle AS cycle,\n    s.seqcache AS cache_size,\n        CASE\n            WHEN has_sequence_privilege(c.oid, 'SELECT,USAGE'::text) THEN pg_sequence_last_value((c.oid)::regclass)\n            ELSE NULL::bigint\n        END AS last_value\n   FROM ((pg_sequence s\n     JOIN pg_class c ON ((c.oid = s.seqrelid)))\n     LEFT JOIN pg_namespace n ON ((n.oid = c.relnamespace)))\n  WHERE ((NOT pg_is_other_temp_schema(n.oid)) AND (c.relkind = 'S'::\"char\"));")
) {
    companion object {

        /**
         * The reference instance of <code>pg_catalog.pg_sequences</code>
         */
        val PG_SEQUENCES: PgSequences = PgSequences()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_sequences.schemaname</code>.
     */
    val SCHEMANAME: TableField<Record, String?> = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_sequences.sequencename</code>.
     */
    val SEQUENCENAME: TableField<Record, String?> = createField(DSL.name("sequencename"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_sequences.sequenceowner</code>.
     */
    val SEQUENCEOWNER: TableField<Record, String?> = createField(DSL.name("sequenceowner"), SQLDataType.VARCHAR, this, "")
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val DATA_TYPE: TableField<Record, Any?> = createField(DSL.name("data_type"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regtype\""), this, "")

    /**
     * The column <code>pg_catalog.pg_sequences.start_value</code>.
     */
    val START_VALUE: TableField<Record, Long?> = createField(DSL.name("start_value"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_sequences.min_value</code>.
     */
    val MIN_VALUE: TableField<Record, Long?> = createField(DSL.name("min_value"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_sequences.max_value</code>.
     */
    val MAX_VALUE: TableField<Record, Long?> = createField(DSL.name("max_value"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_sequences.increment_by</code>.
     */
    val INCREMENT_BY: TableField<Record, Long?> = createField(DSL.name("increment_by"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_sequences.cycle</code>.
     */
    val CYCLE: TableField<Record, Boolean?> = createField(DSL.name("cycle"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column <code>pg_catalog.pg_sequences.cache_size</code>.
     */
    val CACHE_SIZE: TableField<Record, Long?> = createField(DSL.name("cache_size"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_sequences.last_value</code>.
     */
    val LAST_VALUE: TableField<Record, Long?> = createField(DSL.name("last_value"), SQLDataType.BIGINT, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_sequences</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_sequences</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_sequences</code> table reference
     */
    constructor(): this(DSL.name("pg_sequences"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PG_SEQUENCES, null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgSequences = PgSequences(DSL.name(alias), this)
    override fun `as`(alias: Name): PgSequences = PgSequences(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgSequences = PgSequences(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgSequences = PgSequences(name, null)
}
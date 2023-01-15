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
open class PgSeclabels(
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
    TableOptions.view("create view \"pg_seclabels\" as  SELECT l.objoid,\n    l.classoid,\n    l.objsubid,\n        CASE\n            WHEN (rel.relkind = ANY (ARRAY['r'::\"char\", 'p'::\"char\"])) THEN 'table'::text\n            WHEN (rel.relkind = 'v'::\"char\") THEN 'view'::text\n            WHEN (rel.relkind = 'm'::\"char\") THEN 'materialized view'::text\n            WHEN (rel.relkind = 'S'::\"char\") THEN 'sequence'::text\n            WHEN (rel.relkind = 'f'::\"char\") THEN 'foreign table'::text\n            ELSE NULL::text\n        END AS objtype,\n    rel.relnamespace AS objnamespace,\n        CASE\n            WHEN pg_table_is_visible(rel.oid) THEN quote_ident((rel.relname)::text)\n            ELSE ((quote_ident((nsp.nspname)::text) || '.'::text) || quote_ident((rel.relname)::text))\n        END AS objname,\n    l.provider,\n    l.label\n   FROM ((pg_seclabel l\n     JOIN pg_class rel ON (((l.classoid = rel.tableoid) AND (l.objoid = rel.oid))))\n     JOIN pg_namespace nsp ON ((rel.relnamespace = nsp.oid)))\n  WHERE (l.objsubid = 0)\nUNION ALL\n SELECT l.objoid,\n    l.classoid,\n    l.objsubid,\n    'column'::text AS objtype,\n    rel.relnamespace AS objnamespace,\n    ((\n        CASE\n            WHEN pg_table_is_visible(rel.oid) THEN quote_ident((rel.relname)::text)\n            ELSE ((quote_ident((nsp.nspname)::text) || '.'::text) || quote_ident((rel.relname)::text))\n        END || '.'::text) || (att.attname)::text) AS objname,\n    l.provider,\n    l.label\n   FROM (((pg_seclabel l\n     JOIN pg_class rel ON (((l.classoid = rel.tableoid) AND (l.objoid = rel.oid))))\n     JOIN pg_attribute att ON (((rel.oid = att.attrelid) AND (l.objsubid = att.attnum))))\n     JOIN pg_namespace nsp ON ((rel.relnamespace = nsp.oid)))\n  WHERE (l.objsubid <> 0)\nUNION ALL\n SELECT l.objoid,\n    l.classoid,\n    l.objsubid,\n        CASE pro.prokind\n            WHEN 'a'::\"char\" THEN 'aggregate'::text\n            WHEN 'f'::\"char\" THEN 'function'::text\n            WHEN 'p'::\"char\" THEN 'procedure'::text\n            WHEN 'w'::\"char\" THEN 'window'::text\n            ELSE NULL::text\n        END AS objtype,\n    pro.pronamespace AS objnamespace,\n    (((\n        CASE\n            WHEN pg_function_is_visible(pro.oid) THEN quote_ident((pro.proname)::text)\n            ELSE ((quote_ident((nsp.nspname)::text) || '.'::text) || quote_ident((pro.proname)::text))\n        END || '('::text) || pg_get_function_arguments(pro.oid)) || ')'::text) AS objname,\n    l.provider,\n    l.label\n   FROM ((pg_seclabel l\n     JOIN pg_proc pro ON (((l.classoid = pro.tableoid) AND (l.objoid = pro.oid))))\n     JOIN pg_namespace nsp ON ((pro.pronamespace = nsp.oid)))\n  WHERE (l.objsubid = 0)\nUNION ALL\n SELECT l.objoid,\n    l.classoid,\n    l.objsubid,\n        CASE\n            WHEN (typ.typtype = 'd'::\"char\") THEN 'domain'::text\n            ELSE 'type'::text\n        END AS objtype,\n    typ.typnamespace AS objnamespace,\n        CASE\n            WHEN pg_type_is_visible(typ.oid) THEN quote_ident((typ.typname)::text)\n            ELSE ((quote_ident((nsp.nspname)::text) || '.'::text) || quote_ident((typ.typname)::text))\n        END AS objname,\n    l.provider,\n    l.label\n   FROM ((pg_seclabel l\n     JOIN pg_type typ ON (((l.classoid = typ.tableoid) AND (l.objoid = typ.oid))))\n     JOIN pg_namespace nsp ON ((typ.typnamespace = nsp.oid)))\n  WHERE (l.objsubid = 0)\nUNION ALL\n SELECT l.objoid,\n    l.classoid,\n    l.objsubid,\n    'large object'::text AS objtype,\n    NULL::oid AS objnamespace,\n    (l.objoid)::text AS objname,\n    l.provider,\n    l.label\n   FROM (pg_seclabel l\n     JOIN pg_largeobject_metadata lom ON ((l.objoid = lom.oid)))\n  WHERE ((l.classoid = ('pg_largeobject'::regclass)::oid) AND (l.objsubid = 0))\nUNION ALL\n SELECT l.objoid,\n    l.classoid,\n    l.objsubid,\n    'language'::text AS objtype,\n    NULL::oid AS objnamespace,\n    quote_ident((lan.lanname)::text) AS objname,\n    l.provider,\n    l.label\n   FROM (pg_seclabel l\n     JOIN pg_language lan ON (((l.classoid = lan.tableoid) AND (l.objoid = lan.oid))))\n  WHERE (l.objsubid = 0)\nUNION ALL\n SELECT l.objoid,\n    l.classoid,\n    l.objsubid,\n    'schema'::text AS objtype,\n    nsp.oid AS objnamespace,\n    quote_ident((nsp.nspname)::text) AS objname,\n    l.provider,\n    l.label\n   FROM (pg_seclabel l\n     JOIN pg_namespace nsp ON (((l.classoid = nsp.tableoid) AND (l.objoid = nsp.oid))))\n  WHERE (l.objsubid = 0)\nUNION ALL\n SELECT l.objoid,\n    l.classoid,\n    l.objsubid,\n    'event trigger'::text AS objtype,\n    NULL::oid AS objnamespace,\n    quote_ident((evt.evtname)::text) AS objname,\n    l.provider,\n    l.label\n   FROM (pg_seclabel l\n     JOIN pg_event_trigger evt ON (((l.classoid = evt.tableoid) AND (l.objoid = evt.oid))))\n  WHERE (l.objsubid = 0)\nUNION ALL\n SELECT l.objoid,\n    l.classoid,\n    l.objsubid,\n    'publication'::text AS objtype,\n    NULL::oid AS objnamespace,\n    quote_ident((p.pubname)::text) AS objname,\n    l.provider,\n    l.label\n   FROM (pg_seclabel l\n     JOIN pg_publication p ON (((l.classoid = p.tableoid) AND (l.objoid = p.oid))))\n  WHERE (l.objsubid = 0)\nUNION ALL\n SELECT l.objoid,\n    l.classoid,\n    0 AS objsubid,\n    'subscription'::text AS objtype,\n    NULL::oid AS objnamespace,\n    quote_ident((s.subname)::text) AS objname,\n    l.provider,\n    l.label\n   FROM (pg_shseclabel l\n     JOIN pg_subscription s ON (((l.classoid = s.tableoid) AND (l.objoid = s.oid))))\nUNION ALL\n SELECT l.objoid,\n    l.classoid,\n    0 AS objsubid,\n    'database'::text AS objtype,\n    NULL::oid AS objnamespace,\n    quote_ident((dat.datname)::text) AS objname,\n    l.provider,\n    l.label\n   FROM (pg_shseclabel l\n     JOIN pg_database dat ON (((l.classoid = dat.tableoid) AND (l.objoid = dat.oid))))\nUNION ALL\n SELECT l.objoid,\n    l.classoid,\n    0 AS objsubid,\n    'tablespace'::text AS objtype,\n    NULL::oid AS objnamespace,\n    quote_ident((spc.spcname)::text) AS objname,\n    l.provider,\n    l.label\n   FROM (pg_shseclabel l\n     JOIN pg_tablespace spc ON (((l.classoid = spc.tableoid) AND (l.objoid = spc.oid))))\nUNION ALL\n SELECT l.objoid,\n    l.classoid,\n    0 AS objsubid,\n    'role'::text AS objtype,\n    NULL::oid AS objnamespace,\n    quote_ident((rol.rolname)::text) AS objname,\n    l.provider,\n    l.label\n   FROM (pg_shseclabel l\n     JOIN pg_authid rol ON (((l.classoid = rol.tableoid) AND (l.objoid = rol.oid))));")
) {
    companion object {

        /**
         * The reference instance of <code>pg_catalog.pg_seclabels</code>
         */
        val PG_SECLABELS: PgSeclabels = PgSeclabels()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_seclabels.objoid</code>.
     */
    val OBJOID: TableField<Record, Long?> = createField(DSL.name("objoid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_seclabels.classoid</code>.
     */
    val CLASSOID: TableField<Record, Long?> = createField(DSL.name("classoid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_seclabels.objsubid</code>.
     */
    val OBJSUBID: TableField<Record, Int?> = createField(DSL.name("objsubid"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>pg_catalog.pg_seclabels.objtype</code>.
     */
    val OBJTYPE: TableField<Record, String?> = createField(DSL.name("objtype"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_seclabels.objnamespace</code>.
     */
    val OBJNAMESPACE: TableField<Record, Long?> = createField(DSL.name("objnamespace"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_seclabels.objname</code>.
     */
    val OBJNAME: TableField<Record, String?> = createField(DSL.name("objname"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_seclabels.provider</code>.
     */
    val PROVIDER: TableField<Record, String?> = createField(DSL.name("provider"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_seclabels.label</code>.
     */
    val LABEL: TableField<Record, String?> = createField(DSL.name("label"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_seclabels</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_seclabels</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_seclabels</code> table reference
     */
    constructor(): this(DSL.name("pg_seclabels"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PG_SECLABELS, null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgSeclabels = PgSeclabels(DSL.name(alias), this)
    override fun `as`(alias: Name): PgSeclabels = PgSeclabels(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgSeclabels = PgSeclabels(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgSeclabels = PgSeclabels(name, null)
}

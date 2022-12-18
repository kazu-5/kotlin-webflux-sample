/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import nu.studer.sample.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgPolicies extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_policies</code>
     */
    public static final PgPolicies PG_POLICIES = new PgPolicies();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_policies.schemaname</code>.
     */
    public final TableField<Record, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_policies.tablename</code>.
     */
    public final TableField<Record, String> TABLENAME = createField(DSL.name("tablename"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_policies.policyname</code>.
     */
    public final TableField<Record, String> POLICYNAME = createField(DSL.name("policyname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_policies.permissive</code>.
     */
    public final TableField<Record, String> PERMISSIVE = createField(DSL.name("permissive"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_policies.roles</code>.
     */
    public final TableField<Record, String[]> ROLES = createField(DSL.name("roles"), SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_policies.cmd</code>.
     */
    public final TableField<Record, String> CMD = createField(DSL.name("cmd"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_policies.qual</code>.
     */
    public final TableField<Record, String> QUAL = createField(DSL.name("qual"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_policies.with_check</code>.
     */
    public final TableField<Record, String> WITH_CHECK = createField(DSL.name("with_check"), SQLDataType.CLOB, this, "");

    private PgPolicies(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PgPolicies(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"pg_policies\" as  SELECT n.nspname AS schemaname,\n    c.relname AS tablename,\n    pol.polname AS policyname,\n        CASE\n            WHEN pol.polpermissive THEN 'PERMISSIVE'::text\n            ELSE 'RESTRICTIVE'::text\n        END AS permissive,\n        CASE\n            WHEN (pol.polroles = '{0}'::oid[]) THEN (string_to_array('public'::text, ''::text))::name[]\n            ELSE ARRAY( SELECT pg_authid.rolname\n               FROM pg_authid\n              WHERE (pg_authid.oid = ANY (pol.polroles))\n              ORDER BY pg_authid.rolname)\n        END AS roles,\n        CASE pol.polcmd\n            WHEN 'r'::\"char\" THEN 'SELECT'::text\n            WHEN 'a'::\"char\" THEN 'INSERT'::text\n            WHEN 'w'::\"char\" THEN 'UPDATE'::text\n            WHEN 'd'::\"char\" THEN 'DELETE'::text\n            WHEN '*'::\"char\" THEN 'ALL'::text\n            ELSE NULL::text\n        END AS cmd,\n    pg_get_expr(pol.polqual, pol.polrelid) AS qual,\n    pg_get_expr(pol.polwithcheck, pol.polrelid) AS with_check\n   FROM ((pg_policy pol\n     JOIN pg_class c ON ((c.oid = pol.polrelid)))\n     LEFT JOIN pg_namespace n ON ((n.oid = c.relnamespace)));"));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_policies</code> table reference
     */
    public PgPolicies(String alias) {
        this(DSL.name(alias), PG_POLICIES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_policies</code> table reference
     */
    public PgPolicies(Name alias) {
        this(alias, PG_POLICIES);
    }

    /**
     * Create a <code>pg_catalog.pg_policies</code> table reference
     */
    public PgPolicies() {
        this(DSL.name("pg_policies"), null);
    }

    public <O extends Record> PgPolicies(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PG_POLICIES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgPolicies as(String alias) {
        return new PgPolicies(DSL.name(alias), this);
    }

    @Override
    public PgPolicies as(Name alias) {
        return new PgPolicies(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPolicies rename(String name) {
        return new PgPolicies(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPolicies rename(Name name) {
        return new PgPolicies(name, null);
    }
}

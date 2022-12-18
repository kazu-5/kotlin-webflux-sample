/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema.tables;


import nu.studer.sample.information_schema.InformationSchema;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewColumnUsage extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.view_column_usage</code>
     */
    public static final ViewColumnUsage VIEW_COLUMN_USAGE = new ViewColumnUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column
     * <code>information_schema.view_column_usage.view_catalog</code>.
     */
    public final TableField<Record, String> VIEW_CATALOG = createField(DSL.name("view_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.view_column_usage.view_schema</code>.
     */
    public final TableField<Record, String> VIEW_SCHEMA = createField(DSL.name("view_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.view_column_usage.view_name</code>.
     */
    public final TableField<Record, String> VIEW_NAME = createField(DSL.name("view_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.view_column_usage.table_catalog</code>.
     */
    public final TableField<Record, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.view_column_usage.table_schema</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.view_column_usage.table_name</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("table_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.view_column_usage.column_name</code>.
     */
    public final TableField<Record, String> COLUMN_NAME = createField(DSL.name("column_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private ViewColumnUsage(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private ViewColumnUsage(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"view_column_usage\" as  SELECT DISTINCT (current_database())::information_schema.sql_identifier AS view_catalog,\n    (nv.nspname)::information_schema.sql_identifier AS view_schema,\n    (v.relname)::information_schema.sql_identifier AS view_name,\n    (current_database())::information_schema.sql_identifier AS table_catalog,\n    (nt.nspname)::information_schema.sql_identifier AS table_schema,\n    (t.relname)::information_schema.sql_identifier AS table_name,\n    (a.attname)::information_schema.sql_identifier AS column_name\n   FROM pg_namespace nv,\n    pg_class v,\n    pg_depend dv,\n    pg_depend dt,\n    pg_class t,\n    pg_namespace nt,\n    pg_attribute a\n  WHERE ((nv.oid = v.relnamespace) AND (v.relkind = 'v'::\"char\") AND (v.oid = dv.refobjid) AND (dv.refclassid = ('pg_class'::regclass)::oid) AND (dv.classid = ('pg_rewrite'::regclass)::oid) AND (dv.deptype = 'i'::\"char\") AND (dv.objid = dt.objid) AND (dv.refobjid <> dt.refobjid) AND (dt.classid = ('pg_rewrite'::regclass)::oid) AND (dt.refclassid = ('pg_class'::regclass)::oid) AND (dt.refobjid = t.oid) AND (t.relnamespace = nt.oid) AND (t.relkind = ANY (ARRAY['r'::\"char\", 'v'::\"char\", 'f'::\"char\", 'p'::\"char\"])) AND (t.oid = a.attrelid) AND (dt.refobjsubid = a.attnum) AND pg_has_role(t.relowner, 'USAGE'::text));"));
    }

    /**
     * Create an aliased <code>information_schema.view_column_usage</code> table
     * reference
     */
    public ViewColumnUsage(String alias) {
        this(DSL.name(alias), VIEW_COLUMN_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.view_column_usage</code> table
     * reference
     */
    public ViewColumnUsage(Name alias) {
        this(alias, VIEW_COLUMN_USAGE);
    }

    /**
     * Create a <code>information_schema.view_column_usage</code> table
     * reference
     */
    public ViewColumnUsage() {
        this(DSL.name("view_column_usage"), null);
    }

    public <O extends Record> ViewColumnUsage(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, VIEW_COLUMN_USAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ViewColumnUsage as(String alias) {
        return new ViewColumnUsage(DSL.name(alias), this);
    }

    @Override
    public ViewColumnUsage as(Name alias) {
        return new ViewColumnUsage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewColumnUsage rename(String name) {
        return new ViewColumnUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewColumnUsage rename(Name name) {
        return new ViewColumnUsage(name, null);
    }
}
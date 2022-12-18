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
public class ConstraintColumnUsage extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.constraint_column_usage</code>
     */
    public static final ConstraintColumnUsage CONSTRAINT_COLUMN_USAGE = new ConstraintColumnUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column
     * <code>information_schema.constraint_column_usage.table_catalog</code>.
     */
    public final TableField<Record, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.constraint_column_usage.table_schema</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.constraint_column_usage.table_name</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("table_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.constraint_column_usage.column_name</code>.
     */
    public final TableField<Record, String> COLUMN_NAME = createField(DSL.name("column_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.constraint_column_usage.constraint_catalog</code>.
     */
    public final TableField<Record, String> CONSTRAINT_CATALOG = createField(DSL.name("constraint_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.constraint_column_usage.constraint_schema</code>.
     */
    public final TableField<Record, String> CONSTRAINT_SCHEMA = createField(DSL.name("constraint_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.constraint_column_usage.constraint_name</code>.
     */
    public final TableField<Record, String> CONSTRAINT_NAME = createField(DSL.name("constraint_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private ConstraintColumnUsage(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private ConstraintColumnUsage(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"constraint_column_usage\" as  SELECT (current_database())::information_schema.sql_identifier AS table_catalog,\n    (x.tblschema)::information_schema.sql_identifier AS table_schema,\n    (x.tblname)::information_schema.sql_identifier AS table_name,\n    (x.colname)::information_schema.sql_identifier AS column_name,\n    (current_database())::information_schema.sql_identifier AS constraint_catalog,\n    (x.cstrschema)::information_schema.sql_identifier AS constraint_schema,\n    (x.cstrname)::information_schema.sql_identifier AS constraint_name\n   FROM ( SELECT DISTINCT nr.nspname,\n            r.relname,\n            r.relowner,\n            a.attname,\n            nc.nspname,\n            c.conname\n           FROM pg_namespace nr,\n            pg_class r,\n            pg_attribute a,\n            pg_depend d,\n            pg_namespace nc,\n            pg_constraint c\n          WHERE ((nr.oid = r.relnamespace) AND (r.oid = a.attrelid) AND (d.refclassid = ('pg_class'::regclass)::oid) AND (d.refobjid = r.oid) AND (d.refobjsubid = a.attnum) AND (d.classid = ('pg_constraint'::regclass)::oid) AND (d.objid = c.oid) AND (c.connamespace = nc.oid) AND (c.contype = 'c'::\"char\") AND (r.relkind = ANY (ARRAY['r'::\"char\", 'p'::\"char\"])) AND (NOT a.attisdropped))\n        UNION ALL\n         SELECT nr.nspname,\n            r.relname,\n            r.relowner,\n            a.attname,\n            nc.nspname,\n            c.conname\n           FROM pg_namespace nr,\n            pg_class r,\n            pg_attribute a,\n            pg_namespace nc,\n            pg_constraint c\n          WHERE ((nr.oid = r.relnamespace) AND (r.oid = a.attrelid) AND (nc.oid = c.connamespace) AND (r.oid =\n                CASE c.contype\n                    WHEN 'f'::\"char\" THEN c.confrelid\n                    ELSE c.conrelid\n                END) AND (a.attnum = ANY (\n                CASE c.contype\n                    WHEN 'f'::\"char\" THEN c.confkey\n                    ELSE c.conkey\n                END)) AND (NOT a.attisdropped) AND (c.contype = ANY (ARRAY['p'::\"char\", 'u'::\"char\", 'f'::\"char\"])) AND (r.relkind = ANY (ARRAY['r'::\"char\", 'p'::\"char\"])))) x(tblschema, tblname, tblowner, colname, cstrschema, cstrname)\n  WHERE pg_has_role(x.tblowner, 'USAGE'::text);"));
    }

    /**
     * Create an aliased <code>information_schema.constraint_column_usage</code>
     * table reference
     */
    public ConstraintColumnUsage(String alias) {
        this(DSL.name(alias), CONSTRAINT_COLUMN_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.constraint_column_usage</code>
     * table reference
     */
    public ConstraintColumnUsage(Name alias) {
        this(alias, CONSTRAINT_COLUMN_USAGE);
    }

    /**
     * Create a <code>information_schema.constraint_column_usage</code> table
     * reference
     */
    public ConstraintColumnUsage() {
        this(DSL.name("constraint_column_usage"), null);
    }

    public <O extends Record> ConstraintColumnUsage(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, CONSTRAINT_COLUMN_USAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ConstraintColumnUsage as(String alias) {
        return new ConstraintColumnUsage(DSL.name(alias), this);
    }

    @Override
    public ConstraintColumnUsage as(Name alias) {
        return new ConstraintColumnUsage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ConstraintColumnUsage rename(String name) {
        return new ConstraintColumnUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ConstraintColumnUsage rename(Name name) {
        return new ConstraintColumnUsage(name, null);
    }
}
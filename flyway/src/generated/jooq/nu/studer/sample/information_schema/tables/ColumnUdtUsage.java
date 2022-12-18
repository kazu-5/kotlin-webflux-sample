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
public class ColumnUdtUsage extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.column_udt_usage</code>
     */
    public static final ColumnUdtUsage COLUMN_UDT_USAGE = new ColumnUdtUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.column_udt_usage.udt_catalog</code>.
     */
    public final TableField<Record, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.column_udt_usage.udt_schema</code>.
     */
    public final TableField<Record, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.column_udt_usage.udt_name</code>.
     */
    public final TableField<Record, String> UDT_NAME = createField(DSL.name("udt_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.column_udt_usage.table_catalog</code>.
     */
    public final TableField<Record, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.column_udt_usage.table_schema</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.column_udt_usage.table_name</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("table_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.column_udt_usage.column_name</code>.
     */
    public final TableField<Record, String> COLUMN_NAME = createField(DSL.name("column_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private ColumnUdtUsage(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private ColumnUdtUsage(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"column_udt_usage\" as  SELECT (current_database())::information_schema.sql_identifier AS udt_catalog,\n    (COALESCE(nbt.nspname, nt.nspname))::information_schema.sql_identifier AS udt_schema,\n    (COALESCE(bt.typname, t.typname))::information_schema.sql_identifier AS udt_name,\n    (current_database())::information_schema.sql_identifier AS table_catalog,\n    (nc.nspname)::information_schema.sql_identifier AS table_schema,\n    (c.relname)::information_schema.sql_identifier AS table_name,\n    (a.attname)::information_schema.sql_identifier AS column_name\n   FROM pg_attribute a,\n    pg_class c,\n    pg_namespace nc,\n    ((pg_type t\n     JOIN pg_namespace nt ON ((t.typnamespace = nt.oid)))\n     LEFT JOIN (pg_type bt\n     JOIN pg_namespace nbt ON ((bt.typnamespace = nbt.oid))) ON (((t.typtype = 'd'::\"char\") AND (t.typbasetype = bt.oid))))\n  WHERE ((a.attrelid = c.oid) AND (a.atttypid = t.oid) AND (nc.oid = c.relnamespace) AND (a.attnum > 0) AND (NOT a.attisdropped) AND (c.relkind = ANY (ARRAY['r'::\"char\", 'v'::\"char\", 'f'::\"char\", 'p'::\"char\"])) AND pg_has_role(COALESCE(bt.typowner, t.typowner), 'USAGE'::text));"));
    }

    /**
     * Create an aliased <code>information_schema.column_udt_usage</code> table
     * reference
     */
    public ColumnUdtUsage(String alias) {
        this(DSL.name(alias), COLUMN_UDT_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.column_udt_usage</code> table
     * reference
     */
    public ColumnUdtUsage(Name alias) {
        this(alias, COLUMN_UDT_USAGE);
    }

    /**
     * Create a <code>information_schema.column_udt_usage</code> table reference
     */
    public ColumnUdtUsage() {
        this(DSL.name("column_udt_usage"), null);
    }

    public <O extends Record> ColumnUdtUsage(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, COLUMN_UDT_USAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ColumnUdtUsage as(String alias) {
        return new ColumnUdtUsage(DSL.name(alias), this);
    }

    @Override
    public ColumnUdtUsage as(Name alias) {
        return new ColumnUdtUsage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnUdtUsage rename(String name) {
        return new ColumnUdtUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnUdtUsage rename(Name name) {
        return new ColumnUdtUsage(name, null);
    }
}
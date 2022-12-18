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
public class TableConstraints extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.table_constraints</code>
     */
    public static final TableConstraints TABLE_CONSTRAINTS = new TableConstraints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column
     * <code>information_schema.table_constraints.constraint_catalog</code>.
     */
    public final TableField<Record, String> CONSTRAINT_CATALOG = createField(DSL.name("constraint_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.table_constraints.constraint_schema</code>.
     */
    public final TableField<Record, String> CONSTRAINT_SCHEMA = createField(DSL.name("constraint_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.table_constraints.constraint_name</code>.
     */
    public final TableField<Record, String> CONSTRAINT_NAME = createField(DSL.name("constraint_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.table_constraints.table_catalog</code>.
     */
    public final TableField<Record, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.table_constraints.table_schema</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.table_constraints.table_name</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("table_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.table_constraints.constraint_type</code>.
     */
    public final TableField<Record, String> CONSTRAINT_TYPE = createField(DSL.name("constraint_type"), nu.studer.sample.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.table_constraints.is_deferrable</code>.
     */
    public final TableField<Record, String> IS_DEFERRABLE = createField(DSL.name("is_deferrable"), nu.studer.sample.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.table_constraints.initially_deferred</code>.
     */
    public final TableField<Record, String> INITIALLY_DEFERRED = createField(DSL.name("initially_deferred"), nu.studer.sample.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column <code>information_schema.table_constraints.enforced</code>.
     */
    public final TableField<Record, String> ENFORCED = createField(DSL.name("enforced"), nu.studer.sample.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    private TableConstraints(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private TableConstraints(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"table_constraints\" as  SELECT (current_database())::information_schema.sql_identifier AS constraint_catalog,\n    (nc.nspname)::information_schema.sql_identifier AS constraint_schema,\n    (c.conname)::information_schema.sql_identifier AS constraint_name,\n    (current_database())::information_schema.sql_identifier AS table_catalog,\n    (nr.nspname)::information_schema.sql_identifier AS table_schema,\n    (r.relname)::information_schema.sql_identifier AS table_name,\n    (\n        CASE c.contype\n            WHEN 'c'::\"char\" THEN 'CHECK'::text\n            WHEN 'f'::\"char\" THEN 'FOREIGN KEY'::text\n            WHEN 'p'::\"char\" THEN 'PRIMARY KEY'::text\n            WHEN 'u'::\"char\" THEN 'UNIQUE'::text\n            ELSE NULL::text\n        END)::information_schema.character_data AS constraint_type,\n    (\n        CASE\n            WHEN c.condeferrable THEN 'YES'::text\n            ELSE 'NO'::text\n        END)::information_schema.yes_or_no AS is_deferrable,\n    (\n        CASE\n            WHEN c.condeferred THEN 'YES'::text\n            ELSE 'NO'::text\n        END)::information_schema.yes_or_no AS initially_deferred,\n    ('YES'::character varying)::information_schema.yes_or_no AS enforced\n   FROM pg_namespace nc,\n    pg_namespace nr,\n    pg_constraint c,\n    pg_class r\n  WHERE ((nc.oid = c.connamespace) AND (nr.oid = r.relnamespace) AND (c.conrelid = r.oid) AND (c.contype <> ALL (ARRAY['t'::\"char\", 'x'::\"char\"])) AND (r.relkind = ANY (ARRAY['r'::\"char\", 'p'::\"char\"])) AND (NOT pg_is_other_temp_schema(nr.oid)) AND (pg_has_role(r.relowner, 'USAGE'::text) OR has_table_privilege(r.oid, 'INSERT, UPDATE, DELETE, TRUNCATE, REFERENCES, TRIGGER'::text) OR has_any_column_privilege(r.oid, 'INSERT, UPDATE, REFERENCES'::text)))\nUNION ALL\n SELECT (current_database())::information_schema.sql_identifier AS constraint_catalog,\n    (nr.nspname)::information_schema.sql_identifier AS constraint_schema,\n    (((((((nr.oid)::text || '_'::text) || (r.oid)::text) || '_'::text) || (a.attnum)::text) || '_not_null'::text))::information_schema.sql_identifier AS constraint_name,\n    (current_database())::information_schema.sql_identifier AS table_catalog,\n    (nr.nspname)::information_schema.sql_identifier AS table_schema,\n    (r.relname)::information_schema.sql_identifier AS table_name,\n    ('CHECK'::character varying)::information_schema.character_data AS constraint_type,\n    ('NO'::character varying)::information_schema.yes_or_no AS is_deferrable,\n    ('NO'::character varying)::information_schema.yes_or_no AS initially_deferred,\n    ('YES'::character varying)::information_schema.yes_or_no AS enforced\n   FROM pg_namespace nr,\n    pg_class r,\n    pg_attribute a\n  WHERE ((nr.oid = r.relnamespace) AND (r.oid = a.attrelid) AND a.attnotnull AND (a.attnum > 0) AND (NOT a.attisdropped) AND (r.relkind = ANY (ARRAY['r'::\"char\", 'p'::\"char\"])) AND (NOT pg_is_other_temp_schema(nr.oid)) AND (pg_has_role(r.relowner, 'USAGE'::text) OR has_table_privilege(r.oid, 'INSERT, UPDATE, DELETE, TRUNCATE, REFERENCES, TRIGGER'::text) OR has_any_column_privilege(r.oid, 'INSERT, UPDATE, REFERENCES'::text)));"));
    }

    /**
     * Create an aliased <code>information_schema.table_constraints</code> table
     * reference
     */
    public TableConstraints(String alias) {
        this(DSL.name(alias), TABLE_CONSTRAINTS);
    }

    /**
     * Create an aliased <code>information_schema.table_constraints</code> table
     * reference
     */
    public TableConstraints(Name alias) {
        this(alias, TABLE_CONSTRAINTS);
    }

    /**
     * Create a <code>information_schema.table_constraints</code> table
     * reference
     */
    public TableConstraints() {
        this(DSL.name("table_constraints"), null);
    }

    public <O extends Record> TableConstraints(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, TABLE_CONSTRAINTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public TableConstraints as(String alias) {
        return new TableConstraints(DSL.name(alias), this);
    }

    @Override
    public TableConstraints as(Name alias) {
        return new TableConstraints(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TableConstraints rename(String name) {
        return new TableConstraints(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TableConstraints rename(Name name) {
        return new TableConstraints(name, null);
    }
}

/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema.tables;


import java.time.OffsetDateTime;

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
public class Triggers extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.triggers</code>
     */
    public static final Triggers TRIGGERS = new Triggers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.triggers.trigger_catalog</code>.
     */
    public final TableField<Record, String> TRIGGER_CATALOG = createField(DSL.name("trigger_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.triggers.trigger_schema</code>.
     */
    public final TableField<Record, String> TRIGGER_SCHEMA = createField(DSL.name("trigger_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.triggers.trigger_name</code>.
     */
    public final TableField<Record, String> TRIGGER_NAME = createField(DSL.name("trigger_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.triggers.event_manipulation</code>.
     */
    public final TableField<Record, String> EVENT_MANIPULATION = createField(DSL.name("event_manipulation"), nu.studer.sample.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.triggers.event_object_catalog</code>.
     */
    public final TableField<Record, String> EVENT_OBJECT_CATALOG = createField(DSL.name("event_object_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.triggers.event_object_schema</code>.
     */
    public final TableField<Record, String> EVENT_OBJECT_SCHEMA = createField(DSL.name("event_object_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.triggers.event_object_table</code>.
     */
    public final TableField<Record, String> EVENT_OBJECT_TABLE = createField(DSL.name("event_object_table"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.triggers.action_order</code>.
     */
    public final TableField<Record, Integer> ACTION_ORDER = createField(DSL.name("action_order"), nu.studer.sample.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.triggers.action_condition</code>.
     */
    public final TableField<Record, String> ACTION_CONDITION = createField(DSL.name("action_condition"), nu.studer.sample.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.triggers.action_statement</code>.
     */
    public final TableField<Record, String> ACTION_STATEMENT = createField(DSL.name("action_statement"), nu.studer.sample.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.triggers.action_orientation</code>.
     */
    public final TableField<Record, String> ACTION_ORIENTATION = createField(DSL.name("action_orientation"), nu.studer.sample.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.triggers.action_timing</code>.
     */
    public final TableField<Record, String> ACTION_TIMING = createField(DSL.name("action_timing"), nu.studer.sample.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.triggers.action_reference_old_table</code>.
     */
    public final TableField<Record, String> ACTION_REFERENCE_OLD_TABLE = createField(DSL.name("action_reference_old_table"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.triggers.action_reference_new_table</code>.
     */
    public final TableField<Record, String> ACTION_REFERENCE_NEW_TABLE = createField(DSL.name("action_reference_new_table"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.triggers.action_reference_old_row</code>.
     */
    public final TableField<Record, String> ACTION_REFERENCE_OLD_ROW = createField(DSL.name("action_reference_old_row"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.triggers.action_reference_new_row</code>.
     */
    public final TableField<Record, String> ACTION_REFERENCE_NEW_ROW = createField(DSL.name("action_reference_new_row"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.triggers.created</code>.
     */
    public final TableField<Record, OffsetDateTime> CREATED = createField(DSL.name("created"), nu.studer.sample.information_schema.Domains.TIME_STAMP.getDataType(), this, "");

    private Triggers(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Triggers(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"triggers\" as  SELECT (current_database())::information_schema.sql_identifier AS trigger_catalog,\n    (n.nspname)::information_schema.sql_identifier AS trigger_schema,\n    (t.tgname)::information_schema.sql_identifier AS trigger_name,\n    (em.text)::information_schema.character_data AS event_manipulation,\n    (current_database())::information_schema.sql_identifier AS event_object_catalog,\n    (n.nspname)::information_schema.sql_identifier AS event_object_schema,\n    (c.relname)::information_schema.sql_identifier AS event_object_table,\n    (rank() OVER (PARTITION BY (n.nspname)::information_schema.sql_identifier, (c.relname)::information_schema.sql_identifier, em.num, ((t.tgtype)::integer & 1), ((t.tgtype)::integer & 66) ORDER BY t.tgname))::information_schema.cardinal_number AS action_order,\n    (\n        CASE\n            WHEN pg_has_role(c.relowner, 'USAGE'::text) THEN (regexp_match(pg_get_triggerdef(t.oid), '.{35,} WHEN \\((.+)\\) EXECUTE FUNCTION'::text))[1]\n            ELSE NULL::text\n        END)::information_schema.character_data AS action_condition,\n    (\"substring\"(pg_get_triggerdef(t.oid), (\"position\"(\"substring\"(pg_get_triggerdef(t.oid), 48), 'EXECUTE FUNCTION'::text) + 47)))::information_schema.character_data AS action_statement,\n    (\n        CASE ((t.tgtype)::integer & 1)\n            WHEN 1 THEN 'ROW'::text\n            ELSE 'STATEMENT'::text\n        END)::information_schema.character_data AS action_orientation,\n    (\n        CASE ((t.tgtype)::integer & 66)\n            WHEN 2 THEN 'BEFORE'::text\n            WHEN 64 THEN 'INSTEAD OF'::text\n            ELSE 'AFTER'::text\n        END)::information_schema.character_data AS action_timing,\n    (t.tgoldtable)::information_schema.sql_identifier AS action_reference_old_table,\n    (t.tgnewtable)::information_schema.sql_identifier AS action_reference_new_table,\n    (NULL::name)::information_schema.sql_identifier AS action_reference_old_row,\n    (NULL::name)::information_schema.sql_identifier AS action_reference_new_row,\n    (NULL::timestamp with time zone)::information_schema.time_stamp AS created\n   FROM pg_namespace n,\n    pg_class c,\n    pg_trigger t,\n    ( VALUES (4,'INSERT'::text), (8,'DELETE'::text), (16,'UPDATE'::text)) em(num, text)\n  WHERE ((n.oid = c.relnamespace) AND (c.oid = t.tgrelid) AND (((t.tgtype)::integer & em.num) <> 0) AND (NOT t.tgisinternal) AND (NOT pg_is_other_temp_schema(n.oid)) AND (pg_has_role(c.relowner, 'USAGE'::text) OR has_table_privilege(c.oid, 'INSERT, UPDATE, DELETE, TRUNCATE, REFERENCES, TRIGGER'::text) OR has_any_column_privilege(c.oid, 'INSERT, UPDATE, REFERENCES'::text)));"));
    }

    /**
     * Create an aliased <code>information_schema.triggers</code> table
     * reference
     */
    public Triggers(String alias) {
        this(DSL.name(alias), TRIGGERS);
    }

    /**
     * Create an aliased <code>information_schema.triggers</code> table
     * reference
     */
    public Triggers(Name alias) {
        this(alias, TRIGGERS);
    }

    /**
     * Create a <code>information_schema.triggers</code> table reference
     */
    public Triggers() {
        this(DSL.name("triggers"), null);
    }

    public <O extends Record> Triggers(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, TRIGGERS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Triggers as(String alias) {
        return new Triggers(DSL.name(alias), this);
    }

    @Override
    public Triggers as(Name alias) {
        return new Triggers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Triggers rename(String name) {
        return new Triggers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Triggers rename(Name name) {
        return new Triggers(name, null);
    }
}

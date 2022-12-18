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
public class CheckConstraintRoutineUsage extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.check_constraint_routine_usage</code>
     */
    public static final CheckConstraintRoutineUsage CHECK_CONSTRAINT_ROUTINE_USAGE = new CheckConstraintRoutineUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column
     * <code>information_schema.check_constraint_routine_usage.constraint_catalog</code>.
     */
    public final TableField<Record, String> CONSTRAINT_CATALOG = createField(DSL.name("constraint_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.check_constraint_routine_usage.constraint_schema</code>.
     */
    public final TableField<Record, String> CONSTRAINT_SCHEMA = createField(DSL.name("constraint_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.check_constraint_routine_usage.constraint_name</code>.
     */
    public final TableField<Record, String> CONSTRAINT_NAME = createField(DSL.name("constraint_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.check_constraint_routine_usage.specific_catalog</code>.
     */
    public final TableField<Record, String> SPECIFIC_CATALOG = createField(DSL.name("specific_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.check_constraint_routine_usage.specific_schema</code>.
     */
    public final TableField<Record, String> SPECIFIC_SCHEMA = createField(DSL.name("specific_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.check_constraint_routine_usage.specific_name</code>.
     */
    public final TableField<Record, String> SPECIFIC_NAME = createField(DSL.name("specific_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private CheckConstraintRoutineUsage(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private CheckConstraintRoutineUsage(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"check_constraint_routine_usage\" as  SELECT (current_database())::information_schema.sql_identifier AS constraint_catalog,\n    (nc.nspname)::information_schema.sql_identifier AS constraint_schema,\n    (c.conname)::information_schema.sql_identifier AS constraint_name,\n    (current_database())::information_schema.sql_identifier AS specific_catalog,\n    (np.nspname)::information_schema.sql_identifier AS specific_schema,\n    (nameconcatoid(p.proname, p.oid))::information_schema.sql_identifier AS specific_name\n   FROM pg_namespace nc,\n    pg_constraint c,\n    pg_depend d,\n    pg_proc p,\n    pg_namespace np\n  WHERE ((nc.oid = c.connamespace) AND (c.contype = 'c'::\"char\") AND (c.oid = d.objid) AND (d.classid = ('pg_constraint'::regclass)::oid) AND (d.refobjid = p.oid) AND (d.refclassid = ('pg_proc'::regclass)::oid) AND (p.pronamespace = np.oid) AND pg_has_role(p.proowner, 'USAGE'::text));"));
    }

    /**
     * Create an aliased
     * <code>information_schema.check_constraint_routine_usage</code> table
     * reference
     */
    public CheckConstraintRoutineUsage(String alias) {
        this(DSL.name(alias), CHECK_CONSTRAINT_ROUTINE_USAGE);
    }

    /**
     * Create an aliased
     * <code>information_schema.check_constraint_routine_usage</code> table
     * reference
     */
    public CheckConstraintRoutineUsage(Name alias) {
        this(alias, CHECK_CONSTRAINT_ROUTINE_USAGE);
    }

    /**
     * Create a <code>information_schema.check_constraint_routine_usage</code>
     * table reference
     */
    public CheckConstraintRoutineUsage() {
        this(DSL.name("check_constraint_routine_usage"), null);
    }

    public <O extends Record> CheckConstraintRoutineUsage(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, CHECK_CONSTRAINT_ROUTINE_USAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public CheckConstraintRoutineUsage as(String alias) {
        return new CheckConstraintRoutineUsage(DSL.name(alias), this);
    }

    @Override
    public CheckConstraintRoutineUsage as(Name alias) {
        return new CheckConstraintRoutineUsage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CheckConstraintRoutineUsage rename(String name) {
        return new CheckConstraintRoutineUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CheckConstraintRoutineUsage rename(Name name) {
        return new CheckConstraintRoutineUsage(name, null);
    }
}

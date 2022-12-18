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
public class PgHbaFileRules extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_hba_file_rules</code>
     */
    public static final PgHbaFileRules PG_HBA_FILE_RULES = new PgHbaFileRules();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.line_number</code>.
     */
    public final TableField<Record, Integer> LINE_NUMBER = createField(DSL.name("line_number"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.type</code>.
     */
    public final TableField<Record, String> TYPE = createField(DSL.name("type"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.database</code>.
     */
    public final TableField<Record, String[]> DATABASE = createField(DSL.name("database"), SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.user_name</code>.
     */
    public final TableField<Record, String[]> USER_NAME = createField(DSL.name("user_name"), SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.address</code>.
     */
    public final TableField<Record, String> ADDRESS = createField(DSL.name("address"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.netmask</code>.
     */
    public final TableField<Record, String> NETMASK = createField(DSL.name("netmask"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.auth_method</code>.
     */
    public final TableField<Record, String> AUTH_METHOD = createField(DSL.name("auth_method"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.options</code>.
     */
    public final TableField<Record, String[]> OPTIONS = createField(DSL.name("options"), SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.error</code>.
     */
    public final TableField<Record, String> ERROR = createField(DSL.name("error"), SQLDataType.CLOB, this, "");

    private PgHbaFileRules(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PgHbaFileRules(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"pg_hba_file_rules\" as  SELECT a.line_number,\n    a.type,\n    a.database,\n    a.user_name,\n    a.address,\n    a.netmask,\n    a.auth_method,\n    a.options,\n    a.error\n   FROM pg_hba_file_rules() a(line_number, type, database, user_name, address, netmask, auth_method, options, error);"));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_hba_file_rules</code> table
     * reference
     */
    public PgHbaFileRules(String alias) {
        this(DSL.name(alias), PG_HBA_FILE_RULES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_hba_file_rules</code> table
     * reference
     */
    public PgHbaFileRules(Name alias) {
        this(alias, PG_HBA_FILE_RULES);
    }

    /**
     * Create a <code>pg_catalog.pg_hba_file_rules</code> table reference
     */
    public PgHbaFileRules() {
        this(DSL.name("pg_hba_file_rules"), null);
    }

    public <O extends Record> PgHbaFileRules(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PG_HBA_FILE_RULES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgHbaFileRules as(String alias) {
        return new PgHbaFileRules(DSL.name(alias), this);
    }

    @Override
    public PgHbaFileRules as(Name alias) {
        return new PgHbaFileRules(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgHbaFileRules rename(String name) {
        return new PgHbaFileRules(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgHbaFileRules rename(Name name) {
        return new PgHbaFileRules(name, null);
    }
}

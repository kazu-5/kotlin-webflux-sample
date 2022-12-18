/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import java.util.Arrays;
import java.util.List;

import nu.studer.sample.pg_catalog.Indexes;
import nu.studer.sample.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
public class PgShdepend extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_shdepend</code>
     */
    public static final PgShdepend PG_SHDEPEND = new PgShdepend();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_shdepend.dbid</code>.
     */
    public final TableField<Record, Long> DBID = createField(DSL.name("dbid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_shdepend.classid</code>.
     */
    public final TableField<Record, Long> CLASSID = createField(DSL.name("classid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_shdepend.objid</code>.
     */
    public final TableField<Record, Long> OBJID = createField(DSL.name("objid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_shdepend.objsubid</code>.
     */
    public final TableField<Record, Integer> OBJSUBID = createField(DSL.name("objsubid"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_shdepend.refclassid</code>.
     */
    public final TableField<Record, Long> REFCLASSID = createField(DSL.name("refclassid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_shdepend.refobjid</code>.
     */
    public final TableField<Record, Long> REFOBJID = createField(DSL.name("refobjid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_shdepend.deptype</code>.
     */
    public final TableField<Record, String> DEPTYPE = createField(DSL.name("deptype"), SQLDataType.CHAR.nullable(false), this, "");

    private PgShdepend(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PgShdepend(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_shdepend</code> table reference
     */
    public PgShdepend(String alias) {
        this(DSL.name(alias), PG_SHDEPEND);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_shdepend</code> table reference
     */
    public PgShdepend(Name alias) {
        this(alias, PG_SHDEPEND);
    }

    /**
     * Create a <code>pg_catalog.pg_shdepend</code> table reference
     */
    public PgShdepend() {
        this(DSL.name("pg_shdepend"), null);
    }

    public <O extends Record> PgShdepend(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PG_SHDEPEND);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.PG_SHDEPEND_DEPENDER_INDEX, Indexes.PG_SHDEPEND_REFERENCE_INDEX);
    }

    @Override
    public PgShdepend as(String alias) {
        return new PgShdepend(DSL.name(alias), this);
    }

    @Override
    public PgShdepend as(Name alias) {
        return new PgShdepend(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgShdepend rename(String name) {
        return new PgShdepend(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgShdepend rename(Name name) {
        return new PgShdepend(name, null);
    }
}
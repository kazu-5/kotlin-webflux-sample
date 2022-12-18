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
public class PgRange extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_range</code>
     */
    public static final PgRange PG_RANGE = new PgRange();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_range.rngtypid</code>.
     */
    public final TableField<Record, Long> RNGTYPID = createField(DSL.name("rngtypid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_range.rngsubtype</code>.
     */
    public final TableField<Record, Long> RNGSUBTYPE = createField(DSL.name("rngsubtype"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_range.rngcollation</code>.
     */
    public final TableField<Record, Long> RNGCOLLATION = createField(DSL.name("rngcollation"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_range.rngsubopc</code>.
     */
    public final TableField<Record, Long> RNGSUBOPC = createField(DSL.name("rngsubopc"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_range.rngcanonical</code>.
     */
    public final TableField<Record, String> RNGCANONICAL = createField(DSL.name("rngcanonical"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_range.rngsubdiff</code>.
     */
    public final TableField<Record, String> RNGSUBDIFF = createField(DSL.name("rngsubdiff"), SQLDataType.VARCHAR.nullable(false), this, "");

    private PgRange(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PgRange(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_range</code> table reference
     */
    public PgRange(String alias) {
        this(DSL.name(alias), PG_RANGE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_range</code> table reference
     */
    public PgRange(Name alias) {
        this(alias, PG_RANGE);
    }

    /**
     * Create a <code>pg_catalog.pg_range</code> table reference
     */
    public PgRange() {
        this(DSL.name("pg_range"), null);
    }

    public <O extends Record> PgRange(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PG_RANGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.PG_RANGE_RNGTYPID_INDEX);
    }

    @Override
    public PgRange as(String alias) {
        return new PgRange(DSL.name(alias), this);
    }

    @Override
    public PgRange as(Name alias) {
        return new PgRange(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgRange rename(String name) {
        return new PgRange(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgRange rename(Name name) {
        return new PgRange(name, null);
    }
}

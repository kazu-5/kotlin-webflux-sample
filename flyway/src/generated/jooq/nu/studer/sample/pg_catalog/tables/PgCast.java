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
public class PgCast extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_cast</code>
     */
    public static final PgCast PG_CAST = new PgCast();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_cast.oid</code>.
     */
    public final TableField<Record, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_cast.castsource</code>.
     */
    public final TableField<Record, Long> CASTSOURCE = createField(DSL.name("castsource"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_cast.casttarget</code>.
     */
    public final TableField<Record, Long> CASTTARGET = createField(DSL.name("casttarget"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_cast.castfunc</code>.
     */
    public final TableField<Record, Long> CASTFUNC = createField(DSL.name("castfunc"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_cast.castcontext</code>.
     */
    public final TableField<Record, String> CASTCONTEXT = createField(DSL.name("castcontext"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_cast.castmethod</code>.
     */
    public final TableField<Record, String> CASTMETHOD = createField(DSL.name("castmethod"), SQLDataType.CHAR.nullable(false), this, "");

    private PgCast(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PgCast(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_cast</code> table reference
     */
    public PgCast(String alias) {
        this(DSL.name(alias), PG_CAST);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_cast</code> table reference
     */
    public PgCast(Name alias) {
        this(alias, PG_CAST);
    }

    /**
     * Create a <code>pg_catalog.pg_cast</code> table reference
     */
    public PgCast() {
        this(DSL.name("pg_cast"), null);
    }

    public <O extends Record> PgCast(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PG_CAST);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.PG_CAST_OID_INDEX, Indexes.PG_CAST_SOURCE_TARGET_INDEX);
    }

    @Override
    public PgCast as(String alias) {
        return new PgCast(DSL.name(alias), this);
    }

    @Override
    public PgCast as(Name alias) {
        return new PgCast(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgCast rename(String name) {
        return new PgCast(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgCast rename(Name name) {
        return new PgCast(name, null);
    }
}

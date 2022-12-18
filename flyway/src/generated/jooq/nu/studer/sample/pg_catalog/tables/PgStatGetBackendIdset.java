/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import nu.studer.sample.pg_catalog.PgCatalog;

import org.jooq.Field;
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
public class PgStatGetBackendIdset extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_stat_get_backend_idset</code>
     */
    public static final PgStatGetBackendIdset PG_STAT_GET_BACKEND_IDSET = new PgStatGetBackendIdset();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column
     * <code>pg_catalog.pg_stat_get_backend_idset.pg_stat_get_backend_idset</code>.
     */
    public final TableField<Record, Integer> PG_STAT_GET_BACKEND_IDSET_ = createField(DSL.name("pg_stat_get_backend_idset"), SQLDataType.INTEGER, this, "");

    private PgStatGetBackendIdset(Name alias, Table<Record> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgStatGetBackendIdset(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_get_backend_idset</code> table
     * reference
     */
    public PgStatGetBackendIdset(String alias) {
        this(DSL.name(alias), PG_STAT_GET_BACKEND_IDSET);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_get_backend_idset</code> table
     * reference
     */
    public PgStatGetBackendIdset(Name alias) {
        this(alias, PG_STAT_GET_BACKEND_IDSET);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_get_backend_idset</code> table
     * reference
     */
    public PgStatGetBackendIdset() {
        this(DSL.name("pg_stat_get_backend_idset"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatGetBackendIdset as(String alias) {
        return new PgStatGetBackendIdset(DSL.name(alias), this, parameters);
    }

    @Override
    public PgStatGetBackendIdset as(Name alias) {
        return new PgStatGetBackendIdset(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatGetBackendIdset rename(String name) {
        return new PgStatGetBackendIdset(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatGetBackendIdset rename(Name name) {
        return new PgStatGetBackendIdset(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgStatGetBackendIdset call() {
        PgStatGetBackendIdset result = new PgStatGetBackendIdset(DSL.name("pg_stat_get_backend_idset"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
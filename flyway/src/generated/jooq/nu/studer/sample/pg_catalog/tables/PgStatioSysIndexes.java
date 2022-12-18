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
public class PgStatioSysIndexes extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_statio_sys_indexes</code>
     */
    public static final PgStatioSysIndexes PG_STATIO_SYS_INDEXES = new PgStatioSysIndexes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_statio_sys_indexes.relid</code>.
     */
    public final TableField<Record, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_sys_indexes.indexrelid</code>.
     */
    public final TableField<Record, Long> INDEXRELID = createField(DSL.name("indexrelid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_sys_indexes.schemaname</code>.
     */
    public final TableField<Record, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_sys_indexes.relname</code>.
     */
    public final TableField<Record, String> RELNAME = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_sys_indexes.indexrelname</code>.
     */
    public final TableField<Record, String> INDEXRELNAME = createField(DSL.name("indexrelname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_sys_indexes.idx_blks_read</code>.
     */
    public final TableField<Record, Long> IDX_BLKS_READ = createField(DSL.name("idx_blks_read"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_sys_indexes.idx_blks_hit</code>.
     */
    public final TableField<Record, Long> IDX_BLKS_HIT = createField(DSL.name("idx_blks_hit"), SQLDataType.BIGINT, this, "");

    private PgStatioSysIndexes(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PgStatioSysIndexes(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"pg_statio_sys_indexes\" as  SELECT pg_statio_all_indexes.relid,\n    pg_statio_all_indexes.indexrelid,\n    pg_statio_all_indexes.schemaname,\n    pg_statio_all_indexes.relname,\n    pg_statio_all_indexes.indexrelname,\n    pg_statio_all_indexes.idx_blks_read,\n    pg_statio_all_indexes.idx_blks_hit\n   FROM pg_statio_all_indexes\n  WHERE ((pg_statio_all_indexes.schemaname = ANY (ARRAY['pg_catalog'::name, 'information_schema'::name])) OR (pg_statio_all_indexes.schemaname ~ '^pg_toast'::text));"));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statio_sys_indexes</code> table
     * reference
     */
    public PgStatioSysIndexes(String alias) {
        this(DSL.name(alias), PG_STATIO_SYS_INDEXES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statio_sys_indexes</code> table
     * reference
     */
    public PgStatioSysIndexes(Name alias) {
        this(alias, PG_STATIO_SYS_INDEXES);
    }

    /**
     * Create a <code>pg_catalog.pg_statio_sys_indexes</code> table reference
     */
    public PgStatioSysIndexes() {
        this(DSL.name("pg_statio_sys_indexes"), null);
    }

    public <O extends Record> PgStatioSysIndexes(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PG_STATIO_SYS_INDEXES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatioSysIndexes as(String alias) {
        return new PgStatioSysIndexes(DSL.name(alias), this);
    }

    @Override
    public PgStatioSysIndexes as(Name alias) {
        return new PgStatioSysIndexes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatioSysIndexes rename(String name) {
        return new PgStatioSysIndexes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatioSysIndexes rename(Name name) {
        return new PgStatioSysIndexes(name, null);
    }
}

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
public class PgShseclabel extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_shseclabel</code>
     */
    public static final PgShseclabel PG_SHSECLABEL = new PgShseclabel();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_shseclabel.objoid</code>.
     */
    public final TableField<Record, Long> OBJOID = createField(DSL.name("objoid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_shseclabel.classoid</code>.
     */
    public final TableField<Record, Long> CLASSOID = createField(DSL.name("classoid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_shseclabel.provider</code>.
     */
    public final TableField<Record, String> PROVIDER = createField(DSL.name("provider"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_shseclabel.label</code>.
     */
    public final TableField<Record, String> LABEL = createField(DSL.name("label"), SQLDataType.CLOB.nullable(false), this, "");

    private PgShseclabel(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PgShseclabel(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_shseclabel</code> table reference
     */
    public PgShseclabel(String alias) {
        this(DSL.name(alias), PG_SHSECLABEL);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_shseclabel</code> table reference
     */
    public PgShseclabel(Name alias) {
        this(alias, PG_SHSECLABEL);
    }

    /**
     * Create a <code>pg_catalog.pg_shseclabel</code> table reference
     */
    public PgShseclabel() {
        this(DSL.name("pg_shseclabel"), null);
    }

    public <O extends Record> PgShseclabel(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PG_SHSECLABEL);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.PG_SHSECLABEL_OBJECT_INDEX);
    }

    @Override
    public PgShseclabel as(String alias) {
        return new PgShseclabel(DSL.name(alias), this);
    }

    @Override
    public PgShseclabel as(Name alias) {
        return new PgShseclabel(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgShseclabel rename(String name) {
        return new PgShseclabel(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgShseclabel rename(Name name) {
        return new PgShseclabel(name, null);
    }
}
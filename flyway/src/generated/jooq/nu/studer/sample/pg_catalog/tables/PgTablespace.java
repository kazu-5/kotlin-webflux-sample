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
public class PgTablespace extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_tablespace</code>
     */
    public static final PgTablespace PG_TABLESPACE = new PgTablespace();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_tablespace.oid</code>.
     */
    public final TableField<Record, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_tablespace.spcname</code>.
     */
    public final TableField<Record, String> SPCNAME = createField(DSL.name("spcname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_tablespace.spcowner</code>.
     */
    public final TableField<Record, Long> SPCOWNER = createField(DSL.name("spcowner"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_tablespace.spcacl</code>.
     */
    public final TableField<Record, String[]> SPCACL = createField(DSL.name("spcacl"), SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_tablespace.spcoptions</code>.
     */
    public final TableField<Record, String[]> SPCOPTIONS = createField(DSL.name("spcoptions"), SQLDataType.CLOB.getArrayDataType(), this, "");

    private PgTablespace(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PgTablespace(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_tablespace</code> table reference
     */
    public PgTablespace(String alias) {
        this(DSL.name(alias), PG_TABLESPACE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_tablespace</code> table reference
     */
    public PgTablespace(Name alias) {
        this(alias, PG_TABLESPACE);
    }

    /**
     * Create a <code>pg_catalog.pg_tablespace</code> table reference
     */
    public PgTablespace() {
        this(DSL.name("pg_tablespace"), null);
    }

    public <O extends Record> PgTablespace(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PG_TABLESPACE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.PG_TABLESPACE_OID_INDEX, Indexes.PG_TABLESPACE_SPCNAME_INDEX);
    }

    @Override
    public PgTablespace as(String alias) {
        return new PgTablespace(DSL.name(alias), this);
    }

    @Override
    public PgTablespace as(Name alias) {
        return new PgTablespace(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTablespace rename(String name) {
        return new PgTablespace(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTablespace rename(Name name) {
        return new PgTablespace(name, null);
    }
}

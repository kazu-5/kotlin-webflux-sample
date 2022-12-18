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
public class PgForeignServer extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_foreign_server</code>
     */
    public static final PgForeignServer PG_FOREIGN_SERVER = new PgForeignServer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_foreign_server.oid</code>.
     */
    public final TableField<Record, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvname</code>.
     */
    public final TableField<Record, String> SRVNAME = createField(DSL.name("srvname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvowner</code>.
     */
    public final TableField<Record, Long> SRVOWNER = createField(DSL.name("srvowner"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvfdw</code>.
     */
    public final TableField<Record, Long> SRVFDW = createField(DSL.name("srvfdw"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvtype</code>.
     */
    public final TableField<Record, String> SRVTYPE = createField(DSL.name("srvtype"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvversion</code>.
     */
    public final TableField<Record, String> SRVVERSION = createField(DSL.name("srvversion"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvacl</code>.
     */
    public final TableField<Record, String[]> SRVACL = createField(DSL.name("srvacl"), SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvoptions</code>.
     */
    public final TableField<Record, String[]> SRVOPTIONS = createField(DSL.name("srvoptions"), SQLDataType.CLOB.getArrayDataType(), this, "");

    private PgForeignServer(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PgForeignServer(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_foreign_server</code> table
     * reference
     */
    public PgForeignServer(String alias) {
        this(DSL.name(alias), PG_FOREIGN_SERVER);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_foreign_server</code> table
     * reference
     */
    public PgForeignServer(Name alias) {
        this(alias, PG_FOREIGN_SERVER);
    }

    /**
     * Create a <code>pg_catalog.pg_foreign_server</code> table reference
     */
    public PgForeignServer() {
        this(DSL.name("pg_foreign_server"), null);
    }

    public <O extends Record> PgForeignServer(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PG_FOREIGN_SERVER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.PG_FOREIGN_SERVER_NAME_INDEX, Indexes.PG_FOREIGN_SERVER_OID_INDEX);
    }

    @Override
    public PgForeignServer as(String alias) {
        return new PgForeignServer(DSL.name(alias), this);
    }

    @Override
    public PgForeignServer as(Name alias) {
        return new PgForeignServer(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgForeignServer rename(String name) {
        return new PgForeignServer(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgForeignServer rename(Name name) {
        return new PgForeignServer(name, null);
    }
}

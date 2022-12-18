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
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class _PgForeignServers extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema._pg_foreign_servers</code>
     */
    public static final _PgForeignServers _PG_FOREIGN_SERVERS = new _PgForeignServers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema._pg_foreign_servers.oid</code>.
     */
    public final TableField<Record, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_servers.srvoptions</code>.
     */
    public final TableField<Record, String[]> SRVOPTIONS = createField(DSL.name("srvoptions"), SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_servers.foreign_server_catalog</code>.
     */
    public final TableField<Record, String> FOREIGN_SERVER_CATALOG = createField(DSL.name("foreign_server_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_servers.foreign_server_name</code>.
     */
    public final TableField<Record, String> FOREIGN_SERVER_NAME = createField(DSL.name("foreign_server_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_servers.foreign_data_wrapper_catalog</code>.
     */
    public final TableField<Record, String> FOREIGN_DATA_WRAPPER_CATALOG = createField(DSL.name("foreign_data_wrapper_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_servers.foreign_data_wrapper_name</code>.
     */
    public final TableField<Record, String> FOREIGN_DATA_WRAPPER_NAME = createField(DSL.name("foreign_data_wrapper_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_servers.foreign_server_type</code>.
     */
    public final TableField<Record, String> FOREIGN_SERVER_TYPE = createField(DSL.name("foreign_server_type"), nu.studer.sample.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_servers.foreign_server_version</code>.
     */
    public final TableField<Record, String> FOREIGN_SERVER_VERSION = createField(DSL.name("foreign_server_version"), nu.studer.sample.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_servers.authorization_identifier</code>.
     */
    public final TableField<Record, String> AUTHORIZATION_IDENTIFIER = createField(DSL.name("authorization_identifier"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private _PgForeignServers(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private _PgForeignServers(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"_pg_foreign_servers\" as  SELECT s.oid,\n    s.srvoptions,\n    (current_database())::information_schema.sql_identifier AS foreign_server_catalog,\n    (s.srvname)::information_schema.sql_identifier AS foreign_server_name,\n    (current_database())::information_schema.sql_identifier AS foreign_data_wrapper_catalog,\n    (w.fdwname)::information_schema.sql_identifier AS foreign_data_wrapper_name,\n    (s.srvtype)::information_schema.character_data AS foreign_server_type,\n    (s.srvversion)::information_schema.character_data AS foreign_server_version,\n    (u.rolname)::information_schema.sql_identifier AS authorization_identifier\n   FROM pg_foreign_server s,\n    pg_foreign_data_wrapper w,\n    pg_authid u\n  WHERE ((w.oid = s.srvfdw) AND (u.oid = s.srvowner) AND (pg_has_role(s.srvowner, 'USAGE'::text) OR has_server_privilege(s.oid, 'USAGE'::text)));"));
    }

    /**
     * Create an aliased <code>information_schema._pg_foreign_servers</code>
     * table reference
     */
    public _PgForeignServers(String alias) {
        this(DSL.name(alias), _PG_FOREIGN_SERVERS);
    }

    /**
     * Create an aliased <code>information_schema._pg_foreign_servers</code>
     * table reference
     */
    public _PgForeignServers(Name alias) {
        this(alias, _PG_FOREIGN_SERVERS);
    }

    /**
     * Create a <code>information_schema._pg_foreign_servers</code> table
     * reference
     */
    public _PgForeignServers() {
        this(DSL.name("_pg_foreign_servers"), null);
    }

    public <O extends Record> _PgForeignServers(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, _PG_FOREIGN_SERVERS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public _PgForeignServers as(String alias) {
        return new _PgForeignServers(DSL.name(alias), this);
    }

    @Override
    public _PgForeignServers as(Name alias) {
        return new _PgForeignServers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public _PgForeignServers rename(String name) {
        return new _PgForeignServers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public _PgForeignServers rename(Name name) {
        return new _PgForeignServers(name, null);
    }
}
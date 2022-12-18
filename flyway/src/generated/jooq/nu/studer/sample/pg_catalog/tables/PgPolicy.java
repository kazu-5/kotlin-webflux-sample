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
public class PgPolicy extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_policy</code>
     */
    public static final PgPolicy PG_POLICY = new PgPolicy();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_policy.oid</code>.
     */
    public final TableField<Record, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_policy.polname</code>.
     */
    public final TableField<Record, String> POLNAME = createField(DSL.name("polname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_policy.polrelid</code>.
     */
    public final TableField<Record, Long> POLRELID = createField(DSL.name("polrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_policy.polcmd</code>.
     */
    public final TableField<Record, String> POLCMD = createField(DSL.name("polcmd"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_policy.polpermissive</code>.
     */
    public final TableField<Record, Boolean> POLPERMISSIVE = createField(DSL.name("polpermissive"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_policy.polroles</code>.
     */
    public final TableField<Record, Long[]> POLROLES = createField(DSL.name("polroles"), SQLDataType.BIGINT.getArrayDataType(), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<Record, Object> POLQUAL = createField(DSL.name("polqual"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<Record, Object> POLWITHCHECK = createField(DSL.name("polwithcheck"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "");

    private PgPolicy(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PgPolicy(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_policy</code> table reference
     */
    public PgPolicy(String alias) {
        this(DSL.name(alias), PG_POLICY);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_policy</code> table reference
     */
    public PgPolicy(Name alias) {
        this(alias, PG_POLICY);
    }

    /**
     * Create a <code>pg_catalog.pg_policy</code> table reference
     */
    public PgPolicy() {
        this(DSL.name("pg_policy"), null);
    }

    public <O extends Record> PgPolicy(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PG_POLICY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.PG_POLICY_OID_INDEX, Indexes.PG_POLICY_POLRELID_POLNAME_INDEX);
    }

    @Override
    public PgPolicy as(String alias) {
        return new PgPolicy(DSL.name(alias), this);
    }

    @Override
    public PgPolicy as(Name alias) {
        return new PgPolicy(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPolicy rename(String name) {
        return new PgPolicy(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPolicy rename(Name name) {
        return new PgPolicy(name, null);
    }
}

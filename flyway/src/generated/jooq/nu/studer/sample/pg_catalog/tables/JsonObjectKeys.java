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
public class JsonObjectKeys extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.json_object_keys</code>
     */
    public static final JsonObjectKeys JSON_OBJECT_KEYS = new JsonObjectKeys();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.json_object_keys.json_object_keys</code>.
     */
    public final TableField<Record, String> JSON_OBJECT_KEYS_ = createField(DSL.name("json_object_keys"), SQLDataType.CLOB, this, "");

    private JsonObjectKeys(Name alias, Table<Record> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.VARCHAR)
        });
    }

    private JsonObjectKeys(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.json_object_keys</code> table
     * reference
     */
    public JsonObjectKeys(String alias) {
        this(DSL.name(alias), JSON_OBJECT_KEYS);
    }

    /**
     * Create an aliased <code>pg_catalog.json_object_keys</code> table
     * reference
     */
    public JsonObjectKeys(Name alias) {
        this(alias, JSON_OBJECT_KEYS);
    }

    /**
     * Create a <code>pg_catalog.json_object_keys</code> table reference
     */
    public JsonObjectKeys() {
        this(DSL.name("json_object_keys"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public JsonObjectKeys as(String alias) {
        return new JsonObjectKeys(DSL.name(alias), this, parameters);
    }

    @Override
    public JsonObjectKeys as(Name alias) {
        return new JsonObjectKeys(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonObjectKeys rename(String name) {
        return new JsonObjectKeys(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonObjectKeys rename(Name name) {
        return new JsonObjectKeys(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public JsonObjectKeys call(
          String __1
    ) {
        JsonObjectKeys result = new JsonObjectKeys(DSL.name("json_object_keys"), null, new Field[] {
            DSL.val(__1, SQLDataType.VARCHAR)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public JsonObjectKeys call(
          Field<String> __1
    ) {
        JsonObjectKeys result = new JsonObjectKeys(DSL.name("json_object_keys"), null, new Field[] {
            __1
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}

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
public class JsonbArrayElements extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.jsonb_array_elements</code>
     */
    public static final JsonbArrayElements JSONB_ARRAY_ELEMENTS = new JsonbArrayElements();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.jsonb_array_elements.value</code>.
     */
    public final TableField<Record, String> VALUE = createField(DSL.name("value"), SQLDataType.VARCHAR, this, "");

    private JsonbArrayElements(Name alias, Table<Record> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.VARCHAR)
        });
    }

    private JsonbArrayElements(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.jsonb_array_elements</code> table
     * reference
     */
    public JsonbArrayElements(String alias) {
        this(DSL.name(alias), JSONB_ARRAY_ELEMENTS);
    }

    /**
     * Create an aliased <code>pg_catalog.jsonb_array_elements</code> table
     * reference
     */
    public JsonbArrayElements(Name alias) {
        this(alias, JSONB_ARRAY_ELEMENTS);
    }

    /**
     * Create a <code>pg_catalog.jsonb_array_elements</code> table reference
     */
    public JsonbArrayElements() {
        this(DSL.name("jsonb_array_elements"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public JsonbArrayElements as(String alias) {
        return new JsonbArrayElements(DSL.name(alias), this, parameters);
    }

    @Override
    public JsonbArrayElements as(Name alias) {
        return new JsonbArrayElements(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonbArrayElements rename(String name) {
        return new JsonbArrayElements(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonbArrayElements rename(Name name) {
        return new JsonbArrayElements(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public JsonbArrayElements call(
          String fromJson
    ) {
        JsonbArrayElements result = new JsonbArrayElements(DSL.name("jsonb_array_elements"), null, new Field[] {
            DSL.val(fromJson, SQLDataType.VARCHAR)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public JsonbArrayElements call(
          Field<String> fromJson
    ) {
        JsonbArrayElements result = new JsonbArrayElements(DSL.name("jsonb_array_elements"), null, new Field[] {
            fromJson
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}

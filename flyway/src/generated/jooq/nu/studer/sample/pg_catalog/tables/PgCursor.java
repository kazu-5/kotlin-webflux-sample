/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import java.time.OffsetDateTime;

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
public class PgCursor extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_cursor</code>
     */
    public static final PgCursor PG_CURSOR = new PgCursor();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_cursor.name</code>.
     */
    public final TableField<Record, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_cursor.statement</code>.
     */
    public final TableField<Record, String> STATEMENT = createField(DSL.name("statement"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_cursor.is_holdable</code>.
     */
    public final TableField<Record, Boolean> IS_HOLDABLE = createField(DSL.name("is_holdable"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_cursor.is_binary</code>.
     */
    public final TableField<Record, Boolean> IS_BINARY = createField(DSL.name("is_binary"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_cursor.is_scrollable</code>.
     */
    public final TableField<Record, Boolean> IS_SCROLLABLE = createField(DSL.name("is_scrollable"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_cursor.creation_time</code>.
     */
    public final TableField<Record, OffsetDateTime> CREATION_TIME = createField(DSL.name("creation_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgCursor(Name alias, Table<Record> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgCursor(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_cursor</code> table reference
     */
    public PgCursor(String alias) {
        this(DSL.name(alias), PG_CURSOR);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_cursor</code> table reference
     */
    public PgCursor(Name alias) {
        this(alias, PG_CURSOR);
    }

    /**
     * Create a <code>pg_catalog.pg_cursor</code> table reference
     */
    public PgCursor() {
        this(DSL.name("pg_cursor"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgCursor as(String alias) {
        return new PgCursor(DSL.name(alias), this, parameters);
    }

    @Override
    public PgCursor as(Name alias) {
        return new PgCursor(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgCursor rename(String name) {
        return new PgCursor(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgCursor rename(Name name) {
        return new PgCursor(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgCursor call() {
        PgCursor result = new PgCursor(DSL.name("pg_cursor"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}

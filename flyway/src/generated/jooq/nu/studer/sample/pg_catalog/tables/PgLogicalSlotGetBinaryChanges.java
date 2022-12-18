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
public class PgLogicalSlotGetBinaryChanges extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_logical_slot_get_binary_changes</code>
     */
    public static final PgLogicalSlotGetBinaryChanges PG_LOGICAL_SLOT_GET_BINARY_CHANGES = new PgLogicalSlotGetBinaryChanges();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<Record, Object> LSN = createField(DSL.name("lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * The column
     * <code>pg_catalog.pg_logical_slot_get_binary_changes.xid</code>.
     */
    public final TableField<Record, Long> XID = createField(DSL.name("xid"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_logical_slot_get_binary_changes.data</code>.
     */
    public final TableField<Record, byte[]> DATA = createField(DSL.name("data"), SQLDataType.BLOB, this, "");

    private PgLogicalSlotGetBinaryChanges(Name alias, Table<Record> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.VARCHAR),
            DSL.val(null, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\"")),
            DSL.val(null, SQLDataType.INTEGER),
            DSL.val(null, SQLDataType.CLOB.getArrayDataType())
        });
    }

    private PgLogicalSlotGetBinaryChanges(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased
     * <code>pg_catalog.pg_logical_slot_get_binary_changes</code> table
     * reference
     */
    public PgLogicalSlotGetBinaryChanges(String alias) {
        this(DSL.name(alias), PG_LOGICAL_SLOT_GET_BINARY_CHANGES);
    }

    /**
     * Create an aliased
     * <code>pg_catalog.pg_logical_slot_get_binary_changes</code> table
     * reference
     */
    public PgLogicalSlotGetBinaryChanges(Name alias) {
        this(alias, PG_LOGICAL_SLOT_GET_BINARY_CHANGES);
    }

    /**
     * Create a <code>pg_catalog.pg_logical_slot_get_binary_changes</code> table
     * reference
     */
    public PgLogicalSlotGetBinaryChanges() {
        this(DSL.name("pg_logical_slot_get_binary_changes"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgLogicalSlotGetBinaryChanges as(String alias) {
        return new PgLogicalSlotGetBinaryChanges(DSL.name(alias), this, parameters);
    }

    @Override
    public PgLogicalSlotGetBinaryChanges as(Name alias) {
        return new PgLogicalSlotGetBinaryChanges(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLogicalSlotGetBinaryChanges rename(String name) {
        return new PgLogicalSlotGetBinaryChanges(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLogicalSlotGetBinaryChanges rename(Name name) {
        return new PgLogicalSlotGetBinaryChanges(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgLogicalSlotGetBinaryChanges call(
          String slotName
        , Object uptoLsn
        , Integer uptoNchanges
        , String[] options
    ) {
        PgLogicalSlotGetBinaryChanges result = new PgLogicalSlotGetBinaryChanges(DSL.name("pg_logical_slot_get_binary_changes"), null, new Field[] {
            DSL.val(slotName, SQLDataType.VARCHAR),
            DSL.val(uptoLsn, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\"")),
            DSL.val(uptoNchanges, SQLDataType.INTEGER),
            DSL.val(options, SQLDataType.CLOB.getArrayDataType())
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public PgLogicalSlotGetBinaryChanges call(
          Field<String> slotName
        , Field<Object> uptoLsn
        , Field<Integer> uptoNchanges
        , Field<String[]> options
    ) {
        PgLogicalSlotGetBinaryChanges result = new PgLogicalSlotGetBinaryChanges(DSL.name("pg_logical_slot_get_binary_changes"), null, new Field[] {
            slotName,
            uptoLsn,
            uptoNchanges,
            options
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
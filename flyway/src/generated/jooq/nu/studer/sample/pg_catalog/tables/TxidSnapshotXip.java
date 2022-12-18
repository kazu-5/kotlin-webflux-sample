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
public class TxidSnapshotXip extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.txid_snapshot_xip</code>
     */
    public static final TxidSnapshotXip TXID_SNAPSHOT_XIP = new TxidSnapshotXip();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.txid_snapshot_xip.txid_snapshot_xip</code>.
     */
    public final TableField<Record, Long> TXID_SNAPSHOT_XIP_ = createField(DSL.name("txid_snapshot_xip"), SQLDataType.BIGINT, this, "");

    private TxidSnapshotXip(Name alias, Table<Record> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"txid_snapshot\""))
        });
    }

    private TxidSnapshotXip(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.txid_snapshot_xip</code> table
     * reference
     */
    public TxidSnapshotXip(String alias) {
        this(DSL.name(alias), TXID_SNAPSHOT_XIP);
    }

    /**
     * Create an aliased <code>pg_catalog.txid_snapshot_xip</code> table
     * reference
     */
    public TxidSnapshotXip(Name alias) {
        this(alias, TXID_SNAPSHOT_XIP);
    }

    /**
     * Create a <code>pg_catalog.txid_snapshot_xip</code> table reference
     */
    public TxidSnapshotXip() {
        this(DSL.name("txid_snapshot_xip"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public TxidSnapshotXip as(String alias) {
        return new TxidSnapshotXip(DSL.name(alias), this, parameters);
    }

    @Override
    public TxidSnapshotXip as(Name alias) {
        return new TxidSnapshotXip(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public TxidSnapshotXip rename(String name) {
        return new TxidSnapshotXip(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public TxidSnapshotXip rename(Name name) {
        return new TxidSnapshotXip(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public TxidSnapshotXip call(
          Object __1
    ) {
        TxidSnapshotXip result = new TxidSnapshotXip(DSL.name("txid_snapshot_xip"), null, new Field[] {
            DSL.val(__1, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"txid_snapshot\""))
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public TxidSnapshotXip call(
          Field<Object> __1
    ) {
        TxidSnapshotXip result = new TxidSnapshotXip(DSL.name("txid_snapshot_xip"), null, new Field[] {
            __1
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}

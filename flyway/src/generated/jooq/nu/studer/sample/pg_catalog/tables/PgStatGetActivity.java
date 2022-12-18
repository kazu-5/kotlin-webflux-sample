/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import java.math.BigDecimal;
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
public class PgStatGetActivity extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_get_activity</code>
     */
    public static final PgStatGetActivity PG_STAT_GET_ACTIVITY = new PgStatGetActivity();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.datid</code>.
     */
    public final TableField<Record, Long> DATID = createField(DSL.name("datid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.pid</code>.
     */
    public final TableField<Record, Integer> PID = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.usesysid</code>.
     */
    public final TableField<Record, Long> USESYSID = createField(DSL.name("usesysid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.application_name</code>.
     */
    public final TableField<Record, String> APPLICATION_NAME = createField(DSL.name("application_name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.state</code>.
     */
    public final TableField<Record, String> STATE = createField(DSL.name("state"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.query</code>.
     */
    public final TableField<Record, String> QUERY = createField(DSL.name("query"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.wait_event_type</code>.
     */
    public final TableField<Record, String> WAIT_EVENT_TYPE = createField(DSL.name("wait_event_type"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.wait_event</code>.
     */
    public final TableField<Record, String> WAIT_EVENT = createField(DSL.name("wait_event"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.xact_start</code>.
     */
    public final TableField<Record, OffsetDateTime> XACT_START = createField(DSL.name("xact_start"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.query_start</code>.
     */
    public final TableField<Record, OffsetDateTime> QUERY_START = createField(DSL.name("query_start"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.backend_start</code>.
     */
    public final TableField<Record, OffsetDateTime> BACKEND_START = createField(DSL.name("backend_start"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.state_change</code>.
     */
    public final TableField<Record, OffsetDateTime> STATE_CHANGE = createField(DSL.name("state_change"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.client_addr</code>.
     */
    public final TableField<Record, String> CLIENT_ADDR = createField(DSL.name("client_addr"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.client_hostname</code>.
     */
    public final TableField<Record, String> CLIENT_HOSTNAME = createField(DSL.name("client_hostname"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.client_port</code>.
     */
    public final TableField<Record, Integer> CLIENT_PORT = createField(DSL.name("client_port"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.backend_xid</code>.
     */
    public final TableField<Record, Long> BACKEND_XID = createField(DSL.name("backend_xid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.backend_xmin</code>.
     */
    public final TableField<Record, Long> BACKEND_XMIN = createField(DSL.name("backend_xmin"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.backend_type</code>.
     */
    public final TableField<Record, String> BACKEND_TYPE = createField(DSL.name("backend_type"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.ssl</code>.
     */
    public final TableField<Record, Boolean> SSL = createField(DSL.name("ssl"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.sslversion</code>.
     */
    public final TableField<Record, String> SSLVERSION = createField(DSL.name("sslversion"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.sslcipher</code>.
     */
    public final TableField<Record, String> SSLCIPHER = createField(DSL.name("sslcipher"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.sslbits</code>.
     */
    public final TableField<Record, Integer> SSLBITS = createField(DSL.name("sslbits"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.sslcompression</code>.
     */
    public final TableField<Record, Boolean> SSLCOMPRESSION = createField(DSL.name("sslcompression"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.ssl_client_dn</code>.
     */
    public final TableField<Record, String> SSL_CLIENT_DN = createField(DSL.name("ssl_client_dn"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_get_activity.ssl_client_serial</code>.
     */
    public final TableField<Record, BigDecimal> SSL_CLIENT_SERIAL = createField(DSL.name("ssl_client_serial"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.ssl_issuer_dn</code>.
     */
    public final TableField<Record, String> SSL_ISSUER_DN = createField(DSL.name("ssl_issuer_dn"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.gss_auth</code>.
     */
    public final TableField<Record, Boolean> GSS_AUTH = createField(DSL.name("gss_auth"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.gss_princ</code>.
     */
    public final TableField<Record, String> GSS_PRINC = createField(DSL.name("gss_princ"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.gss_enc</code>.
     */
    public final TableField<Record, Boolean> GSS_ENC = createField(DSL.name("gss_enc"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_activity.leader_pid</code>.
     */
    public final TableField<Record, Integer> LEADER_PID = createField(DSL.name("leader_pid"), SQLDataType.INTEGER, this, "");

    private PgStatGetActivity(Name alias, Table<Record> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.INTEGER)
        });
    }

    private PgStatGetActivity(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_get_activity</code> table
     * reference
     */
    public PgStatGetActivity(String alias) {
        this(DSL.name(alias), PG_STAT_GET_ACTIVITY);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_get_activity</code> table
     * reference
     */
    public PgStatGetActivity(Name alias) {
        this(alias, PG_STAT_GET_ACTIVITY);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_get_activity</code> table reference
     */
    public PgStatGetActivity() {
        this(DSL.name("pg_stat_get_activity"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatGetActivity as(String alias) {
        return new PgStatGetActivity(DSL.name(alias), this, parameters);
    }

    @Override
    public PgStatGetActivity as(Name alias) {
        return new PgStatGetActivity(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatGetActivity rename(String name) {
        return new PgStatGetActivity(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatGetActivity rename(Name name) {
        return new PgStatGetActivity(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgStatGetActivity call(
          Integer pid
    ) {
        PgStatGetActivity result = new PgStatGetActivity(DSL.name("pg_stat_get_activity"), null, new Field[] {
            DSL.val(pid, SQLDataType.INTEGER)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public PgStatGetActivity call(
          Field<Integer> pid
    ) {
        PgStatGetActivity result = new PgStatGetActivity(DSL.name("pg_stat_get_activity"), null, new Field[] {
            pid
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}

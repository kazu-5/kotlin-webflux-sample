/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.routines;


import nu.studer.sample.pg_catalog.PgCatalog;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgEventTriggerTableRewriteOid extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>pg_catalog.pg_event_trigger_table_rewrite_oid.oid</code>.
     */
    public static final Parameter<Long> OID = Internal.createParameter("oid", SQLDataType.BIGINT, false, false);

    /**
     * Create a new routine call instance
     */
    public PgEventTriggerTableRewriteOid() {
        super("pg_event_trigger_table_rewrite_oid", PgCatalog.PG_CATALOG);

        addOutParameter(OID);
    }

    /**
     * Get the <code>oid</code> parameter OUT value from the routine
     */
    public Long getOid() {
        return get(OID);
    }
}
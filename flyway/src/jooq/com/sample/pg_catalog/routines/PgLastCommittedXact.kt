/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.routines


import com.sample.pg_catalog.PgCatalog

import java.time.OffsetDateTime

import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgLastCommittedXact : AbstractRoutine<java.lang.Void>("pg_last_committed_xact", PgCatalog.PG_CATALOG) {
    companion object {

        /**
         * The parameter <code>pg_catalog.pg_last_committed_xact.xid</code>.
         */
        val XID: Parameter<Long?> = Internal.createParameter("xid", SQLDataType.BIGINT, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_last_committed_xact.timestamp</code>.
         */
        val TIMESTAMP: Parameter<OffsetDateTime?> = Internal.createParameter("timestamp", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, false)
    }

    init {
        addOutParameter(XID)
        addOutParameter(TIMESTAMP)
    }

    /**
     * Get the <code>xid</code> parameter OUT value from the routine
     */
    fun getXid(): Long? = get(XID)

    /**
     * Get the <code>timestamp</code> parameter OUT value from the routine
     */
    fun getTimestamp(): OffsetDateTime? = get(TIMESTAMP)
}

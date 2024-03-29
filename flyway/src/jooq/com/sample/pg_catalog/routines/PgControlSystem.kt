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
open class PgControlSystem : AbstractRoutine<java.lang.Void>("pg_control_system", PgCatalog.PG_CATALOG) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.pg_control_system.pg_control_version</code>.
         */
        val PG_CONTROL_VERSION: Parameter<Int?> = Internal.createParameter("pg_control_version", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_control_system.catalog_version_no</code>.
         */
        val CATALOG_VERSION_NO: Parameter<Int?> = Internal.createParameter("catalog_version_no", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_control_system.system_identifier</code>.
         */
        val SYSTEM_IDENTIFIER: Parameter<Long?> = Internal.createParameter("system_identifier", SQLDataType.BIGINT, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_control_system.pg_control_last_modified</code>.
         */
        val PG_CONTROL_LAST_MODIFIED: Parameter<OffsetDateTime?> = Internal.createParameter("pg_control_last_modified", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, false)
    }

    init {
        addOutParameter(PG_CONTROL_VERSION)
        addOutParameter(CATALOG_VERSION_NO)
        addOutParameter(SYSTEM_IDENTIFIER)
        addOutParameter(PG_CONTROL_LAST_MODIFIED)
    }

    /**
     * Get the <code>pg_control_version</code> parameter OUT value from the
     * routine
     */
    fun getPgControlVersion(): Int? = get(PG_CONTROL_VERSION)

    /**
     * Get the <code>catalog_version_no</code> parameter OUT value from the
     * routine
     */
    fun getCatalogVersionNo(): Int? = get(CATALOG_VERSION_NO)

    /**
     * Get the <code>system_identifier</code> parameter OUT value from the
     * routine
     */
    fun getSystemIdentifier(): Long? = get(SYSTEM_IDENTIFIER)

    /**
     * Get the <code>pg_control_last_modified</code> parameter OUT value from
     * the routine
     */
    fun getPgControlLastModified(): OffsetDateTime? = get(PG_CONTROL_LAST_MODIFIED)
}

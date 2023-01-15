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
open class PgConfLoadTime : AbstractRoutine<OffsetDateTime>("pg_conf_load_time", PgCatalog.PG_CATALOG, SQLDataType.TIMESTAMPWITHTIMEZONE(6)) {
    companion object {

        /**
         * The parameter <code>pg_catalog.pg_conf_load_time.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<OffsetDateTime?> = Internal.createParameter("RETURN_VALUE", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, false)
    }

    init {
        returnParameter = RETURN_VALUE
    }
}

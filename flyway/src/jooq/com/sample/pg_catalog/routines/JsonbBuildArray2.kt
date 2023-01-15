/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.routines


import com.sample.pg_catalog.PgCatalog

import org.jooq.JSONB
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class JsonbBuildArray2 : AbstractRoutine<JSONB>("jsonb_build_array", PgCatalog.PG_CATALOG, SQLDataType.JSONB) {
    companion object {

        /**
         * The parameter <code>pg_catalog.jsonb_build_array.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<JSONB?> = Internal.createParameter("RETURN_VALUE", SQLDataType.JSONB, false, false)
    }

    init {
        returnParameter = RETURN_VALUE
        setOverloaded(true)
    }
}

/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.routines


import com.sample.pg_catalog.PgCatalog

import org.jooq.JSON
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class JsonBuildObject2 : AbstractRoutine<JSON>("json_build_object", PgCatalog.PG_CATALOG, SQLDataType.JSON) {
    companion object {

        /**
         * The parameter <code>pg_catalog.json_build_object.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<JSON?> = Internal.createParameter("RETURN_VALUE", SQLDataType.JSON, false, false)
    }

    init {
        returnParameter = RETURN_VALUE
        setOverloaded(true)
    }
}

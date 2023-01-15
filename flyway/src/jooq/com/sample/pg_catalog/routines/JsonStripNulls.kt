/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.routines


import com.sample.pg_catalog.PgCatalog

import org.jooq.Field
import org.jooq.JSON
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class JsonStripNulls : AbstractRoutine<JSON>("json_strip_nulls", PgCatalog.PG_CATALOG, SQLDataType.JSON) {
    companion object {

        /**
         * The parameter <code>pg_catalog.json_strip_nulls.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<JSON?> = Internal.createParameter("RETURN_VALUE", SQLDataType.JSON, false, false)

        /**
         * The parameter <code>pg_catalog.json_strip_nulls._1</code>.
         */
        val _1: Parameter<JSON?> = Internal.createParameter("_1", SQLDataType.JSON, false, true)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(_1)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: JSON?): Unit = setValue(_1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<JSON?>): Unit {
        setField(_1, field)
    }
}

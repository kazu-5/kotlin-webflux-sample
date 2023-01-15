/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.routines


import com.sample.pg_catalog.PgCatalog

import org.jooq.Field
import org.jooq.JSONB
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Int25 : AbstractRoutine<Short>("int2", PgCatalog.PG_CATALOG, SQLDataType.SMALLINT) {
    companion object {

        /**
         * The parameter <code>pg_catalog.int2.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Short?> = Internal.createParameter("RETURN_VALUE", SQLDataType.SMALLINT, false, false)

        /**
         * The parameter <code>pg_catalog.int2._1</code>.
         */
        val _1: Parameter<JSONB?> = Internal.createParameter("_1", SQLDataType.JSONB, false, true)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(_1)
        setOverloaded(true)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: JSONB?): Unit = setValue(_1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<JSONB?>): Unit {
        setField(_1, field)
    }
}

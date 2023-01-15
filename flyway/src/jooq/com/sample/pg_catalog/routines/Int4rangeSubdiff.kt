/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.routines


import com.sample.pg_catalog.PgCatalog

import org.jooq.Field
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Int4rangeSubdiff : AbstractRoutine<Double>("int4range_subdiff", PgCatalog.PG_CATALOG, SQLDataType.DOUBLE) {
    companion object {

        /**
         * The parameter <code>pg_catalog.int4range_subdiff.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Double?> = Internal.createParameter("RETURN_VALUE", SQLDataType.DOUBLE, false, false)

        /**
         * The parameter <code>pg_catalog.int4range_subdiff._1</code>.
         */
        val _1: Parameter<Int?> = Internal.createParameter("_1", SQLDataType.INTEGER, false, true)

        /**
         * The parameter <code>pg_catalog.int4range_subdiff._2</code>.
         */
        val _2: Parameter<Int?> = Internal.createParameter("_2", SQLDataType.INTEGER, false, true)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(_1)
        addInParameter(_2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Int?): Unit = setValue(_1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Int?>): Unit {
        setField(_1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Int?): Unit = setValue(_2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Int?>): Unit {
        setField(_2, field)
    }
}

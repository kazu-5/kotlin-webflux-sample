/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.routines


import com.sample.pg_catalog.PgCatalog

import java.time.LocalTime

import org.jooq.Field
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.types.YearToSecond


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Time2 : AbstractRoutine<LocalTime>("time", PgCatalog.PG_CATALOG, SQLDataType.LOCALTIME(6)) {
    companion object {

        /**
         * The parameter <code>pg_catalog.time.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<LocalTime?> = Internal.createParameter("RETURN_VALUE", SQLDataType.LOCALTIME(6), false, false)

        /**
         * The parameter <code>pg_catalog.time._1</code>.
         */
        val _1: Parameter<YearToSecond?> = Internal.createParameter("_1", SQLDataType.INTERVAL, false, true)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(_1)
        setOverloaded(true)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: YearToSecond?): Unit = setValue(_1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<YearToSecond?>): Unit {
        setField(_1, field)
    }
}

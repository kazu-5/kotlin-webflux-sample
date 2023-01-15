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


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Min9 : AbstractRoutine<LocalTime>("min", PgCatalog.PG_CATALOG, SQLDataType.LOCALTIME(6)) {
    companion object {

        /**
         * The parameter <code>pg_catalog.min.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<LocalTime?> = Internal.createParameter("RETURN_VALUE", SQLDataType.LOCALTIME(6), false, false)

        /**
         * The parameter <code>pg_catalog.min._1</code>.
         */
        val _1: Parameter<LocalTime?> = Internal.createParameter("_1", SQLDataType.LOCALTIME(6), false, true)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(_1)
        setOverloaded(true)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: LocalTime?): Unit = setValue(_1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<LocalTime?>): Unit {
        setField(_1, field)
    }
}

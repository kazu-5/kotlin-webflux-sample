/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.routines


import com.sample.pg_catalog.PgCatalog

import java.time.OffsetTime

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
open class TimetzPlInterval : AbstractRoutine<OffsetTime>("timetz_pl_interval", PgCatalog.PG_CATALOG, SQLDataType.TIMEWITHTIMEZONE(6)) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.timetz_pl_interval.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<OffsetTime?> = Internal.createParameter("RETURN_VALUE", SQLDataType.TIMEWITHTIMEZONE(6), false, false)

        /**
         * The parameter <code>pg_catalog.timetz_pl_interval._1</code>.
         */
        val _1: Parameter<OffsetTime?> = Internal.createParameter("_1", SQLDataType.TIMEWITHTIMEZONE(6), false, true)

        /**
         * The parameter <code>pg_catalog.timetz_pl_interval._2</code>.
         */
        val _2: Parameter<YearToSecond?> = Internal.createParameter("_2", SQLDataType.INTERVAL, false, true)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(_1)
        addInParameter(_2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: OffsetTime?): Unit = setValue(_1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<OffsetTime?>): Unit {
        setField(_1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: YearToSecond?): Unit = setValue(_2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<YearToSecond?>): Unit {
        setField(_2, field)
    }
}

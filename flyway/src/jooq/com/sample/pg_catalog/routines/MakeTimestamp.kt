/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.routines


import com.sample.pg_catalog.PgCatalog

import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class MakeTimestamp : AbstractRoutine<LocalDateTime>("make_timestamp", PgCatalog.PG_CATALOG, SQLDataType.LOCALDATETIME(6)) {
    companion object {

        /**
         * The parameter <code>pg_catalog.make_timestamp.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<LocalDateTime?> = Internal.createParameter("RETURN_VALUE", SQLDataType.LOCALDATETIME(6), false, false)

        /**
         * The parameter <code>pg_catalog.make_timestamp.year</code>.
         */
        val YEAR: Parameter<Int?> = Internal.createParameter("year", SQLDataType.INTEGER, false, false)

        /**
         * The parameter <code>pg_catalog.make_timestamp.month</code>.
         */
        val MONTH: Parameter<Int?> = Internal.createParameter("month", SQLDataType.INTEGER, false, false)

        /**
         * The parameter <code>pg_catalog.make_timestamp.mday</code>.
         */
        val MDAY: Parameter<Int?> = Internal.createParameter("mday", SQLDataType.INTEGER, false, false)

        /**
         * The parameter <code>pg_catalog.make_timestamp.hour</code>.
         */
        val HOUR: Parameter<Int?> = Internal.createParameter("hour", SQLDataType.INTEGER, false, false)

        /**
         * The parameter <code>pg_catalog.make_timestamp.min</code>.
         */
        val MIN: Parameter<Int?> = Internal.createParameter("min", SQLDataType.INTEGER, false, false)

        /**
         * The parameter <code>pg_catalog.make_timestamp.sec</code>.
         */
        val SEC: Parameter<Double?> = Internal.createParameter("sec", SQLDataType.DOUBLE, false, false)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(YEAR)
        addInParameter(MONTH)
        addInParameter(MDAY)
        addInParameter(HOUR)
        addInParameter(MIN)
        addInParameter(SEC)
    }

    /**
     * Set the <code>year</code> parameter IN value to the routine
     */
    fun setYear(value: Int?): Unit = setValue(YEAR, value)

    /**
     * Set the <code>year</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setYear(field: Field<Int?>): Unit {
        setField(YEAR, field)
    }

    /**
     * Set the <code>month</code> parameter IN value to the routine
     */
    fun setMonth(value: Int?): Unit = setValue(MONTH, value)

    /**
     * Set the <code>month</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setMonth(field: Field<Int?>): Unit {
        setField(MONTH, field)
    }

    /**
     * Set the <code>mday</code> parameter IN value to the routine
     */
    fun setMday(value: Int?): Unit = setValue(MDAY, value)

    /**
     * Set the <code>mday</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setMday(field: Field<Int?>): Unit {
        setField(MDAY, field)
    }

    /**
     * Set the <code>hour</code> parameter IN value to the routine
     */
    fun setHour(value: Int?): Unit = setValue(HOUR, value)

    /**
     * Set the <code>hour</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setHour(field: Field<Int?>): Unit {
        setField(HOUR, field)
    }

    /**
     * Set the <code>min</code> parameter IN value to the routine
     */
    fun setMin(value: Int?): Unit = setValue(MIN, value)

    /**
     * Set the <code>min</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setMin(field: Field<Int?>): Unit {
        setField(MIN, field)
    }

    /**
     * Set the <code>sec</code> parameter IN value to the routine
     */
    fun setSec(value: Double?): Unit = setValue(SEC, value)

    /**
     * Set the <code>sec</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setSec(field: Field<Double?>): Unit {
        setField(SEC, field)
    }
}

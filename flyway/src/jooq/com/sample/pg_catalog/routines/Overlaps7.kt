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
open class Overlaps7 : AbstractRoutine<Boolean>("overlaps", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN) {
    companion object {

        /**
         * The parameter <code>pg_catalog.overlaps.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Boolean?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false)

        /**
         * The parameter <code>pg_catalog.overlaps._1</code>.
         */
        val _1: Parameter<LocalTime?> = Internal.createParameter("_1", SQLDataType.LOCALTIME(6), false, true)

        /**
         * The parameter <code>pg_catalog.overlaps._2</code>.
         */
        val _2: Parameter<YearToSecond?> = Internal.createParameter("_2", SQLDataType.INTERVAL, false, true)

        /**
         * The parameter <code>pg_catalog.overlaps._3</code>.
         */
        val _3: Parameter<LocalTime?> = Internal.createParameter("_3", SQLDataType.LOCALTIME(6), false, true)

        /**
         * The parameter <code>pg_catalog.overlaps._4</code>.
         */
        val _4: Parameter<YearToSecond?> = Internal.createParameter("_4", SQLDataType.INTERVAL, false, true)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(_1)
        addInParameter(_2)
        addInParameter(_3)
        addInParameter(_4)
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

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    fun set__3(value: LocalTime?): Unit = setValue(_3, value)

    /**
     * Set the <code>_3</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__3(field: Field<LocalTime?>): Unit {
        setField(_3, field)
    }

    /**
     * Set the <code>_4</code> parameter IN value to the routine
     */
    fun set__4(value: YearToSecond?): Unit = setValue(_4, value)

    /**
     * Set the <code>_4</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__4(field: Field<YearToSecond?>): Unit {
        setField(_4, field)
    }
}

/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.routines


import com.sample.pg_catalog.PgCatalog

import java.time.LocalDateTime
import java.time.OffsetDateTime

import org.jooq.Field
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class TimestampLtTimestamptz : AbstractRoutine<Boolean>("timestamp_lt_timestamptz", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.timestamp_lt_timestamptz.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Boolean?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false)

        /**
         * The parameter <code>pg_catalog.timestamp_lt_timestamptz._1</code>.
         */
        val _1: Parameter<LocalDateTime?> = Internal.createParameter("_1", SQLDataType.LOCALDATETIME(6), false, true)

        /**
         * The parameter <code>pg_catalog.timestamp_lt_timestamptz._2</code>.
         */
        val _2: Parameter<OffsetDateTime?> = Internal.createParameter("_2", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, true)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(_1)
        addInParameter(_2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: LocalDateTime?): Unit = setValue(_1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<LocalDateTime?>): Unit {
        setField(_1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: OffsetDateTime?): Unit = setValue(_2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<OffsetDateTime?>): Unit {
        setField(_2, field)
    }
}

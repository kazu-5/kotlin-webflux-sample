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
open class PgGetConstraintdef2 : AbstractRoutine<String>("pg_get_constraintdef", PgCatalog.PG_CATALOG, SQLDataType.CLOB) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.pg_get_constraintdef.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<String?> = Internal.createParameter("RETURN_VALUE", SQLDataType.CLOB, false, false)

        /**
         * The parameter <code>pg_catalog.pg_get_constraintdef._1</code>.
         */
        val _1: Parameter<Long?> = Internal.createParameter("_1", SQLDataType.BIGINT, false, true)

        /**
         * The parameter <code>pg_catalog.pg_get_constraintdef._2</code>.
         */
        val _2: Parameter<Boolean?> = Internal.createParameter("_2", SQLDataType.BOOLEAN, false, true)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(_1)
        addInParameter(_2)
        setOverloaded(true)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Long?): Unit = setValue(_1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Long?>): Unit {
        setField(_1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Boolean?): Unit = setValue(_2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Boolean?>): Unit {
        setField(_2, field)
    }
}

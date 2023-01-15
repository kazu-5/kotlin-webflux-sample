/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.routines


import com.sample.pg_catalog.PgCatalog

import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class LoPut : AbstractRoutine<java.lang.Void>("lo_put", PgCatalog.PG_CATALOG) {
    companion object {

        /**
         * The parameter <code>pg_catalog.lo_put._1</code>.
         */
        val _1: Parameter<Long?> = Internal.createParameter("_1", SQLDataType.BIGINT, false, true)

        /**
         * The parameter <code>pg_catalog.lo_put._2</code>.
         */
        val _2: Parameter<Long?> = Internal.createParameter("_2", SQLDataType.BIGINT, false, true)

        /**
         * The parameter <code>pg_catalog.lo_put._3</code>.
         */
        val _3: Parameter<ByteArray?> = Internal.createParameter("_3", SQLDataType.BLOB, false, true)
    }

    init {
        addInParameter(_1)
        addInParameter(_2)
        addInParameter(_3)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Long?): Unit = setValue(_1, value)

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Long?): Unit = setValue(_2, value)

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    fun set__3(value: ByteArray?): Unit = setValue(_3, value)
}
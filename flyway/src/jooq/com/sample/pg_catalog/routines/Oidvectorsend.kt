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
open class Oidvectorsend : AbstractRoutine<ByteArray>("oidvectorsend", PgCatalog.PG_CATALOG, SQLDataType.BLOB) {
    companion object {

        /**
         * The parameter <code>pg_catalog.oidvectorsend.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<ByteArray?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BLOB, false, false)

        /**
         * The parameter <code>pg_catalog.oidvectorsend._1</code>.
         */
        val _1: Parameter<Array<Long?>?> = Internal.createParameter("_1", SQLDataType.BIGINT.getArrayDataType(), false, true)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(_1)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Array<Long?>?): Unit = setValue(_1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Array<Long?>?>): Unit {
        setField(_1, field)
    }
}

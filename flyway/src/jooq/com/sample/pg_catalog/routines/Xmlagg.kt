/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.routines


import com.sample.pg_catalog.PgCatalog

import org.jooq.Field
import org.jooq.Parameter
import org.jooq.XML
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Xmlagg : AbstractRoutine<XML>("xmlagg", PgCatalog.PG_CATALOG, SQLDataType.XML) {
    companion object {

        /**
         * The parameter <code>pg_catalog.xmlagg.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<XML?> = Internal.createParameter("RETURN_VALUE", SQLDataType.XML, false, false)

        /**
         * The parameter <code>pg_catalog.xmlagg._1</code>.
         */
        val _1: Parameter<XML?> = Internal.createParameter("_1", SQLDataType.XML, false, true)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(_1)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: XML?): Unit = setValue(_1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<XML?>): Unit {
        setField(_1, field)
    }
}
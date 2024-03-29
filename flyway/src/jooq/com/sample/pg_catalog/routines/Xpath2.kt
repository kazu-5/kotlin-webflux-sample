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
open class Xpath2 : AbstractRoutine<Array<XML?>>("xpath", PgCatalog.PG_CATALOG, SQLDataType.XML.getArrayDataType()) {
    companion object {

        /**
         * The parameter <code>pg_catalog.xpath.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Array<XML?>?> = Internal.createParameter("RETURN_VALUE", SQLDataType.XML.getArrayDataType(), false, false)

        /**
         * The parameter <code>pg_catalog.xpath._1</code>.
         */
        val _1: Parameter<String?> = Internal.createParameter("_1", SQLDataType.CLOB, false, true)

        /**
         * The parameter <code>pg_catalog.xpath._2</code>.
         */
        val _2: Parameter<XML?> = Internal.createParameter("_2", SQLDataType.XML, false, true)
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
    fun set__1(value: String?): Unit = setValue(_1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<String?>): Unit {
        setField(_1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: XML?): Unit = setValue(_2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<XML?>): Unit {
        setField(_2, field)
    }
}

/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.routines


import com.sample.pg_catalog.PgCatalog

import org.jooq.Field
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ParseIdent : AbstractRoutine<Array<String?>>("parse_ident", PgCatalog.PG_CATALOG, SQLDataType.CLOB.getArrayDataType()) {
    companion object {

        /**
         * The parameter <code>pg_catalog.parse_ident.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Array<String?>?> = Internal.createParameter("RETURN_VALUE", SQLDataType.CLOB.getArrayDataType(), false, false)

        /**
         * The parameter <code>pg_catalog.parse_ident.str</code>.
         */
        val STR: Parameter<String?> = Internal.createParameter("str", SQLDataType.CLOB, false, false)

        /**
         * The parameter <code>pg_catalog.parse_ident.strict</code>.
         */
        val STRICT: Parameter<Boolean?> = Internal.createParameter("strict", SQLDataType.BOOLEAN.defaultValue(DSL.field("true", SQLDataType.BOOLEAN)), true, false)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(STR)
        addInParameter(STRICT)
    }

    /**
     * Set the <code>str</code> parameter IN value to the routine
     */
    fun setStr(value: String?): Unit = setValue(STR, value)

    /**
     * Set the <code>str</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setStr(field: Field<String?>): Unit {
        setField(STR, field)
    }

    /**
     * Set the <code>strict</code> parameter IN value to the routine
     */
    fun setStrict(value: Boolean?): Unit = setValue(STRICT, value)

    /**
     * Set the <code>strict</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setStrict(field: Field<Boolean?>): Unit {
        setField(STRICT, field)
    }
}

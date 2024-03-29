/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.routines


import com.sample.pg_catalog.PgCatalog

import org.jooq.Field
import org.jooq.JSONB
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class JsonbSet : AbstractRoutine<JSONB>("jsonb_set", PgCatalog.PG_CATALOG, SQLDataType.JSONB) {
    companion object {

        /**
         * The parameter <code>pg_catalog.jsonb_set.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<JSONB?> = Internal.createParameter("RETURN_VALUE", SQLDataType.JSONB, false, false)

        /**
         * The parameter <code>pg_catalog.jsonb_set.jsonb_in</code>.
         */
        val JSONB_IN: Parameter<JSONB?> = Internal.createParameter("jsonb_in", SQLDataType.JSONB, false, false)

        /**
         * The parameter <code>pg_catalog.jsonb_set.path</code>.
         */
        val PATH: Parameter<Array<String?>?> = Internal.createParameter("path", SQLDataType.CLOB.getArrayDataType(), false, false)

        /**
         * The parameter <code>pg_catalog.jsonb_set.replacement</code>.
         */
        val REPLACEMENT: Parameter<JSONB?> = Internal.createParameter("replacement", SQLDataType.JSONB, false, false)

        /**
         * The parameter <code>pg_catalog.jsonb_set.create_if_missing</code>.
         */
        val CREATE_IF_MISSING: Parameter<Boolean?> = Internal.createParameter("create_if_missing", SQLDataType.BOOLEAN.defaultValue(DSL.field("true", SQLDataType.BOOLEAN)), true, false)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(JSONB_IN)
        addInParameter(PATH)
        addInParameter(REPLACEMENT)
        addInParameter(CREATE_IF_MISSING)
    }

    /**
     * Set the <code>jsonb_in</code> parameter IN value to the routine
     */
    fun setJsonbIn(value: JSONB?): Unit = setValue(JSONB_IN, value)

    /**
     * Set the <code>jsonb_in</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setJsonbIn(field: Field<JSONB?>): Unit {
        setField(JSONB_IN, field)
    }

    /**
     * Set the <code>path</code> parameter IN value to the routine
     */
    fun setPath(value: Array<String?>?): Unit = setValue(PATH, value)

    /**
     * Set the <code>path</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setPath(field: Field<Array<String?>?>): Unit {
        setField(PATH, field)
    }

    /**
     * Set the <code>replacement</code> parameter IN value to the routine
     */
    fun setReplacement(value: JSONB?): Unit = setValue(REPLACEMENT, value)

    /**
     * Set the <code>replacement</code> parameter to the function to be used
     * with a {@link org.jooq.Select} statement
     */
    fun setReplacement(field: Field<JSONB?>): Unit {
        setField(REPLACEMENT, field)
    }

    /**
     * Set the <code>create_if_missing</code> parameter IN value to the routine
     */
    fun setCreateIfMissing(value: Boolean?): Unit = setValue(CREATE_IF_MISSING, value)

    /**
     * Set the <code>create_if_missing</code> parameter to the function to be
     * used with a {@link org.jooq.Select} statement
     */
    fun setCreateIfMissing(field: Field<Boolean?>): Unit {
        setField(CREATE_IF_MISSING, field)
    }
}

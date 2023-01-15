/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.routines


import com.sample.pg_catalog.PgCatalog

import org.jooq.Field
import org.jooq.JSONB
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class JsonbExtractPath : AbstractRoutine<JSONB>("jsonb_extract_path", PgCatalog.PG_CATALOG, SQLDataType.JSONB) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.jsonb_extract_path.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<JSONB?> = Internal.createParameter("RETURN_VALUE", SQLDataType.JSONB, false, false)

        /**
         * The parameter <code>pg_catalog.jsonb_extract_path.from_json</code>.
         */
        val FROM_JSON: Parameter<JSONB?> = Internal.createParameter("from_json", SQLDataType.JSONB, false, false)

        /**
         * The parameter <code>pg_catalog.jsonb_extract_path.path_elems</code>.
         */
        val PATH_ELEMS: Parameter<Array<String?>?> = Internal.createParameter("path_elems", SQLDataType.CLOB.getArrayDataType(), false, false)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(FROM_JSON)
        addInParameter(PATH_ELEMS)
    }

    /**
     * Set the <code>from_json</code> parameter IN value to the routine
     */
    fun setFromJson(value: JSONB?): Unit = setValue(FROM_JSON, value)

    /**
     * Set the <code>from_json</code> parameter to the function to be used with
     * a {@link org.jooq.Select} statement
     */
    fun setFromJson(field: Field<JSONB?>): Unit {
        setField(FROM_JSON, field)
    }

    /**
     * Set the <code>path_elems</code> parameter IN value to the routine
     */
    fun setPathElems(value: Array<String?>?): Unit = setValue(PATH_ELEMS, value)

    /**
     * Set the <code>path_elems</code> parameter to the function to be used with
     * a {@link org.jooq.Select} statement
     */
    fun setPathElems(field: Field<Array<String?>?>): Unit {
        setField(PATH_ELEMS, field)
    }
}
/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.routines


import com.sample.pg_catalog.PgCatalog

import org.jooq.Field
import org.jooq.Parameter
import org.jooq.Record
import org.jooq.Result
import org.jooq.XML
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class CursorToXmlschema : AbstractRoutine<XML>("cursor_to_xmlschema", PgCatalog.PG_CATALOG, SQLDataType.XML) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.cursor_to_xmlschema.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<XML?> = Internal.createParameter("RETURN_VALUE", SQLDataType.XML, false, false)

        /**
         * The parameter <code>pg_catalog.cursor_to_xmlschema.cursor</code>.
         */
        val CURSOR: Parameter<Result<Record>?> = Internal.createParameter("cursor", SQLDataType.RESULT, false, false)

        /**
         * The parameter <code>pg_catalog.cursor_to_xmlschema.nulls</code>.
         */
        val NULLS: Parameter<Boolean?> = Internal.createParameter("nulls", SQLDataType.BOOLEAN, false, false)

        /**
         * The parameter
         * <code>pg_catalog.cursor_to_xmlschema.tableforest</code>.
         */
        val TABLEFOREST: Parameter<Boolean?> = Internal.createParameter("tableforest", SQLDataType.BOOLEAN, false, false)

        /**
         * The parameter <code>pg_catalog.cursor_to_xmlschema.targetns</code>.
         */
        val TARGETNS: Parameter<String?> = Internal.createParameter("targetns", SQLDataType.CLOB, false, false)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(CURSOR)
        addInParameter(NULLS)
        addInParameter(TABLEFOREST)
        addInParameter(TARGETNS)
    }

    /**
     * Set the <code>cursor</code> parameter IN value to the routine
     */
    fun setCursor(value: Result<Record>?): Unit = setValue(CURSOR, value)

    /**
     * Set the <code>cursor</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setCursor(field: Field<Result<Record>?>): Unit {
        setField(CURSOR, field)
    }

    /**
     * Set the <code>nulls</code> parameter IN value to the routine
     */
    fun setNulls(value: Boolean?): Unit = setValue(NULLS, value)

    /**
     * Set the <code>nulls</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setNulls(field: Field<Boolean?>): Unit {
        setField(NULLS, field)
    }

    /**
     * Set the <code>tableforest</code> parameter IN value to the routine
     */
    fun setTableforest(value: Boolean?): Unit = setValue(TABLEFOREST, value)

    /**
     * Set the <code>tableforest</code> parameter to the function to be used
     * with a {@link org.jooq.Select} statement
     */
    fun setTableforest(field: Field<Boolean?>): Unit {
        setField(TABLEFOREST, field)
    }

    /**
     * Set the <code>targetns</code> parameter IN value to the routine
     */
    fun setTargetns(value: String?): Unit = setValue(TARGETNS, value)

    /**
     * Set the <code>targetns</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setTargetns(field: Field<String?>): Unit {
        setField(TARGETNS, field)
    }
}

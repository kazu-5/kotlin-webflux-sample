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
open class DatabaseToXmlAndXmlschema : AbstractRoutine<XML>("database_to_xml_and_xmlschema", PgCatalog.PG_CATALOG, SQLDataType.XML) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.database_to_xml_and_xmlschema.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<XML?> = Internal.createParameter("RETURN_VALUE", SQLDataType.XML, false, false)

        /**
         * The parameter
         * <code>pg_catalog.database_to_xml_and_xmlschema.nulls</code>.
         */
        val NULLS: Parameter<Boolean?> = Internal.createParameter("nulls", SQLDataType.BOOLEAN, false, false)

        /**
         * The parameter
         * <code>pg_catalog.database_to_xml_and_xmlschema.tableforest</code>.
         */
        val TABLEFOREST: Parameter<Boolean?> = Internal.createParameter("tableforest", SQLDataType.BOOLEAN, false, false)

        /**
         * The parameter
         * <code>pg_catalog.database_to_xml_and_xmlschema.targetns</code>.
         */
        val TARGETNS: Parameter<String?> = Internal.createParameter("targetns", SQLDataType.CLOB, false, false)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(NULLS)
        addInParameter(TABLEFOREST)
        addInParameter(TARGETNS)
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

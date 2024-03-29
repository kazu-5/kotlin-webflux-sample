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
open class PgGetObjectAddress : AbstractRoutine<java.lang.Void>("pg_get_object_address", PgCatalog.PG_CATALOG) {
    companion object {

        /**
         * The parameter <code>pg_catalog.pg_get_object_address.type</code>.
         */
        val TYPE: Parameter<String?> = Internal.createParameter("type", SQLDataType.CLOB, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_get_object_address.object_names</code>.
         */
        val OBJECT_NAMES: Parameter<Array<String?>?> = Internal.createParameter("object_names", SQLDataType.CLOB.getArrayDataType(), false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_get_object_address.object_args</code>.
         */
        val OBJECT_ARGS: Parameter<Array<String?>?> = Internal.createParameter("object_args", SQLDataType.CLOB.getArrayDataType(), false, false)

        /**
         * The parameter <code>pg_catalog.pg_get_object_address.classid</code>.
         */
        val CLASSID: Parameter<Long?> = Internal.createParameter("classid", SQLDataType.BIGINT, false, false)

        /**
         * The parameter <code>pg_catalog.pg_get_object_address.objid</code>.
         */
        val OBJID: Parameter<Long?> = Internal.createParameter("objid", SQLDataType.BIGINT, false, false)

        /**
         * The parameter <code>pg_catalog.pg_get_object_address.objsubid</code>.
         */
        val OBJSUBID: Parameter<Int?> = Internal.createParameter("objsubid", SQLDataType.INTEGER, false, false)
    }

    init {
        addInParameter(TYPE)
        addInParameter(OBJECT_NAMES)
        addInParameter(OBJECT_ARGS)
        addOutParameter(CLASSID)
        addOutParameter(OBJID)
        addOutParameter(OBJSUBID)
    }

    /**
     * Set the <code>type</code> parameter IN value to the routine
     */
    fun setType(value: String?): Unit = setValue(TYPE, value)

    /**
     * Set the <code>object_names</code> parameter IN value to the routine
     */
    fun setObjectNames(value: Array<String?>?): Unit = setValue(OBJECT_NAMES, value)

    /**
     * Set the <code>object_args</code> parameter IN value to the routine
     */
    fun setObjectArgs(value: Array<String?>?): Unit = setValue(OBJECT_ARGS, value)

    /**
     * Get the <code>classid</code> parameter OUT value from the routine
     */
    fun getClassid(): Long? = get(CLASSID)

    /**
     * Get the <code>objid</code> parameter OUT value from the routine
     */
    fun getObjid(): Long? = get(OBJID)

    /**
     * Get the <code>objsubid</code> parameter OUT value from the routine
     */
    fun getObjsubid(): Int? = get(OBJSUBID)
}

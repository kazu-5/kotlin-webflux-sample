/*
 * This file is generated by jOOQ.
 */
package com.sample.information_schema.routines


import com.sample.information_schema.InformationSchema

import org.jooq.Field
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class _PgNumericScale : AbstractRoutine<Int>("_pg_numeric_scale", InformationSchema.INFORMATION_SCHEMA, SQLDataType.INTEGER) {
    companion object {

        /**
         * The parameter
         * <code>information_schema._pg_numeric_scale.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Int?> = Internal.createParameter("RETURN_VALUE", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>information_schema._pg_numeric_scale.typid</code>.
         */
        val TYPID: Parameter<Long?> = Internal.createParameter("typid", SQLDataType.BIGINT, false, false)

        /**
         * The parameter
         * <code>information_schema._pg_numeric_scale.typmod</code>.
         */
        val TYPMOD: Parameter<Int?> = Internal.createParameter("typmod", SQLDataType.INTEGER, false, false)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(TYPID)
        addInParameter(TYPMOD)
    }

    /**
     * Set the <code>typid</code> parameter IN value to the routine
     */
    fun setTypid(value: Long?): Unit = setValue(TYPID, value)

    /**
     * Set the <code>typid</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setTypid(field: Field<Long?>): Unit {
        setField(TYPID, field)
    }

    /**
     * Set the <code>typmod</code> parameter IN value to the routine
     */
    fun setTypmod(value: Int?): Unit = setValue(TYPMOD, value)

    /**
     * Set the <code>typmod</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setTypmod(field: Field<Int?>): Unit {
        setField(TYPMOD, field)
    }
}

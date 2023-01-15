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
open class PgSequenceParameters : AbstractRoutine<java.lang.Void>("pg_sequence_parameters", PgCatalog.PG_CATALOG) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.pg_sequence_parameters.sequence_oid</code>.
         */
        val SEQUENCE_OID: Parameter<Long?> = Internal.createParameter("sequence_oid", SQLDataType.BIGINT, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_sequence_parameters.start_value</code>.
         */
        val START_VALUE: Parameter<Long?> = Internal.createParameter("start_value", SQLDataType.BIGINT, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_sequence_parameters.minimum_value</code>.
         */
        val MINIMUM_VALUE: Parameter<Long?> = Internal.createParameter("minimum_value", SQLDataType.BIGINT, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_sequence_parameters.maximum_value</code>.
         */
        val MAXIMUM_VALUE: Parameter<Long?> = Internal.createParameter("maximum_value", SQLDataType.BIGINT, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_sequence_parameters.increment</code>.
         */
        val INCREMENT: Parameter<Long?> = Internal.createParameter("increment", SQLDataType.BIGINT, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_sequence_parameters.cycle_option</code>.
         */
        val CYCLE_OPTION: Parameter<Boolean?> = Internal.createParameter("cycle_option", SQLDataType.BOOLEAN, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_sequence_parameters.cache_size</code>.
         */
        val CACHE_SIZE: Parameter<Long?> = Internal.createParameter("cache_size", SQLDataType.BIGINT, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_sequence_parameters.data_type</code>.
         */
        val DATA_TYPE: Parameter<Long?> = Internal.createParameter("data_type", SQLDataType.BIGINT, false, false)
    }

    init {
        addInParameter(SEQUENCE_OID)
        addOutParameter(START_VALUE)
        addOutParameter(MINIMUM_VALUE)
        addOutParameter(MAXIMUM_VALUE)
        addOutParameter(INCREMENT)
        addOutParameter(CYCLE_OPTION)
        addOutParameter(CACHE_SIZE)
        addOutParameter(DATA_TYPE)
    }

    /**
     * Set the <code>sequence_oid</code> parameter IN value to the routine
     */
    fun setSequenceOid(value: Long?): Unit = setValue(SEQUENCE_OID, value)

    /**
     * Get the <code>start_value</code> parameter OUT value from the routine
     */
    fun getStartValue(): Long? = get(START_VALUE)

    /**
     * Get the <code>minimum_value</code> parameter OUT value from the routine
     */
    fun getMinimumValue(): Long? = get(MINIMUM_VALUE)

    /**
     * Get the <code>maximum_value</code> parameter OUT value from the routine
     */
    fun getMaximumValue(): Long? = get(MAXIMUM_VALUE)

    /**
     * Get the <code>increment</code> parameter OUT value from the routine
     */
    fun getIncrement(): Long? = get(INCREMENT)

    /**
     * Get the <code>cycle_option</code> parameter OUT value from the routine
     */
    fun getCycleOption(): Boolean? = get(CYCLE_OPTION)

    /**
     * Get the <code>cache_size</code> parameter OUT value from the routine
     */
    fun getCacheSize(): Long? = get(CACHE_SIZE)

    /**
     * Get the <code>data_type</code> parameter OUT value from the routine
     */
    fun getDataType(): Long? = get(DATA_TYPE)
}
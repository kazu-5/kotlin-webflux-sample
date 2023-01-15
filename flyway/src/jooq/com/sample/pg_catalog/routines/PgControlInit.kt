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
open class PgControlInit : AbstractRoutine<java.lang.Void>("pg_control_init", PgCatalog.PG_CATALOG) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.pg_control_init.max_data_alignment</code>.
         */
        val MAX_DATA_ALIGNMENT: Parameter<Int?> = Internal.createParameter("max_data_alignment", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_control_init.database_block_size</code>.
         */
        val DATABASE_BLOCK_SIZE: Parameter<Int?> = Internal.createParameter("database_block_size", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_control_init.blocks_per_segment</code>.
         */
        val BLOCKS_PER_SEGMENT: Parameter<Int?> = Internal.createParameter("blocks_per_segment", SQLDataType.INTEGER, false, false)

        /**
         * The parameter <code>pg_catalog.pg_control_init.wal_block_size</code>.
         */
        val WAL_BLOCK_SIZE: Parameter<Int?> = Internal.createParameter("wal_block_size", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_control_init.bytes_per_wal_segment</code>.
         */
        val BYTES_PER_WAL_SEGMENT: Parameter<Int?> = Internal.createParameter("bytes_per_wal_segment", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_control_init.max_identifier_length</code>.
         */
        val MAX_IDENTIFIER_LENGTH: Parameter<Int?> = Internal.createParameter("max_identifier_length", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_control_init.max_index_columns</code>.
         */
        val MAX_INDEX_COLUMNS: Parameter<Int?> = Internal.createParameter("max_index_columns", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_control_init.max_toast_chunk_size</code>.
         */
        val MAX_TOAST_CHUNK_SIZE: Parameter<Int?> = Internal.createParameter("max_toast_chunk_size", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_control_init.large_object_chunk_size</code>.
         */
        val LARGE_OBJECT_CHUNK_SIZE: Parameter<Int?> = Internal.createParameter("large_object_chunk_size", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_control_init.float8_pass_by_value</code>.
         */
        val FLOAT8_PASS_BY_VALUE: Parameter<Boolean?> = Internal.createParameter("float8_pass_by_value", SQLDataType.BOOLEAN, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_control_init.data_page_checksum_version</code>.
         */
        val DATA_PAGE_CHECKSUM_VERSION: Parameter<Int?> = Internal.createParameter("data_page_checksum_version", SQLDataType.INTEGER, false, false)
    }

    init {
        addOutParameter(MAX_DATA_ALIGNMENT)
        addOutParameter(DATABASE_BLOCK_SIZE)
        addOutParameter(BLOCKS_PER_SEGMENT)
        addOutParameter(WAL_BLOCK_SIZE)
        addOutParameter(BYTES_PER_WAL_SEGMENT)
        addOutParameter(MAX_IDENTIFIER_LENGTH)
        addOutParameter(MAX_INDEX_COLUMNS)
        addOutParameter(MAX_TOAST_CHUNK_SIZE)
        addOutParameter(LARGE_OBJECT_CHUNK_SIZE)
        addOutParameter(FLOAT8_PASS_BY_VALUE)
        addOutParameter(DATA_PAGE_CHECKSUM_VERSION)
    }

    /**
     * Get the <code>max_data_alignment</code> parameter OUT value from the
     * routine
     */
    fun getMaxDataAlignment(): Int? = get(MAX_DATA_ALIGNMENT)

    /**
     * Get the <code>database_block_size</code> parameter OUT value from the
     * routine
     */
    fun getDatabaseBlockSize(): Int? = get(DATABASE_BLOCK_SIZE)

    /**
     * Get the <code>blocks_per_segment</code> parameter OUT value from the
     * routine
     */
    fun getBlocksPerSegment(): Int? = get(BLOCKS_PER_SEGMENT)

    /**
     * Get the <code>wal_block_size</code> parameter OUT value from the routine
     */
    fun getWalBlockSize(): Int? = get(WAL_BLOCK_SIZE)

    /**
     * Get the <code>bytes_per_wal_segment</code> parameter OUT value from the
     * routine
     */
    fun getBytesPerWalSegment(): Int? = get(BYTES_PER_WAL_SEGMENT)

    /**
     * Get the <code>max_identifier_length</code> parameter OUT value from the
     * routine
     */
    fun getMaxIdentifierLength(): Int? = get(MAX_IDENTIFIER_LENGTH)

    /**
     * Get the <code>max_index_columns</code> parameter OUT value from the
     * routine
     */
    fun getMaxIndexColumns(): Int? = get(MAX_INDEX_COLUMNS)

    /**
     * Get the <code>max_toast_chunk_size</code> parameter OUT value from the
     * routine
     */
    fun getMaxToastChunkSize(): Int? = get(MAX_TOAST_CHUNK_SIZE)

    /**
     * Get the <code>large_object_chunk_size</code> parameter OUT value from the
     * routine
     */
    fun getLargeObjectChunkSize(): Int? = get(LARGE_OBJECT_CHUNK_SIZE)

    /**
     * Get the <code>float8_pass_by_value</code> parameter OUT value from the
     * routine
     */
    fun getFloat8PassByValue(): Boolean? = get(FLOAT8_PASS_BY_VALUE)

    /**
     * Get the <code>data_page_checksum_version</code> parameter OUT value from
     * the routine
     */
    fun getDataPageChecksumVersion(): Int? = get(DATA_PAGE_CHECKSUM_VERSION)
}
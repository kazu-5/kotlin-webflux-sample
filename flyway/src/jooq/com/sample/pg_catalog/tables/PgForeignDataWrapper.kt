/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.tables


import com.sample.pg_catalog.PgCatalog
import com.sample.pg_catalog.indexes.PG_FOREIGN_DATA_WRAPPER_NAME_INDEX
import com.sample.pg_catalog.indexes.PG_FOREIGN_DATA_WRAPPER_OID_INDEX

import kotlin.collections.List

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Index
import org.jooq.Name
import org.jooq.Record
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgForeignDataWrapper(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, Record>?,
    aliased: Table<Record>?,
    parameters: Array<Field<*>?>?
): TableImpl<Record>(
    alias,
    PgCatalog.PG_CATALOG,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of
         * <code>pg_catalog.pg_foreign_data_wrapper</code>
         */
        val PG_FOREIGN_DATA_WRAPPER: PgForeignDataWrapper = PgForeignDataWrapper()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_foreign_data_wrapper.oid</code>.
     */
    val OID: TableField<Record, Long?> = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_foreign_data_wrapper.fdwname</code>.
     */
    val FDWNAME: TableField<Record, String?> = createField(DSL.name("fdwname"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_foreign_data_wrapper.fdwowner</code>.
     */
    val FDWOWNER: TableField<Record, Long?> = createField(DSL.name("fdwowner"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_foreign_data_wrapper.fdwhandler</code>.
     */
    val FDWHANDLER: TableField<Record, Long?> = createField(DSL.name("fdwhandler"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_foreign_data_wrapper.fdwvalidator</code>.
     */
    val FDWVALIDATOR: TableField<Record, Long?> = createField(DSL.name("fdwvalidator"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_foreign_data_wrapper.fdwacl</code>.
     */
    val FDWACL: TableField<Record, Array<String?>?> = createField(DSL.name("fdwacl"), SQLDataType.VARCHAR.getArrayDataType(), this, "")

    /**
     * The column <code>pg_catalog.pg_foreign_data_wrapper.fdwoptions</code>.
     */
    val FDWOPTIONS: TableField<Record, Array<String?>?> = createField(DSL.name("fdwoptions"), SQLDataType.CLOB.getArrayDataType(), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_foreign_data_wrapper</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_foreign_data_wrapper</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_foreign_data_wrapper</code> table reference
     */
    constructor(): this(DSL.name("pg_foreign_data_wrapper"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PG_FOREIGN_DATA_WRAPPER, null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getIndexes(): List<Index> = listOf(PG_FOREIGN_DATA_WRAPPER_NAME_INDEX, PG_FOREIGN_DATA_WRAPPER_OID_INDEX)
    override fun `as`(alias: String): PgForeignDataWrapper = PgForeignDataWrapper(DSL.name(alias), this)
    override fun `as`(alias: Name): PgForeignDataWrapper = PgForeignDataWrapper(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgForeignDataWrapper = PgForeignDataWrapper(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgForeignDataWrapper = PgForeignDataWrapper(name, null)
}

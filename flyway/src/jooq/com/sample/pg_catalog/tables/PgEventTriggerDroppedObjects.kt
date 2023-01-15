/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.tables


import com.sample.pg_catalog.PgCatalog

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgEventTriggerDroppedObjects(
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
    TableOptions.function()
) {
    companion object {

        /**
         * The reference instance of
         * <code>pg_catalog.pg_event_trigger_dropped_objects</code>
         */
        val PG_EVENT_TRIGGER_DROPPED_OBJECTS: PgEventTriggerDroppedObjects = PgEventTriggerDroppedObjects()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_dropped_objects.classid</code>.
     */
    val CLASSID: TableField<Record, Long?> = createField(DSL.name("classid"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_dropped_objects.objid</code>.
     */
    val OBJID: TableField<Record, Long?> = createField(DSL.name("objid"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_dropped_objects.objsubid</code>.
     */
    val OBJSUBID: TableField<Record, Int?> = createField(DSL.name("objsubid"), SQLDataType.INTEGER, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_dropped_objects.original</code>.
     */
    val ORIGINAL: TableField<Record, Boolean?> = createField(DSL.name("original"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_dropped_objects.normal</code>.
     */
    val NORMAL: TableField<Record, Boolean?> = createField(DSL.name("normal"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_dropped_objects.is_temporary</code>.
     */
    val IS_TEMPORARY: TableField<Record, Boolean?> = createField(DSL.name("is_temporary"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_dropped_objects.object_type</code>.
     */
    val OBJECT_TYPE: TableField<Record, String?> = createField(DSL.name("object_type"), SQLDataType.CLOB, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_dropped_objects.schema_name</code>.
     */
    val SCHEMA_NAME: TableField<Record, String?> = createField(DSL.name("schema_name"), SQLDataType.CLOB, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_dropped_objects.object_name</code>.
     */
    val OBJECT_NAME: TableField<Record, String?> = createField(DSL.name("object_name"), SQLDataType.CLOB, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_dropped_objects.object_identity</code>.
     */
    val OBJECT_IDENTITY: TableField<Record, String?> = createField(DSL.name("object_identity"), SQLDataType.CLOB, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_dropped_objects.address_names</code>.
     */
    val ADDRESS_NAMES: TableField<Record, Array<String?>?> = createField(DSL.name("address_names"), SQLDataType.CLOB.getArrayDataType(), this, "")

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_dropped_objects.address_args</code>.
     */
    val ADDRESS_ARGS: TableField<Record, Array<String?>?> = createField(DSL.name("address_args"), SQLDataType.CLOB.getArrayDataType(), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, arrayOf(
    ))
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased
     * <code>pg_catalog.pg_event_trigger_dropped_objects</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>pg_catalog.pg_event_trigger_dropped_objects</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_event_trigger_dropped_objects</code> table
     * reference
     */
    constructor(): this(DSL.name("pg_event_trigger_dropped_objects"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgEventTriggerDroppedObjects = PgEventTriggerDroppedObjects(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): PgEventTriggerDroppedObjects = PgEventTriggerDroppedObjects(alias, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgEventTriggerDroppedObjects = PgEventTriggerDroppedObjects(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgEventTriggerDroppedObjects = PgEventTriggerDroppedObjects(name, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(): PgEventTriggerDroppedObjects = PgEventTriggerDroppedObjects(DSL.name("pg_event_trigger_dropped_objects"), null, arrayOf()).let { if (aliased()) it.`as`(unqualifiedName) else it }
}

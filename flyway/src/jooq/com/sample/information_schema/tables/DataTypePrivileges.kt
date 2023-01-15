/*
 * This file is generated by jOOQ.
 */
package com.sample.information_schema.tables


import com.sample.information_schema.InformationSchema

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class DataTypePrivileges(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, Record>?,
    aliased: Table<Record>?,
    parameters: Array<Field<*>?>?
): TableImpl<Record>(
    alias,
    InformationSchema.INFORMATION_SCHEMA,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("create view \"data_type_privileges\" as  SELECT (current_database())::information_schema.sql_identifier AS object_catalog,\n    x.objschema AS object_schema,\n    x.objname AS object_name,\n    (x.objtype)::information_schema.character_data AS object_type,\n    x.objdtdid AS dtd_identifier\n   FROM ( SELECT attributes.udt_schema,\n            attributes.udt_name,\n            'USER-DEFINED TYPE'::text AS text,\n            attributes.dtd_identifier\n           FROM information_schema.attributes\n        UNION ALL\n         SELECT columns.table_schema,\n            columns.table_name,\n            'TABLE'::text AS text,\n            columns.dtd_identifier\n           FROM information_schema.columns\n        UNION ALL\n         SELECT domains.domain_schema,\n            domains.domain_name,\n            'DOMAIN'::text AS text,\n            domains.dtd_identifier\n           FROM information_schema.domains\n        UNION ALL\n         SELECT parameters.specific_schema,\n            parameters.specific_name,\n            'ROUTINE'::text AS text,\n            parameters.dtd_identifier\n           FROM information_schema.parameters\n        UNION ALL\n         SELECT routines.specific_schema,\n            routines.specific_name,\n            'ROUTINE'::text AS text,\n            routines.dtd_identifier\n           FROM information_schema.routines) x(objschema, objname, objtype, objdtdid);")
) {
    companion object {

        /**
         * The reference instance of
         * <code>information_schema.data_type_privileges</code>
         */
        val DATA_TYPE_PRIVILEGES: DataTypePrivileges = DataTypePrivileges()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column
     * <code>information_schema.data_type_privileges.object_catalog</code>.
     */
    val OBJECT_CATALOG: TableField<Record, String?> = createField(DSL.name("object_catalog"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.data_type_privileges.object_schema</code>.
     */
    val OBJECT_SCHEMA: TableField<Record, String?> = createField(DSL.name("object_schema"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.data_type_privileges.object_name</code>.
     */
    val OBJECT_NAME: TableField<Record, String?> = createField(DSL.name("object_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.data_type_privileges.object_type</code>.
     */
    val OBJECT_TYPE: TableField<Record, String?> = createField(DSL.name("object_type"), com.sample.information_schema.domains.CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.data_type_privileges.dtd_identifier</code>.
     */
    val DTD_IDENTIFIER: TableField<Record, String?> = createField(DSL.name("dtd_identifier"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.data_type_privileges</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.data_type_privileges</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.data_type_privileges</code> table
     * reference
     */
    constructor(): this(DSL.name("data_type_privileges"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, DATA_TYPE_PRIVILEGES, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): DataTypePrivileges = DataTypePrivileges(DSL.name(alias), this)
    override fun `as`(alias: Name): DataTypePrivileges = DataTypePrivileges(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): DataTypePrivileges = DataTypePrivileges(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): DataTypePrivileges = DataTypePrivileges(name, null)
}

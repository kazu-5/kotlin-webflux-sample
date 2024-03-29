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
open class CheckConstraintRoutineUsage(
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
    TableOptions.view("create view \"check_constraint_routine_usage\" as  SELECT (current_database())::information_schema.sql_identifier AS constraint_catalog,\n    (nc.nspname)::information_schema.sql_identifier AS constraint_schema,\n    (c.conname)::information_schema.sql_identifier AS constraint_name,\n    (current_database())::information_schema.sql_identifier AS specific_catalog,\n    (np.nspname)::information_schema.sql_identifier AS specific_schema,\n    (nameconcatoid(p.proname, p.oid))::information_schema.sql_identifier AS specific_name\n   FROM pg_namespace nc,\n    pg_constraint c,\n    pg_depend d,\n    pg_proc p,\n    pg_namespace np\n  WHERE ((nc.oid = c.connamespace) AND (c.contype = 'c'::\"char\") AND (c.oid = d.objid) AND (d.classid = ('pg_constraint'::regclass)::oid) AND (d.refobjid = p.oid) AND (d.refclassid = ('pg_proc'::regclass)::oid) AND (p.pronamespace = np.oid) AND pg_has_role(p.proowner, 'USAGE'::text));")
) {
    companion object {

        /**
         * The reference instance of
         * <code>information_schema.check_constraint_routine_usage</code>
         */
        val CHECK_CONSTRAINT_ROUTINE_USAGE: CheckConstraintRoutineUsage = CheckConstraintRoutineUsage()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column
     * <code>information_schema.check_constraint_routine_usage.constraint_catalog</code>.
     */
    val CONSTRAINT_CATALOG: TableField<Record, String?> = createField(DSL.name("constraint_catalog"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.check_constraint_routine_usage.constraint_schema</code>.
     */
    val CONSTRAINT_SCHEMA: TableField<Record, String?> = createField(DSL.name("constraint_schema"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.check_constraint_routine_usage.constraint_name</code>.
     */
    val CONSTRAINT_NAME: TableField<Record, String?> = createField(DSL.name("constraint_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.check_constraint_routine_usage.specific_catalog</code>.
     */
    val SPECIFIC_CATALOG: TableField<Record, String?> = createField(DSL.name("specific_catalog"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.check_constraint_routine_usage.specific_schema</code>.
     */
    val SPECIFIC_SCHEMA: TableField<Record, String?> = createField(DSL.name("specific_schema"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.check_constraint_routine_usage.specific_name</code>.
     */
    val SPECIFIC_NAME: TableField<Record, String?> = createField(DSL.name("specific_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased
     * <code>information_schema.check_constraint_routine_usage</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>information_schema.check_constraint_routine_usage</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.check_constraint_routine_usage</code>
     * table reference
     */
    constructor(): this(DSL.name("check_constraint_routine_usage"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, CHECK_CONSTRAINT_ROUTINE_USAGE, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): CheckConstraintRoutineUsage = CheckConstraintRoutineUsage(DSL.name(alias), this)
    override fun `as`(alias: Name): CheckConstraintRoutineUsage = CheckConstraintRoutineUsage(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): CheckConstraintRoutineUsage = CheckConstraintRoutineUsage(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): CheckConstraintRoutineUsage = CheckConstraintRoutineUsage(name, null)
}

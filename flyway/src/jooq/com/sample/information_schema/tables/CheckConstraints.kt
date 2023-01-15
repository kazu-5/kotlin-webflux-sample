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
open class CheckConstraints(
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
    TableOptions.view("create view \"check_constraints\" as  SELECT (current_database())::information_schema.sql_identifier AS constraint_catalog,\n    (rs.nspname)::information_schema.sql_identifier AS constraint_schema,\n    (con.conname)::information_schema.sql_identifier AS constraint_name,\n    (\"substring\"(pg_get_constraintdef(con.oid), 7))::information_schema.character_data AS check_clause\n   FROM (((pg_constraint con\n     LEFT JOIN pg_namespace rs ON ((rs.oid = con.connamespace)))\n     LEFT JOIN pg_class c ON ((c.oid = con.conrelid)))\n     LEFT JOIN pg_type t ON ((t.oid = con.contypid)))\n  WHERE (pg_has_role(COALESCE(c.relowner, t.typowner), 'USAGE'::text) AND (con.contype = 'c'::\"char\"))\nUNION\n SELECT (current_database())::information_schema.sql_identifier AS constraint_catalog,\n    (n.nspname)::information_schema.sql_identifier AS constraint_schema,\n    (((((((n.oid)::text || '_'::text) || (r.oid)::text) || '_'::text) || (a.attnum)::text) || '_not_null'::text))::information_schema.sql_identifier AS constraint_name,\n    (((a.attname)::text || ' IS NOT NULL'::text))::information_schema.character_data AS check_clause\n   FROM pg_namespace n,\n    pg_class r,\n    pg_attribute a\n  WHERE ((n.oid = r.relnamespace) AND (r.oid = a.attrelid) AND (a.attnum > 0) AND (NOT a.attisdropped) AND a.attnotnull AND (r.relkind = ANY (ARRAY['r'::\"char\", 'p'::\"char\"])) AND pg_has_role(r.relowner, 'USAGE'::text));")
) {
    companion object {

        /**
         * The reference instance of
         * <code>information_schema.check_constraints</code>
         */
        val CHECK_CONSTRAINTS: CheckConstraints = CheckConstraints()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column
     * <code>information_schema.check_constraints.constraint_catalog</code>.
     */
    val CONSTRAINT_CATALOG: TableField<Record, String?> = createField(DSL.name("constraint_catalog"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.check_constraints.constraint_schema</code>.
     */
    val CONSTRAINT_SCHEMA: TableField<Record, String?> = createField(DSL.name("constraint_schema"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.check_constraints.constraint_name</code>.
     */
    val CONSTRAINT_NAME: TableField<Record, String?> = createField(DSL.name("constraint_name"), com.sample.information_schema.domains.SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.check_constraints.check_clause</code>.
     */
    val CHECK_CLAUSE: TableField<Record, String?> = createField(DSL.name("check_clause"), com.sample.information_schema.domains.CHARACTER_DATA.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.check_constraints</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.check_constraints</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.check_constraints</code> table
     * reference
     */
    constructor(): this(DSL.name("check_constraints"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, CHECK_CONSTRAINTS, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): CheckConstraints = CheckConstraints(DSL.name(alias), this)
    override fun `as`(alias: Name): CheckConstraints = CheckConstraints(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): CheckConstraints = CheckConstraints(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): CheckConstraints = CheckConstraints(name, null)
}

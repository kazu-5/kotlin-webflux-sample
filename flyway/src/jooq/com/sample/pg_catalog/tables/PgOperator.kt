/*
 * This file is generated by jOOQ.
 */
package com.sample.pg_catalog.tables


import com.sample.pg_catalog.PgCatalog
import com.sample.pg_catalog.indexes.PG_OPERATOR_OID_INDEX
import com.sample.pg_catalog.indexes.PG_OPERATOR_OPRNAME_L_R_N_INDEX

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
open class PgOperator(
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
         * The reference instance of <code>pg_catalog.pg_operator</code>
         */
        val PG_OPERATOR: PgOperator = PgOperator()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>pg_catalog.pg_operator.oid</code>.
     */
    val OID: TableField<Record, Long?> = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprname</code>.
     */
    val OPRNAME: TableField<Record, String?> = createField(DSL.name("oprname"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprnamespace</code>.
     */
    val OPRNAMESPACE: TableField<Record, Long?> = createField(DSL.name("oprnamespace"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprowner</code>.
     */
    val OPROWNER: TableField<Record, Long?> = createField(DSL.name("oprowner"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprkind</code>.
     */
    val OPRKIND: TableField<Record, String?> = createField(DSL.name("oprkind"), SQLDataType.CHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprcanmerge</code>.
     */
    val OPRCANMERGE: TableField<Record, Boolean?> = createField(DSL.name("oprcanmerge"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprcanhash</code>.
     */
    val OPRCANHASH: TableField<Record, Boolean?> = createField(DSL.name("oprcanhash"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprleft</code>.
     */
    val OPRLEFT: TableField<Record, Long?> = createField(DSL.name("oprleft"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprright</code>.
     */
    val OPRRIGHT: TableField<Record, Long?> = createField(DSL.name("oprright"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprresult</code>.
     */
    val OPRRESULT: TableField<Record, Long?> = createField(DSL.name("oprresult"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprcom</code>.
     */
    val OPRCOM: TableField<Record, Long?> = createField(DSL.name("oprcom"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprnegate</code>.
     */
    val OPRNEGATE: TableField<Record, Long?> = createField(DSL.name("oprnegate"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprcode</code>.
     */
    val OPRCODE: TableField<Record, String?> = createField(DSL.name("oprcode"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprrest</code>.
     */
    val OPRREST: TableField<Record, String?> = createField(DSL.name("oprrest"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprjoin</code>.
     */
    val OPRJOIN: TableField<Record, String?> = createField(DSL.name("oprjoin"), SQLDataType.VARCHAR.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>pg_catalog.pg_operator</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_operator</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_operator</code> table reference
     */
    constructor(): this(DSL.name("pg_operator"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PG_OPERATOR, null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getIndexes(): List<Index> = listOf(PG_OPERATOR_OID_INDEX, PG_OPERATOR_OPRNAME_L_R_N_INDEX)
    override fun `as`(alias: String): PgOperator = PgOperator(DSL.name(alias), this)
    override fun `as`(alias: Name): PgOperator = PgOperator(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgOperator = PgOperator(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgOperator = PgOperator(name, null)
}

/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.routines;


import nu.studer.sample.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Timetztypmodin extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.timetztypmodin.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.timetztypmodin._1</code>.
     */
    public static final Parameter<Object[]> _1 = Internal.createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"cstring\"").getArrayDataType(), false, true);

    /**
     * Create a new routine call instance
     */
    public Timetztypmodin() {
        super("timetztypmodin", PgCatalog.PG_CATALOG, SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Object[] value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<Object[]> field) {
        setField(_1, field);
    }
}

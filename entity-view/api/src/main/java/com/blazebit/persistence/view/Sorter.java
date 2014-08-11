package com.blazebit.persistence.view;

import com.blazebit.persistence.Sortable;

/**
 * A sorter is an object that applies an order by on a {@link Sortable} for a specific expression.
 *
 * @author Christian Beikov
 * @since 1.0
 */
public interface Sorter {

    /**
     * Applies an order by on the given sortable for the given expression.
     *
     * @param <T>        The actual type of the sortable
     * @param sortable   The sortable on which to apply the order by
     * @param expression The order by expression
     * @return The sortable
     */
    public <T extends Sortable<T>> T apply(T sortable, String expression);

}

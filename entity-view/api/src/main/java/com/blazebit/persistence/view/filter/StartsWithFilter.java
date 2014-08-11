package com.blazebit.persistence.view.filter;

import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.Filter;
import com.blazebit.persistence.view.MappingFilter;

/**
 * A placeholder for a filter implementation that implements a starts with filter.
 * This placeholder can be used in a {@link MappingFilter} annotation or you can retrieve an instance of this filter by invoking
 * {@link EntityViewManager#createFilter(java.lang.Class, java.lang.Class, java.lang.Object)}.
 *
 * A starts with filter accepts an object. The {@linkplain Object#toString()} representation of that object will be used as value 
 * for the starts with restriction.
 * 
 * @author Christian Beikov
 * @since 1.0
 */
public interface StartsWithFilter extends Filter {

}

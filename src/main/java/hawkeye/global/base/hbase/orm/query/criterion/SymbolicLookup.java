package hawkeye.global.base.hbase.orm.query.criterion;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import java.util.Arrays;

/**
 * A tool for resolving a Symbolic object from its String symbol 
 */
public class SymbolicLookup implements Function<Symbolic, String> {

    @Override
    public String apply(Symbolic symbolic) {
        return symbolic.symbol();
    }

    public static <T extends Symbolic> ImmutableMap<String, T> map(T[] values) {
        return Maps.uniqueIndex(Arrays.asList(values), new SymbolicLookup());
    }

    public static <T extends Symbolic> T resolve(String symbol, ImmutableMap<String, T> map, Class<T> clss) {
        T symbolic = map.get(symbol);
        if (symbolic == null) {
            throw new IllegalArgumentException(symbol + " is not a valid " + clss.getSimpleName() + " symbol");
        }
        return symbolic;
    }

}

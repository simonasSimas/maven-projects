package eu.academy.test.lambdaofstreams.basicFirst.streams.bonusExc.bonusExcGeneric;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class DistinctById<T> {
    private Function<T, Object> function;
    private Set<Object> seenObject;

    public DistinctById(Function<T, Object> function) {
        this.function = function;
        this.seenObject = new HashSet<>();
    }
    public boolean filterById(T t){
        return seenObject.add(function.apply(t));
    }
}

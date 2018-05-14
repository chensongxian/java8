package com.csx.defaultmethods;

import java.util.Iterator;
import java.util.function.Predicate;

/**
 * @author csx
 * @Package com.csx.defaultmethods
 * @Description: TODO
 * @date 2018/5/14 0014
 */
public interface Collection<T>  extends java.util.Collection {
    default boolean removeIf2(Predicate<T> predicate){
        boolean isRemoved = false;
        Iterator<T> iterator = iterator();
        while(iterator.hasNext()){
            if(predicate.test(iterator.next())){
                iterator.remove();
                isRemoved = true;
            }
        }
        return isRemoved;
    }
}

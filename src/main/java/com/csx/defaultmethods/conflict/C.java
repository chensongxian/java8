package com.csx.defaultmethods.conflict;

/**
 * @author csx
 * @Package com.csx.defaultmethods.conflict
 * @Description: TODO
 * @date 2018/5/14 0014
 */
public interface C extends A{
    @Override
    default void sayHello() {
        System.out.println("C say hello");
    }
}

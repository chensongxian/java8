package com.csx.defaultmethods.conflict;

/**
 * @author csx
 * @Package com.csx.defaultmethods.conflict
 * @Description: TODO
 * @date 2018/5/14 0014
 */
public class App3 implements A,B{
    @Override
    public void sayHello() {
        System.out.println("App3 say hello");
    }

    public static void main(String[] args) {
        new App3().sayHello();
    }
}

package com.csx.defaultmethods;

/**
 * @author csx
 * @Package com.csx.defaultmethods
 * @Description: TODO
 * @date 2018/5/14 0014
 */
public class UseCalc {
    public static void main(String[] args) {
        Calculator cal=new BasicCalculator();
        int mod = cal.mod(10, 2);
        System.out.println(mod);

        Calculator cal2=Calculator.getInstance();
        int add = cal2.add(1, 10);
        System.out.println(add);
    }
}

package com.csx.defaultmethods;

/**
 * @author csx
 * @Package com.csx.defaultmethods
 * @Description: TODO
 * @date 2018/5/14 0014
 */
public interface Calculator {
    int add(int first, int second);

    int subtract(int first, int second);

    int multiply(int first, int second);

    int divide(int number, int divisor);

    default int mod(int first, int second){
        return first % second;
    }

    static Calculator getInstance(){
        return new BasicCalculator();
    }
}

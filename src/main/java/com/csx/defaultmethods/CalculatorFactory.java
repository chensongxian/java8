package com.csx.defaultmethods;

/**
 * @author csx
 * @Package com.csx.defaultmethods
 * @Description: TODO
 * @date 2018/5/14 0014
 */
public class CalculatorFactory {
    public static Calculator getInstance(){
        return new BasicCalculator();
    }
}

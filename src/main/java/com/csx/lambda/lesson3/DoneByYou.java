package com.csx.lambda.lesson3;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/**
 * @author csx
 * @Package com.csx.lambda.lesson3
 * @Description: 等效引用
 * @date 2018/5/14 0014
 */
public class DoneByYou {
    public static void main(String[] args) {
//        Function<String, Integer> stringToInteger = (String s)->Integer.parseInt(s);
        //等效应用
        Function<String,Integer> stringToInteger=Integer::parseInt;
        Integer num = stringToInteger.apply("10");
        System.out.println(num);
        //        BiPredicate<List<String>, String> contains= (list, element) -> list.contains(element);
        BiPredicate<List<String>, String> contains2 = List::contains;
    }
}

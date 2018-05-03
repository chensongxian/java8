package com.csx.stream.lesson2;

import lombok.AllArgsConstructor;

import java.util.stream.Stream;

/**
 * @author csx
 * @Package com.csx.stream.lesson2
 * @Description: iterate 构造无限流  first f(first) f(f(first))
 * @date 2018/5/2 0002
 */
public class Quiz1 {

    @AllArgsConstructor
    static class Tuple{
        int first;
        int second;
    }

    public static void main(String[] args) {
        Stream.iterate(new Tuple(0,1),tuple -> new Tuple(tuple.second,tuple.first+tuple.second))
        .limit(20)
        .forEach(tuple -> System.out.println(tuple.first+"---"+tuple.second));
    }
}

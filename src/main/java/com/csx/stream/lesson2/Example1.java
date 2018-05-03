package com.csx.stream.lesson2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author csx
 * @Package com.csx.stream.lesson2
 * @Description: 创建流
 * @date 2018/5/2 0002
 */
public class Example1 {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("hello","world");
        Stream<String> listStream=list.stream();

        Stream<String> arrayStream=Arrays.stream(new String[]{"hello","world"});

        Stream<String> stream=Stream.of("hello","world");
    }
}

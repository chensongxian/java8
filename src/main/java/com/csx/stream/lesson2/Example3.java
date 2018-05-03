package com.csx.stream.lesson2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author csx
 * @Package com.csx.stream.lesson2
 * @Description: map  映射
 * @date 2018/5/2 0002
 */
public class Example3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java 8", "Lambdas", "In", "Action");

        words.stream()
                .map(word->word.length())
                .collect(Collectors.toList())
                .forEach(word-> System.out.println(word));
    }
}

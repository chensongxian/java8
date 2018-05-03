package com.csx.stream.lesson2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author csx
 * @Package com.csx.stream.lesson2
 * @Description: 扁平流(合并多个流) flatMap 列出List中各不相同的单词
 * @date 2018/5/2 0002
 */
public class Example4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("I am a boy", "I love the girl", "But the girl loves another girl");
        list.stream()
                .map(word->word.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList())
                .forEach(word-> System.out.println(word));
    }
}

package com.csx.stream.lesson2;

import com.csx.stream.Project;

import java.util.Arrays;
import java.util.List;

/**
 * @author csx
 * @Package com.csx.stream.lesson2
 * @Description: 规约reduce  1.元素求和
 * @date 2018/5/2 0002
 */
public class Example6 {
    public static void main(String[] args) {
        List<Project> projects = Project.buildData();
        List<Integer> numbers  = Arrays.asList(2, 4, 5, 6);

        int sum = 0;
        for (int x : numbers) {
            sum += x;
        }

        System.out.println(sum);

        Integer reduce = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(reduce);

        System.out.println(numbers.stream().reduce(0,Integer::sum));
    }
}

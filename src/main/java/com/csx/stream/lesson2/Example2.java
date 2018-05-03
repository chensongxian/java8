package com.csx.stream.lesson2;

import com.csx.stream.Project;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author csx
 * @Package com.csx.stream.lesson2
 * @Description:
 *  filter 使用
 *  distinct 使用
 *  limit 使用
 *  skip 使用filter 使用
 *  distinct 使用
 *  limit 使用
 *  skip 使用
 * @date 2018/5/2 0002
 */
public class Example2 {
    public static void main(String[] args) {
        List<Project> projects=Project.buildData();

        List<Project> collect=projects.stream()
                .filter(project ->
                    project.getStars()>1000
                )
                .collect(Collectors.toList());

        Stream<Integer> numbers=Stream.of(1, 2, 3, 3, 2, 4);
        numbers.distinct().limit(3).forEach(n-> System.out.println(n));

        System.out.println("===================");
        //跳过前四个元素
        Stream.of(1, 2, 3, 3, 2, 4).skip(4).forEach(n -> System.out.println(n));
    }
}

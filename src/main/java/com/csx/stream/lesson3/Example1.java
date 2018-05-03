package com.csx.stream.lesson3;

import com.csx.stream.Project;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author csx
 * @Package com.csx.stream.lesson3
 * @Description: TODO
 * @date 2018/5/3 0003
 */
public class Example1 {
    public static void main(String[] args) {
        List<Project> projects=Project.buildData();

        Double avg = projects.stream().collect(Collectors.averagingInt(Project::getStars));
        System.out.println(avg);

        String joinStr = projects.stream().map(Project::getName).collect(Collectors.joining(","));
        System.out.println(joinStr);

        Integer collect = projects.stream().collect(Collectors.reducing(0, Project::getStars, (x, y) -> x + y));
        System.out.println(collect);

        Optional<Integer> collect1 = projects.stream().map(Project::getStars).collect(Collectors.reducing((x, y) -> x + y));
        System.out.println(collect1.get());

    }
}

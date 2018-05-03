package com.csx.stream.lesson3;

import com.csx.stream.Project;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

import static java.util.stream.Collectors.*;


/**
 * @author csx
 * @Package com.csx.stream.lesson3
 * @Description: TODO
 * @date 2018/5/3 0003
 */
public class Example5 {
    public static void main(String[] args) {
        List<Project> projects = Project.buildData();

        Collection<Project> collect = projects.stream()
                .collect(toCollection(CopyOnWriteArrayList::new));
        System.out.println(collect);

        Map<String, Project> collect1 = projects.stream()
                .collect(groupingBy(Project::getAuthor, collectingAndThen(
                        maxBy(Comparator.comparingInt(Project::getStars)),
                        Optional::get
                )));
        System.out.println(collect1);



    }
}

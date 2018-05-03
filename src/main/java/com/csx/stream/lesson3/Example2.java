package com.csx.stream.lesson3;

import com.csx.stream.Project;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author csx
 * @Package com.csx.stream.lesson3
 * @Description: TODO
 * @date 2018/5/3 0003
 */
public class Example2 {
    public static void main(String[] args) {
        List<Project> projects=Project.buildData();

        Map<String, Integer> map = projects.stream().collect(Collectors.toMap(Project::getName, Project::getStars));
        System.out.println(map);

        //Function.identity() 返回输入元素
        Map<String,Project> map1 = projects.stream().collect(Collectors.toMap(Project::getName,Function.identity()));

        System.out.println(map1);
    }
}

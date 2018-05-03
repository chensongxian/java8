package com.csx.stream.lesson2;

import com.csx.stream.Project;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author csx
 * @Package com.csx.stream.lesson2
 * @Description: 你将如何利用流来筛选前两个Java项目呢？
 * @date 2018/5/2 0002
 */
public class Quiz2 {
    public static void main(String[] args) {
        List<Project> projects=Project.buildData();

        System.out.println(projects.stream().map(Project::getName).limit(2).collect(Collectors.toList()));
    }
}

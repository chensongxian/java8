package com.csx.stream.lesson2;

import com.csx.stream.Project;

import java.util.List;

/**
 * @author csx
 * @Package com.csx.stream.lesson2
 * @Description: 匹配元素
 * @date 2018/5/2 0002
 */
public class Example5 {
    public static void main(String[] args) {
        List<Project> projects = Project.buildData();

        boolean hasBiezhi=projects.stream().anyMatch(project -> project.getAuthor().equals("biezhi"));
        System.out.println(hasBiezhi);

        System.out.println(projects.stream().allMatch(project -> project.getAuthor().equals("biezhi")));

        System.out.println(projects.stream().noneMatch(project -> project.getAuthor().equals("csx")));

        System.out.println(projects.stream().findAny().get());

        System.out.println(projects.stream().findFirst().get());


    }
}

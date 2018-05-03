package com.csx.stream.lesson3;

import com.csx.stream.Project;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.partitioningBy;

/**
 * @author csx
 * @Package com.csx.stream.lesson3
 * @Description: 将项目分成两组
 * @date 2018/5/3 0003
 */
public class Example4 {
    public static boolean isBackEnd(Project project){
        return "java".equalsIgnoreCase(project.getLanguage()) || "python".equalsIgnoreCase(project.getLanguage());
    }

    public static void main(String[] args) {
        List<Project> projects = Project.buildData();

        Map<Boolean, List<Project>> collect = projects.stream()
                .collect(partitioningBy(Example4::isBackEnd));
        System.out.println(collect);
    }
}

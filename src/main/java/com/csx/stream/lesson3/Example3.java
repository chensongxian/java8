package com.csx.stream.lesson3;

import com.csx.stream.Project;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * @author csx
 * @Package com.csx.stream.lesson3
 * @Description: 分组
 * @date 2018/5/3 0003
 */
public class Example3 {
    public static void main(String[] args) {
        List<Project> projects = Project.buildData();
        Map<String, List<Project>> collect = projects.stream()
                .collect(groupingBy(Project::getAuthor));
        System.out.println(collect);

        Map<String, Map<String, Long>> collect1 = projects.stream()
                .collect(groupingBy(Project::getAuthor,
                        groupingBy(p -> {
                            if ("java".equalsIgnoreCase(p.getLanguage()) ||
                                    "python".equalsIgnoreCase(p.getLanguage())) {
                                return "后端";
                            }
                            return "前端";
                        }, counting())
                ));
        System.out.println(collect1);
    }
}

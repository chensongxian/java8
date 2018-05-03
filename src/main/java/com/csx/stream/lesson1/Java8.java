package com.csx.stream.lesson1;

import com.csx.stream.Project;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author csx
 * @Package com.csx.stream.lesson1
 * @Description: TODO
 * @date 2018/5/2 0002
 */
public class Java8 {
    public static void main(String[] args) {
        List<Project> projects=Project.buildData();

        List<String> names=projects.stream()
                .filter(p->{
                    System.out.println(p.getName());
                    return p.getStars()>1000;
                })
                .map(p->{
                    System.out.println(p.getName());
                    return p.getName();
                })
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(names);
    }
}

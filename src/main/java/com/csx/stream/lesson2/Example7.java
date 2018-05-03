package com.csx.stream.lesson2;

import com.csx.stream.Project;

import java.util.List;
import java.util.OptionalInt;

/**
 * @author csx
 * @Package com.csx.stream.lesson2
 * @Description: 数值流
 * @date 2018/5/2 0002
 */
public class Example7 {
    public static void main(String[] args) {
        List<Project> projects=Project.buildData();

        OptionalInt max=projects.stream()
                .mapToInt(p->p.getStars())
                .max();
        System.out.println(max.getAsInt());
    }
}

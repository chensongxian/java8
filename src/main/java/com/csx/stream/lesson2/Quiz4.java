package com.csx.stream.lesson2;

import com.csx.stream.Project;

import java.util.List;

/**
 * @author csx
 * @Package com.csx.stream.lesson2
 * @Description: TODO
 * @date 2018/5/3 0003
 */
public class Quiz4 {
    public static void main(String[] args) {
        List<Project> projects=Project.buildData();

        Integer biezhi = projects.stream()
                .filter(p -> p.getAuthor().equals("biezhi"))
                .map(p -> p.getStars())
                .reduce(0, Integer::sum);
        System.out.println(biezhi);

    }
}

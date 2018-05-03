package com.csx.stream.lesson2;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author csx
 * @Package com.csx.stream.lesson2
 * @Description: TODO
 * @date 2018/5/2 0002
 */
public class Quiz3 {
    /**
     * 给定一个数字列表，如何返回一个由每个数的平方构成的列表呢？
     */
    @Test
    public void q1(){
        List<Integer> numbers=Arrays.asList(1,2,3,4,5);

        numbers.stream()
                .map(n->n*n)
                .forEach(n-> System.out.println(n));
    }

    /**
     * 给定两个数字列表，如何返回所有的数对呢？例如，给定列表[1, 2, 3]和列表[3, 4]，
     * 应该返回[(1, 3), (1, 4), (2, 3), (2, 4), (3, 3), (3, 4)]。
     * 为简单起见，你可以用有两个元素的数组来代表数对。
     */
    @Test
    public void q2(){
        List<Integer> numbers1=Arrays.asList(1,2,3);
        List<Integer> numbers2=Arrays.asList(3,4);

        numbers1.stream()
                .flatMap(i->numbers2.stream().map(j->new Integer[]{i,j}))
                .forEach(ret-> System.out.println(ret[0]+"--"+ret[1]));
    }

    /**
     * 如何扩展前一个例子，只返回总和能被3整除的数对呢？例如(2, 4)和(3, 3)是可以的
     */
    @Test
    public void q3(){
        List<Integer> numbers1=Arrays.asList(1,2,3);
        List<Integer> numbers2=Arrays.asList(3,4);

        numbers1.stream()
                .flatMap(i->numbers2.stream().filter(j->(i+j)%3==0)
                .map(j->new Integer[]{i,j}))
                .forEach(num-> System.out.println(num[0]+"---"+num[1]));
    }
}

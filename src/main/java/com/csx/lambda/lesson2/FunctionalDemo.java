package com.csx.lambda.lesson2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.*;

/**
 * @author csx
 * @Package com.csx.lambda.lesson2
 * @Description: TODO
 * @date 2018/5/14 0014
 */
public class FunctionalDemo {
    /**
     * 断言
     */
    @Test
    public void predicate(){
        Predicate<String> nameStartWithS=name->name.startsWith("s");
        boolean hello = nameStartWithS.test("hello");
        System.out.println(hello);
    }

    /**
     * 消费数据
     */
    @Test
    public void consume(){
        Consumer<String> consumer=message-> System.out.println(message);
        consumer.accept("learn Java8");
    }

    /**
     *  转换
     */
    @Test
    public void function(){
        Function<String,String> toUpper=name->name.toUpperCase();
        String upper=toUpper.apply("csx");
        System.out.println(upper);
    }

    /**
     *  提供数据
     */
    @Test
    public void supplier(){
        Supplier<String> supplier=()->UUID.randomUUID().toString();
        System.out.println(supplier.get());
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for(int i=300;i<=400;i++){
            list.add(i);
        }

        IntPredicate evenNumbers=(int i)->i%2==0;
        evenNumbers.test(1000);

        Predicate<Integer> oddNumbers=(Integer i)->i%2==1;
        oddNumbers.test(1001);


        Function<Integer,Integer> add1=x->x+1;
        Function<String,String> contact=x->x+1;

        Integer two = add1.apply(1);
        String contactStr=contact.apply("1");
        System.out.println(two);
        System.out.println(contactStr);

        BinaryOperator<Integer> sum=(a,b)->a+b;
        Integer res = sum.apply(1, 2);
        System.out.println(res);

    }

}

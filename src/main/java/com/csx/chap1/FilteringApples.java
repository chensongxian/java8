package com.csx.chap1;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Author: csx
 * @Date: 2018/03/09
 */
public class FilteringApples {

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(80,"green"),
                new Apple(155, "green"),
                new Apple(120, "red"));


        List<Apple> greenApples=filterApples(inventory,FilteringApples::isGreenApple);
        System.out.println(greenApples);

        List<Apple> heavyApples=filterApples(inventory,FilteringApples::isHeavyApple);
        System.out.println(heavyApples);

        List<Apple> greenApples2=filterApples(inventory,(Apple a)->"green".equals(a.getColor()));
        System.out.println(greenApples2);

        List<Apple> heavyApples2=filterApples(inventory,(Apple a)->a.getWeight()>150);
        System.out.println(heavyApples2);

        List<Apple> weirdApples = filterApples(inventory, (Apple a) -> a.getWeight() < 80 ||
                "red".equals(a.getColor()));
        System.out.println(weirdApples);


        List<Apple> heavyApples3=inventory.stream().filter((Apple a) -> a.getWeight()>150).collect(Collectors.toList());
        System.out.println(heavyApples3);

        List<Apple> heavyApples4=inventory.parallelStream().filter((Apple a) -> a.getWeight()>150).collect(Collectors.toList());
        System.out.println(heavyApples4);


        List<Apple> redApples = filterApplesByColor(inventory, "red");
        System.out.println(redApples);

        // [Apple{color='green', weight=80}, Apple{color='green', weight=155}]
        List<Apple> greenApples3 = filter(inventory, new AppleColorPredicate());
        System.out.println(greenApples3);

        // [Apple{color='green', weight=155}]
        List<Apple> heavyApples5 = filter(inventory, new AppleWeightPredicate());
        System.out.println(heavyApples5);

        // []
        List<Apple> redAndHeavyApples = filter(inventory, new AppleRedAndHeavyPredicate());
        System.out.println(redAndHeavyApples);

        // [Apple{color='red', weight=120}]
        List<Apple> redApples2 = filter(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple a){
                return a.getColor().equals("red");
            }
        });
        System.out.println(redApples2);
    }


    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result=new ArrayList<>();
        for(Apple apple:inventory){
            if("green".equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterHeavyApples(List<Apple> inventory){
        List<Apple> result=new ArrayList<>();
        for(Apple apple:inventory){
            if(apple.getWeight()>150){
                result.add(apple);
            }
        }
        return result;
    }

    public static boolean isGreenApple(Apple apple){
        return "green".equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple){
        return apple.getWeight()>150;
    }

    public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p){
        List<Apple> result=new ArrayList<>();
        for(Apple apple:inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

    public static class Apple {
        private int weight = 0;
        private String color = "";

        public Apple(int weight, String color){
            this.weight = weight;
            this.color = color;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Apple{" +
                    "color='" + color + '\'' +
                    ", weight=" + weight +
                    '}';
        }
    }

    public static List<Apple> filterApplesByColor(List<Apple> inventory, String color){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if(apple.getColor().equals(color)){
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if(apple.getWeight() > weight){
                result.add(apple);
            }
        }
        return result;
    }


    public static List<Apple> filter(List<Apple> inventory, ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

    interface ApplePredicate{
        public boolean test(Apple a);
    }

    static class AppleWeightPredicate implements ApplePredicate{
        @Override
        public boolean test(Apple apple){
            return apple.getWeight() > 150;
        }
    }
    static class AppleColorPredicate implements ApplePredicate{
        @Override
        public boolean test(Apple apple){
            return "green".equals(apple.getColor());
        }
    }

    static class AppleRedAndHeavyPredicate implements ApplePredicate{
        @Override
        public boolean test(Apple apple){
            return "red".equals(apple.getColor())
                    && apple.getWeight() > 150;
        }
    }
}

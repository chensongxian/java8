package com.csx.lambda.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.function.Function;

/**
 * @author csx
 * @Package com.csx.lambda.lesson3
 * @Description: 任何函数式接口都不允许抛出受检异常
 * @date 2018/5/14 0014
 */
public class LambdaException {
    public static void main(String[] args) {
        Function<BufferedReader, String> f = (BufferedReader b) -> {
            try {
                return b.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
    }
}

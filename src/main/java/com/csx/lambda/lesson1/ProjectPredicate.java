package com.csx.lambda.lesson1;

/**
 * @author csx
 * @Package com.csx.lambda.lesson1
 * @Description: 项目过滤接口
 * @date 2018/5/3 0003
 */
public interface ProjectPredicate {
    boolean test(Project project);
}

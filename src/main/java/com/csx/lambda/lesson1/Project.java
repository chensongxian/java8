package com.csx.lambda.lesson1;

import lombok.Builder;
import lombok.Data;

/**
 * @author csx
 * @Package com.csx.lambda.lesson1
 * @Description: TODO
 * @date 2018/5/3 0003
 */
@Data
@Builder
public class Project {
    /**
     * 项目名称
     */
    private String  name;

    /**
     * 编程语言
     */
    private String  language;

    /**
     * star 数
     */
    private Integer stars;

    /**
     * 描述
     */
    private String  description;

    /**
     * 作者
     */
    private String  author;
}

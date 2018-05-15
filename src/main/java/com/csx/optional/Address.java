package com.csx.optional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author csx
 * @Package com.csx.optional
 * @Description: TODO
 * @date 2018/5/14 0014
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    /**
     * 街道
     */
    private String street;

    /**
     * 门牌
     */
    private String door;
}

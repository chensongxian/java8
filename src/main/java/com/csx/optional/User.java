package com.csx.optional;

import lombok.Data;

import java.util.Optional;

/**
 * @author csx
 * @Package com.csx.optional
 * @Description: TODO
 * @date 2018/5/15 0015
 */
@Data
public class User {
    private String  username;
    private String  password;
    private Integer age;
    private Address address;

    private Optional<Address> optAddress;
}

package com.csx.lambda.lesson3;

import java.util.function.Supplier;

/**
 * @author csx
 * @Package com.csx.lambda.lesson3
 * @Description: TODO
 * @date 2018/5/14 0014
 */
public class ConstructorReference {
    public static void main(String[] args) {
        Supplier<ConstructorReference> referenceSupplier=ConstructorReference::new;
        ConstructorReference constructorReference = referenceSupplier.get();
    }
}

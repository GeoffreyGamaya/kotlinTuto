package com.geogrej;

public class CallInKotlin {

    private final String name1;
    private final String name2;
    private final Integer age;

    public CallInKotlin(String a, String b, Integer c) {
        this.name1 = a;
        this.name2 = b;
        this.age = c;
    }

    public Integer getAge() {
        return this.age;
    }
}

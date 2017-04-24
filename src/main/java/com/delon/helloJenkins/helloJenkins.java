package com.delon.helloJenkins;

/**
 * Created by dongzheng on 2017/4/24.
 */
public class helloJenkins {

    public String sayHello(){
        return "Hello Jenkins";
    }

    public static void main(String[] args) {
        System.out.print(new helloJenkins().sayHello());
    }
}

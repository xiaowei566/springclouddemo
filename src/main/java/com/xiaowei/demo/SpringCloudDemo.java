package com.xiaowei.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

/**
 * @author : lxw
 */

@SpringBootApplication
public class SpringCloudDemo {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDemo.class,args);

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
    }

    public void function(){

    }
}
package com.junit5;

import org.junit.jupiter.api.*;

public class Junit5Demo_3_1_Fixtures {
    @BeforeAll
    public static void beforeAll(){
        System.out.println("beforeAll执行");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("afterAll 执行！");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("BeforeEach 执行！");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("AfterEach 执行！");
    }

    @Test
    public void testMethod01(){
        System.out.println("testMethod01 执行！");
    }

    @Test
    public void testMethod02(){
        System.out.println("testMethod02 执行！");
    }

    @Test
    public void testMethod03(){
        System.out.println("testMethod03 执行！");
    }
}

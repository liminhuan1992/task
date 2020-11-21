package com.junit5;

import com.util.Calculator;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 使用junit5提供的assertAll进行断言，增加了脚本的容错性
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Junit5DemoAssertAll {
    @Test
    @Order(1)
    public void addTest(){
        int result1 = Calculator.add(4,2);
        int result2 = Calculator.add(5,2);
        int result3 = Calculator.add(6,2);
        assertAll("计算结果校验",
                ()->assertEquals(6,result1),
                ()->assertEquals(6,result2),
                ()->assertEquals(6,result3));
    }

    @Test
    public void subTractTest(){
        int result = Calculator.subtract(4,2);
        System.out.println(result);
        assertEquals(2,result);
    }

    @Test
    public void multiplyTest(){
        int result = Calculator.multiply(4,2);
        System.out.println(result);
        assertEquals(8,result);
    }

    @Test
    public void divideTest(){
        int result = Calculator.divide(4,2);
        System.out.println(result);
        assertEquals(2,result);
    }

    @Test
    public void countTest() throws InterruptedException {
        int result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        System.out.println(result);
        assertEquals(4,result);
    }
}

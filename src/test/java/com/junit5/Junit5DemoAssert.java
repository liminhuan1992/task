package com.junit5;

import com.util.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * junit5 断言练习
 */
public class Junit5DemoAssert {
    @Test
    public void addTest(){
        int result = Calculator.add(4,2);
        System.out.println(result);
        assertEquals(6,result);
        assertEquals(5,result);
        assertEquals(4,result);
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

package org.example.services;

import org.junit.jupiter.api.*;

public class CalculatorServiceTestJunit5 {

    // execute teh logic before all test cases run
    @BeforeAll  // this annotation will run before all test cases(BeforeAll is used in junit5)
    public static void init(){
        System.out.println("this is single time logic");
    }

    @AfterAll   // this annotation will run before all test cases(BeforeAll is used in junit5)
    public static void cleanUp(){
        System.out.println("After all test case logic");
    }

    @BeforeEach // this method will run before each test methods runs
    public void beforeEachTestCase(){
        System.out.println("Before each test case");
    }

    @AfterEach  // this method will run after each test methods run
    public void afterEachTestCase(){
        System.out.println("After each test case");
    }

    // test method for addTwoNumbers
    @Test   // this test is coming from org.junit.jupiter.api.Test
    @DisplayName("this is a custom first test method name") // to provide custom name for our junit test methods
    public void addTwoNumbersTest(){
        System.out.println("running first test case");
        int actualResult = CalculatorService.addTwoNumbers(12,13);

        int expectedResult = 25;

        // here we are using Assertions instead of Assert. Assertions is used in junit5
        // a syntax of assertEquals(expectedValue, actualValue, message);
        Assertions.assertEquals(expectedResult, actualResult, "Test Failed");

    }

    // test method for addAnyNumbers
    @Test
//    @Disabled   // if we want any test case to be ignored(or we dont want this test case to run) then we use this @Disabled annotation
    public void addAnyNumbersTest(){
        System.out.println("running second test case");
        int actualResult = CalculatorService.sumAnyNumbers(1,2,3,4,5);

        int expectedResult = 15;

        Assertions.assertEquals(expectedResult, actualResult, "Test case failed!");
    }

}

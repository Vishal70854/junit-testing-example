//package org.example.services;
//
//import org.junit.*;
//
//import java.util.Date;
//
//// from junit 4 we don't need to extend TestCase class for testing as it was applicable for version less than 4
//// we have used junit 4 in this class to test modules/methods
//public class CalculatorServiceTest{
//
//    int counter = 0;
//
//    @BeforeClass    // this annotation will run before testing any of the methods for junit. it works as before initializer
//    public static void init(){
//        System.out.println("Before all test cases this method executes");
//        System.out.println("Started test : " +new Date());
//
//        // connection open/file open
//
//    }
//
//
//
//    @Before // if we want this method to execute before each test case runs then we use @Before annotation
//    public void beforeEach(){
//        System.out.println("Before each test case");
//        counter = 0;    // before each test case runs, set counter to 0;
//    }
//
//    @After // if we want this method to execute after each test case runs then we use @After annotation
//    public void afterEach(){
//        System.out.println("After each test case");
//    }
//
//    // test method of addTwoNumbers
//    // convention for writing test method for each of the method defined in main package goes like
//    // methodNameTest(){} i.e method name followed by Test() to mention that this is a test method for
//    // the method which is defined in main package
//    // methodName should be same as the method name defined in main package i.e here it is defined in services package
//    // with the name addTwoNumbers
//
//    @Test   // annotation of junit used for testing a method and after mentioning @Test it will be executed as a test
//    public void addTwoNumbersTest(){
//
//        for(int i = 1; i<= 20; i++){
//            counter += i;
//        }
//
//        System.out.println("Test executed for addTwoNumbersTest");
//        System.out.println("counter is 1st test case : "+counter);
//        int result = CalculatorService.addTwoNumbers(15, 25);
//
//        int expected = 40;
//        Assert.assertEquals(expected, result); // syntax assertEquals(expected, actual);
//
//        // actual result
//        // expected result
//
//    }
//
//    // test for sumAnyNumbers
//    @Test
//    public void sumAnyNumbersTest(){
//
//        for(int i = 1; i<= 10; i++){
//            counter += i;
//        }
//
//        System.out.println("Test executed for sumAnyNumbersTest");
//        System.out.println("counter in 2nd test case : " +counter);
//        int result = CalculatorService.sumAnyNumbers(2, 6, 7 ,9);
//
//        int expectedResult = 24;
//        Assert.assertEquals(expectedResult, result);
//
//    }
//
//    @AfterClass //this annotation will run after all test methods are executed to perform cleanup activity
//    public static void cleanUp(){
//        System.out.println("After all test cases this method executes");
//        System.out.println("End test cases : " +new Date());
//    }
//
//    //Test
//    //BeforeClass
//    //AfterClass
//    //Before
//    //After
//}

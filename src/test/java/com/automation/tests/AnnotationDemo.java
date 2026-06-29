package com.automation.tests;

import org.testng.annotations.*;

public class AnnotationDemo {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BEFORE SUITE: Initialising test report...");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AFTER SUITE: Sending test report via email...");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BEFORE CLASS: Launching Chrome browser...");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AFTER CLASS: Closing browser...");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("  BEFORE METHOD: Navigating to base URL...");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("  AFTER METHOD: Taking screenshot...");
    }

    @Test
    public void testLogin() {
        System.out.println("    TEST: Executing Login test...");
    }

    @Test
    public void testSearch() {
        System.out.println("    TEST: Executing Search test...");
    }

    @Test
    public void testLogout() {
        System.out.println("    TEST: Executing Logout test...");
    }
}
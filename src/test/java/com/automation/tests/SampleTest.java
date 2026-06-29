package com.automation.tests;

import com.automation.base.BaseTest;

public class SampleTest extends BaseTest {

    public void testLogin() {
        setUp();
        System.out.println("Executing Login Test...");
        tearDown();
    }

    public static void main(String[] args) {
        SampleTest test = new SampleTest();
        test.testLogin();
    }
}
package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {

    @Test
    public void testHardAssert() {
        String pageTitle = "Welcome to MyApp";
        String expectedTitle = "Welcome to MyApp";

        // Hard Assert — test STOPS immediately if this fails
        Assert.assertEquals(pageTitle, expectedTitle,
                "Page title mismatch!");
        System.out.println("Title assertion passed!");

        // This line only runs if assertion above passed
        Assert.assertTrue(pageTitle.contains("MyApp"),
                "Title should contain MyApp");
        System.out.println("Contains assertion passed!");
    }

    @Test
    public void testSoftAssert() {
        // Soft Assert — test CONTINUES even if assertion fails
        // Collects ALL failures and reports at the end
        org.testng.asserts.SoftAssert softAssert =
                new org.testng.asserts.SoftAssert();

        String actualUrl = "https://staging.myapp.com/dashboard";

        softAssert.assertTrue(actualUrl.contains("myapp"),
                "URL should contain myapp");
        softAssert.assertTrue(actualUrl.contains("dashboard"),
                "URL should contain dashboard");
        softAssert.assertFalse(actualUrl.contains("login"),
                "URL should not contain login");

        // MANDATORY — without this, soft assert never reports failures
        softAssert.assertAll();
        System.out.println("All soft assertions passed!");
    }
}
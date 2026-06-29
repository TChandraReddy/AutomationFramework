package com.automation.tests;

import org.testng.annotations.*;

public class PriorityDemo {

    @Test(priority = 1)
    public void openApplication() {
        System.out.println("Step 1: Opening application...");
    }

    @Test(priority = 2)
    public void login() {
        System.out.println("Step 2: Logging in...");
    }

    @Test(priority = 3)
    public void searchProduct() {
        System.out.println("Step 3: Searching for product...");
    }

    @Test(priority = 4)
    public void addToCart() {
        System.out.println("Step 4: Adding to cart...");
    }

    @Test(priority = 5, dependsOnMethods = {"login"})
    public void logout() {
        System.out.println("Step 5: Logging out...");
    }
}
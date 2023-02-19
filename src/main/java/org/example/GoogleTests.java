package org.example;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class GoogleTests extends SeleniumTestBase {

    GooglePage googlePage;
    @BeforeTest
    public void setUp() {
         googlePage = new GooglePage(driver);
    }

    @Test
    public void navigateTest(){
        googlePage.navigateTo();
        googlePage.searchFor();
        googlePage.searchBut();
        Assert.assertEquals(0,0,"condition is false");
    }


}

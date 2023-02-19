package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class GooglePage {
    private WebDriver driver;
    By searchBox = By.cssSelector("input[title=\"Search\"]");
    public WebElement searchButton;

    public GooglePage(WebDriver webDriver) {
        driver = webDriver;

    }
    public void navigateTo() {
        driver.navigate().to("https://www.google.com");
    }

    public void searchFor() {
        driver.findElement(searchBox).sendKeys("this is test");
        searchButton = driver.findElement(By.cssSelector("input[value=\"Google Search\"]"));
    }

    public void searchBut() {
        searchButton.click();
    //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     //   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    //    wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
    }

}

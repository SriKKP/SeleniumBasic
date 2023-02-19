package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class SeleniumTestBase {

protected WebDriver driver;
   @BeforeTest
    public void createDriver(){
   // System.setProperty("webdriver.chrome.driver","C:\\Users\\sripriya\\Downloads\\chromedriver_win32");
    driver = new ChromeDriver();
}

@AfterTest
public void closeDriver() {
    try{
        driver.close();
    }
    finally {
        driver.quit();
    }
}
}

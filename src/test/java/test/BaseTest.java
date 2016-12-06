package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;


public class BaseTest {


    public WebDriver driver;


    public WebDriver initialize() {

        if (driver != null) {
            return driver;
        }
        else{
            System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/geckodriver 2");
            driver = new FirefoxDriver();
            return driver;
        }

    }

}

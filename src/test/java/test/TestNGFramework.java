package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNGFramework {
    WebDriver driver;


    @Test
    public void nowShowing() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/geckodriver 2");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.spicinemas.in/");
        Thread.sleep(2000);
        driver.findElement(By.className("dropdown-arrow")).click();
        driver.findElement(By.xpath("//li[contains(text(), 'mumbai')]")).click();
        driver.findElement(By.id("selectCity")).click();
        Thread.sleep(2000);

        driver.findElement(By.className("sign-in")).click();
        driver.findElement(By.id("userEmail")).sendKeys("vasorange@gmail.com");
        driver.findElement(By.id("userPassword")).sendKeys("Panini12#");
        driver.findElement(By.id("login_submit")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[contains(text(),'Movies')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("DEAR ZINDAGI")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li/span")).click();

        driver.quit();

    }

    @Test
    public void showTimes() throws InterruptedException {
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.spicinemas.in/");
        Thread.sleep(2000);
        driver.findElement(By.className("dropdown-arrow")).click();
        driver.findElement(By.xpath("//li[contains(text(), 'mumbai')]")).click();
        driver.findElement(By.id("selectCity")).click();
        Thread.sleep(2000);

        driver.findElement(By.className("sign-in")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("userEmail")).sendKeys("vasorange@gmail.com");
        driver.findElement(By.id("userPassword")).sendKeys("Panini12#");
        driver.findElement(By.id("login_submit")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[contains(text(),'ShowTimes')]")).click();
        driver.findElement(By.xpath("//li/span")).click();
        driver.quit();

    }
}

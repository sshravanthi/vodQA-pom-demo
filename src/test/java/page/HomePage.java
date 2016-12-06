package page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage{

    private final WebDriver driver;

    public HomePage(WebDriver Pdriver){
        this.driver = Pdriver;
    }

    public HomePage selectLocation() throws InterruptedException {
        driver.findElement(By.className("dropdown-arrow")).click();
        driver.findElement(By.xpath("//li[contains(text(), 'mumbai')]")).click();
        driver.findElement(By.id("selectCity")).click();
        Thread.sleep(2000);
        return this;
    }

    public HomePage login() throws InterruptedException {
        driver.findElement(By.className("sign-in")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("userEmail")).sendKeys("vasorange@gmail.com");
        driver.findElement(By.id("userPassword")).sendKeys("Panini12#");
        driver.findElement(By.id("login_submit")).click();
        Thread.sleep(1000);
        return this;
    }

    public NowShowingPage clickOnMovies() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Movies')]")).click();
        Thread.sleep(2000);
        return new NowShowingPage(driver);
    }

    public MovieDetailsPage clickOnShowTimes() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'ShowTimes')]")).click();
        Thread.sleep(2000);
        return new MovieDetailsPage(driver);
    }
}

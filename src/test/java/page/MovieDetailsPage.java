package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MovieDetailsPage{

    private final WebDriver driver;

    public MovieDetailsPage(WebDriver driver){
        this.driver = driver;
    }

    public SeatSelection selectFirstShowTime() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li/span")).click();
        Thread.sleep(3000);
        return new SeatSelection(driver);
    }
}

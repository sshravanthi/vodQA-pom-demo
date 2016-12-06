package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import test.BaseTest;

public class SeatSelection extends BaseTest{


    private final WebDriver driver;

    public SeatSelection(WebDriver driver){
        this.driver = driver;
    }

    public SeatSelection cancelBooking() throws InterruptedException {
        driver.findElement(By.className("ticket__cancel")).click();
        Thread.sleep(1000);
        return this;
    }
}

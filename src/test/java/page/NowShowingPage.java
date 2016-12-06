package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class NowShowingPage{
    private final WebDriver driver;

    public NowShowingPage(WebDriver driver){
        this.driver = driver;
    }

    public MovieDetailsPage selectMovie(String movieName){
        driver.findElement(By.linkText(movieName)).click();
        return new MovieDetailsPage(driver);
    }
}

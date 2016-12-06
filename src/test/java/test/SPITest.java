package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.HomePage;

public class SPITest extends BaseTest {


    @Test
    public void nowShowing() throws InterruptedException {
        new HomePage(driver)
                .selectLocation()
                .login()
                .clickOnMovies()
                .selectMovie("DEAR ZINDAGI")
                .selectFirstShowTime()
                .cancelBooking();
    }

    @BeforeClass
    public void setUp() throws InterruptedException {
        driver=initialize();
        driver.get("https://www.spicinemas.in");
        Thread.sleep(2000);
    }

    @Test
    public void showTimes() throws InterruptedException {
        new HomePage(driver)
                .clickOnShowTimes()
                .selectFirstShowTime()
                .cancelBooking();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

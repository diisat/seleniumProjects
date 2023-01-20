package selenium.java.technicalExercise.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    /** Chrome driver */
    protected WebDriver driver;


    /**
     * Setup
     */
    @BeforeClass
    protected void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/src/test/resources/drivers/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //String url = System.getenv("test.url");
        driver.get("https://www.teaminternational.com/#industry");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    /**
     * Wrap up
     */
    @AfterClass
    public void wrapUp() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }


}

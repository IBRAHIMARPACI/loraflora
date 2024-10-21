package driver;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.BeforeSpec;
import com.thoughtworks.gauge.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static WebDriver driver;

    @BeforeSuite
    public void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeSpec
    public void setup() {
       driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterScenario
    public void teardown() {
        driver.quit();
    }

}

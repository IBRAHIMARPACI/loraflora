package methods;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Methods {
    private WebDriver driver;
    private WebDriverWait wait;

    public Methods() {

        this.driver = Driver.driver;

        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public WebElement findElement(By element) {
        driver.findElement(element);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void waitSecond(int key) throws InterruptedException {

        Thread.sleep(key* 1000);

    }


    public void clickElement(String elementXpath) {
        findElement(By.xpath(elementXpath)).click();
    }


    public void enterText(String elementXpath, String key) {
        findElement(By.xpath(elementXpath)).sendKeys(key);
    }

    public void goToUrl(String url) {
        driver.get(url);
    }


    public void clickFirstResult(String elementXpath) {
        List<WebElement> searchResults = driver.findElements(By.xpath(elementXpath));

        if (!searchResults.isEmpty()) {
            searchResults.get(0).click();
        } else {
            System.out.println("Arama sonuçları bulunamadı");
        }
    }
}

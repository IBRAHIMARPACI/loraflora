package steps;
import methods.Methods;
import com.thoughtworks.gauge.Step;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.reflections.ReflectionUtils.Methods;

public class StepImplementation {
    Methods methods = new Methods();
    public WebDriver driver = Driver.driver;


    @Step("<url> Sayfasına git")
    public void goToUrl(String url) {
        methods.goToUrl(url);

    }

    @Step("<key> saniye kadar bekle")
    public void waitSecond(int key) throws InterruptedException {
        methods.waitSecond(key);


    }

    @Step("<element> tıkla bannerı kapat")
    public void clickBannerCloseButton(String element) {
        methods.clickElement(element);

    }

    @Step("<element> Xpathli elementi bul ve adresi <adres> yaz.")
    public void sendAdressToElement(String adres,String element)  {
     methods.enterText(adres,element);

    }

    @Step("<element> Xpathli elementi bul ve <key> yaz.")
    public void sendTextToElement(String element, String key) {
        methods.enterText(element, key);

    }

    @Step("<element> arama butonuna tıkla")
    public void clisckSearchButton(String element) {
        methods.clickElement(element);

    }


    @Step("<element> Seçenekler arasından çıkan ilk seçenek seçilir.")
    public void clickfirstResult(String element) {
        methods.clickFirstResult(element);

    }

   @Step("Ürün detay sayfasından <element>'e tıklanrak sepete eklenir.")
    public void addToCart(String element) {
        methods.clickElement(element);

    }

    @Step("Sepette <element>'e tıklanarak ilerlenir.")
    public void goToPayment(String element) {
        methods.clickElement(element);


    }
}

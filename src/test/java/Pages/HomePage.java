package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class HomePage {
    private WebDriver browser;
    private WebDriverWait wait;
    public HomePage(WebDriver browserName){
        browser=browserName;
        wait = new WebDriverWait(browser,10);
    }
    private List<WebElement> getProducts(){
        List<WebElement> products = browser.findElements(By.partialLinkText("Product"));
        return products;
    }
    public void clickProduct(){
        List<WebElement> products = getProducts();
        int size = products.size();
        Random r = new Random();
        int randomValue = r.nextInt(size);
        products.get(randomValue).click();
    }
}

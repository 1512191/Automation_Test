package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopNamePage {
    private WebDriver browser;
    private WebDriverWait wait;
    public ShopNamePage(WebDriver browserName){
        browser = browserName;
        wait = new WebDriverWait(browser,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("img")));
    }
    public void clickOrderButton(){
        WebElement orderButton = browser.findElement(By.xpath("//a[@class='btn btn-success']"));
        orderButton.click();
    }

}

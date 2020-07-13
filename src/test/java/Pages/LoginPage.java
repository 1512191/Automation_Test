package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver browser;
    private WebDriverWait wait;
    public LoginPage(WebDriver browserName){
        browser=browserName;
        wait = new WebDriverWait(browser,10);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("")));

    }
}

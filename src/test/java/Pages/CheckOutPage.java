package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutPage {
    private WebDriver browser;
    private WebDriverWait wait;
    public CheckOutPage(WebDriver browserName){
        browser=browserName;
        wait = new WebDriverWait(browser,10);
    }
    private void setEmail(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        WebElement emailInput = browser.findElement(By.id("email"));
        emailInput.clear();
        emailInput.sendKeys(email);
    }
    private void setFullName(String fullName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("full_name")));
        WebElement fullnameInput = browser.findElement(By.id("full_name"));
        fullnameInput.clear();
        fullnameInput.sendKeys(fullName);
    }
    private void setPhone(String phone){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone")));
        WebElement phoneInput = browser.findElement(By.id("phone"));
        phoneInput.clear();
        phoneInput.sendKeys(phone);
    }
    private void setAddress(String address){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address")));
        WebElement addressInput = browser.findElement(By.id("address"));
        addressInput.clear();
        addressInput.sendKeys(address);
    }
    private void setNote(String note){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("note")));
        WebElement noteInput = browser.findElement(By.id("note"));
        noteInput.clear();
        noteInput.sendKeys(note);
    }
    private void clickSubmit(){
        WebElement submitButton = browser.findElement(By.xpath("//button[@class='btn btn-success']"));
        submitButton.click();
    }
    public void checkOut(String email, String fullname, String phone, String address, String note){
        setEmail(email);
        setFullName(fullname);
        setPhone(phone);
        setAddress(address);
        setNote(note);
        clickSubmit();
    }
}

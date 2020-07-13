package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Dictionary;
import java.util.List;

public class InfomationPage {
    private WebDriver browser;
    private WebDriverWait wait;
    public InfomationPage(WebDriver browserName){
        browser = browserName;
        wait = new WebDriverWait(browser,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("text-danger")));
    }
    public boolean getInfor(String text){

            WebElement info = browser.findElement(By.xpath(String.format("//dd[contains(text(),'%s')]",text)));
            if (info.isDisplayed())
                return true;
            else return false;


    }
//    public Dictionary getInfo(){
//        Dictionary info = null;
//       List<WebElement> infoElements = browser.findElements(By.tagName("dd"));
//       for(int i=0; i<infoElements.size();i++){
//           info.put(infoElements.get())
//       }
//       return info;
  //  }
    public String getHeaderPage(){
        WebElement header = browser.findElement(By.className("text-danger"));
        return header.getText();
    }
}

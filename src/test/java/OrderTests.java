import Pages.CheckOutPage;
import Pages.HomePage;
import Pages.InfomationPage;
import Pages.ShopNamePage;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderTests {
    @Test
    public void orderTests(){
        System.setProperty("webdriver.chrome.driver","./src/test/driver/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(browser,10);
        browser.manage().window().maximize();
        // go to website
        browser.get("http://qa-minerva:minerva@par.minerva.vn/");
        HomePage homePage = new HomePage(browser);
        homePage.clickProduct();
        ShopNamePage shopNamePage = new ShopNamePage(browser);
        shopNamePage.clickOrderButton();
        CheckOutPage checkOutPage = new CheckOutPage(browser);
        String email ="a@gmail.com";
        String fullname="test";
        String phone ="0123456789";
        String address="Hồ Chí Minh";
        String note="giao hàng giờ hành chính";
        checkOutPage.checkOut(email,fullname,phone,address,note);
        InfomationPage infomationPage = new InfomationPage(browser);
        String header=infomationPage.getHeaderPage();
        try{
            Assert.assertEquals(true, infomationPage.getInfor(email));

            Assert.assertEquals(true, infomationPage.getInfor(fullname));
            Assert.assertEquals(true, infomationPage.getInfor(phone));
            Assert.assertEquals(true, infomationPage.getInfor(address));
            Assert.assertEquals(true, infomationPage.getInfor(note));
            Assert.assertEquals("INFORMATION",header);
        } catch (Exception e){
            throw new AssertionError("Description", e);
       }
        browser.close();
    }
}

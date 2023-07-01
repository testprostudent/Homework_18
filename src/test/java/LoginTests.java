import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends BaseTest {
    @Test
    public void LoginValidEmailPasswordTest() {
   openLoginUrl();
   enterEmail("serhanikamal@yahoo.com");
   enterPassword("te$t$tudent");
   clickSubmit();
        WebElement avatar =driver.findElement(By.cssSelector(".avatar"));
        Assert.assertTrue(avatar.isDisplayed());

    }
    @Test
    public void LoginEmtyEmailPasswordTest() {
        openLoginUrl();
        enterEmail("serhanikamal@yahoo.com");
        enterPassword("te$t$tudent");
        clickSubmit();
          Assert.assertEquals(driver.getCurrentUrl(),url);
          driver.quit();


    }
}

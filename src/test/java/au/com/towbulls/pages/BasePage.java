package au.com.towbulls.pages;

import au.com.towbulls.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

/**
 * Created by att.jacobg on 24/06/2018.
 */
public class BasePage extends BaseTest {


    public static WebDriver driver = null;
    public static WebDriverWait wait = null;

    public static void clickLinkText(String linkText){
        wait.until( ExpectedConditions.elementToBeClickable( By.linkText(linkText) ) ).click();
    }

    public static void verifyPageTitle(String pageTitle){
        wait.until(ExpectedConditions.titleContains(pageTitle));
        assertEquals("Page Title", driver.getTitle(), pageTitle);
    }

}

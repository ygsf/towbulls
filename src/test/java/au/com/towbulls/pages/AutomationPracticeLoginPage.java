package au.com.towbulls.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AutomationPracticeLoginPage extends BasePage {

    String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

    public void login(String iUser, String iPass){

        wait.until( ExpectedConditions.presenceOfElementLocated( By.id("email") ) ).sendKeys(iUser);

        wait.until( ExpectedConditions.presenceOfElementLocated( By.id("passwd") ) ).sendKeys(iPass);

        wait.until( ExpectedConditions.presenceOfElementLocated( By.id("SubmitLogin") ) ).click();
    }

    public void goHome(){
            driver.get(url);
    }
}



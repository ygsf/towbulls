package au.com.towbulls.pages;


import au.com.towbulls.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AutomationPracticeMyAccountPage extends BasePage {

    public void verifyLogin(){
        wait.until( ExpectedConditions.presenceOfElementLocated( By.linkText("Sign out") ) );
    }

}

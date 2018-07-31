package au.com.towbulls.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by att.jacobg on 24/06/2018.
 */
public class GooglePage extends BasePage{

    String url = "https://www.google.com";

    private WebElement qaLink;

    private WebElement searchField;

    private WebElement searchButton;

    public void goHome() {
        driver.get(url);
    }

    public void searchForText(String str){
        searchField = wait.until( ExpectedConditions.presenceOfElementLocated( By.name("q") ) );
        searchField.click();
        searchField.sendKeys( str );

        searchButton = wait.until( ExpectedConditions.elementToBeClickable( By.name("btnK") ) );
        searchButton.click();
    }


}

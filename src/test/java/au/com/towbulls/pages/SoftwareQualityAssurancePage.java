package au.com.towbulls.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by att.jacobg on 24/06/2018.
 */
public class SoftwareQualityAssurancePage extends BasePage{

    private WebElement qaLink;


    public void assertLinkToQualityAssurancePresent(){
        qaLink = wait.until( ExpectedConditions.elementToBeClickable( By.xpath("//a[contains(@href,'/wiki/Quality_assurance')]") ) );
    }

}

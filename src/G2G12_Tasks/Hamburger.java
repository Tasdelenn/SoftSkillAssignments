package G2G12_Tasks;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Hamburger extends GenelWebDriver {

    @Test
    void HamburgerMenuTest() {

        By hmb=By.cssSelector(
                "button[class='mat-focus-indicator mat-menu-trigger mat-button-wrapper mat-button mat-button-base']");
        driver.findElement(hmb).click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(
                "//div[contains(@id,'cdk-overlay-')]//button")));
        List<WebElement> hmbList = driver.findElements(By.xpath(
                "//div[contains(@id,'cdk-overlay-')]//button"));

        List<String> hmbListTr= new ArrayList<>();
            hmbListTr.add("Messaging");
            hmbListTr.add("Finance");
            hmbListTr.add("Video Conference");

        for (int i=0; i<hmbListTr.size(); i++){
            Assert.assertEquals(hmbListTr.get(i), hmbList.get(i).getText());
        }

    }

}

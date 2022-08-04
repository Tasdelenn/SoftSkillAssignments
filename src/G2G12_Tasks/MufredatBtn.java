package G2G12_Tasks;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class MufredatBtn extends GenelWebDriver {

    @Test(priority = 1)
    void CredentialsLoginVal()
    {
        WebElement welCome = driver.findElement(By.cssSelector("div[fxlayout=\"column\"][class=\"ng-star-inserted\"]"));
        Assert.assertTrue(welCome.getText().toLowerCase().contains("welcome"));
    }

    @Test()
    void syllabusLink()
    {
        List<WebElement> syllabus = driver.findElements(By.xpath("//span[contains(text(),'Syllabus')]"));

        System.out.println(syllabus.size());

        for (WebElement wE : syllabus)
        {
            Assert.assertNotNull(wE,"Karşılaştırma Sonucu");
            //Assert.assertTrue(wE.getText().toLowerCase().contains("syllabus"));
        }
    }
}

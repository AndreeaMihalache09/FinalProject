package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.CheckboxDemoPage;


public class CheckboxDemoTestCases extends BasePage {
    private CheckboxDemoPage CheckboxDemoPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        CheckboxDemoPage = new CheckboxDemoPage(driver);
        }

        @Test
        public void NoClickOnTheSingleCheckboxButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        WebElement checkboxMessage = driver.findElement(By.id("txtAge"));
            Assert.assertEquals(false, checkboxMessage.isDisplayed());
    }
}

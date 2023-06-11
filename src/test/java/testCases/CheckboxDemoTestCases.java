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

    @Test
    public void ClickOnTheSingleCheckboxButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        CheckboxDemoPage.clickOnSingleCheckBox();
        WebElement checkboxMessage = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[1]/div[2]/div[2]"));
        String messageText = checkboxMessage.getText();
        Assert.assertTrue(messageText.contains("Checked"));
    }

    @Test
    public void VerifyIfCheckAllButtonChangesToUncheckAllButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        CheckboxDemoPage.clickOnCheckAllButton();
        WebElement UncheckAllButtons = driver.findElement(By.xpath("//input[@id='box' and @value='Uncheck All']"));
        Assert.assertEquals(true, UncheckAllButtons.isDisplayed());
    }

    @Test
    public void VerifyIfUnCheckAllButtonChangesToCheckAllButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        CheckboxDemoPage.clickOnCheckAllButton();
        CheckboxDemoPage.clickOnCheckAllButton();
        WebElement CheckAllButtons = driver.findElement(By.xpath("//input[@id='box' and @value='Check All']"));
        Assert.assertEquals(true, CheckAllButtons.isDisplayed());


    }
}
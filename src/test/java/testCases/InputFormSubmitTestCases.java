package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.InputFormSubmitPage;
import org.openqa.selenium.Alert;

import java.time.Duration;


public class InputFormSubmitTestCases extends BasePage{
    private pages.InputFormSubmitPage inputFormSubmitPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        inputFormSubmitPage = new InputFormSubmitPage(driver);
    }
    @Test
    public void FillAllRequiredFields()throws InterruptedException{
       driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[5]/a")).click();
       inputFormSubmitPage.FillNameField("Ana");

       inputFormSubmitPage.FillEmailField("ana124@yahoo.com");

       inputFormSubmitPage.FillPasswordField("1234");
       inputFormSubmitPage.FillCompanyField("Company");
       inputFormSubmitPage.FillWebsiteField("Website.com");


        inputFormSubmitPage.selectCountryByValue("AO");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div/h2/span")));
        submitButton.click();





        inputFormSubmitPage.FillAddress1Field("Street 135");
       inputFormSubmitPage.FillAddress2Field("Street 145");

       inputFormSubmitPage.FillStateField("Romania");
       inputFormSubmitPage.FillZipCodeField("45120");
       inputFormSubmitPage.FillCityField("New York");

       inputFormSubmitPage.ClickOnSubmitButton();




    }


}

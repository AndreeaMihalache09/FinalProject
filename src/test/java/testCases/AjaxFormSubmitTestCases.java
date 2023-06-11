package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.AjaxFormSubmitPage;

public class AjaxFormSubmitTestCases extends BasePage {
    private pages.AjaxFormSubmitPage ajaxFormSubmitPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        ajaxFormSubmitPage = new AjaxFormSubmitPage(driver);
    }

    @Test
    public void WriteNameAndCommentThenClickSubmitButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[3]/div/div/div[1]/div[1]/ul/li[6]/a")).click();
        ajaxFormSubmitPage.WriteOnNameField("Ana");
        ajaxFormSubmitPage.WriteOnDescriptionField("Comment");
        ajaxFormSubmitPage.ClickOnSubmitButton();
        WebElement Text = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/form/div[3]"));
        String TextDisplayed = Text.getText();
        Assert.assertTrue(TextDisplayed.contains("Ajax Request is Processing!"));
    }

    @Test
    public void WriteOnlyNameThenClickSubmitButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[6]/a")).click();
        ajaxFormSubmitPage.WriteOnNameField("Ana");
        ajaxFormSubmitPage.ClickOnSubmitButton();
        WebElement Text = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/form/div[3]"));
        String TextDisplayed = Text.getText();
        Assert.assertTrue(TextDisplayed.contains("Ajax Request is Processing!"));
    }
    @Test
    public void WriteOnlyCommentThenClickSubmitButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[6]/a")).click();
        ajaxFormSubmitPage.WriteOnDescriptionField("Comment");
        ajaxFormSubmitPage.ClickOnSubmitButton();
        WebElement Text = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/form/div[3]"));
        String TextDisplayed = Text.getText();
        Assert.assertFalse(TextDisplayed.contains("Ajax Request is Processing!"));

    }
    @Test
    public void WriteNothingThenClickSubmitButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[6]/a")).click();
        ajaxFormSubmitPage.ClickOnSubmitButton();
        WebElement Text = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/form/div[3]"));
        String TextDisplayed = Text.getText();
        Assert.assertFalse(TextDisplayed.contains("Ajax Request is Processing!"));
}}
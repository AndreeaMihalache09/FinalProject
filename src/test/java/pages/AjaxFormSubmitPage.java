package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AjaxFormSubmitPage extends BasePage {
    public AjaxFormSubmitPage(WebDriver driver){
        super(driver);
    }
    By NameField = By.id("title");
    public void WriteOnNameField(String arg1) {
        driver.findElement(NameField).sendKeys(arg1);
    }

    By DescriptionFiled = By.id("description");
    public void WriteOnDescriptionField(String arg1) {
        driver.findElement(DescriptionFiled).sendKeys(arg1);
    }

    By SubmitButton = By.id("btn-submit");
    public void ClickOnSubmitButton (){driver.findElement(SubmitButton).click();}


}

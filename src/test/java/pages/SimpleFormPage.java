package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SimpleFormPage extends BasePage{
    public SimpleFormPage(WebDriver driver){
        super(driver);
    }

    //Locators for Simple Input Field
    By TextField = By.id("user-message");
    public void selectTextField(String arg1) {
        driver.findElement(TextField).sendKeys(arg1);
    }
    By GetCheckedValue = By.id("showInput");
    public void clickOnGetCheckedValue(){ driver.findElement(GetCheckedValue).click();}
    By YourMessageResult = By.id("message");


    //Locators for Two Input Fields
    By TwoInputFieldsEnterA = By.id("sum1");
    public void selectTwoFieldsEnterA(String arg1) {
        driver.findElement(TwoInputFieldsEnterA).sendKeys(arg1);
    }

    By TwoInputFieldsEnterB = By.id("sum2");
    public void selectTwoFieldsEnterB(String arg1) {
        driver.findElement(TwoInputFieldsEnterB).sendKeys(arg1);
    }
    By GetValuesButton = By.xpath("//*[@id=\"gettotal\"]/button");
    public void clickGetValuesButton(){ driver.findElement(GetValuesButton).click();}







}

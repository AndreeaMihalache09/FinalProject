package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CheckboxDemo extends BasePage{
    public CheckboxDemo(WebDriver driver){
        super(driver);
}
    By SingleCheckBox = By.id("isAgeSelected");
    public void clickOnSingleCheckBox(){ driver.findElement(SingleCheckBox).click();}
    By MultipleCheckBoxOption1 = By.id("ex1-check1");
    public void clickOnMultipleCheckBoxOption1(){ driver.findElement(MultipleCheckBoxOption1).click();}
    By MultipleCheckBoxOption2 = By.id("ex1-check2");
    public void clickOnMultipleCheckBoxOption2(){ driver.findElement(MultipleCheckBoxOption2).click();}
    By MultipleCheckBoxOption3 = By.id("ex1-check3");
    public void clickOnMultipleCheckBoxOption3(){ driver.findElement(MultipleCheckBoxOption3).click();}


}

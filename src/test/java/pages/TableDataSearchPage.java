package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TableDataSearchPage extends BasePage {
    public  TableDataSearchPage(WebDriver driver) {
        super(driver);
    }

    //Tasks

    By FilterField = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/input");
    public void WriteFilterInput(String arg1) {driver.findElement(FilterField).sendKeys(arg1);}

    //Listed Users

    By FilterButton = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div/div[1]/button");
    public void ClickOnFilterButton(){driver.findElement(FilterButton).click();}

    By NumberInputField = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[1]/input");
    public void WriteInTheNumberInputField(String arg1) {driver.findElement(NumberInputField).sendKeys(arg1);}

    By UsernameInputField = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[2]/input");
    public void WriteInUsernameInputField(String arg1) {driver.findElement(UsernameInputField).sendKeys(arg1);}

    By FirstNameInputField = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[3]/input");
    public void WriteInTheFirstNameInputField(String arg1) {driver.findElement(FirstNameInputField).sendKeys(arg1);}
    By LastNameInputField = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[4]/input");
    public void WriteInTheLastNameInputField(String arg1) {driver.findElement(LastNameInputField).sendKeys(arg1);}


}

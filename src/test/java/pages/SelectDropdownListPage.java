package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownListPage extends BasePage {
    public SelectDropdownListPage(WebDriver driver) {
        super(driver);
    }

    By SelectADayDropdownList = By.id("select-demo");
    public void ClickOnSelectADayDropdownList() {
        driver.findElement(SelectADayDropdownList).click();
    }
    public void selectDayByValue(String value) {
        Select daySelect = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/select")));
        daySelect.selectByValue(value);
}
    By FirstValue =By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[1]/select/option[1]");
    public void ClickOnFirstValue() {driver.findElement(FirstValue).click();}
    By SecondValue = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[1]/select/option[2]");
    public void ClickOnSecondValue(){driver.findElement(SecondValue).click();}
    By ThirdValue = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[1]/select/option[3]");
    public void ClickOnThirdValue(){driver.findElement(ThirdValue).click();}
    By ForthValue = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[1]/select/option[4]");
    public void ClickOnForthValue(){driver.findElement(ForthValue).click();}
    By FifthValue = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[1]/select/option[5]");
    public void ClickOnFifthValue(){driver.findElement(FifthValue).click();}
    By SixthValue = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[1]/select/option[6]");
    public void ClickOnSixthValue(){driver.findElement(SixthValue).click();}
    By SeventhValue = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[1]/select/option[7]");
    public void ClickOnSeventhValue(){driver.findElement(SeventhValue).click();}
    By EighthValue = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[1]/select/option[8]");
    public void ClickOnEighthValue(){driver.findElement(EighthValue).click();}
    By FirstSelectedButton = By.id("printMe");
    public void ClickOnFirstSelectedButton(){driver.findElement(FirstSelectedButton).click();}

}

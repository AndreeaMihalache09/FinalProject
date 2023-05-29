package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class InputFormSubmitPage extends BasePage{
    public InputFormSubmitPage (WebDriver driver) {
        super(driver);
    }
    By NameField = By.id("name");
    public void FillNameField(String arg1) {
        driver.findElement(NameField).sendKeys(arg1);
    }
    By PasswordField = By.id("inputPassword4");
    public void FillPasswordField(String arg1){ driver.findElement(PasswordField).sendKeys(arg1);}
    By CompanyField = By.id("company");
    public void FillCompanyField(String arg1){ driver.findElement(CompanyField).sendKeys(arg1);}
    By WebsiteField = By.id("websitename");
    public void FillWebsiteField(String arg1){ driver.findElement(WebsiteField).sendKeys(arg1);}
    By EmailField = By.id("inputEmail4");
    public void FillEmailField(String arg1){ driver.findElement(EmailField).sendKeys(arg1);}

    By Country = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/form/div[3]/div[1]/select");
    public void ClickCountry (){driver.findElement(Country).click();}
    public void selectCountryByValue(String value) {
        Select countrySelect = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/form/div[3]/div[1]/select")));
        countrySelect.selectByValue(value);
    }
    By CityField = By.id("inputCity");
    public void FillCityField(String arg1){ driver.findElement(CityField).sendKeys(arg1);}

    By Address1Field = By.id("inputAddress1");
    public void FillAddress1Field(String arg1){ driver.findElement(Address1Field).sendKeys(arg1);}
    By Address2Field = By.id("inputAddress2");
    public void FillAddress2Field(String arg1){ driver.findElement(Address2Field).sendKeys(arg1);}
    By StateField = By.id("inputState");
    public void FillStateField(String arg1){ driver.findElement(StateField).sendKeys(arg1);}
    By ZipCodeField = By.id("inputZip");
    public void FillZipCodeField(String arg1){ driver.findElement(ZipCodeField).sendKeys(arg1);}

    By PopUp = By.xpath("/html/body/div[1]/div[2]/div/h2/span");
    public void ClickOnX(){driver.findElement(PopUp).click();}


    By SubmitButton = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/form/div[6]/button");
    public void ClickOnSubmitButton(){driver.findElement(SubmitButton).click();}
}


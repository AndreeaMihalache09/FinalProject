
package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class JqueryDropdownSearchPage extends BasePage {
    public JqueryDropdownSearchPage(WebDriver driver) {
        super(driver);
    }

    //Drop Down with Search box
    By SelectCountryDropdownList = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/span/span[1]/span");

    public void ClickOnSelectCountryDropdownList() {
        driver.findElement(SelectCountryDropdownList).click();
    }

    By Australia = By.xpath("/html/body/span/span/span[2]/ul/li[2]");

    public void ClickOnAustralia() {
        driver.findElement(Australia).click();
    }

    By Bangladesh = By.xpath("/html/body/span/span/span[2]/ul/li[3]");

    public void ClickOnBangladesh() {
        driver.findElement(Bangladesh).click();
    }

    By Denmark = By.xpath("/html/body/span/span/span[2]/ul/li[4]");

    public void ClickOnDenmark() {
        driver.findElement(Denmark).click();
    }

    By HongKong = By.xpath("/html/body/span/span/span[2]/ul/li[5]");

    public void ClickOnHongKong() {
        driver.findElement(HongKong).click();
    }

    By India = By.xpath("/html/body/span/span/span[2]/ul/li[6]");

    public void ClickOnIndia() {
        driver.findElement(India).click();
    }

    By Japan = By.xpath("/html/body/span/span/span[2]/ul/li[7]");

    public void ClickOnJapan() {
        driver.findElement(Japan).click();
    }

    By Netherlands = By.xpath("/html/body/span/span/span[2]/ul/li[8]");

    public void ClickOnNetherlands() {
        driver.findElement(Netherlands).click();
    }

    By NewZeeland = By.xpath("/html/body/span/span/span[2]/ul/li[9]");

    public void ClickOnNewZealand() {
        driver.findElement(NewZeeland).click();
    }

    By SouthAfrica = By.xpath("/html/body/span/span/span[2]/ul/li[10]");

    public void ClickOnSouthAfrica() {
        driver.findElement(SouthAfrica).click();
    }

    By UnitedStatesOfAmerica = By.xpath("/html/body/span/span/span[2]/ul/li[11]");

    public void ClickOnUnitedStatesOfAmerica() {
        driver.findElement(UnitedStatesOfAmerica).click();
    }


    //Multi Select - Search and Select multiple states

    By SelectStateField = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/span/span[1]/span");

    public void ClickOnSelectStateField() {driver.findElement(SelectStateField).click();
    }
    By Alabama = By.xpath("/html/body/span/span/span/ul/li[1]");
    public void ClickAlabamaInSelectStateField(){driver.findElement(Alabama).click();}
    By Alaska = By.xpath("/html/body/span/span/span/ul/li[2]");
    public void ClickAlaskaInSelectStateField(){driver.findElement(Alaska).click();}
    By Delaware = By.xpath("/html/body/span/span/span/ul/li[8]");
    public void ClickDelawareInSelectStateField(){driver.findElement(Delaware).click();}

    //Drop Down with Disabled values
    By SelectionArrow = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[3]/div[2]/span/span[1]/span/span[2]");
    public void ClickOnSelectionArrow (){driver.findElement(SelectionArrow).click();}

    By PuertoRicoValue = By.xpath("/html/body/span/span/span[2]/ul/li[1]");
    public void ClickOnPuertoRicoValue(){driver.findElement(PuertoRicoValue).click();}

    By AmericanSamoaValue = By.xpath("/html/body/span/span/span[2]/ul/li[2]");
    public void ClickOnAmericanSamoaValue(){driver.findElement(AmericanSamoaValue).click();}

    By GuamDisabledValue = By.xpath("/html/body/span/span/span[2]/ul/li[3]");
    public void ClickOnGuamDisabledValue(){driver.findElement(GuamDisabledValue).click();}

    By NorthernMarianaIslandsValue = By.xpath("/html/body/span/span/span[2]/ul/li[4]");
    public void ClickOnNorthernMarianaIslandsValue(){driver.findElement(NorthernMarianaIslandsValue).click();}

    By UnitedStatesMinorOutlyingIslandsDisabledValue = By.xpath("/html/body/span/span/span[2]/ul/li[5]");
    public void ClickOnUnitedStatesMinorOutlyingIslandsDisabledValue(){driver.findElement(UnitedStatesMinorOutlyingIslandsDisabledValue).click();}
    By VirginIslandsValue = By.xpath("/html/body/span/span/span[2]/ul/li[4]");
    public void ClickOnVirginIslandsValue(){driver.findElement(VirginIslandsValue).click();}
}

package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.JqueryDropdownSearchPage;

import java.time.Duration;

public class JqueryDropdownSearchTestCases extends BasePage {
    private pages.JqueryDropdownSearchPage jqueryDropdownSearchPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();

        jqueryDropdownSearchPage = new JqueryDropdownSearchPage(driver);
    }

    //Drop Down with Search box
    @Test
    public void SelectAustraliaInDropdownList() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectCountryDropdownList();
        jqueryDropdownSearchPage.ClickOnAustralia();
        WebElement CountryField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/span/span[1]/span/span[1]"));
        String Text = CountryField.getText();
        Assert.assertTrue(Text.contains("Australia"));
    }

    @Test
    public void SelectBangladeshInDropdownList() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectCountryDropdownList();
        jqueryDropdownSearchPage.ClickOnBangladesh();
        WebElement CountryField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/span/span[1]/span/span[1]"));
        String Text = CountryField.getText();
        Assert.assertTrue(Text.contains("Bangladesh"));
    }

    @Test
    public void SelectDenmarkInDropdownList() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectCountryDropdownList();
        jqueryDropdownSearchPage.ClickOnDenmark();
        WebElement CountryField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/span/span[1]/span/span[1]"));
        String Text = CountryField.getText();
        Assert.assertTrue(Text.contains("Denmark"));
    }

    @Test
    public void SelectHongKongInDropdownList() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectCountryDropdownList();
        jqueryDropdownSearchPage.ClickOnHongKong();
        WebElement CountryField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/span/span[1]/span/span[1]"));
        String Text = CountryField.getText();
        Assert.assertTrue(Text.contains("Hong Kong"));
    }

    @Test
    public void SelectIndiaInDropdownList() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectCountryDropdownList();
        jqueryDropdownSearchPage.ClickOnIndia();
        WebElement CountryField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/span/span[1]/span/span[1]"));
        String Text = CountryField.getText();
        Assert.assertTrue(Text.contains("India"));
    }

    @Test
    public void SelectJapanInDropdownList() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectCountryDropdownList();
        jqueryDropdownSearchPage.ClickOnJapan();
        WebElement CountryField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/span/span[1]/span/span[1]"));
        String Text = CountryField.getText();
        Assert.assertTrue(Text.contains("Japan"));
    }

    @Test
    public void SelectNewZealandInDropdownList() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectCountryDropdownList();
        jqueryDropdownSearchPage.ClickOnNewZealand();
        WebElement CountryField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/span/span[1]/span/span[1]"));
        String Text = CountryField.getText();
        Assert.assertTrue(Text.contains("New Zealand"));
    }

    @Test
    public void SelectSouthAfricaInDropdownList() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectCountryDropdownList();
        jqueryDropdownSearchPage.ClickOnSouthAfrica();
        WebElement CountryField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/span/span[1]/span/span[1]"));
        String Text = CountryField.getText();
        Assert.assertTrue(Text.contains("South Africa"));
    }

    @Test
    public void SelectUnitedStatesOfAmericaInDropdownList() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectCountryDropdownList();
        jqueryDropdownSearchPage.ClickOnUnitedStatesOfAmerica();
        WebElement CountryField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/span/span[1]/span/span[1]"));
        String Text = CountryField.getText();
        Assert.assertTrue(Text.contains("United States of America"));
    }

    //Multi Select - Search and Select multiple states
    @Test
    public void SelectNothingInSelectStateField() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        WebElement TextDisplayed = driver.findElement(By.xpath("//input[@class='select2-search__field' and @placeholder='Select state(s)']\n"));
        Assert.assertTrue(TextDisplayed.isDisplayed());

    }

    @Test
    public void SelectOnlyOneValueInSelectStateField() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectStateField();
        jqueryDropdownSearchPage.ClickAlabamaInSelectStateField();
        WebElement Text = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/span/span[1]/span/ul/li[1]"));
        String TextDisplayed = Text.getText();
        Assert.assertTrue(TextDisplayed.contains("Alabama"));
    }

    @Test
    public void SelectTwoValuesInSelectStateField() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectStateField();
        jqueryDropdownSearchPage.ClickAlabamaInSelectStateField();
        jqueryDropdownSearchPage.ClickOnSelectStateField();
        jqueryDropdownSearchPage.ClickAlaskaInSelectStateField();
        WebElement Text = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/span/span[1]/span/ul/li[1]"));
        String TextDisplayed = Text.getText();
        WebElement Text2 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/span/span[1]/span/ul/li[2]"));
        String TextDisplayed2 = Text2.getText();
        Assert.assertTrue(TextDisplayed.contains("Alabama"));
        Assert.assertTrue(TextDisplayed2.contains("Alaska"));
    }

    @Test
    public void SelectThreeValuesInSelectStateField() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectStateField();
        jqueryDropdownSearchPage.ClickAlabamaInSelectStateField();
        jqueryDropdownSearchPage.ClickOnSelectStateField();
        jqueryDropdownSearchPage.ClickAlaskaInSelectStateField();
        jqueryDropdownSearchPage.ClickOnSelectStateField();
        jqueryDropdownSearchPage.ClickDelawareInSelectStateField();
        WebElement Text = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/span/span[1]/span/ul/li[1]"));
        String TextDisplayed = Text.getText();
        WebElement Text2 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/span/span[1]/span/ul/li[2]"));
        String TextDisplayed2 = Text2.getText();
        WebElement Text3 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/span/span[1]/span/ul/li[3]"));
        String TextDisplayed3 = Text3.getText();
        Assert.assertTrue(TextDisplayed.contains("Alabama"));
        Assert.assertTrue(TextDisplayed2.contains("Alaska"));
        Assert.assertTrue(TextDisplayed3.contains("Delaware"));
    }

    //Drop Down with Disabled values
    @Test
    public void NoSelectAnyValue() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        WebElement SelectBox = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[3]/div[2]/span/span[1]/span/span[1]"));
        String TextDisplayed = SelectBox.getText();
        Assert.assertTrue(TextDisplayed.contains("Puerto Rico"));
    }

    @Test
    public void SelectAmericanSamoaValue() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectionArrow();
        jqueryDropdownSearchPage.ClickOnAmericanSamoaValue();
        WebElement SelectBox = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[3]/div[2]/span/span[1]/span/span[1]"));
        String TextDisplayed = SelectBox.getText();
        Assert.assertTrue(TextDisplayed.contains("American Samoa"));
    }
    @Test
    public void CheckGuamDisabledValue() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectionArrow();
        WebElement UnableButton = driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[3]"));
        Assert.assertFalse(UnableButton.isEnabled();

    }
    @Test
    public void SelectNorthernMarianaIslandsValue() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectionArrow();
        jqueryDropdownSearchPage.ClickOnNorthernMarianaIslandsValue();
        WebElement SelectBox = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[3]/div[2]/span/span[1]/span/span[1]"));
        String TextDisplayed = SelectBox.getText();
        Assert.assertTrue(TextDisplayed.contains("Northern Mariana Islands"));
    }

}
package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.JqueryDropdownSearchPage;

public class JqueryDropdownSearchTestCases extends BasePage {
    private pages.JqueryDropdownSearchPage jqueryDropdownSearchPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();

        jqueryDropdownSearchPage = new JqueryDropdownSearchPage(driver);
    }

    //Drop Down with Search box
    @Test
    public void SelectAustraliaInDropdownList() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectCountryDropdownList();
        jqueryDropdownSearchPage.ClickOnAustralia();
        WebElement CountryField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/span/span[1]/span/span[1]"));
        String Text = CountryField.getText();
        Assert.assertTrue(Text.contains("Australia"));
    }

    @Test
    public void SelectBangladeshInDropdownList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectCountryDropdownList();
        jqueryDropdownSearchPage.ClickOnBangladesh();
        WebElement CountryField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/span/span[1]/span/span[1]"));
        String Text = CountryField.getText();
        Assert.assertTrue(Text.contains("Bangladesh"));
    }

    @Test
    public void SelectDenmarkInDropdownList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectCountryDropdownList();
        jqueryDropdownSearchPage.ClickOnDenmark();
        WebElement CountryField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/span/span[1]/span/span[1]"));
        String Text = CountryField.getText();
        Assert.assertTrue(Text.contains("Denmark"));
    }

    @Test
    public void SelectHongKongInDropdownList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectCountryDropdownList();
        jqueryDropdownSearchPage.ClickOnHongKong();
        WebElement CountryField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/span/span[1]/span/span[1]"));
        String Text = CountryField.getText();
        Assert.assertTrue(Text.contains("Hong Kong"));
    }

    @Test
    public void SelectIndiaInDropdownList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectCountryDropdownList();
        jqueryDropdownSearchPage.ClickOnIndia();
        WebElement CountryField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/span/span[1]/span/span[1]"));
        String Text = CountryField.getText();
        Assert.assertTrue(Text.contains("India"));
    }

    @Test
    public void SelectJapanInDropdownList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectCountryDropdownList();
        jqueryDropdownSearchPage.ClickOnJapan();
        WebElement CountryField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/span/span[1]/span/span[1]"));
        String Text = CountryField.getText();
        Assert.assertTrue(Text.contains("Japan"));
    }

    @Test
    public void SelectNewZealandInDropdownList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectCountryDropdownList();
        jqueryDropdownSearchPage.ClickOnNewZealand();
        WebElement CountryField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/span/span[1]/span/span[1]"));
        String Text = CountryField.getText();
        Assert.assertTrue(Text.contains("New Zealand"));
    }

    @Test
    public void SelectSouthAfricaInDropdownList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectCountryDropdownList();
        jqueryDropdownSearchPage.ClickOnSouthAfrica();
        WebElement CountryField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/span/span[1]/span/span[1]"));
        String Text = CountryField.getText();
        Assert.assertTrue(Text.contains("South Africa"));
    }

    @Test
    public void SelectUnitedStatesOfAmericaInDropdownList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectCountryDropdownList();
        jqueryDropdownSearchPage.ClickOnUnitedStatesOfAmerica();
        WebElement CountryField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/span/span[1]/span/span[1]"));
        String Text = CountryField.getText();
        Assert.assertTrue(Text.contains("United States of America"));
    }

    //Multi Select - Search and Select multiple states
    @Test
    public void SelectNothingInSelectStateField() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        WebElement TextDisplayed = driver.findElement(By.xpath("//input[@class='select2-search__field' and @placeholder='Select state(s)']\n"));
        Assert.assertTrue(TextDisplayed.isDisplayed());

    }

    @Test
    public void SelectOnlyOneValueInSelectStateField() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectStateField();
        jqueryDropdownSearchPage.ClickAlabamaInSelectStateField();
        WebElement Text = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/span/span[1]/span/ul/li[1]"));
        String TextDisplayed = Text.getText();
        Assert.assertTrue(TextDisplayed.contains("Alabama"));
    }

    @Test
    public void SelectTwoValuesInSelectStateField() throws InterruptedException {
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
    public void SelectThreeValuesInSelectStateField() throws InterruptedException {
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
    public void NoSelectAnyValue() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        WebElement SelectBox = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[3]/div[2]/span/span[1]/span/span[1]"));
        String TextDisplayed = SelectBox.getText();
        Assert.assertTrue(TextDisplayed.contains("Puerto Rico"));
    }

    @Test
    public void SelectAmericanSamoaValue() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectionArrow();
        jqueryDropdownSearchPage.ClickOnAmericanSamoaValue();
        WebElement SelectBox = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[3]/div[2]/span/span[1]/span/span[1]"));
        String TextDisplayed = SelectBox.getText();
        Assert.assertTrue(TextDisplayed.contains("American Samoa"));
    }

    @Test
    public void CheckGuamDisabledValue() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectionArrow();
        WebElement UnableButton = driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[3]"));
        boolean isButtonDisabled = UnableButton.getAttribute("aria-disabled").equals("true");
        Assert.assertTrue(isButtonDisabled, "The unableButton should be disabled");
    }

    @Test
    public void SelectNorthernMarianaIslandsValue() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectionArrow();
        jqueryDropdownSearchPage.ClickOnNorthernMarianaIslandsValue();
        WebElement SelectBox = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[3]/div[2]/span/span[1]/span/span[1]"));
        String TextDisplayed = SelectBox.getText();
        Assert.assertTrue(TextDisplayed.contains("Northern Mariana Islands"));
    }

    @Test
    public void CheckUnitedStatesMinorOutlyingIslandsDisabledValue() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectionArrow();
        WebElement UnableButton = driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[5]"));
        boolean isButtonDisabled = UnableButton.getAttribute("aria-disabled").equals("true");
        Assert.assertTrue(isButtonDisabled, "The unabledButton should be disabled");
    }

    @Test
    public void SelectVirginIslandsValue() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnSelectionArrow();
        jqueryDropdownSearchPage.ClickOnVirginIslandsValue();
        WebElement SelectBox = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[3]/div[2]/span/span[1]/span/span[1]"));
        String TextDisplayed = SelectBox.getText();
        Assert.assertTrue(TextDisplayed.contains("Virgin Islands"));
    }

    //Drop-down with Category related options
    @Test
    public void SelectNoOptionInDropdownList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        WebElement Text = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[4]/div[2]/select"));
        String TextDisplayed = (Text.getText());
        Assert.assertTrue(TextDisplayed.contains("PHP"));
    }

    @Test
    public void SelectOption2InDropdownList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnOtherFileDropdown();
        jqueryDropdownSearchPage.SelectAnOption("P");
        jqueryDropdownSearchPage.ClickOutside();
        WebElement Text = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[4]/div[2]/select"));
        String TextDisplayed = (Text.getText());
        Assert.assertTrue(TextDisplayed.contains("Python"));

    }

    @Test
    public void SelectOption3InDropdownList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnOtherFileDropdown();
        jqueryDropdownSearchPage.SelectAnOption("R");
        jqueryDropdownSearchPage.ClickOutside();
        WebElement Text = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[4]/div[2]/select"));
        String TextDisplayed = (Text.getText());
        Assert.assertTrue(TextDisplayed.contains("Ruby"));

    }
    @Test
    public void SelectOption4InDropdownList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnOtherFileDropdown();
        jqueryDropdownSearchPage.SelectAnOption("C");
        jqueryDropdownSearchPage.ClickOutside();
        WebElement Text = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[4]/div[2]/select"));
        String TextDisplayed = (Text.getText());
        Assert.assertTrue(TextDisplayed.contains("C"));

    }
    @Test
    public void SelectOption5InDropdownList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnOtherFileDropdown();
        jqueryDropdownSearchPage.SelectAnOption("J");
        jqueryDropdownSearchPage.ClickOutside();
        WebElement Text = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[4]/div[2]/select"));
        String TextDisplayed = (Text.getText());
        Assert.assertTrue(TextDisplayed.contains("Java"));

    }
    @Test
    public void SelectOption6InDropdownList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnOtherFileDropdown();
        jqueryDropdownSearchPage.SelectAnOption(".");
        jqueryDropdownSearchPage.ClickOutside();
        WebElement Text = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[4]/div[2]/select"));
        String TextDisplayed = (Text.getText());
        Assert.assertTrue(TextDisplayed.contains(".Net"));

    }
    @Test
    public void SelectOption7InDropdownList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnOtherFileDropdown();
        jqueryDropdownSearchPage.SelectAnOption("U");
        jqueryDropdownSearchPage.ClickOutside();
        WebElement Text = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[4]/div[2]/select"));
        String TextDisplayed = (Text.getText());
        Assert.assertTrue(TextDisplayed.contains("Unknown Script"));

    }
    @Test
    public void SelectOption8InDropdownList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jqueryDropdownSearchPage.ClickOnOtherFileDropdown();
        jqueryDropdownSearchPage.SelectAnOption("O");
        jqueryDropdownSearchPage.ClickOutside();
        WebElement Text = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[4]/div[2]/select"));
        String TextDisplayed = (Text.getText());
        Assert.assertTrue(TextDisplayed.contains("Other file"));

    }
}
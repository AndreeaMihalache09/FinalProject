package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.TablePaginationPage;

public class TablePaginationTestCases extends BasePage {
    private TablePaginationPage tablePaginationPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        tablePaginationPage = new TablePaginationPage(driver);
    }

    @Test
    public void SelectNoOptionInDropdownList() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[1]/a")).click();
        WebElement DropownListTextBox = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/select"));
        String TextDysplayed = DropownListTextBox.getText();
        Assert.assertTrue(TextDysplayed.contains("5"));
    }

    @Test
    public void CheckIfAllRowsAppearAfterSelectShowALLRowsOption() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[1]/a")).click();
        tablePaginationPage.SelectAnOptionInDropdownList("s");
        WebElement DropownListTextBox = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/select"));
        String TextDysplayed = DropownListTextBox.getText();
        WebElement LastOptions = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/table/tbody/tr[30]/td[1]"));
        Assert.assertTrue(LastOptions.isDisplayed());
        Assert.assertTrue(TextDysplayed.contains("Show ALL Rows"));
    }

    @Test
    public void CheckIf10RowsAppearAfterSelect10RowsOption() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[1]/a")).click();
        tablePaginationPage.SelectAnOptionInDropdownList("10");
        WebElement DropownListTextBox = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/select"));
        String TextDysplayed = DropownListTextBox.getText();
        WebElement LastOptions = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/table/tbody/tr[10]/td[1]"));
        Assert.assertTrue(LastOptions.isDisplayed());
        Assert.assertTrue(TextDysplayed.contains("10"));
    }

    @Test
    public void CheckIf15RowsAppearAfterSelect15RowsOption() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[1]/a")).click();
        tablePaginationPage.SelectAnOptionInDropdownList("15");
        WebElement DropownListTextBox = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/select"));
        String TextDysplayed = DropownListTextBox.getText();
        WebElement LastOptions = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/table/tbody/tr[10]/td[1]"));
        Assert.assertTrue(LastOptions.isDisplayed());
        Assert.assertTrue(TextDysplayed.contains("15"));
    }

    @Test
    public void CheckIf30RowsAppearAfterSelect30RowsOption() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[1]/a")).click();
        tablePaginationPage.SelectAnOptionInDropdownList("30");
        WebElement DropownListTextBox = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/select"));
        String TextDysplayed = DropownListTextBox.getText();
        WebElement LastOptions = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/table/tbody/tr[10]/td[1]"));
        Assert.assertTrue(LastOptions.isDisplayed());
        Assert.assertTrue(TextDysplayed.contains("30"));
    }

    @Test
    public void CheckIfAllPagesOfTheTableContainTheSelectedNumberOfRows() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[1]/a")).click();
        tablePaginationPage.ClickPage1();
        WebElement LastRowPage1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/table/tbody/tr[5]/td[1]"));
        String Number5 = LastRowPage1.getText();
        Assert.assertTrue(Number5.contains("5"));
        tablePaginationPage.ClickPage2();
        WebElement LastRowPage2 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/table/tbody/tr[10]/td[1]"));
        String Number10 = LastRowPage2.getText();
        Assert.assertTrue(Number10.contains("10"));
        tablePaginationPage.ClickPage3();
        WebElement LastRowPage3 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/table/tbody/tr[15]/td[1]"));
        String Number15 = LastRowPage3.getText();
        Assert.assertTrue(Number15.contains("15"));
        tablePaginationPage.ClickPage4();
        WebElement LastRowPage4 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/table/tbody/tr[20]/td[1]"));
        String Number20 = LastRowPage4.getText();
        Assert.assertTrue(Number20.contains("20"));
        tablePaginationPage.ClickPage5();
        WebElement LastRowPage5 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/table/tbody/tr[25]/td[1]"));
        String Number25 = LastRowPage5.getText();
        Assert.assertTrue(Number25.contains("25"));
        tablePaginationPage.ClickPage6();
        WebElement LastRowPage6 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/table/tbody/tr[30]/td[1]"));
        String Number30 = LastRowPage6.getText();
        Assert.assertTrue(Number30.contains("30"));
    }

    @Test
    public void Select10InDropdownListAndCheckIfAllPagesOfTheTableContain10Rows() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[1]/a")).click();
        tablePaginationPage.SelectAnOptionInDropdownList("10");
        tablePaginationPage.ClickPage1();
        WebElement LastRowPage1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/table/tbody/tr[10]/td[1]"));
        String Number10 = LastRowPage1.getText();
        Assert.assertTrue(Number10.contains("10"));
        tablePaginationPage.ClickPage2();
        WebElement LastRowPage2 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/table/tbody/tr[20]/td[1]"));
        String Number20 = LastRowPage2.getText();
        Assert.assertTrue(Number20.contains("20"));
        tablePaginationPage.ClickPage3();
        WebElement LastRowPage3 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/table/tbody/tr[30]/td[1]"));
        String Number30 = LastRowPage3.getText();
        Assert.assertTrue(Number30.contains("30"));
    }

    @Test
    public void Select15InDropdownListAndCheckIfAllPagesOfTheTableContain15Rows() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[1]/a")).click();
        tablePaginationPage.SelectAnOptionInDropdownList("15");
        tablePaginationPage.ClickPage1();
        WebElement LastRowPage1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/table/tbody/tr[10]/td[1]"));
        String Number10 = LastRowPage1.getText();
        Assert.assertTrue(Number10.contains("10"));
        tablePaginationPage.ClickPage2();
        WebElement LastRowPage2 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/table/tbody/tr[20]/td[1]"));
        String Number20 = LastRowPage2.getText();
        Assert.assertTrue(Number20.contains("20"));
    }

    @Test
    public void Select20InDropdownListAndCheckIfAllPagesOfTheTableContain20Rows() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[1]/a")).click();
        tablePaginationPage.SelectAnOptionInDropdownList("20");
        tablePaginationPage.ClickPage1();
        WebElement LastRowPage1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/table/tbody/tr[20]/td[1]"));
        String Number20 = LastRowPage1.getText();
        Assert.assertTrue(Number20.contains("20"));
        tablePaginationPage.ClickPage2();
        WebElement LastRowPage2 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/table/tbody/tr[30]/td[1]"));
        String Number30 = LastRowPage2.getText();
        Assert.assertTrue(Number30.contains("30"));
    }

    }

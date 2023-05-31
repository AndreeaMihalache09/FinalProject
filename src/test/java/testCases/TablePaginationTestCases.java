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
    public void CheckIf10RowsAppearAfterSelect10Option() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[1]/a")).click();
        tablePaginationPage.SelectAnOptionInDropdownList("10");
        WebElement DropownListTextBox = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/select"));
        String TextDysplayed = DropownListTextBox.getText();
        WebElement LastOptions = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/table/tbody/tr[10]/td[1]"));
        Assert.assertTrue(LastOptions.isDisplayed());
        Assert.assertTrue(TextDysplayed.contains("10"));
    }

    @Test
    public void CheckIf15RowsAppearAfterSelect15Option() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[1]/a")).click();
        tablePaginationPage.SelectAnOptionInDropdownList("15");
        WebElement DropownListTextBox = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/select"));
        String TextDysplayed = DropownListTextBox.getText();
        WebElement LastOptions = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/table/tbody/tr[10]/td[1]"));
        Assert.assertTrue(LastOptions.isDisplayed());
        Assert.assertTrue(TextDysplayed.contains("15"));
    }

    @Test
    public void CheckIf30RowsAppearAfterSelect30Option() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[1]/a")).click();
        tablePaginationPage.SelectAnOptionInDropdownList("30");
        WebElement DropownListTextBox = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/select"));
        String TextDysplayed = DropownListTextBox.getText();
        WebElement LastOptions = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/table/tbody/tr[10]/td[1]"));
        Assert.assertTrue(LastOptions.isDisplayed());
        Assert.assertTrue(TextDysplayed.contains("30"));
    }

    @Test
    public void SelectNoOptionInDropdownListAndSwitchPagesToSeeAllRowsInTheTable() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[1]/a")).click();
        WebElement DropownListTextBox = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/select"));
        String TextDysplayed = DropownListTextBox.getText();
        Assert.assertTrue(TextDysplayed.contains("5"));
    }
}
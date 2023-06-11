package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.TableFilterPage;
public class TableFilterTestCases extends BasePage {
    private TableFilterPage tableFilterPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        tableFilterPage = new TableFilterPage(driver);
    }

    @Test
    public void CheckGreenButton()throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[3]/a")).click();
        tableFilterPage.ClickOnGreenButton();
        WebElement FirstGreenValue = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/div[2]/div[2]/table/tbody/tr[1]"));
        WebElement SecondGreenValue = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/div[2]/div[2]/table/tbody/tr[4]"));
        Assert.assertTrue(FirstGreenValue.isDisplayed());
        Assert.assertTrue(SecondGreenValue.isDisplayed());
    }

    @Test
    public void CheckOrangeButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[3]/a")).click();
        tableFilterPage.ClickOnOrangeButton();
        WebElement FirstOrangeValue = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/div[2]/div[2]/table/tbody/tr[2]"));
        WebElement SecondOrangeValue = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/div[2]/div[2]/table/tbody/tr[5]"));
        Assert.assertTrue(FirstOrangeValue.isDisplayed());
        Assert.assertTrue(SecondOrangeValue.isDisplayed());
    }
    @Test
    public void CheckRedButton()throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[3]/a")).click();
        tableFilterPage.ClickOnRedButton();
        WebElement RedValue = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/div[2]/div[2]/table/tbody/tr[3]"));
        Assert.assertTrue(RedValue.isDisplayed());
    }
    @Test
    public void CheckAllButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[3]/a")).click();
        tableFilterPage.ClickOnAllButton();
        WebElement FirstGreenValue = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/div[2]/div[2]/table/tbody/tr[1]"));
        WebElement SecondGreenValue = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/div[2]/div[2]/table/tbody/tr[4]"));
        WebElement FirstOrangeValue = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/div[2]/div[2]/table/tbody/tr[2]"));
        WebElement SecondOrangeValue = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/div[2]/div[2]/table/tbody/tr[5]"));
        WebElement RedValue = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/div[2]/div[2]/table/tbody/tr[3]"));
        Assert.assertTrue(FirstGreenValue.isDisplayed());
        Assert.assertTrue(SecondGreenValue.isDisplayed());
        Assert.assertTrue(FirstOrangeValue.isDisplayed());
        Assert.assertTrue(SecondOrangeValue.isDisplayed());
        Assert.assertTrue(RedValue.isDisplayed());
    }
    @Test
    public void CheckNoButtonlButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[3]/a")).click();
        WebElement FirstGreenValue = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/div[2]/div[2]/table/tbody/tr[1]"));
        WebElement SecondGreenValue = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/div[2]/div[2]/table/tbody/tr[4]"));
        WebElement FirstOrangeValue = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/div[2]/div[2]/table/tbody/tr[2]"));
        WebElement SecondOrangeValue = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/div[2]/div[2]/table/tbody/tr[5]"));
        WebElement RedValue = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/div[2]/div[2]/table/tbody/tr[3]"));
        Assert.assertTrue(FirstGreenValue.isDisplayed());
        Assert.assertTrue(SecondGreenValue.isDisplayed());
        Assert.assertTrue(FirstOrangeValue.isDisplayed());
        Assert.assertTrue(SecondOrangeValue.isDisplayed());
        Assert.assertTrue(RedValue.isDisplayed());
    }
}
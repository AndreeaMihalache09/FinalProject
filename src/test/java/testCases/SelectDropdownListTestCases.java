package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.SelectDropdownListPage;
public class SelectDropdownListTestCases extends BasePage {
    private pages.SelectDropdownListPage selectDropdownListPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        selectDropdownListPage = new SelectDropdownListPage(driver);
    }

    @Test
    public void SelectSundayInDropdownList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnSelectADayDropdownList();
        selectDropdownListPage.selectDayByValue("Sunday");
        WebElement Message = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/p[2]"));
        String MessageDisplayed = Message.getText();
        Assert.assertTrue(MessageDisplayed.contains("Day selected :- Sunday"));
    }

    @Test
    public void SelectMondayInDropdownList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnSelectADayDropdownList();
        selectDropdownListPage.selectDayByValue("Monday");
        WebElement Message = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/p[2]"));
        String MessageDisplayed = Message.getText();
        Assert.assertTrue(MessageDisplayed.contains("Day selected :- Monday"));
    }

    @Test
    public void SelectTuesdayInDropdownList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnSelectADayDropdownList();
        selectDropdownListPage.selectDayByValue("Tuesday");
        WebElement Message = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/p[2]"));
        String MessageDisplayed = Message.getText();
        Assert.assertTrue(MessageDisplayed.contains("Day selected :- Tuesday"));
    }

    @Test
    public void SelectWednesdayInDropdownList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnSelectADayDropdownList();
        selectDropdownListPage.selectDayByValue("Wednesday");
        WebElement Message = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/p[2]"));
        String MessageDisplayed = Message.getText();
        Assert.assertTrue(MessageDisplayed.contains("Day selected :- Wednesday"));
    }

    @Test
    public void SelectThursdayInDropdownList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnSelectADayDropdownList();
        selectDropdownListPage.selectDayByValue("Thursday");
        WebElement Message = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/p[2]"));
        String MessageDisplayed = Message.getText();
        Assert.assertTrue(MessageDisplayed.contains("Day selected :- Thursday"));
    }
    @Test
    public void SelectFridayInDropdownList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnSelectADayDropdownList();
        selectDropdownListPage.selectDayByValue("Friday");
        WebElement Message = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/p[2]"));
        String MessageDisplayed = Message.getText();
        Assert.assertTrue(MessageDisplayed.contains("Day selected :- Friday"));
    }
    @Test
    public void SelectSaturdayInDropdownList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnSelectADayDropdownList();
        selectDropdownListPage.selectDayByValue("Saturday");
        WebElement Message = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/p[2]"));
        String MessageDisplayed = Message.getText();
        Assert.assertTrue(MessageDisplayed.contains("Day selected :- Saturday"));
    }
    @Test
    public void NoDaySelectedInDropdownList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        WebElement Message = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/p[2]"));
        Assert.assertFalse(Message.isDisplayed());
}
    @Test
    public void SelectFirstValueAndClickFirstSelectedButtonInMultiSelectList() throws InterruptedException{
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnFirstValue();
        selectDropdownListPage.ClickOnFirstSelectedButton();
        WebElement result1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/p[1]"));
        String result1Displayed = result1.getText();
        Assert.assertTrue(result1Displayed.contains("First selected option is : California"));
    }
    @Test
    public void SelectSecondValueAndClickFirstSelectedButtonInMultiSelectList ()throws InterruptedException{
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnSecondValue();
        selectDropdownListPage.ClickOnFirstSelectedButton();
        WebElement result1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/p[1]"));
        String result1Displayed = result1.getText();
        Assert.assertTrue(result1Displayed.contains("First selected option is : Florida"));
    }
    @Test
    public void SelectThirdValueAndClickFirstSelectedButtonInMultiSelectList() throws InterruptedException{
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnThirdValue();
        selectDropdownListPage.ClickOnFirstSelectedButton();
        WebElement result1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/p[1]"));
        String result1Displayed = result1.getText();
        Assert.assertTrue(result1Displayed.contains("First selected option is : New Jersey"));
    }
    @Test
    public void SelectForthValueAndClickFirstSelectedButtonInMultiSelectList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnForthValue();
        selectDropdownListPage.ClickOnFirstSelectedButton();
        WebElement result1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/p[1]"));
        String result1Displayed = result1.getText();
        Assert.assertTrue(result1Displayed.contains("First selected option is : New York"));
    }
    @Test
    public void SelectFifthValueAndClickFirstSelectedButtonInMultiSelectList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnFifthValue();
        selectDropdownListPage.ClickOnFirstSelectedButton();
        WebElement result1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/p[1]"));
        String result1Displayed = result1.getText();
        Assert.assertTrue(result1Displayed.contains("First selected option is : Ohio"));
    }
    @Test
    public void SelectSixthValueAndClickFirstSelectedButtonInMultiSelectList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnSixthValue();
        selectDropdownListPage.ClickOnFirstSelectedButton();
        WebElement result1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/p[1]"));
        String result1Displayed = result1.getText();
        Assert.assertTrue(result1Displayed.contains("First selected option is : Texas"));
    }
    @Test
    public void SelectSeventhValueAndClickFirstSelectedButtonInMultiSelectList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnSeventhValue();
        selectDropdownListPage.ClickOnFirstSelectedButton();
        WebElement result1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/p[1]"));
        String result1Displayed = result1.getText();
        Assert.assertTrue(result1Displayed.contains("First selected option is : Pennsylvania"));
    }
    @Test
    public void SelectEighthValueAndClickFirstSelectedButtonInMultiSelectList() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnEighthValue();
        selectDropdownListPage.ClickOnFirstSelectedButton();
        WebElement result1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/p[1]"));
        String result1Displayed = result1.getText();
        Assert.assertTrue(result1Displayed.contains("First selected option is : Washington"));
    }
}

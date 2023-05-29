package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.CheckboxDemoPage;
import pages.RadioButtonPage;
import pages.SelectDropdownListPage;
public class SelectDropdownListTestCases extends BasePage {
    private pages.SelectDropdownListPage selectDropdownListPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        selectDropdownListPage = new SelectDropdownListPage(driver);
    }

    @Test
    public void SelectSundayInDropdownList() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnSelectADayDropdownList();
        selectDropdownListPage.selectDayByValue("Sunday");
        WebElement Message = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/p[2]"));
        String MessageDisplayed = Message.getText();
        Assert.assertTrue(MessageDisplayed.contains("Day selected :- Sunday"));
    }

    @Test
    public void SelectMondayInDropdownList() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnSelectADayDropdownList();
        selectDropdownListPage.selectDayByValue("Monday");
        WebElement Message = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/p[2]"));
        String MessageDisplayed = Message.getText();
        Assert.assertTrue(MessageDisplayed.contains("Day selected :- Monday"));
    }

    @Test
    public void SelectTuesdayInDropdownList() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnSelectADayDropdownList();
        selectDropdownListPage.selectDayByValue("Tuesday");
        WebElement Message = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/p[2]"));
        String MessageDisplayed = Message.getText();
        Assert.assertTrue(MessageDisplayed.contains("Day selected :- Tuesday"));
    }

    @Test
    public void SelectWednesdayInDropdownList() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnSelectADayDropdownList();
        selectDropdownListPage.selectDayByValue("Wednesday");
        WebElement Message = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/p[2]"));
        String MessageDisplayed = Message.getText();
        Assert.assertTrue(MessageDisplayed.contains("Day selected :- Wednesday"));
    }

    @Test
    public void SelectThursdayInDropdownList() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnSelectADayDropdownList();
        selectDropdownListPage.selectDayByValue("Thursday");
        WebElement Message = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/p[2]"));
        String MessageDisplayed = Message.getText();
        Assert.assertTrue(MessageDisplayed.contains("Day selected :- Thursday"));
    }
    @Test
    public void SelectFridayInDropdownList() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnSelectADayDropdownList();
        selectDropdownListPage.selectDayByValue("Friday");
        WebElement Message = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/p[2]"));
        String MessageDisplayed = Message.getText();
        Assert.assertTrue(MessageDisplayed.contains("Day selected :- Friday"));
    }
    @Test
    public void SelectSaturdayInDropdownList() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnSelectADayDropdownList();
        selectDropdownListPage.selectDayByValue("Saturday");
        WebElement Message = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/p[2]"));
        String MessageDisplayed = Message.getText();
        Assert.assertTrue(MessageDisplayed.contains("Day selected :- Saturday"));
    }
    @Test
    public void NoDaySelectedInDropdownList() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        WebElement Message = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/p[2]"));
        Assert.assertFalse(Message.isDisplayed());
}
    @Test
    public void SelectFirstValueAndClickFirstSelectedButtonInMultiSelectList(){
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnFirstValue();
        selectDropdownListPage.ClickOnFirstSelectedButton();
        WebElement result1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/p[1]"));
        String result1Displayed = result1.getText();
        Assert.assertTrue(result1Displayed.contains("First selected option is : California"));
    }
    @Test
    public void SelectSecondValueAndClickFirstSelectedButtonInMultiSelectList(){
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnSecondValue();
        selectDropdownListPage.ClickOnFirstSelectedButton();
        WebElement result1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/p[1]"));
        String result1Displayed = result1.getText();
        Assert.assertTrue(result1Displayed.contains("First selected option is : Florida"));
    }
    @Test
    public void SelectThirdValueAndClickFirstSelectedButtonInMultiSelectList(){
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnThirdValue();
        selectDropdownListPage.ClickOnFirstSelectedButton();
        WebElement result1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/p[1]"));
        String result1Displayed = result1.getText();
        Assert.assertTrue(result1Displayed.contains("First selected option is : New Jersey"));
    }
    @Test
    public void SelectForthValueAndClickFirstSelectedButtonInMultiSelectList() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnForthValue();
        selectDropdownListPage.ClickOnFirstSelectedButton();
        WebElement result1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/p[1]"));
        String result1Displayed = result1.getText();
        Assert.assertTrue(result1Displayed.contains("First selected option is : New York"));
    }
    @Test
    public void SelectFifthValueAndClickFirstSelectedButtonInMultiSelectList() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnFifthValue();
        selectDropdownListPage.ClickOnFirstSelectedButton();
        WebElement result1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/p[1]"));
        String result1Displayed = result1.getText();
        Assert.assertTrue(result1Displayed.contains("First selected option is : Ohio"));
    }
    @Test
    public void SelectSixthValueAndClickFirstSelectedButtonInMultiSelectList() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnSixthValue();
        selectDropdownListPage.ClickOnFirstSelectedButton();
        WebElement result1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/p[1]"));
        String result1Displayed = result1.getText();
        Assert.assertTrue(result1Displayed.contains("First selected option is : Texas"));
    }
    @Test
    public void SelectSeventhValueAndClickFirstSelectedButtonInMultiSelectList() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnSeventhValue();
        selectDropdownListPage.ClickOnFirstSelectedButton();
        WebElement result1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/p[1]"));
        String result1Displayed = result1.getText();
        Assert.assertTrue(result1Displayed.contains("First selected option is : Pennsylvania"));
    }
    @Test
    public void SelectEighthValueAndClickFirstSelectedButtonInMultiSelectList() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.ClickOnEighthValue();
        selectDropdownListPage.ClickOnFirstSelectedButton();
        WebElement result1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/p[1]"));
        String result1Displayed = result1.getText();
        Assert.assertTrue(result1Displayed.contains("First selected option is : Washington"));
    }
}

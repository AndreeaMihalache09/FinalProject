package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.RadioButtonPage;
public class RadioButtonTestCases extends BasePage {
    private pages.RadioButtonPage radioButtonPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        radioButtonPage = new RadioButtonPage(driver);
    }

    @Test
    public void ClickOnGetCheckedValueButtonWithoutClickAnyValue() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.ClickOnGetCheckedValueButton();
        WebElement resultValue = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[1]/div/p[2]"));
        String result = resultValue.getText();
        Assert.assertTrue(result.contains("Radio button is Not checked"));
    }

    @Test
    public void SelectMaleValue() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.ClickMaleValue();
        radioButtonPage.ClickOnGetCheckedValueButton();
        WebElement resultValue = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[1]/div/p[2]"));
        String result = resultValue.getText();
        Assert.assertTrue(result.contains("Radio button 'Male' is checked"));

    }

    @Test
    public void SelectFemaleValue() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.ClickFemaleValue();
        radioButtonPage.ClickOnGetCheckedValueButton();
        WebElement resultValue = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[1]/div/p[2]"));
        String result = resultValue.getText();
        Assert.assertTrue(result.contains("Radio button 'Female' is checked"));
    }

    @Test
    public void ClickOnGetValueButtonWithoutSelectGenderAndAge() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.ClickOnGetValuesButton();
        WebElement Gender = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span"));
        WebElement Age = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span"));
        Assert.assertFalse(Gender.isDisplayed());
        Assert.assertFalse((Age.isDisplayed()));
    }

    @Test
    public void VerifyIfGender1AndAge1AppearsAfterClickTheGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.ClickOnMaleGender();
        radioButtonPage.ClickOnFirstAgeGroup();
        radioButtonPage.ClickOnGetValuesButton();
        WebElement Gender = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span"));
        String Gender1 = Gender.getText();
        WebElement Age = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span"));
        String Age1 = Age.getText();
        Assert.assertTrue(Gender1.contains("Male"));
        Assert.assertTrue((Age1.contains("0 - 5")));
    }

    @Test
    public void VerifyIfGender1AndAge2AppearsAfterClickTheGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.ClickOnMaleGender();
        radioButtonPage.ClickOnSecondAgeGroup();
        radioButtonPage.ClickOnGetValuesButton();
        WebElement Gender = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span"));
        String Gender1 = Gender.getText();
        WebElement Age = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span"));
        String Age1 = Age.getText();
        Assert.assertTrue(Gender1.contains("Male"));
        Assert.assertTrue((Age1.contains("5 - 15")));

    }

    @Test
    public void VerifyIfGender1AndAge3AppearsAfterClickTheGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.ClickOnMaleGender();
        radioButtonPage.ClickOnThirdAgeGroup();
        radioButtonPage.ClickOnGetValuesButton();
        WebElement Gender = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span"));
        String Gender1 = Gender.getText();
        WebElement Age = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span"));
        String Age1 = Age.getText();
        Assert.assertTrue(Gender1.contains("Male"));
        Assert.assertTrue((Age1.contains("15 - 50")));

    }

    @Test
    public void VerifyIfGender2AndAge1AppearsAfterClickTheGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.ClickOnFemaleGender();
        radioButtonPage.ClickOnFirstAgeGroup();
        radioButtonPage.ClickOnGetValuesButton();
        WebElement Gender = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span"));
        String Gender1 = Gender.getText();
        WebElement Age = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span"));
        String Age1 = Age.getText();
        Assert.assertTrue(Gender1.contains("Female"));
        Assert.assertTrue((Age1.contains("0 - 5")));
    }

    @Test
    public void VerifyIfGender2AndAge2AppearsAfterClickTheGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.ClickOnFemaleGender();
        radioButtonPage.ClickOnSecondAgeGroup();
        radioButtonPage.ClickOnGetValuesButton();
        WebElement Gender = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span"));
        String Gender1 = Gender.getText();
        WebElement Age = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span"));
        String Age1 = Age.getText();
        Assert.assertTrue(Gender1.contains("Female"));
        Assert.assertTrue((Age1.contains("5 - 15")));

    }

    @Test
    public void VerifyIfGender2AndAge3AppearsAfterClickTheGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.ClickOnFemaleGender();
        radioButtonPage.ClickOnThirdAgeGroup();
        radioButtonPage.ClickOnGetValuesButton();
        WebElement Gender = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span"));
        String Gender1 = Gender.getText();
        WebElement Age = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span"));
        String Age1 = Age.getText();
        Assert.assertTrue(Gender1.contains("Female"));
        Assert.assertTrue((Age1.contains("15 - 50")));
    }

    @Test
    public void VerifyIfGender3AndAge1AppearsAfterClickTheGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.ClickOnOtherGender();
        radioButtonPage.ClickOnFirstAgeGroup();
        radioButtonPage.ClickOnGetValuesButton();
        WebElement Gender = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span"));
        String Gender1 = Gender.getText();
        WebElement Age = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span"));
        String Age1 = Age.getText();
        Assert.assertTrue(Gender1.contains("Other"));
        Assert.assertTrue((Age1.contains("0 - 5")));
    }

    @Test
    public void VerifyIfGender3AndAge2AppearsAfterClickTheGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.ClickOnOtherGender();
        radioButtonPage.ClickOnSecondAgeGroup();
        radioButtonPage.ClickOnGetValuesButton();
        WebElement Gender = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span"));
        String Gender1 = Gender.getText();
        WebElement Age = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span"));
        String Age1 = Age.getText();
        Assert.assertTrue(Gender1.contains("Other"));
        Assert.assertTrue((Age1.contains("5 - 15")));
    }

    @Test
    public void VerifyIfGender3AndAge3AppearsAfterClickTheGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.ClickOnOtherGender();
        radioButtonPage.ClickOnThirdAgeGroup();
        radioButtonPage.ClickOnGetValuesButton();
        WebElement Gender = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span"));
        String Gender1 = Gender.getText();
        WebElement Age = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span"));
        String Age1 = Age.getText();
        Assert.assertTrue(Gender1.contains("Other"));
        Assert.assertTrue((Age1.contains("15 - 50")));
    }

    @Test
    public void SelectOnlyGender1ThenClickTheGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.ClickOnMaleGender();
        radioButtonPage.ClickOnGetValuesButton();
        WebElement Gender = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span"));
        String Gender1 = Gender.getText();
        Assert.assertTrue(Gender1.contains("Male"));
    }

    @Test
    public void SelectOnlyGender2ThenClickTheGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.ClickOnFemaleGender();
        radioButtonPage.ClickOnGetValuesButton();
        WebElement Gender = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span"));
        String Gender1 = Gender.getText();
        Assert.assertTrue(Gender1.contains("Female"));
    }

    @Test
    public void SelectOnlyGender3ThenClickTheGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.ClickOnOtherGender();
        radioButtonPage.ClickOnGetValuesButton();
        WebElement Gender = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span"));
        String Gender1 = Gender.getText();
        Assert.assertTrue(Gender1.contains("Other"));
    }

    @Test
    public void SelectOnlyAge1ThenClickTheGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.ClickOnFirstAgeGroup();
        radioButtonPage.ClickOnGetValuesButton();
        WebElement Age = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span"));
        String Age1 = Age.getText();
        Assert.assertTrue((Age1.contains("0 - 5")));
    }

    @Test
    public void SelectOnlyAge2ThenClickTheGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.ClickOnSecondAgeGroup();
        radioButtonPage.ClickOnGetValuesButton();
        WebElement Age = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span"));
        String Age1 = Age.getText();
        Assert.assertTrue((Age1.contains("5 - 15")));
    }

    @Test
    public void SelectOnlyAge3ThenClickTheGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.ClickOnThirdAgeGroup();
        radioButtonPage.ClickOnGetValuesButton();
        WebElement Age = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span"));
        String Age1 = Age.getText();
        Assert.assertTrue((Age1.contains("15 - 50")));
    }
}
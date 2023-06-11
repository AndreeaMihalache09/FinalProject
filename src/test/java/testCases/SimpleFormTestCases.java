package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.SimpleFormPage;

public class SimpleFormTestCases extends BasePage {
    private SimpleFormPage simpleFormPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        simpleFormPage = new SimpleFormPage(driver);
    }

    @Test
    public void writeOneWordInSingleInputFieldThenClickOnTheGetCheckedValueButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTextField("word");
        simpleFormPage.clickOnGetCheckedValue();
        Assert.assertTrue(driver.getPageSource().contains("word"));
    }

    @Test
    public void writeASentanceInSingleInputFieldThenClickOnTheGetCheckedValueButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTextField("I am hungry!");
        simpleFormPage.clickOnGetCheckedValue();
        Assert.assertTrue(driver.getPageSource().contains("I am hungry!"));
    }

    @Test
    public void writeANumberInSingleInputFieldThenClickOnTheGetCheckedValueButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTextField("1728485");
        simpleFormPage.clickOnGetCheckedValue();
        Assert.assertTrue(driver.getPageSource().contains("1728485"));
    }

    @Test
    public void writeSpecialCharactersInSingleInputFieldThenClickOnTheGetCheckedValueButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTextField("+*/=?/)-?!@");
        simpleFormPage.clickOnGetCheckedValue();
        Assert.assertTrue(driver.getPageSource().contains("+*/=?/)-?!@"));
    }

    @Test
    public void writeRomanianDiacriticsInSingleInputFieldThenClickOnTheGetCheckedValueButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTextField("țșășț");
        simpleFormPage.clickOnGetCheckedValue();
        Assert.assertTrue(driver.getPageSource().contains("țșășț"));
    }

    @Test
    public void writeTwoNumbersForValueAAndValueB() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTwoFieldsEnterA("1");
        simpleFormPage.selectTwoFieldsEnterB("3");
        simpleFormPage.clickGetValuesButton();
        WebElement result = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div/div[2]/div/p"));
        String resultDisplayed = result.getText();
        Assert.assertTrue(resultDisplayed.contains("4"));

    }

    @Test
    public void writeANumberForValueAAndTextForValueB() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTwoFieldsEnterA("1");
        simpleFormPage.selectTwoFieldsEnterB("dog");
        simpleFormPage.clickGetValuesButton();
        Assert.assertTrue(driver.getPageSource().contains("Entered value is not a number"));

    }

    @Test
    public void writeTextsForValueAAndForValueB() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTwoFieldsEnterA("cat");
        simpleFormPage.selectTwoFieldsEnterB("dog");
        simpleFormPage.clickGetValuesButton();
        Assert.assertTrue(driver.getPageSource().contains("Entered value is not a number"));
    }

    @Test
    public void writeSpecialCharactersForValueAAndForValueB() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTwoFieldsEnterA("+*/)-");
        simpleFormPage.selectTwoFieldsEnterB("*/./*");
        simpleFormPage.clickGetValuesButton();
        Assert.assertTrue(driver.getPageSource().contains("Entered value is not a number"));

    }
    @Test
    public void CheckIfTheSumOfTwoNumbersIsCorrect() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTwoFieldsEnterA("45");
        simpleFormPage.selectTwoFieldsEnterB("14");
        simpleFormPage.clickGetValuesButton();
        WebElement Sum = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div/div[2]/div/p"));
        String SumResult = Sum.getText();
        Assert.assertTrue(SumResult.contains("59"));

    }

}
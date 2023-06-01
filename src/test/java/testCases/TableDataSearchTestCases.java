package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages. TableDataSearchPage;

public class  TableDataSearchTestCases extends BasePage {
    private TableDataSearchPage tableDataSearchPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        tableDataSearchPage = new TableDataSearchPage(driver);
    }

    @Test
    public void CheckInProgressStatusFilter() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.WriteFilterInput("in progress");
        WebElement Row1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[1]"));
        String Text1 = Row1.getText();
        Assert.assertTrue(Text1.contains("Wireframes"));
        WebElement Row4 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[4]"));
        String Text4 = Row4.getText();
        Assert.assertTrue(Text4.contains("Bootstrap 3"));
        WebElement Row7 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[7]"));
        String Text7 = Row7.getText();
        Assert.assertTrue(Text7.contains("Bug fixing"));
    }

    @Test
    public void CheckCompletedStatusFilter() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.WriteFilterInput("completed");
        WebElement Row2 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[2]"));
        String Text2 = Row2.getText();
        Assert.assertTrue(Text2.contains("Landing Page"));

    }

    @Test
    public void CheckDeployedStatusFilter() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.WriteFilterInput("deployed");
        WebElement Row5 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[5]"));
        String Text5 = Row5.getText();
        Assert.assertTrue(Text5.contains("jQuery library"));
    }

    @Test
    public void CheckFilterByAssigneeJohn() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.WriteFilterInput("John");
        WebElement DisplayedRow1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[1]"));
        String Text1 = DisplayedRow1.getText();
        WebElement DisplayedRow4 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[4]"));
        String Text4 = DisplayedRow4.getText();
        Assert.assertTrue(Text1.contains("John Smith"));
        Assert.assertTrue(Text4.contains("Emily John"));
    }

    @Test
    public void CheckFilterByAssigneeJohnSmith() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.WriteFilterInput("John Smith");
        WebElement DisplayedRow1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[1]"));
        String Text1 = DisplayedRow1.getText();
        Assert.assertTrue(Text1.contains("John Smith"));

    }

    @Test
    public void CheckFilterByAssigneeEmilyJohn() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.WriteFilterInput("Emily John");
        WebElement DisplayedRow4 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[4]"));
        String Text4 = DisplayedRow4.getText();
        Assert.assertTrue(Text4.contains("Emily John"));
    }

    @Test
    public void CheckFilterByAssigneeTrout() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.WriteFilterInput("Trout");
        WebElement DisplayedRow2 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[2]"));
        String Text2 = DisplayedRow2.getText();
        WebElement DisplayedRow7 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[7]"));
        String Text7 = DisplayedRow7.getText();
        Assert.assertTrue(Text2.contains("Mike Trout"));
        Assert.assertTrue(Text7.contains("Kilgore Trout"));
    }

    @Test
    public void CheckFilterByAssigneeMikeTrout() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.WriteFilterInput("Mike Trout");
        WebElement DisplayedRow2 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[2]"));
        String Text2 = DisplayedRow2.getText();
        Assert.assertTrue(Text2.contains("Mike Trout"));

    }

    @Test
    public void CheckFilterByAssigneeKilgoreTrout() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.WriteFilterInput("Kilgore Trout");
        WebElement DisplayedRow7 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[7]"));
        String Text7 = DisplayedRow7.getText();
        Assert.assertTrue(Text7.contains("Kilgore Trout"));
    }

    @Test
    public void CheckFilterByTaskWireframes() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.WriteFilterInput("Wireframes");
        WebElement DisplayedRow1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[1]"));
        String Text1 = DisplayedRow1.getText();
        Assert.assertTrue(Text1.contains("Wireframes"));
    }

    @Test
    public void WriteANumberGraterThanTheNumberOfRowsInTheTableInTheFilterField() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.WriteFilterInput("458");
        WebElement RowsDisplayed = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[1]"));
        Assert.assertFalse(RowsDisplayed.isDisplayed());
    }

    @Test
    public void Write0InTheTableInTheFilterField() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.WriteFilterInput("0");
        WebElement RowsDisplayed = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[1]"));
        Assert.assertFalse(RowsDisplayed.isDisplayed());
    }

    @Test
    public void WriteSpecialCharactersInTheFilterField() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.WriteFilterInput("/*-?");
        WebElement RowsDisplayed = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[1]"));
        Assert.assertFalse(RowsDisplayed.isDisplayed());
    }

    @Test
    public void WriteNothingInFilterField() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        WebElement Row1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[1]"));
        WebElement Row2 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[1]"));
        WebElement Row3 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[1]"));
        WebElement Row4 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[1]"));
        WebElement Row5 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[1]"));
        WebElement Row6 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[1]"));
        WebElement Row7 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[1]"));
        Assert.assertTrue(Row1.isDisplayed());
        Assert.assertTrue(Row2.isDisplayed());
        Assert.assertTrue(Row3.isDisplayed());
        Assert.assertTrue(Row4.isDisplayed());
        Assert.assertTrue(Row5.isDisplayed());
        Assert.assertTrue(Row6.isDisplayed());
        Assert.assertTrue(Row7.isDisplayed());
    }

    //Listed Users
    @Test
    public void CheckIfTheNumberInputFieldIsDisabled() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        WebElement NumberInputFieldUnable = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr"));
        boolean NumberInputFieldDisabled = !NumberInputFieldUnable.isEnabled();
        Assert.assertFalse(NumberInputFieldDisabled, "The Number Input Field should be disabled");
    }

    @Test
    public void CheckIfTheUsernameInputFieldIsDisabled() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        WebElement UsernameInputUnableField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[2]"));
        boolean UsernameInputFieldDisabled = !UsernameInputUnableField.isEnabled();
        Assert.assertFalse(UsernameInputFieldDisabled, "The susername input field should be disabled");
    }

    @Test
    public void CheckIfTheFirstNameInputFieldIsDisabled() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        WebElement FirstNameInputFieldUnable = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[3]"));
        boolean FirstNameInputFieldDisabled = !FirstNameInputFieldUnable.isEnabled();
        Assert.assertFalse(FirstNameInputFieldDisabled, "The First Name Input Field should be disabled");
    }

    @Test
    public void CheckIfTheLastNameInputFieldIsDisabled() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        WebElement ForthUnableField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[3]"));
        boolean ForthFieldDisabled = !ForthUnableField.isEnabled();
        Assert.assertFalse(ForthFieldDisabled, "The forth field should be disabled");

    }

    @Test
    public void CheckIfTheNumberInputFieldIsEnabledAfterClickFilterButton() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.ClickOnFilterButton();
        WebElement NumberInputField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[1]"));

        Assert.assertTrue(NumberInputField.isEnabled());
    }

    @Test
    public void CheckIfTheUsernameInputFieldIsEnabledAfterClickFilterButton() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.ClickOnFilterButton();
        WebElement UsernameInputField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[1]"));
        Assert.assertTrue(UsernameInputField.isEnabled());
    }

    @Test
    public void CheckIfTheFirstNameInputFieldIsEnabledAfterClickFilterButton() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.ClickOnFilterButton();
        WebElement FirstNameInputField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[3]"));
        Assert.assertTrue(FirstNameInputField.isEnabled());
    }

    @Test
    public void CheckIfTheLastNameInputFieldIsEnabledAfterClickFilterButton() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.ClickOnFilterButton();
        WebElement FourthField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[4]"));
        Assert.assertTrue(FourthField.isEnabled());
    }

    @Test
    public void Write0InTheNumberInputField() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.ClickOnFilterButton();
        tableDataSearchPage.WriteInTheNumberInputField("0");
        WebElement MessageDisplayed = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td"));
        String Message = MessageDisplayed.getText();
        Assert.assertTrue(Message.contains("No result found"));
    }

    @Test
    public void WriteANumberGraterThanTheNumberOfRowsInTheTableInTheNumberInputField() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.ClickOnFilterButton();
        tableDataSearchPage.WriteInTheNumberInputField("74");
        WebElement MessageDisplayed = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td"));
        String Message = MessageDisplayed.getText();
        Assert.assertTrue(Message.contains("No result found"));
    }

    @Test
    public void WriteLettersInTheNumberInputField() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.ClickOnFilterButton();
        tableDataSearchPage.WriteInTheNumberInputField("xcv");
        WebElement MessageDisplayed = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td"));
        String Message = MessageDisplayed.getText();
        Assert.assertTrue(Message.contains("No result found"));
    }

    @Test
    public void WriteSpecialCharactersInTheNumberInputField() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.ClickOnFilterButton();
        tableDataSearchPage.WriteInTheNumberInputField("/*/?");
        WebElement MessageDisplayed = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td"));
        String Message = MessageDisplayed.getText();
        Assert.assertTrue(Message.contains("No result found"));
    }

    @Test
    public void WriteANumberInTheUsernameInputField() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.ClickOnFilterButton();
        tableDataSearchPage.WriteInUsernameInputField("51");
        WebElement MessageDisplayed = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td"));
        String Message = MessageDisplayed.getText();
        Assert.assertTrue(Message.contains("No result found"));
    }

    @Test
    public void WriteASpecialCharactersInTheUsernameInputField() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.ClickOnFilterButton();
        tableDataSearchPage.WriteInUsernameInputField("/*-?");
        WebElement MessageDisplayed = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td"));
        String Message = MessageDisplayed.getText();
        Assert.assertTrue(Message.contains("No result found"));

    }

    @Test
    public void WriteALetterInTheUsernameInputField() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.ClickOnFilterButton();
        tableDataSearchPage.WriteInUsernameInputField("L");
        WebElement RowsDisplayed = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div/div[2]/table/tbody"));
        String Rows = RowsDisplayed.getText();
        Assert.assertTrue(Rows.contains("Landing Page"));
        Assert.assertTrue(Rows.contains("jQuery library"));

    }

    @Test
    public void WriteAnUsernameWhichIsNotInTheTableInTheUsernameInputField() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.ClickOnFilterButton();
        tableDataSearchPage.WriteInUsernameInputField("Test123");
        WebElement MessageDisplayed = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td"));
        String Message = MessageDisplayed.getText();
        Assert.assertTrue(Message.contains("No result found"));
    }

    @Test
    public void CheckIfAnUserWhichExistsInTheTableAppearsWhenItIsWrittenInTheUsernameInputField() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.ClickOnFilterButton();
        tableDataSearchPage.WriteInUsernameInputField("Wireframes");
        WebElement MessageDisplayed = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]"));
        String Message = MessageDisplayed.getText();
        Assert.assertTrue(Message.contains("Wireframes"));

    }

    @Test
    public void WriteANumberInTheFirstNameInputField() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.ClickOnFilterButton();
        tableDataSearchPage.WriteInTheFirstNameInputField("1");
        WebElement MessageDisplayed = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td"));
        String Message = MessageDisplayed.getText();
        Assert.assertTrue(Message.contains("No result found"));
    }

    @Test
    public void WriteASpecialCharactersInTheFirstNameInputField() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.ClickOnFilterButton();
        tableDataSearchPage.WriteInTheFirstNameInputField("/*-?");
        WebElement MessageDisplayed = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td"));
        String Message = MessageDisplayed.getText();
        Assert.assertTrue(Message.contains("No result found"));

    }

    @Test
    public void WriteALetterInTheFirstNameInputField() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.ClickOnFilterButton();
        tableDataSearchPage.WriteInTheFirstNameInputField("K");
        WebElement RowsDisplayed = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div/div[2]/table/tbody"));
        String Rows = RowsDisplayed.getText();
        Assert.assertTrue(Rows.contains("Mike Trout"));
        Assert.assertTrue(Rows.contains("Kilgore Trout"));
    }

    @Test
    public void WriteAFirstNameWhichExistsInTheTableInputField() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
        tableDataSearchPage.ClickOnFilterButton();
        tableDataSearchPage.WriteInTheFirstNameInputField("Jane");
        WebElement RowsDisplayed = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div/div[2]/table/tbody"));
        String Rows = RowsDisplayed.getText();
        Assert.assertTrue(Rows.contains("Jane"));

    }
}
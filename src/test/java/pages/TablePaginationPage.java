package pages;
import com.google.common.collect.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TablePaginationPage extends BasePage {
    public TablePaginationPage(WebDriver driver) {
        super(driver);
    }
    By DropdownListBox = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/select");
    public void ClickOnDropdownListBox (){driver.findElement(DropdownListBox);}

    public void SelectAnOptionInDropdownList(String arg1) {driver.findElement(DropdownListBox).sendKeys(arg1);}

    By Page1 = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/nav/ul/li[2]/span");
    public void ClickPage1(){driver.findElement(Page1).click();}
    By Page2 = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/nav/ul/li[3]/span");
    public void ClickPage2(){driver.findElement(Page2).click();}
    By Page3 = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/nav/ul/li[4]/span");
    public void ClickPage3(){driver.findElement(Page3).click();}
    By Page4 = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/nav/ul/li[5]/span");
    public void ClickPage4(){driver.findElement(Page4).click();}
    By Page5 = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/nav/ul/li[6]/span");
    public void ClickPage5(){driver.findElement(Page5).click();}
    By Page6 = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/nav/ul/li[7]/span");
    public void ClickPage6(){driver.findElement(Page6).click();}


}


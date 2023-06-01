package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TableFilterPage extends BasePage {
    public  TableFilterPage(WebDriver driver) {
        super(driver);
    }
    By GreenButton = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/div[2]/div[1]/div/button[1]");
    public void ClickOnGreenButton(){driver.findElement(GreenButton).click();}
    By OrangeButton = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/div[2]/div[1]/div/button[2]");
    public void ClickOnOrangeButton(){driver.findElement(OrangeButton).click();}
    By RedButton = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/div[2]/div[1]/div/button[3]");
    public void ClickOnRedButton(){driver.findElement(RedButton).click();}
    By AllButton = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/div[2]/div[1]/div/button[4]");
    public void ClickOnAllButton(){driver.findElement(AllButton).click();}


}

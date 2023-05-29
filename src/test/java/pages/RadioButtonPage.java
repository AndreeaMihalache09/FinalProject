package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage extends BasePage {
    public RadioButtonPage(WebDriver driver){
        super(driver);
    }
    By MaleValue = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/label[1]/input");
    public void ClickMaleValue(){ driver.findElement(MaleValue).click();}
     By FemaleValue = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/label[2]/input");
     public void ClickFemaleValue(){driver.findElement(FemaleValue).click();}
    By GetCheckedValueButton = By.id("buttoncheck");
     public void ClickOnGetCheckedValueButton(){driver.findElement(GetCheckedValueButton).click();}

    By MaleGender = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[1]/div[1]/label[1]/input");
     public void ClickOnMaleGender(){driver.findElement(MaleGender).click();}
    By FemaleGender = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[1]/div[1]/label[2]/input");
     public void ClickOnFemaleGender(){driver.findElement(FemaleGender).click();}
    By OtherGender = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[1]/div[1]/label[3]/input");
     public void  ClickOnOtherGender(){driver.findElement(OtherGender).click();}
    By FirstAgeGroup = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/label[1]/input");
     public void ClickOnFirstAgeGroup (){driver.findElement(FirstAgeGroup).click();}
    By SecondAgeGroup = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/label[2]/input");
     public void ClickOnSecondAgeGroup(){driver.findElement(SecondAgeGroup).click();}
     By ThirdAgeValue = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/label[3]/input");
     public void ClickOnThirdAgeGroup (){driver.findElement(ThirdAgeValue).click();}

    By GetValuesButton = By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[1]/button");
     public void ClickOnGetValuesButton(){driver.findElement(GetValuesButton).click();}

}

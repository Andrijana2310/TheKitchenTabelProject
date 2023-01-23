package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    public WebDriver driver;

    public HomePage(ChromeDriver driver){
        this.driver = driver;
    }

    public void openPage(){
        driver.get("https://kitchen.applitools.com/ingredients/links");
    }

    public void clickOnButton(){
         driver.findElement(By.id("button-the-kitchen-table")).click();
    }

    public void openTablePage(){
        driver.get("https://kitchen.applitools.com/ingredients/table");
    }

}

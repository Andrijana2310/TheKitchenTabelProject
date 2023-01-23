package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.ArrayList;
import java.util.List;

public class HomeTests {


    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ana\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        HomePage homePage = new HomePage(driver);
        homePage.openPage();
        homePage.clickOnButton();

        driver.get("https://kitchen.applitools.com/ingredients/links");
        driver.findElement(By.id("button-the-kitchen-table")).click();
        List<String> tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        driver.close();
        driver.quit();
    }
}

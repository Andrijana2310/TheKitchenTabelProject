package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.TablePage;

import java.util.ArrayList;
import java.util.List;

public class TableTests {


    @Test
    public void tableTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ana\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        HomePage homePage = new HomePage(driver);
        homePage.openPage();
        homePage.clickOnButton();
       // homePage.openTablePage();

        List<String> tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        TablePage tablePage = new TablePage(driver);
        List<List<String>> tableData = tablePage.getTableData();
        for(int i = 0; i < tableData.size(); i++) {
            List<String> tableRow = tableData.get(i);
            int row = i + 1;
            for(int j = 0; j < tableRow.size(); j++) {
                System.out.println("Row " + row + " : " + tableRow.get(j));
            }
        }

        tablePage.close();





    }
}

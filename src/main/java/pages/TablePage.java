package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class TablePage {

    public WebDriver driver;

    public TablePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
      driver.get("https://kitchen.applitools.com/ingredients/table");
    }

    public List<List<String>> getTableData() {
        List<List<String>> tableData = new ArrayList<>();

        WebElement tableRoot = driver.findElement(By.id("fruits-vegetables"));

        WebElement tBody = tableRoot.findElement(By.xpath(".//tbody"));

        List<WebElement> tRows = tBody.findElements(By.xpath(".//tr"));

        for (int i = 0; i < tRows.size(); i++) {
            List<WebElement> tDataCells = tRows.get(i).findElements(By.xpath(".//td"));
            List<String> tRow = new ArrayList<>();
            for (int j = 0; j < tDataCells.size(); j++) {
                tRow.add(tDataCells.get(j).getText());
            }
            tableData.add(tRow);
        }

        return tableData;
    }

    public void close() {
        driver.close();
        driver.quit();
    }
}
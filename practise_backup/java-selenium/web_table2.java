package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class web_table2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "D:/IDLE/Practise/Selenium-maven/src/main/Driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");
        List<WebElement> Table2_body_rows = driver.findElements(By.xpath("//table[@id='table2']/tbody/tr"));
        System.out.println(Table2_body_rows.size());
        for(WebElement row : Table2_body_rows)
        {
            List<WebElement> row_cells = row.findElements(By.tagName("td"));
            String email = row_cells.get(2)
                    .getText();
            if(email.contains("hotmail"))
            {
                row_cells.get(5).findElement(By.linkText("edit")).click();
                break;
            }

        }

    }
}

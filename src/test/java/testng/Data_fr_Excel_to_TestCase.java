package testng;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class Data_fr_Excel_to_TestCase{
    @DataProvider(name = "Excel_data")
    public String[][] Data_from_Excel() throws IOException
    {
        String [][] Email_Pass = new String [3][2];
        String Excel_location = "D:/IDLE/Practise/Selenium-maven/Exel_data/demoOne.xlsx";
        XSSFWorkbook Excel = new XSSFWorkbook(Excel_location);
        XSSFSheet Sheet1 = Excel.getSheetAt(0);
        int Total_rows = Sheet1.getPhysicalNumberOfRows();
        int Total_column = Sheet1.getRow(0).getLastCellNum();

        for (int i = 1; i < Total_rows; i++) {
            XSSFRow row = Sheet1.getRow(i);
            for (int j = 0; j < Total_column; j++) {
                XSSFCell cell = row.getCell(j);
                String Cell_value = cell.getStringCellValue();
                 Email_Pass [i-1][j] = Cell_value;
            }
        }

//            XSSFCell cell_data1 = row.getCell(0);
//            XSSFCell cell_data2 = row.getCell(1);
//            String Email = cell_data1.getStringCellValue();
//            String Password = cell_data2.getStringCellValue();
//            System.out.println("Email: " + Email + " Password: " + Password);

        return Email_Pass;

    }
    @Test(dataProvider = "Excel_data")
    public void Excel_test(String Email , String Password)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Email);

    }
}



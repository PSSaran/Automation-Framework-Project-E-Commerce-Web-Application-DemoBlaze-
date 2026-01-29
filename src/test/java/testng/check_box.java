package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class check_box {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" ,
                "D:/IDLE/Practise/Selenium-maven/src/main/Driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkbox = driver.findElements(By.tagName("input"));
        for(WebElement BL : checkbox)
        {
            if(!BL.isSelected())
            {
                BL.click();

            }
        }
        System.out.println(checkbox.size());

    }

}

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class cricket_interview_question {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" ,
                "D:/IDLE/Practise/Selenium-maven/src/main/Driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/search?q=cricket&oq=cricke&gs_lcrp=EgZjaHJvbWUqCggAEAAYsQMYgAQyCggAEAAYsQMYgAQyCggBEAAYsQMYgAQyBggCEEUYOTIKCAMQABixAxiABDIKCAQQABixAxiABDINCAUQABiDARixAxiABDIKCAYQABixAxiABDINCAcQLhjUAhixAxiABDINCAgQLhjUAhixAxiABDIKCAkQABixAxiABNIBCTM1MDVqMGoxNagCCLACAfEF1g77IEmmkuLxBdYO-yBJppLi&sourceid=chrome&ie=UTF-8");
        driver.findElement(By.tagName("textarea")).sendKeys("cricket", Keys.ENTER);

        List<WebElement> elements = driver.findElements(By.xpath("//*[contains(text(),'cricket') or contains(text(),'Cricket')]"));
        System.out.println(elements.size());
//        String text = elements.get(0).getText();
//        System.out.println(text);

//        driver.quit();
    }
}

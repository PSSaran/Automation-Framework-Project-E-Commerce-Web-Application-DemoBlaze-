import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.Document;

public class demos {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" ,
                "D:/IDLE/Practise/Selenium-maven/src/main/Driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
//        driver.findElement(By.xpath("//textarea[@title='Search']")) . sendKeys("Automate");
        driver.findElement(By.linkText("Sign in")).click();
//        driver.findElement(By.name("identifier")). sendKeys("saranselvaraj02164@gmail.com");
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("saranselvaraj02164@gmail.com");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
    }
}

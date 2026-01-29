package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.xml.XmlSuite;

public class Multiple_login {
    RemoteWebDriver driver;
    @DataProvider
    public Object[][] login()
    {
        Object[][] obj = new Object[3][2];
        obj[0][0] = "saranselvaraj001@gmail.com";
        obj[0][1] = "admin";
        obj[1][0] = "saranpsselvaraj@gmail.com";
        obj[1][1] = "admins";
        obj[2][0] = "saranselvaraj02164@gmail.com";
        obj[2][1] = "adminsss";

        return obj;
    }
    @Test(dataProvider="login" )
    public void Login_test(String email, String password)
    {

        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
//        driver.findElement(By.linkText("Try again")).click();
        driver.findElement(By.xpath("//span[text()='Next']")).click();
//        driver.findElement(By.xpath("//span[text()='Try again']")).click();

    }

}

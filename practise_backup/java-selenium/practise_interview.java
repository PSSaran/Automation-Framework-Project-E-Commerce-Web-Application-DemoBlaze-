package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class practise_interview {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");


        // getting location of the webelement
        WebElement el = driver.findElement(By.xpath("//html/body/div[2]/div/ul/li[1]/a"));
        Point pp =  el.getLocation();
        int a = pp.getX();
        int b = pp.getY();
        System.out.println("X is " + a + " Y is " + b);

        //screenshot
        File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("./oneimg.png");
        FileHandler.copy(ss,dest);

        //alert
        driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[29]/a")).click();
        driver.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/button")).click();
        driver.switchTo().alert().accept();



        //implicit_waits
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //frames switching , also can able o switch using frame name , frameid
        driver.switchTo().frame(0);
        driver.switchTo().parentFrame(); // moves one level up
        driver.switchTo().defaultContent(); // moves out from all the frames

        //drag and drop
        driver.findElement(By.xpath("//*[@id='content']/ul/li[10]/a")).click();
        WebElement source =  driver.findElement(By.xpath("//*[@id='column-b']"));
        WebElement destna =  driver.findElement(By.xpath("//*[@id='column-a']"));
        Actions d = new Actions(driver);
        d.dragAndDrop(source,destna).perform();
        Thread.sleep(3000);
        driver.quit();

        //right click
        WebElement els = driver.findElement(By.xpath("//*[@id='column-b']"));
        d.contextClick(els).perform();

        //select
        WebElement select = driver.findElement(By.xpath("//*[@id='column-b']"));
        Select s = new Select(select);
        s.selectByValue("1");//also select by visible text , index
        s.getFirstSelectedOption();
        s.isMultiple();
        WebElement allelect = s.getAllSelectedOptions();

        //window handling
        driver.findElement(By.xpath("//*[@id='content']/ul/li[33]/a")).click();
        driver.findElement(By.xpath("//*[@id='content']/div/a")).click();
        Set<String> windows = driver.getWindowHandles();
        ArrayList<String> WW = new ArrayList<>(windows);
        driver.switchTo().window(WW.get(1));
        driver.close();
        driver.switchTo().window(WW.get(0));
        driver.close();
//        Thread.sleep(3000);
        driver.quit();

        //explicit wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        WebElement we =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='content']/div/a")));
        we.sendKeys(Keys.ENTER);




    }
}

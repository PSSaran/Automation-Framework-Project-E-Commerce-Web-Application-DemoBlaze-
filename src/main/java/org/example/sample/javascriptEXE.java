package org.example.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class javascriptEXE {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoblaze.com/index.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a")).click();


//        driver.findElement(By.xpath("//div[@id='example-video']")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//div[@id='example-video']")).click();


        JavascriptExecutor  js = (JavascriptExecutor) driver;
        WebElement video = driver.findElement(By.tagName("video"));
//        js.executeScript("arguments[0].volume=0;", video);

//        //div[@class='vjs-poster']
        driver.findElement(By.xpath("//div[@id='example-video']")).click();
        js.executeScript("return arguments[0].play();" ,  video);
        Boolean Video_status = (Boolean) js.executeScript("return arguments[0].paused;", video);
        System.out.println("Video Status : " + Video_status);

    }



}

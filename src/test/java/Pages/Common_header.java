package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Common_header {
    public WebDriver driver;
    public JavascriptExecutor js;
    Boolean Video_status;
    WebElement video;
    WebDriverWait wait;
    //constructor
    public Common_header(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(30));
    }

    //Home
    public void Home()
    {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Home ']"))).click();
//        driver.findElement(By.xpath("//a[text()='Home ']")).click();

    }

    //Contact
    public void Contact(String Contact_email, String Contact_Name, String Message)
    {
        driver.findElement(By.xpath("//a[text()='Contact']")).click();
        driver.findElement(By.xpath("//input[@id='recipient-email']")).sendKeys(Contact_email);
        driver.findElement(By.xpath("//input[@id='recipient-name']")).sendKeys(Contact_Name);
        driver.findElement(By.xpath("//textarea[@id='message-text']")).sendKeys(Message);

    }

    // to click the close button inside contact
    public void Contact_close_button() {
        //close button
        driver.findElement(By.xpath("//*[@id='exampleModal']/div/div/div/button[@class='close']")).click();
    }

    //send message button inside contact
    public void Send_message() {
        driver.findElement(By.xpath("//button[text()='Send message']")).click();
    }

    //Handling alert after clicking the send msg button
    public void alert_handling()
    {
        driver.switchTo().alert().accept();
    }

    //CONTACT OVER


    //ABOUT US
    public void click_about_us() {
        driver.findElement(By.xpath("//a[text()='About us']")).click();
    }

    //play and pause the video

    public void PlayVideo() {

        video = driver.findElement(By.tagName("video"));
        boolean videoCheck = isPlayingVideo();
        if (videoCheck)
        {
            driver.findElement(By.xpath("//div[@id='example-video']")).click();
            js.executeScript("return arguments[0].play();" ,  video);
        }

    }


    public void PauseVideo() {
        boolean videoCheck = isPlayingVideo();
        if (! videoCheck)
        {
            driver.findElement(By.xpath("//div[@id='example-video']")).click();

        }
    }

    //check whether video is playing or not
    public boolean isPlayingVideo()
    {
        js = (JavascriptExecutor) driver;
        WebElement video = driver.findElement(By.tagName("video"));
        boolean Video_value =   (boolean) js.executeScript("return arguments[0].paused;", video);
        return Video_value;
    }

    //About-US close button
    public void AboutUs_closeButton()
    {
        driver.findElement(By.xpath("//*[@id = 'videoModal']/div/div/div/button/span")).click();
    }

    //to make video fullscreen
    public void VideoFullscreen()
    {
        js.executeScript("arguments[0].requestFullscreen();", video);
    }

    //to exit fullscreen
    public void ExitFullscreen()
    {
        js.executeScript("document.exitFullscreen();");
    }

    //ABOUT US OVER

    //Cart
    public void cart()
    {
        wait.until (ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Cart']"))).click();
    }//cart in next class (Cart_place order)



    //Login

    //Login Credentials
    public void LogIn(String email, String  password)
    {
        driver.findElement(By.xpath("//div[@id='navbarExample']/ul/li[5]/a")).click();
        driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys(password);
        driver.findElement(By.xpath("//div[@id='logInModal']/div/div/div[3]/button[2]"))
                .click();
    }

    //login closeButton
    public void close()
    {
        driver.findElement(By.xpath("//div[@id='logInModal']/div/div/div[3]/button[1]"))
                .click();
    }

    //Logout
    public void logOut()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='navbarExample']/ul/li[6]/a"))).click();
//        driver.findElement(By.xpath("//div[@id='navbarExample']/ul/li[6]/a")).click();
    }


    //Close buttons present inside headers
    public  ArrayList<WebElement> Close_buttons() {
        ArrayList<WebElement> All_close_buttons = new ArrayList<>(driver.findElements(By.xpath("//div[@class='modal-footer']/button[text()='Close']")));
        return All_close_buttons;
    }


}
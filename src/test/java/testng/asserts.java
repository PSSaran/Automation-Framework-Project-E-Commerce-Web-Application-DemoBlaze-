package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class asserts {
   @Test
    public static void Main() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        String actualTitle = driver.getTitle();;
        String expectedTitle = "Google";
        Assert.assertEquals(actualTitle, expectedTitle , "Title Is Not Equal");
    }
}

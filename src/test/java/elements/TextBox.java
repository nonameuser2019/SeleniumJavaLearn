package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TextBox {
    WebDriver driver = new ChromeDriver();



    @Test
    public void fillingTextBoxFormTest() throws InterruptedException{
        driver.manage().window().maximize();
        final String name = "Alex";
        driver.get("https://demoqa.com/text-box");
        WebElement fullName = driver.findElement(By.cssSelector("#userName"));
        fullName.clear();
        fullName.sendKeys(name);
        Thread.sleep(2000);
        driver.quit();

    }



}

package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BasePage;

public class Switching extends BasePage {
    private String url = "https://output.jsbin.com/usidix/1";

    @Test
    public void switchToAlert() throws InterruptedException{
        driver.get(url);
        WebElement goBtn = driver.findElement(By.cssSelector("input[onclick=\"showAlert()\"]"));
        goBtn.click();
        String allertText = driver.switchTo().alert().getText();
        Assert.assertEquals(allertText, "This is an alert box.");
        driver.switchTo().alert().accept();

    }



}

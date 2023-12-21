import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework18 extends BaseTest {

    @Test
    public static void playSong() {

        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);

        // log into Koel
        setCssTextBox("input[type='email']", "henry.carter@testpro.io");
        setCssTextBox("input[type='password']", "password");

        clickCssButton("button[type='submit']");

        // click play next song
        // causes the player control buttons to become visible, but there is
        // no response from the player otherwise. I even attempting the
        // following line twice.... Please advise. The video for the following
        // lecture is terrible.
        clickXpathButton("//*[@id='mainFooter']/div[1]/i[2]");

    }

    public static void setCssTextBox(String selector, String value) {
        WebElement field = driver.findElement(By.cssSelector(selector));
        field.clear();
        field.sendKeys(value);
    }
    public static void setXpathTextBox(String selector, String value) {
        WebElement field = driver.findElement(By.xpath(selector));
        field.clear();
        field.sendKeys(value);
    }

    public static void clickCssButton(String selector) {
        WebElement field = driver.findElement(By.cssSelector(selector));
        field.click();
    }
    public static void clickXpathButton(String selector) {
        WebElement field = driver.findElement(By.xpath(selector));
        field.click();
    }

    public static String getCssText(String selector) {
        WebElement field = driver.findElement(By.cssSelector(selector));
        return field.getText();
    }
}

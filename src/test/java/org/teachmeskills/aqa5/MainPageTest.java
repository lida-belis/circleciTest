package org.teachmeskills.aqa5;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTest {
    WebDriver webDriver;

    @Test
    public void openChromePage() {
        System.out.println("Selenium has been started!");
        DriverManagerType driverManagerType = DriverManagerType.CHROME;
        WebDriverManager.getInstance(driverManagerType).setup();

        webDriver = new ChromeDriver();
        webDriver.get("https://www.google.com");

        System.out.println(webDriver.getTitle());
        Assert.assertEquals(webDriver.getTitle(), "Google");
        webDriver.close();
    }

    @Test
    public void openFirefoxPage() {
        System.out.println("Selenium has been started!");
        DriverManagerType driverManagerType = DriverManagerType.FIREFOX;
        WebDriverManager.getInstance(driverManagerType).setup();

        webDriver = new FirefoxDriver();
        webDriver.get("https://www.google.com");

        System.out.println(webDriver.getTitle());
        Assert.assertEquals(webDriver.getTitle(), "Google");
        webDriver.close();
    }
}

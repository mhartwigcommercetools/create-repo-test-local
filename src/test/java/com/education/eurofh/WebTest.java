package com.education.eurofh;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static com.codeborne.selenide.Selenide.*;


public class WebTest {

    // @Test   Removed so that the Web-Test is not included automatically
    public void fillInForm() {

        open("file:///Users/michaelhartwig/Downloads/JavaTesten/codih06/src/main/resources/Eingabe.html");

        $(By.name("age")).val("32");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        $(By.name("submitAge")).click();
    }

}

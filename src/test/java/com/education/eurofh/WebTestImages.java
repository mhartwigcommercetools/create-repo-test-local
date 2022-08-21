package com.education.eurofh;

import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class WebTestImages {

    @Test
    public void fillInForm() {
        open("https://www.bundesgesundheitsministerium.de/");
        $(By.tagName("img")).should(Condition.exist);
    }

}

package com.attra.programs.testNG_Concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launchBrowser {

    public static  void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","D://Softwares//chromedriver_win32//chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.in/");
    }
}

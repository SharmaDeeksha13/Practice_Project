package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {

    public static void main(String[] args)
        {
            System.setProperty("webdriver.chrome.driver","D://Softwares//chromedriver_win32//chromedriver.exe");
            WebDriver driver= new ChromeDriver();
            driver.get("https://www.amazon.in/");
        }

    @Test
    public void execute(){
        System.setProperty("webdriver.chrome.driver","D://Softwares//chromedriver_win32//chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.in/");

    }
}

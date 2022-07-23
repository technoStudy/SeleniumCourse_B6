package Day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class _09_PageLoadTimeout {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        // if the page is not loaded in 5 seconds you will get an error

        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        driver.quit();

    }

}

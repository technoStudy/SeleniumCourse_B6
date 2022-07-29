package Day10;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Scrolling {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://techno.study/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down 3000 pixels
        js.executeScript("window.scrollBy(0,3000)");

        // Scroll up 2000 pixels
        js.executeScript("window.scrollBy(0,-2000)");

    }

}

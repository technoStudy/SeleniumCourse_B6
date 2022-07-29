package Day10;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_ScrollingAllTheWayDown {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://techno.study/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // This will scroll all the way down to bottom of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

    }

}

package Day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Navigating {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        // Navigate to website and wait until page is load!
        driver.get("https://www.google.com/");

        // Thread.sleep force selenium to wait!
        Thread.sleep(3000);

        driver.get("https://www.facebook.com/");

        // navigate().to() method is not waiting for page to load!
        // driver.navigate().to("https://www.google.com/");

        // navigate().back() will navigate previous page!
        driver.navigate().back();

        // navigate().forward method will navigate to forward page
        driver.navigate().forward();

        // refresh the page
        driver.navigate().refresh();


        driver.quit();

    }

}

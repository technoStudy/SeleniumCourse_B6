package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_ScrollingToElement {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://techno.study/");

        WebElement enrollNowButton = driver.findElement(By.xpath("//a[@href='/enroll#enroll']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // scroll to a specific element
        js.executeScript("arguments[0].scrollIntoView();", enrollNowButton);

    }

}

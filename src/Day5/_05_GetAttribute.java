package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_GetAttribute {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com/");

        WebElement header = driver.findElement(By.id("site-name"));
        String headerAttribute = header.getAttribute("class"); // you can get any attribute of a web element using getAttribute() method!

        System.out.println(headerAttribute);

        driver.quit();

    }

}

package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_isSelected {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        WebElement checkbox = driver.findElement(By.id("isAgeSelected"));

        boolean beforeClickOnCheckbox = checkbox.isSelected();

        Thread.sleep(3000);

        checkbox.click();

        Thread.sleep(3000);

        boolean afterClickOnCheckbox = checkbox.isSelected();

        System.out.println("Before click: " + beforeClickOnCheckbox);
        System.out.println("After click: " + afterClickOnCheckbox);

        driver.quit();

    }

}

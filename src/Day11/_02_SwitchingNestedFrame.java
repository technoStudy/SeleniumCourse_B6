package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_SwitchingNestedFrame {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame("frame1");

        driver.switchTo().frame("frame3");

        WebElement checkbox = driver.findElement(By.id("a"));
        checkbox.click();

        driver.switchTo().defaultContent(); // switch to main webpage

        WebElement mainElement = driver.findElement(By.xpath("//a[text()='UiPath']"));
        mainElement.click();

    }

}

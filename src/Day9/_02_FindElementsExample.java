package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _02_FindElementsExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://techno.study/");

        List<WebElement> aTagElements = driver.findElements(By.xpath("//a"));
        for (int i = 0; i < aTagElements.size(); i++) {
            System.out.println(aTagElements.get(i).getText());
        }

        driver.quit();

    }

}

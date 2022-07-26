package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_InvisibilityOfElement {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));
        startButton.click();

        WebElement loadingBar = driver.findElement(By.id("loading"));
        wait.until(ExpectedConditions.invisibilityOf(loadingBar));

        WebElement finishText = driver.findElement(By.id("finish"));

        driver.quit();

    }

}

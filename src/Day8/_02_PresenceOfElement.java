package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _02_PresenceOfElement {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));
        startButton.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#finish")));

        WebElement text = driver.findElement(By.cssSelector("#finish"));
        System.out.println(text.getText());

        driver.quit();

    }

}

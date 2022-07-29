package Day10.ActionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _05_ActionsClass_HoverOver {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.myntra.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement homeAndLiving = driver.findElement(By.xpath("//a[text()='Home & Living']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(homeAndLiving).perform();

        WebElement bathTowels = driver.findElement(By.xpath("//a[text()='Bath Towels']"));
        wait.until(ExpectedConditions.visibilityOf(bathTowels));
        bathTowels.click();

        driver.quit();

    }

}

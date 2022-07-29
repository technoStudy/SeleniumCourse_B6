package Day10.ActionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionsClass_DoubleClick {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/buttons");

        WebElement doubleClickMeButton = driver.findElement(By.id("doubleClickBtn"));

        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickMeButton).perform();

        WebElement doubleClickMessage = driver.findElement(By.id("doubleClickMessage"));
        System.out.println(doubleClickMessage.getText());

        driver.quit();

    }

}

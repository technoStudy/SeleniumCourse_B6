package Day10.ActionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionsClass_RightClick {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/buttons");

        WebElement rightClickMeButton = driver.findElement(By.id("rightClickBtn"));

        Actions actions = new Actions(driver);
        actions.contextClick(rightClickMeButton).perform();

        WebElement rightClickMessage = driver.findElement(By.id("rightClickMessage"));
        System.out.println(rightClickMessage.getText());

        driver.quit();

    }

}

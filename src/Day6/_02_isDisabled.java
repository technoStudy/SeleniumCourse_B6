package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_isDisabled {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        WebElement inputField = driver.findElement(By.cssSelector("#input-example>input"));
        WebElement enableButton = driver.findElement(By.cssSelector("#input-example>button"));

        boolean isInputEnabledBefore = inputField.isEnabled();

        enableButton.click();

        Thread.sleep(5000);

        boolean isInputEnabledAfter = inputField.isEnabled();

        System.out.println(isInputEnabledBefore);
        System.out.println(isInputEnabledAfter);

        driver.quit();

    }

}

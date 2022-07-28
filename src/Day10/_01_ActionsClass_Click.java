package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionsClass_Click {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/buttons");

        WebElement clickMeButton = driver.findElement(By.xpath("//button[text()='Click Me']"));

        Actions actions = new Actions(driver);
        actions.click(clickMeButton).perform();

        WebElement textAfterClick = driver.findElement(By.id("dynamicClickMessage"));
        System.out.println(textAfterClick.getText());

        driver.quit();

    }

}

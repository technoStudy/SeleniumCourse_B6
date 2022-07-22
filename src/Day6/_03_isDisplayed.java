package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_isDisplayed {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));

        WebElement invisibleText = driver.findElement(By.cssSelector("#finish>h4"));

        boolean isDisplayedBeforeCLick = invisibleText.isDisplayed();

        startButton.click();

        Thread.sleep(7000);

        boolean isDisplayedAfterClick = invisibleText.isDisplayed();

        System.out.println("Before Start: " + isDisplayedBeforeCLick);
        System.out.println("After Start: " + isDisplayedAfterClick);

        driver.quit();

    }

}

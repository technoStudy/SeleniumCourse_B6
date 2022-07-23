package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_JSAlert {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        WebElement JSAlertButton = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
        JSAlertButton.click();

        // To handle alerts we use driver.switchTo().alert() method
        String alertText = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();

        System.out.println(alertText);

        driver.quit();

    }

}

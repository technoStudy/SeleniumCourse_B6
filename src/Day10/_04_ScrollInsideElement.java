package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_ScrollInsideElement {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://ressio.github.io/lazy-load-xt/demo/horizontal.htm");

        WebElement divWrapper = driver.findElement(By.className("wrapper"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // with this we can scroll horizontally and inside an element
        js.executeScript("arguments[0].scrollBy(200,0)", divWrapper);

        driver.quit();

    }

}

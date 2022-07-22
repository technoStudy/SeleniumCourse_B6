package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _07_ClickAndSendKeysTASK {

    public static void main(String[] args) throws InterruptedException {

        // Test Data
        String num1 = "25";
        String num2 = "12";

        int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
        String expectedResult = Integer.toString(sum);

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        Thread.sleep(3000);

        WebElement closePopUpButton = driver.findElement(By.id("at-cv-lightbox-close"));
        closePopUpButton.click();

        Thread.sleep(3000);

        WebElement numberInput1 = driver.findElement(By.id("sum1"));
        WebElement numberInput2 = driver.findElement(By.id("sum2"));

        numberInput1.sendKeys(num1);
        numberInput2.sendKeys(num2);

        Thread.sleep(3000);

        WebElement getTotalButton = driver.findElement(By.cssSelector("button[onclick='return total()']"));
        getTotalButton.click();

        Thread.sleep(3000);

        WebElement resultMessage = driver.findElement(By.id("displayvalue"));
        String actualResult = resultMessage.getText();

        if (actualResult.equals(expectedResult))
            System.out.println("Success!");
        else
            throw new RuntimeException();

        driver.quit();

    }

}

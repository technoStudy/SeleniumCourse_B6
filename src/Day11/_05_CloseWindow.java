package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class _05_CloseWindow {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://techno.study/");

        // Get the main window handle (parent window handle) so we can switch back easily!
        String mainWindow = driver.getWindowHandle();
        System.out.println(mainWindow);

        WebElement getFreeConsultationButton = driver.findElement(By.xpath("//div[@class='t228__right_buttons_but']//a"));
        getFreeConsultationButton.click();

        // Get all window handles(id) and using for each loop switch to other window
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
        }

        WebElement nameInput = driver.findElement(By.xpath("//input[@name='Name']"));
        nameInput.sendKeys("Hello");

        // close() will close only the current window
        // quit() will quit the browser (all the windows)
        driver.close();

        driver.switchTo().window(mainWindow);

    }

}

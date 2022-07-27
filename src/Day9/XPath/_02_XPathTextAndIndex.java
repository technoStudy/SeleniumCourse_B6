package Day9.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_XPathTextAndIndex {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://techno.study/");

        // Locating element using their text!
        WebElement header = driver.findElement(By.xpath("//p[text()='Learn skills to launch a tech career in 6 months']"));
        String headerText = header.getText();

        // Locating element using contains (contains can work with text and attributes)
        WebElement header2 = driver.findElement(By.xpath("//p[contains(text(),'mentorship')]"));
        String header2Text = header2.getText();

        // Locating element by index
        // When your locator finds more than 1 element you can use index to select specific one
        WebElement enrollNowButton = driver.findElement(By.xpath("(//span[text()='Enroll now'])[2]"));

        // In XPath we can move from parent element to child using // (double slash)
        WebElement anotherHeader = driver.findElement(By.xpath("//div[@class='t181__title t-title t-title_md']//p"));
        String anotherHeaderText = anotherHeader.getText();

        // In XPath we can move from child element to parent using /..
        WebElement divElement = driver.findElement(By.xpath("//input[@name='Email']/.."));

        driver.quit();

    }

}

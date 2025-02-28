import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import java.util.Set;
import java.util.Iterator;

public class AutomateAutify {

    public static void main(String[] args) {
        // Set the path for the chromedriver (adjust the path as necessary)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize Chrome WebDriver
        ChromeDriver driver = new ChromeDriver();

        // Open the URL
        driver.get("https://autify.com/");

        try {
            // Step a: Click on "Start Free Trial" button (Use XPath to find the element)
            WebElement startTrialButton = driver.findElement(By.xpath("//a[@href='/start-free-trial']"));
            startTrialButton.click();

            // Step b: Verify that a new tab is opened and switch to the child window
            // Get the window handles to switch between the parent and child windows
            Set<String> windowHandles = driver.getWindowHandles();
            Iterator<String> iterator = windowHandles.iterator();
            String parentWindowHandle = iterator.next();
            String childWindowHandle = iterator.next();

            // Switch to the child window
            driver.switchTo().window(childWindowHandle);

            // Step c: Verify the title of the child window
            String childWindowTitle = driver.getTitle();
            System.out.println("Child Window Title: " + childWindowTitle);
            
            if(childWindowTitle.contains("Autify")) {
                System.out.println("Child window title verification passed.");
            } else {
                System.out.println("Child window title verification failed.");
            }

            // Step d: Close the child window
            driver.close();

            // Step e: Switch back to the parent window
            driver.switchTo().window(parentWindowHandle);
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the parent window
            driver.quit();
        }
    }
}

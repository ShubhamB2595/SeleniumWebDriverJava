import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WDManager {

    public static String WEB_URL = "https://www.ebay.com/";

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        try {
            driver.manage().window().maximize();
            driver.get(WEB_URL);
            Thread.sleep(4000);
            driver.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        
    }
}

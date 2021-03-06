import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SWebDriver {

    public static String WEB_URL = "https://www.ebay.com/";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "I:\\Installation Files\\chromedriver.exe");
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

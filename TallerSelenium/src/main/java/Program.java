import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program {
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();

        driver.get("https://www.jotajotavm.com/");
        driver.manage().window().maximize();
        
        System.out.print("title from google is\t " + driver.getTitle());

        driver.quit();
    }
}

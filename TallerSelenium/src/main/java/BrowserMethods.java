import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class BrowserMethods {
    public static String URL_TEST = "http://jotajotavm.com/";

    public static void main(String[] args) throws Exception {
        WebDriver driver = common.ClassConfiguration.getChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_TEST);
        Thread.sleep(3000);
        driver.navigate().to("https://www.google.com/");

        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();

        String currentWindowID = driver.getWindowHandle();
        Thread.sleep(3000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(3000);
        driver.switchTo().window(currentWindowID);
        Thread.sleep(3000);
        driver.switchTo().newWindow(WindowType.TAB);
        String newWindows = driver.getWindowHandle();
        driver.get("https://github.com/casivaagustin-zz/drupal-services/commits?author=casivaagustin-zz");
        Thread.sleep(3000);
        driver.switchTo().window(newWindows).close();
        System.out.println("current window id is\t" + currentWindowID);
        driver.quit();
    }
}

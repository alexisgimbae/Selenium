import org.openqa.selenium.WebDriver;

public class BrowserMethods {
    public static String URL_TEST = "http://jotajotavm.com/";

    public static void main(String[] args) throws Exception {
        WebDriver driver = common.ClassConfiguration.getChromeDriver();
        driver.get(URL_TEST);
        driver.navigate().to("https://www.google.com/");

        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();

        String currentWindowID = driver.getWindowHandle();
        System.out.println("current window id is\t" + currentWindowID);
        driver.quit();
    }
}

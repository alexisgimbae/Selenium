import org.openqa.selenium.WebDriver;

public class ProgramChrome {
    public static void main(String[] args) throws Exception {
        WebDriver driver = common.ClassConfiguration.getChromeDriver();
        driver.get("http://jotajotavm.com/");
        Thread.sleep(5000);
        driver.quit();
    }
}

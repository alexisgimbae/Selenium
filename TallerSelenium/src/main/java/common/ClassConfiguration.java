package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;


public class ClassConfiguration {

    public static String OS_NAME = System.getProperty("os.name");
    public static String DRIVER_DIR = System.getProperty("user.dir")
            + File.separator
            + "drivers"
            + File.separator;
    public static String CHROME_DRIVER_PATH = DRIVER_DIR + "chromedriver";

//    public static String GECKO_DRIVER_PATH = DRIVER_DIR + "geckodriver";

    public static String getOperatingSystem(String path) {
        boolean isLinux = OS_NAME.equals("Linux");
        if (isLinux) {
            return path;
        } else {
            return path + ".exe";
        }
    }

//    public static WebDriver getGeckoDriver() {
//        System.setProperty("webdriver.gecko.driver",
//                getOperatingSystem(GECKO_DRIVER_PATH));
//        return new FirefoxDriver();
//    }

    public static WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver",
                getOperatingSystem(CHROME_DRIVER_PATH));
        return new ChromeDriver();
    }

    public static void main(String[] args) {
        System.out.println(getOperatingSystem(CHROME_DRIVER_PATH));
    }

}

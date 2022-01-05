package service;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static model.Constants.*;

public class SeleniumConfig {

    public static ChromeDriver driver(){
        System.setProperty(WEB_CHROME_DRIVER, WEB_CHROME_DRIVER_LOCATION);
        final ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments(HEADLESS);
        return new ChromeDriver(chromeOptions);
    }
}

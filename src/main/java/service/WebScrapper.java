package service;

import model.LotteryInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static model.Constants.CURRENT_RESULT_DATE;
import static model.Constants.BALL_NUMBER;

public class WebScrapper {
    private String url;
    public final ChromeDriver driver;

    {
        driver = SeleniumConfig.driver();
    }

    public WebScrapper(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LotteryInfo scrape() throws Throwable {
        driver.get(url);
        final List<WebElement> eleNumbers = driver.findElementsByClassName(BALL_NUMBER);
        final WebElement eleDate = driver.findElementByClassName(CURRENT_RESULT_DATE);
        Date date = new Date(eleDate.getText());
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i<= 6; i++) {
            numbers.add(i,Integer.parseInt(eleNumbers.get(i).getText()));

        }
        LotteryInfo lotteryInfo = new LotteryInfo(numbers,date);
        return lotteryInfo;
    }
}

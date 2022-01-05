package service;

import model.Constants;

public class WebScrap {
    public static void main(String[] args) throws Throwable {
        WebScrapper webScrapper = new WebScrapper(Constants.LOTTERY_URL);
        csvWriter.write(webScrapper.scrape());
    }
}

package service;

import com.opencsv.bean.CsvToBeanBuilder;
import model.LotteryInfo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Date;
import java.util.List;

public class Utility {
    public static boolean checkForLastDate(Date lotteryInfoDate, String fileName) throws FileNotFoundException {
        List<LotteryInfo> lotteryInfos = new CsvToBeanBuilder(new FileReader(fileName))
                .withType(LotteryInfo.class)
                .build()
                .parse();
        LotteryInfo lotteryInfo = lotteryInfos.get(lotteryInfos.size()-1);
        return lotteryInfo.getDate().equals(lotteryInfoDate);
    }
}

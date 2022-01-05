package service;

import model.Constants;
import model.LotteryInfo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class csvWriter {
    private final static Path PATH = Paths.get(Constants.FILE_PATH, Constants.FILE_NAME);

    public static void  write (LotteryInfo lotteryInfo){
        try {

            if (!Utility.checkForLastDate(lotteryInfo.getDate(), PATH.toString())){
                String text = lotteryInfo.toString();
                Files.write(PATH, (text+ System.lineSeparator()).getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
            }
        } catch(IOException e)  {
            e.printStackTrace();
        }
    }
}

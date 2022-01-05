package model;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;

import java.util.Date;
import java.util.List;

public class LotteryInfo {
    private final Throwable IllegalArgumentException = new Throwable();

    @CsvBindByPosition(position = 0)
    private int firstNumber;

    @CsvBindByPosition(position = 1)
    private int secondNumber;

    @CsvBindByPosition(position = 2)
    private int thirdNumber;

    @CsvBindByPosition(position = 3)
    private int fourthNumber;

    @CsvBindByPosition(position = 4)
    private int fifthNumber;

    @CsvBindByPosition(position = 5)
    private int sixthNumber;

    @CsvBindByPosition(position = 6)
    private int seventhNumber;

    @CsvDate(value = "E MMM dd yyyy HH:mm:ss")
    @CsvBindByPosition(position = 7)
    private Date date;

    public  LotteryInfo(){

    }

    public LotteryInfo(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber, int sixthNumber, int seventhNumber, Date date) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
        this.fourthNumber = fourthNumber;
        this.fifthNumber = fifthNumber;
        this.sixthNumber = sixthNumber;
        this.seventhNumber = seventhNumber;
        this.date = date;
    }

    public LotteryInfo (List<Integer> numbers, Date date) throws Throwable {
        if (numbers.size() != 7) {
            throw IllegalArgumentException;
        } else{
            int cnt = 0;
            for (Integer number: numbers
                 ) {
                switch(cnt){
                    case 0:
                        this.firstNumber = number;
                        break;
                    case 1:
                        this.secondNumber = number;
                        break;
                    case 2:
                        this.thirdNumber = number;
                        break;
                    case 3:
                        this.fourthNumber = number;
                        break;
                    case 4:
                        this.fifthNumber = number;
                        break;
                    case 5:
                        this.sixthNumber = number;
                        break;
                    case 6:
                        this.seventhNumber = number;
                        break;
                }
                cnt++;
                this.date = date;
            }
        }
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getThirdNumber() {
        return thirdNumber;
    }

    public void setThirdNumber(int thirdNumber) {
        this.thirdNumber = thirdNumber;
    }

    public int getFourthNumber() {
        return fourthNumber;
    }

    public void setFourthNumber(int fourthNumber) {
        this.fourthNumber = fourthNumber;
    }

    public int getFifthNumber() {
        return fifthNumber;
    }

    public void setFifthNumber(int fifthNumber) {
        this.fifthNumber = fifthNumber;
    }

    public int getSixthNumber() {
        return sixthNumber;
    }

    public void setSixthNumber(int sixthNumber) {
        this.sixthNumber = sixthNumber;
    }

    public int getSeventhNumber() {
        return seventhNumber;
    }

    public void setSeventhNumber(int seventhNumber) {
        this.seventhNumber = seventhNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return         firstNumber +
                "," + secondNumber +
                "," + thirdNumber +
                "," + fourthNumber +
                "," + fifthNumber +
                "," + sixthNumber +
                "," + seventhNumber +
                "," + date.toString();
    }
}

package CourseMaterial;

import CodingChallenges.ForLoopChallenges;
import utils.Data;

import java.util.ArrayList;
import java.util.List;

import static utils.LoggerUtil.logInfo;

public class WhileLoop extends ForLoopChallenges {
    public static void main(String[] args){
    }

    public static List<Integer> getEvenNumberFrom(int number){
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        while(number < 100){
            if(isEven(number)){
                evenNumbers.add(number);
            }else {
                oddNumbers.add(number);
            }
            if(evenNumbers.size() >= 10){
                break;
            }
            number++;
        }
        logInfo("following odd numbers were found : " + Data.listGenerator(oddNumbers));
        logInfo("%d numbers were found", evenNumbers.size());
        return evenNumbers;
    }
    private static boolean isEven(int number){
        return number % 2 == 0;
    }
    public static int sumDigits(int number){
       if(number < 0){
           return -1;
       }
       int sum = 0;
       while(number > 9 ){
          sum +=(number % 10);
          number = number / 10;
       }
       sum += number;
       return number;
    }
}

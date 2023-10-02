package CodingChallenges;

import java.util.ArrayList;
import java.util.List;

public class ForLoopChallenges {
    public static void main(String[] args){
     int sum = sumOdd(10, 20);
     System.out.println(sum);
    }
    public static int sumOdd(int start, int end) {
        if( end < start || start <= 0 || end<= 0 ){
            return -1;
        }
        int sum = 0;
        for(int i = start; i <= end; i ++){
            if(isOdd(i)){
                sum+=i;
            }
        }
        return sum;
    }
    public static boolean isOdd(int number){
      if(number <=0){
          return false;
      }
      return number % 2 !=0;
    }


    public static void sum3and5(){
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i <= 1000; i+=5){
            if(i % 3 == 0 && i % 5 == 0){
                if (i != 0) {
                    numbers.add(i);
                    if (numbers.size() >= 5) {
                        break;
                    }
                }
            }
        }
        int totalSum = 0;
        for(int number : numbers){
            totalSum += number;
        }
        System.out.println("Numbers are : " + numbers);
        System.out.println("Sum is: " + totalSum);


    }
}

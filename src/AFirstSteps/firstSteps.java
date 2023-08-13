package AFirstSteps;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class firstSteps {


    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(2121244, 123, 501, 1001);
        String playerName = "Tim";
        displayHighScorePosition(playerName, calculateHighScorePosition(scores));
    }
    public static void displayHighScorePosition(String playerName, List<Integer> playerPosition){
        for(Integer position : playerPosition) {
            System.out.printf("%s managed to get into position %d on the high score list%n", playerName, position);
        }
    }
    public static List<Integer> calculateHighScorePosition(List<Integer> playerScores){
       List<Integer> finalScores = new ArrayList<>();
        for(Integer playerScore : playerScores) {
           if (playerScore > 1000) {
               playerScore = 1;
           } else if (playerScore < 1000 && playerScore > 500) {
               playerScore = 2;
           } else if (playerScore < 500 && playerScore > 100) {
               playerScore = 3;
           } else {
               playerScore = 4;
           }
           finalScores.add(playerScore);
       }
        return finalScores;
    }
}

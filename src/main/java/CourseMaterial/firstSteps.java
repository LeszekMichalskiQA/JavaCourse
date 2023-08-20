package CourseMaterial;


import utils.Generator;

import java.util.ArrayList;
import java.util.List;

public class firstSteps {
    public static void main(String[] args) {
        List<Integer> scores = Generator.getRandomIntList(-100, 1000, 5, 20);
        String playerName = "Jim";
        displayHighScorePosition(playerName, scores, calculateHighScorePosition(scores));
    }

    public static void displayHighScorePosition(String playerName, List<Integer> scores, List<Integer> playerPosition) {
        for (int i = 0; i < scores.size(); i++) {
            System.out.printf("%s for score: %d managed to get into tier %d on the high score list%n", playerName, scores.get(i), playerPosition.get(i));
        }
    }

    public static List<Integer> calculateHighScorePosition(List<Integer> scores) {
        List<Integer> finalScores = new ArrayList<>();
        for (Integer score : scores) {
            if (score >= 1000) {
                score = 1;
            } else if (score >= 500) {
                score = 2;
            } else if (score >= 100) {
                score = 3;
            } else {
                score = 4;
            }
            finalScores.add(score);
        }
        return finalScores;
    }
}

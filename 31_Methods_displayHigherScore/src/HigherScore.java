
public class HigherScore {

    public static void main(String[] args) {
        int higherScorePosition;

        higherScorePosition = calculateHighScorePosition(1500);
        displayHigherScorePosition("Carla", higherScorePosition);

        higherScorePosition = calculateHighScorePosition(900);
        displayHigherScorePosition("billy", higherScorePosition);

        higherScorePosition = calculateHighScorePosition(400);
        displayHigherScorePosition("tim", higherScorePosition);

        higherScorePosition = calculateHighScorePosition(50);
        displayHigherScorePosition("marla", higherScorePosition);

        higherScorePosition = calculateHighScorePosition(1000);
        displayHigherScorePosition("kir", higherScorePosition);
    }


    public static void displayHigherScorePosition(String playerName, int higherScorePosition) {

        System.out.println(playerName + " manage to get into position " + higherScorePosition + " on the high score table ");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
// otra forma de hacerlo
//        if (playerScore >= 1000) {
//            return 1;
//        }
//        else if (playerScore >= 500) {
//            return 2;
//        }
//        else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;
//    }

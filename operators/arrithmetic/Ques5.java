package operators.arrithmetic;

public class Ques5 {
    public static void main(String[] args) {
        int baseScore = 1000;
        int enemiesDefeated = 15;
        int pointsPerEnemy = 75;
        int bonus = 500;
        int penalty = 200;
        int players = 2;

        int enemyPoints = enemiesDefeated * pointsPerEnemy;
        int rawScore = baseScore + enemyPoints + bonus;
        int finalScore = rawScore - penalty;
        int scorePerPlayer = finalScore / players;
        int remainingPoints = finalScore % players;

        
        System.out.println("ENEMY POINTS      : " +  enemyPoints);
        System.out.println("RAW SCORE         : " + rawScore);
        System.out.println("FINAL SCORE       : " + finalScore);
        System.out.println("SCORE PER  PLAYER : " + scorePerPlayer);
        System.out.println("REMAINING POINTS  : " + remainingPoints);
    }
}

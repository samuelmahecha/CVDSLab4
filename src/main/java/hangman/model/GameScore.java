package hangman.model;

public interface GameScore {
    /**
     * Calculates the actual score of the game
     * @param correctCount, int 
     * @param incorectCount, int 
     * @return int, represents the score of the game
     * @throws GameScoreNegativeException, when the count numbers are negative
     */
    public int calculateScore(int correctCount, int incorectCount) throws GameScoreNegativeException;
}

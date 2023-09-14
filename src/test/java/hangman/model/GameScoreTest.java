package hangman.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GameScoreTest {

    private GameScore gameScore;

    @Before
    public void setup() {
        // Common setup code can go here if needed
    }

    @Test
    public void validateOriginalScoreWithZeroInputs(){
        gameScore = new OriginalScore();
        assertOriginalScore(0, 0, 100);
    }

    @Test
    public void validateOriginalScoreWithTenMistakes(){
        gameScore = new OriginalScore();
        assertOriginalScore(0, 10, 0);
    }

    @Test
    public void validateOriginalScoreWithElevenMistakes(){
        gameScore = new OriginalScore();
        assertOriginalScore(0, 11, 0);
    }

    @Test
    public void validateOriginalScoreWithFiveMistakes(){
        gameScore = new OriginalScore();
        assertOriginalScore(0, 5, 50);
    }

    // ... other test cases

    private void assertOriginalScore(int correctCount, int incorrectCount, int expectedScore) {
        int result = gameScore.CalculatedScore(correctCount, incorrectCount);
        Assert.assertEquals(expectedScore, result);
    }
}

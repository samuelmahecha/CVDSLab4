package hangman.model;

public class GameScoreNegativeException extends Exception{
    public static final String NEGATIVE_NUMBER = "the score can't be negative.";
    public GameScoreNegativeException (String message){
        super(message);
    }
}

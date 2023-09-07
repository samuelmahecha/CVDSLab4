package hangman.model;

public class BonusScore implements GameScore{
    private int puntaje;
    private int falla = 5;
    private int puntajeMinimo = 0;
    private int bonus = 10;
    /**
     * This method calculates the current score with the next conditions the game begins with a 0 points, failure penalty of 5 points, 
     * 10 points for correct letter and the minimun score is 0  
     * @param correctCount int
     * @param incorrectCount int
     * @return int 
     * @throws GameScoreNegativeException
    */ 
    @Override
    public int calculateScore (int correctCount, int incorectCount) throws GameScoreNegativeException {
        puntaje = 0;
        if (correctCount<0 || incorectCount<0){
            throw new GameScoreNegativeException(GameScoreNegativeException.NEGATIVE_NUMBER);
        }
        puntaje = (puntaje+(bonus*correctCount)-(falla*incorectCount)<puntajeMinimo)?puntajeMinimo:puntaje + (bonus*correctCount)-(falla*incorectCount);
        return puntaje;
    }
}  
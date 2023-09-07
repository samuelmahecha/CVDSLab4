package hangman.model;

public class OriginalScore implements GameScore{
    private int puntaje;
    private int falla = 10;
    private int puntajeMinimo = 0;
    /**
     * This method calculates the current score with the next conditions the game begins with a 100 points, failure penalty of 10 points, 
     * no points for correct letter and the minimun score is 0  
     * @param correctCount int
     * @param incorrectCount int
     * @return int 
     * @throws GameScoreNegativeException
    */ 
    @Override
    public int calculateScore (int correctCount, int incorectCount) throws GameScoreNegativeException {
        puntaje = 100;
        if (correctCount<0 || incorectCount<0){
            throw new GameScoreNegativeException(GameScoreNegativeException.NEGATIVE_NUMBER);
        }
        puntaje = (puntaje-(falla*incorectCount)<puntajeMinimo)?puntajeMinimo:puntaje-(falla*incorectCount);
        return puntaje;
    }
}   

package hangman.model;

import java.lang.Math;

public class PowerScore implements GameScore{
    private int puntaje;
    private int falla = 8;
    private int puntajeMinimo = 0;
    private int bonus = 5;
    private int puntajeMaximo = 500;
    /**
     * This method calculates the current score with the next conditions the game begins with a 0 points, failure penalty of 8 points, 
     * 5^i points for correct letter, the minimun score is 0 and the maximun score is 500.  
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
        for (int i=1; i<= correctCount; i++){
            puntaje +=(Math.pow(bonus,i));
        }
        puntaje = (puntaje-(falla*incorectCount)<puntajeMinimo)?puntajeMinimo:puntaje-(falla*incorectCount);
        puntaje = (puntaje>puntajeMaximo)?puntajeMaximo:puntaje;
        return puntaje;
    }
}  
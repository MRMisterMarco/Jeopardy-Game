
/**
 * Write a description of class JeopardyRunner here.
 *
 * @author (Marco Rosales)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class JeopardyRunner
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner input = new Scanner(new File("QandA.txt"));  
            //System.out.println("\f");
           QuestionsAndAnswers [] [] gameboard = makeQuestionsAndAnswers(input);
           System.out.println(gameboard);
           for (QuestionsAndAnswers [] category:gameboard)
           {
               for(QuestionsAndAnswers qna: category){
                   System.out.println(qna);
                }
            }
    }
    
    public static QuestionsAndAnswers [] [] makeQuestionsAndAnswers (Scanner input)
    {
        QuestionsAndAnswers [] [] gameboard = new QuestionsAndAnswers [5] [5];
        
        //QuestionsAndAnswers [] [] category = new QuestionsAndAnswers [0] [0];
        int value;
        for (QuestionsAndAnswers [] category : gameboard)
        {
            value = 200;
            for(QuestionsAndAnswers questionAtCategorysubZero : category)
            {
                    String prompt = input.nextLine();
                    String [] answer = new String[4];
                    questionAtCategorysubZero = new QuestionsAndAnswers ();
                        questionAtCategorysubZero.setPrompt(prompt);
                       // questionAtCategorysubZero.setAnswer(answer);
                       // questionAtCategorysubZero.setCorrect(correct);
                        questionAtCategorysubZero.setValue(value);
               for(String answered : answer)
               {
                        answered = input.nextLine();
                        //int correct = input.nextInt();
                        answer.equals(answered);
                        questionAtCategorysubZero.setAnswer(answer);
                        
                        
               }
               // Get which answer is the correct answer
               
               value += 200;
            }
        }
            return gameboard;
    }
}


/**
 * Write a description of class QuestionsAndAnswers here.
 *
 * @author (Marco Rosales)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class QuestionsAndAnswers
{
    // instance variables - replace the example below with your own
    private String prompt;
    private String [] answer;
   // private int correct;
    private int value;
    public static void main(String [] args)
        throws FileNotFoundException
        {
            Scanner input = new Scanner(System.in);
            System.out.println("\f");
    
            
        }
    /**
     * Constructor for objects of class QuestionsAndAnswers
     */
    public QuestionsAndAnswers()
    {
        // initialise instance variables
        this.prompt = "prompt";
        this.answer = answer;
        //this.correct = 0;
        this.value = 0;
    }
    
    public QuestionsAndAnswers(String prompt, String [] answer)
    {
        this.prompt ="prompt";
        this.answer = answer;
        //this.correct = 0;
        this.value = 0;
    }

    public String getPrompt()
    {
        return this.prompt;
    }
    
    public String[] getAnswer()
    {
        return answer;
    }
    
    
    
    public int getValue()
    {
        return this.value;
    }
    
    public void setPrompt(String prompt)
    {
        this.prompt = prompt;
    }
    
    public void setAnswer(String[] answer)
    {
        this.answer = answer;
    }
    
   
    
    public void setValue(int value)
    {
        this.value = value;
    }
    
    //public void print()
    //{
      //  System.out.println(prompt);
      //  System.out.println("What is your answer: " + answer);
      //  System.out.println("The correct answer is: " + correct);
    //}
    
    public String toString()
    {
        return prompt + "," + answer +
                    " and your score is: " + value;
    }
    
    public static boolean correctAnswer(int answer)
    {
        if (answer > 1 || answer < 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

package exercise1;

//@author: Ayesha Mohammed Azim Shaikh
//Student ID: 301166757

import java.util.Random;
import javax.swing.JOptionPane;

public class Test {
    public int correctAnswer;
    public int wrongAnswer;
    public int numOfQuestions = 5;

    //contains all questions for quiz
    public void simulateQuestion(int questionBank) {
        String questions = "";
        String[] options = new String[4];
        int correctOption = 5;
        switch (questionBank + 1)
        {
            case 1:
                questions = "Which of the following are not Java keywords?";
                options[0] = "double";
                options[1] = "then";
                options[2] = "instanceof";
                options[3] = "switch";
                correctOption = 1;
                break;
            case 2:
                questions = "Which one is a template for creating different objects?";
                options[0] = "Array";
                options[1] = "Interface";
                options[2] = "Method";
                options[3] = "Class";
                correctOption = 3;
                break;
            case 3:
                questions = "Modulus operator (%) can be applied to which of these?";
                options[0] = "Integers";
                options[1] = "floating-point numbers";
                options[2] = "Both 1 and 2";
                options[3] = "None of the above";
                correctOption = 2;
                break;
            case 4:
                questions = "What is the full form of JVM ?";
                options[0] = "Java Very Large Machine";
                options[1] = "Java Verified Machine";
                options[2] = "Java Very Small Machine";
                options[3] = "Java Virtual Machine";
                correctOption = 3;
                break;
            case 5:
                questions = "In Java code, the line that begins with /* and ends with */ is known as?";
                options[0] = "Multiline comment";
                options[1] = "Single line comment";
                options[2] = "Both A & B";
                options[3] = "None of the above";
                correctOption = 0;
                break;
        }
        int ans = JOptionPane.showOptionDialog(null, questions, "Choose the correct answer", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, correctOption);
        checkAnswer(ans, correctOption);

    }
    // checks if the answer is correct or incorrect
    public void checkAnswer(int inputAnswer, int savedAnswer) {
        Random rand = new Random();
        if (inputAnswer == savedAnswer) {
            correctAnswer++;
            JOptionPane.showMessageDialog(null, generateMessage(true));
        } else {
            wrongAnswer++;
            JOptionPane.showMessageDialog(null, generateMessage(false));
        }
    }

    //Initiates the test by displaying questions
    public void inputAnswer() {
        for (int i = 0; i < numOfQuestions; i++) {
            simulateQuestion(i);
        }
        generateFinalResult();
    }

    //Gives final result and score %
    public void generateFinalResult() {
        String output = "";
        output = "No. of questions answered correct: " + correctAnswer;
        output += "\nNo. of questions answered wrong: " + wrongAnswer;
        output += "\nScored Percentage: " + ((double) correctAnswer / numOfQuestions) * 100 + "%";
        JOptionPane.showMessageDialog(null, output);
    }

   //generates random feedback
    public String generateMessage(boolean win) {

        Random randomObject = new Random();
        if (win) {
            switch (randomObject.nextInt(4) + 1) {
                case 1:
                    return "Excellent!!";
                case 2:
                    return "Good";
                case 3:
                    return "Keep up the good work!";
                case 4:
                    return "Nice Work!";
            }
        }
        else
        {
            switch (randomObject.nextInt(4))
            {
                case 1:
                    return "No. Please try again.";
                case 2:
                    return "Wrong. Try once more";
                case 3:
                    return "Don't give up";
                case 4:
                    return "No. Keep trying";
            }
        }
        return "";
    }
}
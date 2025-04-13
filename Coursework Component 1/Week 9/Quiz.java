package Java_Coursework;
import java.util.Scanner;

public class Quiz {

    static class Question {
        String question;
        String answer;
        
        public Question(String question, String answer) {
            this.question = question;
            this.answer = answer;
        }
        
        public boolean checkAnswer(String userAnswer) {
            return userAnswer.equalsIgnoreCase(answer);
        }
        
        public void displayQuestion() {
            System.out.println(question);
        }
    }

    static class QuizManager {
        Question[] questions;
        int questionCount;
        
        public QuizManager() {
            questions = new Question[25];
            questionCount = 0;
        }
        
        public void addQuestion(Question question) {
            if (questionCount < 25) {
                questions[questionCount] = question;
                questionCount++;
            }
        }
        
        public void giveQuiz() {
            Scanner scanner = new Scanner(System.in);
            int correctAnswers = 0;
            
            for (int i = 0; i < questionCount; i++) {
                questions[i].displayQuestion();
                System.out.print("Your answer: ");
                String userAnswer = scanner.nextLine();
                
                if (questions[i].checkAnswer(userAnswer)) {
                    correctAnswers++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect...");
                }
            }
            
            System.out.println("\nQuiz Completed! You got " + correctAnswers + " out of " + questionCount + " correct.");
            scanner.close();
        }
    }

    public static class QuizTime {
        public static void main(String[] args) {
            QuizManager quiz = new QuizManager();  
            
            quiz.addQuestion(new Question("What is 1+1", "2"));
            quiz.addQuestion(new Question("What is the square root of 5?", "25"));
            quiz.addQuestion(new Question("What is the largest planet in our solar system?", "Jupiter"));
            quiz.addQuestion(new Question("What has keys but can't open locks?", "piano"));
            quiz.addQuestion(new Question("What comes once in a minute, twice in a moment, but never in a thousand years?", "M"));
            
            quiz.giveQuiz();  
        }
    }
}

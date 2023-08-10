import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "What is the largest mammal?"
        };
        
        String[] choices = {
            "A) Paris   B) London   C) Rome",
            "A) Venus   B) Mars     C) Jupiter",
            "A) Elephant B) Whale    C) Giraffe"
        };
        
        char[] answers = {'A', 'B', 'B'};
        
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Quiz App!");
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            System.out.println(choices[i]);
            System.out.print("Your answer: ");
            
            char userAnswer = Character.toUpperCase(scanner.next().charAt(0));
            
            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect.\n");
            }
        }
        
        System.out.println("Quiz completed! Your score: " + score + "/" + questions.length);
        scanner.close();
    }
}

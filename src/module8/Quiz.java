package module8;

import java.util.Scanner;

public class Quiz {
    private Question[] questions;
    private Scanner input;

    public Quiz(Question[] questions) {
        this.questions = questions;
        this.input = new Scanner(System.in);
    }

    private String getUserAnswer() {
        System.out.print("Your answer: ");
        return input.nextLine();
    }

    public int getTotalPoints() {
        // TODO: Add up and return the total possible points for all questions.
        return 0;
    }

    public void takeQuiz() {
        int earned = 0;
        for (Question question : questions) {
            question.displayPrompt();
            int points = question.checkAnswer(getUserAnswer());
            earned += points;
            System.out.println("Points earned: " + points);
        }
        System.out.println("Total points: " + earned + "/" + getTotalPoints());
    }
}

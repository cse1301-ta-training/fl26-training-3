package module8;

public class Question {
    private String prompt;
    private String answer;
    private int points;

    public Question(String prompt, String answer, int points) {
        this.prompt = prompt;
        this.answer = answer;
        this.points = points;
    }

    public void displayPrompt() {
        System.out.println(prompt);
    }

    public int checkAnswer(String response) {
        if (answer.equals(response)) {
            return points;
        } else {
            return 0;
        }
    }

    public int getPoints() {
        return points;
    }
}

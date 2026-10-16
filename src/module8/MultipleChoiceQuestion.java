package module8;

public class MultipleChoiceQuestion extends Question {
    private String[] choices;

    public MultipleChoiceQuestion(String prompt, String[] choices,
                                  String answer, int points) {
        super(prompt, answer, points);
        this.choices = choices;
    }

    @Override
    public void displayPrompt() {
        super.displayPrompt();
        // TODO: Print every choice in order, numbered from 1.
        // For example: 1. first choice
    }
}

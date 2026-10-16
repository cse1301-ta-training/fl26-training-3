package module8;

public class SelectAllQuestion extends MultipleChoiceQuestion {
    private String correctChoiceNumbers;

    public SelectAllQuestion(String prompt, String[] choices,
                             String correctChoiceNumbers) {
        super(prompt, choices, correctChoiceNumbers, choices.length);
        this.correctChoiceNumbers = correctChoiceNumbers;
    }

    @Override
    public int checkAnswer(String response) {
        // TODO: Deduct one point for each correct choice
        // that is missing and each incorrect choice that was selected.
        // Return the points earned for this response.        
        // Do not return a negative score.
        return 0;
    }

    private int findMissingCorrectAnswers(String response) {
        int missing = 0;
        for (int i = 0; i < correctChoiceNumbers.length(); i++) {
            if (response.indexOf(correctChoiceNumbers.charAt(i)) < 0) {
                missing++;
            }
        }
        return missing;
    }

    private int findIncorrectGivenAnswers(String response) {
        int incorrect = 0;
        for (int i = 0; i < response.length(); i++) {
            if (correctChoiceNumbers.indexOf(response.charAt(i)) < 0) {
                incorrect++;
            }
        }
        return incorrect;
    }
}

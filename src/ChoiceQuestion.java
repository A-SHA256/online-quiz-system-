public class ChoiceQuestion extends Question {
    private final String[] choices;

    public ChoiceQuestion(String questionText, int correctAnswer, String[] choices) {
        super(questionText, correctAnswer);
        this.choices = choices;
    }

    @Override
    void displayQuestion() {
        int i;
        System.out.println(getQuestionText());
        for (i = 0; i < choices.length; i++) {
            System.out.println(i+1 + ". " + choices[i]);
        }
    }
}

public class TrueFalseQuestion extends Question {

    public TrueFalseQuestion(String questionText, int correctAnswer) {
        super(questionText, correctAnswer);
    }

    @Override
    void displayQuestion() {
        System.out.println(getQuestionText());
        System.out.println();
        System.out.println("1. True");
        System.out.println("2. False");
    }
}

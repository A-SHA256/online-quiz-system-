abstract class Question {
    private final String questionText;
    private final int correctAnswer;

    public Question(String questionText, int correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public boolean checkAnswer(int choice) {
        return choice == correctAnswer;
    }

    abstract void displayQuestion();

    public void displayResult(boolean choice) {
        System.out.println(choice ? "Correct" : "Incorrect");
        System.out.println();
    }
}

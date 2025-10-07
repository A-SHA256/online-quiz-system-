import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private Scanner sc;
    private int score = 0;

    Question q1 = new ChoiceQuestion(
            "How many planets are there in the Solar System?",
            2,
            new String[] {"7", "8", "9", "10"}
    );

    Question q2 = new ChoiceQuestion(
            "Which planet is known as the Red Planet?",
            3,
            new String[] {"Venus", "Jupiter", "Mars", "Saturn"}
    );

    Question q3 = new ChoiceQuestion(
            "What is the largest ocean on Earth?",
            3,
            new String[] {"Atlantic Ocean", "Indian Ocean", "Pacific Ocean", "Arctic Ocean"}
    );

    Question q4 = new ChoiceQuestion(
            "Who developed the theory of relativity?",
            2,
            new String[] {"Isaac Newton", "Albert Einstein", "Nikola Tesla", "Galileo Galilei"}
    );

    Question q5 = new ChoiceQuestion(
            "Which gas do plants absorb during photosynthesis?",
            2,
            new String[] {"Oxygen", "Carbon Dioxide", "Nitrogen", "Hydrogen"}
    );

    Question q6 = new TrueFalseQuestion(
            "The Great Wall of China is visible from space. True or False?",
            2
    );

    Question q7 = new TrueFalseQuestion(
            "Light travels faster than sound. True or False?",
            1
    );

    Question q8 = new TrueFalseQuestion(
            "Humans can breathe underwater without any equipment. True or False?",
            2
    );

    Question q9 = new TrueFalseQuestion(
            "The chemical symbol for water is H2O. True or False?",
            1
    );

    Question q10 = new TrueFalseQuestion(
            "Bats are blind. True or False?",
            2
    );


    List<Question> questions = new ArrayList<>(List.of(q1, q2, q3, q4, q5, q6, q7, q8, q9, q10));

    public int userInput(Question typeOfQuestion){
        sc = new Scanner(System.in);
        while (true) {
            System.out.print("Choose the number of right answer: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input");
                sc.next();
                continue;
            }
            int userAnswer = sc.nextInt();
            if(typeOfQuestion instanceof ChoiceQuestion) {
                if (userAnswer < 1 || userAnswer > 4) {
                    System.out.println("Incorrect option chosen");
                    continue;
                }
            } else if (typeOfQuestion instanceof TrueFalseQuestion) {
                if (userAnswer < 1 || userAnswer > 2) {
                    System.out.println("Incorrect option chosen");
                    continue;
                }
            }
            return userAnswer;
        }
    }

    public void run() {
        for (Question q : questions) {
            q.displayQuestion();
            System.out.println();
            boolean userAnswer = q.checkAnswer(userInput(q));
            if (userAnswer) {
                score++;
            }
            q.displayResult(userAnswer);
        }
        sc.close();
        System.out.println("Total score is " + score + " out of 10");
    }
}

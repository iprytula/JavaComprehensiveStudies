import java.util.Scanner;

public class QuestionService {

  private static final int QUESTIONS_QUANTITY = 5;
  Question[] questions = new Question[QUESTIONS_QUANTITY];
  int score = 0;

  QuestionService() {
    this.setQuestions();
  }

  private void setQuestions() {
    questions[0] = new Question("What is the capital of France?", new String[] { "London", "Berlin", "Paris", "Rome" },
        3);
    questions[1] = new Question("Which method is used to calculate the length of a string in Java?",
        new String[] { "length()", "size()", "length", "getSize()" }, 1);
    questions[2] = new Question("What does HTTP stand for?", new String[] { "HyperText Transfer Product",
        "HyperText Transfer Protocol", "HyperText Transfer Process", "HyperText Transmission Protocol" },
        2);
    questions[3] = new Question("Which planet is known as the Red Planet?",
        new String[] { "Earth", "Mars", "Jupiter", "Venus" }, 2);
    questions[4] = new Question("In Java, which keyword is used to inherit a class?",
        new String[] { "extends", "implements", "inherits", "super" }, 1);
  }

  public void playQuiz() {
    int score = 0;

    for (Question question : questions) {
      int clientAnswer;

      System.out.println("Question: " + question.getQuestion());
      System.out.println("Options:");

      int i = 0;
      for (String option : question.getOptions()) {
        System.out.println(i + 1 + ": " + option);
        i++;
      }

      clientAnswer = inputAnswer();
      score += checkCorrectAnswerAndGetScorePoint(question, clientAnswer);

      System.out.println("Answer: " + question.getAnswer() + "\n");
    }

    System.out.println("This is the end of the quiz, your score: " + score);
  }

  public int inputAnswer() {
    Scanner scanner = new Scanner(System.in);
    int answer;

    try {
      answer = Integer.parseInt(scanner.nextLine());
    } catch (NumberFormatException e) {
      answer = 0;
      System.out.println("Invalid integer input");
    }

    return answer;
  }

  private int checkCorrectAnswerAndGetScorePoint(Question question, int answer) {
    return question.getAnswer() == answer ? 1 : 0;
  }

}
public class Question {

  private String id;
  private String question;
  private String[] options;
  private int answer;

  Question(String question, String[] options, int answer) {
    this.id = this.toString();
    this.question = question;
    this.options = options;
    this.answer = answer;
  }

  public String getId() {
    return id;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public String[] getOptions() {
    return options;
  }

  public void setOptions(String[] options) {
    this.options = options;
  }

  public int getAnswer() {
    return answer;
  }

}
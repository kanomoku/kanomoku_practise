package reflection;

public class C3_Question {
    private String title;
    private String answer;

    public C3_Question() {
    }

    public C3_Question(String title, String answer) {
        this.answer = answer;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String toString() {
        return "{" + title + "," + answer + "}";
    }

}

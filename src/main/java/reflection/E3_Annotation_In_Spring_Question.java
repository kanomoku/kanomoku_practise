package reflection;

public class E3_Annotation_In_Spring_Question {// 实体对象 只有属性 共有的方法 无参数构造方法

    private String title;
    private String answer;

    @D1_MyAnnotation(value={"1+1=？A1B2C3D4","A"})
    public E3_Annotation_In_Spring_Question() {
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
}

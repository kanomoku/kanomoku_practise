package reflection;

public class E4_Annotation_In_Spring_User {
    private String name;
    private String password;
    private Float balance;

    @D1_MyAnnotation(value = {"麻诗民", "333", "100"})
    public E4_Annotation_In_Spring_User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }
}

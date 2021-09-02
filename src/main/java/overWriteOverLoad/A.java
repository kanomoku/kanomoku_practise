package overWriteOverLoad;

public class A {
    String name;

    public A getInstance() {
        A a = new A();
        a.name = "a";
        return a;
    }
}

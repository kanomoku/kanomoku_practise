package overWriteOverLoad;


public class B extends A {

    public B getInstance() {
        B b = new B();
        b.name = "b";

        return b;
    }
}

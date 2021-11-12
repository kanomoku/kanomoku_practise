package java8.java8_interface;

public interface A2_interfaceB {
    default String say(String name) {
        return "hi " + name;
    }
}

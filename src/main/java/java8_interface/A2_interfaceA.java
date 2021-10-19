package java8_interface;

public interface A2_interfaceA {
    default String say(String name) {
        return "hello " + name;
    }
}

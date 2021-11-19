package exception.throwandthrows;

import org.junit.Test;

public class ThrowsAndThrowMainTest {
    public static void main(String[] args) {

        try {
            exception.throwandthrows.Person person = new exception.throwandthrows.Person();
            person.weight(91);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void test(){
        Person person = new Person();
        person.weight(91);
    }
}
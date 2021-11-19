package exception.throwandthrows;

import org.junit.Test;

public class MainTest {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            person.weight(91);
        } catch (MyException e) {
            System.out.println(e.getCode() + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void test() {
        Person person = new Person();
        person.weight(91);
    }

    @Test
    public void test2() {
        try {
            Person person = new Person();
            person.weight(91);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    @Test
    public void test3() {
        try {
            Person person = new Person();
            person.weight(91);
        } catch (MyException e) {
            System.out.println(e.getCode() + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new MyException(500, e.getMessage());
        }
    }

    @Test
    public void test4() {
        try {
            Doctor doctor = new Doctor();
            doctor.check();
        } catch (MyException e) {
            System.out.println(e.getCode() + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new MyException(500, e.getMessage());
        }
    }

@Test
public void test11() {
    Person person = new Person();
    person.high();
}

@Test
public void test12() {
    try {
        Doctor doctor = new Doctor();
        doctor.check2();
    } catch (MyException e) {
        System.out.println(e.getCode() + e.getMessage());
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}

@Test
public void test13() {
    try {
        Doctor doctor = new Doctor();
        doctor.check3();
    } catch (MyException e) {
        System.out.println(e.getCode() + e.getMessage());
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}

@Test
public void test14() {
    try {
        Doctor doctor = new Doctor();
        doctor.check4();
    } catch (MyException e) {
        System.out.println(e.getCode() + e.getMessage());
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
}
package exception.throwandthrows;

public class Doctor {

    public void check() {
        try {
            Person person = new Person();
            person.weight(91);
        } catch (MyException e) {
            throw e;
        } catch (Exception e) {
            throw new MyException(500, e.getMessage());
        }
    }

    public void check2() {
        try {
            Person person = new Person();
            person.high();
        } catch (MyException e) {
            throw e;
        } catch (Exception e) {
            throw new MyException(500, e.getMessage());
        }
    }

    public void check3() {
        Person person = new Person();
        person.weight(91);
    }

    public void check4() {
        Person person = new Person();
        person.high();
    }
}

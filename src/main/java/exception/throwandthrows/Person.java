package exception.throwandthrows;

public class Person {

public String weight(int num) {
    if (num > 90) {
        throw new MyException(400, "overWeight");
    }
    return "light";
}

    public String high() {
        int a = 5;
        a = a / 0;
        return "tall";
    }
}
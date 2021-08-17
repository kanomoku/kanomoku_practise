package reflection;


public class D2_Person {
    @D1_MyAnnotation(value = {"AAA", "BBB"})
    private String name;
    @D1_MyAnnotation( value = {"CCC", "DDD"})
    public void eat(){
    }
}


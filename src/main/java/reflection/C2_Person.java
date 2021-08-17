package reflection;

public class C2_Person {
    private String name;
    //    private int age;//最好使用基本类型对应的包装类
    private Integer age;//最好使用基本类型对应的包装类
    private String sex;

    public C2_Person() {
    }

    public C2_Person(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

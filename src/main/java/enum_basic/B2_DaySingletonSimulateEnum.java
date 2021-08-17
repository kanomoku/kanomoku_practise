package enum_basic;

public class B2_DaySingletonSimulateEnum {//描述星期
    //类似单例模式的想法
    //构造方法私有
    private B2_DaySingletonSimulateEnum(){}
    //所有对象都是属性
    public static final B2_DaySingletonSimulateEnum MONDAY = new B2_DaySingletonSimulateEnum();
    public static final B2_DaySingletonSimulateEnum TUESDAY = new B2_DaySingletonSimulateEnum();
    public static final B2_DaySingletonSimulateEnum WEDNESDAY = new B2_DaySingletonSimulateEnum();
    public static final B2_DaySingletonSimulateEnum THURSDAY = new B2_DaySingletonSimulateEnum();
    public static final B2_DaySingletonSimulateEnum FRIDAY = new B2_DaySingletonSimulateEnum();
    public static final B2_DaySingletonSimulateEnum SATURDAY = new B2_DaySingletonSimulateEnum();
    public static final B2_DaySingletonSimulateEnum SUNDAY = new B2_DaySingletonSimulateEnum();

    //一般的属性和方法随便设计 这里只是控制只有这7个对象
}

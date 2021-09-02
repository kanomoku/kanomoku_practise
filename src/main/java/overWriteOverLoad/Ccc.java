package overWriteOverLoad;

import jvm.Aaa;
import loadClassCreateObject.Bbb;

public class Ccc extends Bbb{
    public static void main(String[] args){
	System.out.println(new Bbb().name);//zyt
	//在不同包下,自己的实例却访问不了,出现编译不通过
//	System.out.println(new A().name);
    }
}
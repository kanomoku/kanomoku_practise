package publicProtectedDefaultPrivate2;

import publicProtectedDefaultPrivate.Aaa;

public class Bbb extends Aaa{
    public static void main(String[] args){
	System.out.println(new Bbb().name);//zyt
	//在不同包下,自己的实例却访问不了,出现编译不通过
//	System.out.println(new Aaa().name);
    }
}
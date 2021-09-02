package publicProtectedDefaultPrivate3;

import publicProtectedDefaultPrivate.Aaa;
import publicProtectedDefaultPrivate2.Bbb;

public class Ccc extends Bbb{
    public static void main(String[] args){
    	System.out.println(new Ccc().name);//zyt
    	//在不同包下,自己的实例却访问不了,出现编译不通过
//	System.out.println(new Bbb().name);
//	System.out.println(new Aaa().name);
    }
}
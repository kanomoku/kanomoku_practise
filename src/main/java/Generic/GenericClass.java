package Generic;

/*
1:把泛型定义在类上
2:类型变量定义在类上,方法中也可以使用
*/
public class GenericClass<T> {
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}

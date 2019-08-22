package me.ylchen.java.reflection;

public class ClassDemo2 {

	public static void main(String[] args) {
		//基本数据类型也有类类型（Class Type)
		Class c1 = int.class;
		Class c2 = String.class;
		Class c3 = double.class;
		Class c4 = Double.class;
		//类里声明的关键字也有类类型
		Class c5 = void.class;
	}

}

package me.ylchen.java.reflection;

import java.lang.reflect.Method;

public class ClassUtil  {

	public static void main(String[] args) {
		printClassMsg(new me.ylchen.java.reflection.Foo());
		String i = "";
		//printClassMsg(i);
	}
	
	/**
	 * 打印类的信息，包括类的成员函数，成员变量
	 * @param obj
	 */
	public static void printClassMsg(Object obj) {
		//先获取类的类类型
		Class c = obj.getClass();
		//打印类的名称
		System.out.println("类的名称是："+c.getName());
		//getMethod()获取所有public的方法
		Method []ms = c.getDeclaredMethods();
		//getDeclaredMethod()获取自己声明的方法（不包括从父类继承来的方法）
		for(Method m:ms) {
			Class returnType = m.getReturnType();
			String mName = m.getName();
			System.out.print(returnType + " " + mName + "(");
			//获取参数列表的类型的类类型（eg:参数是int类型，则返回int.class)
			Class[] paramTypes =  m.getParameterTypes();
			for(Class type:paramTypes) {
				System.out.print(type+",");
			}
			System.out.println(");");
			
		}
		
	}
}

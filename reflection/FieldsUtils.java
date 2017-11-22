package me.ylchen.java.reflection;

import java.lang.reflect.Field;

public class FieldsUtils {

	public static void main(String[] args) {
		printFieldsMsg(new String());

	}
	
	public static void printFieldsMsg(Object obj) {
		Class c = obj.getClass();
		/**
		 * 成员变量也有对应的类类型
		 * getDeclaredFields()获取所有声明的变量
		 * getFields()获取所有public的成员变量
		 */
		
		Field fs[] = c.getDeclaredFields();
		for(Field f : fs) {
			//获取成员变量的类型 对应的类类型
			Class fieldType = f.getType();
			//得到成员变量的名称
			String fieldName = f.getName();
			//成员变量的类型
			String typeName = fieldType.getName(); 
			System.out.println(fieldName + " " + typeName + ","); 
		}
	}

}

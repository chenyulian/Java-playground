package me.ylchen.java.reflection;

public class ClassDemo1 {

	
	public static void main(String[] args) {
		
		Foo foo = new Foo();
		
		//1.通过类 获得类的类类型(Class Type),即类这个实例对象的类
		Class c1 = Foo.class;
		
		//2.通过对象 获得类的类类型(Class Type)
		Class c2 = foo.getClass();
		//c1 == c2 ?
		//一个类只可能是Class类的一个实例对象
		System.out.println(c1 == c2);
		
		//3.通过静态方法Class.forName
		Class c3 = null;
		try {
			c3 = Class.forName("me.ylchen.java.reflection.Foo");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		//我们还可以通过类的类类型创建该类的实例对象
		Foo foo2 = null;
		try {
			foo2 = (Foo)c1.newInstance();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(foo2);
	}

}

class Foo{
	public void hello() {
		
	}
	private void world() {
		
	}
	
}

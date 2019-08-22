package me.ylchen.java.jvm.gc;

public class ReferenceCounterProblem {
    public static void main(String[] args) {
        MyObject object1 = new MyObject();
        MyObject object2 = new MyObject();

        //循环引用
        object1.child = object2;
        object2.child = object1;
    }
}

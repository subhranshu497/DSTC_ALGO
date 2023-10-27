package com.interview.prep.java;

public class ClassObjOnHeap {
    private  int a;

    public int getA() {
        return a;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("java.lang.String");
        Class c2 = Class.forName("java.lang.Integer");
        ClassObjOnHeap coh = new ClassObjOnHeap();
        System.out.println(c1==c2);
        System.out.println(ClassObjOnHeap.class.getClassLoader());
        Runtime r = Runtime.getRuntime();
        System.out.println(r.maxMemory());
        System.out.println(r.totalMemory());
        System.out.println(r.freeMemory());
        System.out.println(coh.a);

    }
}

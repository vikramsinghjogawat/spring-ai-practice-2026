package com.java.SpringDemo.algo.singleton;

public class StudentSingleton {

    private StudentSingleton(){}

    private static class Holder{
        private static final StudentSingleton INSTANCE = new StudentSingleton();
    }

    public static StudentSingleton getInstance(){
        return Holder.INSTANCE;
    }
}
class StudentSingeltonTest{
    public static void main(String[] args) {
        StudentSingleton s1 = StudentSingleton.getInstance();
        StudentSingleton s2 = StudentSingleton.getInstance();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}

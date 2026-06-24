package com.java.SpringDemo.algo.singleton;

public class PersonSigleton {
    private static volatile PersonSigleton instance = null;
    private PersonSigleton(){}
    public static PersonSigleton getInstance() {
        if(instance==null){
            synchronized (PersonSigleton.class) {
                if (instance==null)
                    instance = new PersonSigleton();
            }
        }
        return instance;
    }
}
class PersonSingletonTest{
    public static void main(String[] args) {
        int hashCode1 = PersonSigleton.getInstance().hashCode();
        int hashCode2 = PersonSigleton.getInstance().hashCode();
        System.out.println(hashCode1);
        System.out.println(hashCode2);
    }
}

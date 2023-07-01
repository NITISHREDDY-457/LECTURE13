package Lecture13;
import Lecture13_A.A;
public class D {
    public static void main(String[] args) {
        A obj=new A();
        // System.out.println(obj.a); default is not accessible outside the package
        // System.out.println(obj.b); protected is not accessible outside the class
        // System.out.println(obj.c); private is not accessible outside the package
        System.out.println(obj.d);// Public is accessible outside the package
    }
}
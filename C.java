package Lecture13;
import Lecture13_A.A;
public class C extends A{
    public static void main(String[] args) {
        A obj=new A();
        C obj2=new C();
        // System.out.println(obj.a) default not accessible outside the package for subclass
        // System.out.println(obj.c) private not accessible outside class
        System.out.println(obj.d); // public is accessible everywhere 
        System.out.println(obj2.b); // Protected is accessible for different package for subclass using object of subclass only. 
    }
}
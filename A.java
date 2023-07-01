public class A{
    int a=10; // default or pacakge privat
    protected int b=43;
    private int c=50;
    public int d=95;

    public static void main(String[] args) {
        A obj=new A();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}
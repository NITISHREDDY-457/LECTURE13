// package Lecture13_A;
class demo{
    private int x=3;
    private int y=25;
    private int z=45;
    private int w=63;
    public int get_A(){
        System.out.println("Value of a is : ");
        return this.x;
    }
    public int get_B(){
        System.out.println("Value of b is : ");
        return this.y;
    }
    public void set_A(int x){
        //we can manipulate the private variables using encapsulation
        if(x>50){
            this.x=x;
            System.out.println("Value of a changed to : "+x);
        }
        else{
            System.out.println("Value cannot be changed");
        }
    }
    public void set_B(int y){
        this.y=y;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        demo obj=new demo();
        System.out.println(obj.get_A());
        obj.set_A(55);
        System.out.println(obj.get_A());

    }
}
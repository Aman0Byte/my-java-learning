class Base1{
    public int x;

public Base1(){
    System.out.println("HEY I AM A CONSTRUCTOR ");
}
    public Base1(int x){
        System.out.println("HEY I AM A OVERLOADED  CONSTRUCTOR WITH VALUE OF x AS:  "+x);
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived1 extends Base1{

    public Derived1() {
      //  super(0);
        System.out.println("I AM CONSTRUCTOR OF DERIVED CLASS");
    }
    Derived1(int x ,  int y ){
        super(x);
        System.out.println("I AM A OVERLOADED CONSTRUCTOR OF DERIVED WITH VALUE OF Y AS :"+y);
    }

}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I AM A CHILD OF DERIVED CONSTRUCTOR ");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I AM A OVERLOADED CONSTRUCTOR OF ChildOfDerived WITH VALUE OF z AS :"+z);
    }
}



public class _46_constructors_in_inheritance {
    public static void main(String[] args) {

// Base1 b1= new Base1();
//  Derived1 d = new Derived1();
//Derived1 d = new Derived1(14,9);
//ChildOfDerived cd = new ChildOfDerived();
ChildOfDerived cd = new ChildOfDerived(12,13,15);
    }
}

class Base{
  public   int x;
    public  Base(){
        System.out.println("I am  constructor");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in Base and  setting x now");
        this.x = x;
    }
}
class Derived extends Base{ // here I use INHERITANCE

   public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am setting  y now");
        this.y = y;
    }
}

public class _45_CHAP_10_Inheritance {
    public static void main(String[] args) {
  // Creating an object of Base class
      //  Base b = new Base();
     //   b.setX(4);
     //   System.out.println(b.getX());
        // Creating an object of Derived class
Derived d = new Derived();
d.setX(56);
        System.out.println(d.getX());
        d.setY(88);
        System.out.println(d.getY());

    }
}

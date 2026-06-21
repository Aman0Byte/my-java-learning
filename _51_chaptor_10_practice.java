class Circle{
    public int radius;
    Circle(int r){
        System.out.println("I am circle parameterized constructor ");
        this.radius=r;
    }
    Circle(){
        System.out.println("I am circle no  parameterized constructor ");
    }
    public double Area(){
        return (radius*radius*Math.PI);
    }
}
class Cylinder extends Circle{
    public int height;
    Cylinder(int r , int h){
        super(r);
        this.height=h;
        System.out.println("I am cylinder  parameterized constructor ");
    }
    public double volume(){
        return (radius*radius*Math.PI*height);
    }

}
class Rectangle22{
    public int length , breadth ;
    Rectangle22(){
        System.out.println("I AM A RECTANGLE no  PARAMETRIZED CONSTRUCTOR ");
    }
    Rectangle22(int length){
        System.out.println("I AM A RECTANGLE 1  PARAMETRIZED CONSTRUCTOR ");
    }
    Rectangle22(int length, int breadth){
        System.out.println("I AM A RECTANGLE 2  PARAMETRIZED CONSTRUCTOR ");
    }

    public int getBreadth() {
        return breadth;
    }
public void SetBreadth(int breadth)
{
 this.breadth=breadth;
}
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public double Area(){
        return length*breadth;
    }

}
class cuboid extends Rectangle22{
    public int  height;
    public void setHeight(int height){
        this.height= height;
    }
    public int getHeight(){
        return height;
    }
    cuboid(int length, int breadth, int height ){
        super(length);
        System.out.println("I AM CUBOID PARAMETERIZED CONSTRUCTOR ");

    }
    public double Area(){
        return 2*(length*breadth+length*height+breadth*height);
    }
    public double volume(){
        return length*breadth*height;
    }
}

public class _51_chaptor_10_practice {
    public static void main(String[] args) {
//Circle objc= new Circle();
//Cylinder objc1= new Cylinder(14,22);
Rectangle22 obj= new Rectangle22();
//cuboid cu = new cuboid();
        obj.SetBreadth(12);
        obj.setLength(13);
        System.out.println("THE AREA OF GIVEN RECTANGLE IS "+obj.Area());

    }
}

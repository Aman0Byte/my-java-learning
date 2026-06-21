import java.util.Scanner;
class cylinder{
    private int radius;
    private int height;

    /*public cylinder(int height , int radius) {
        this.height = height;
        this.radius=radius;
    }

     */

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
    public double surfacearea(){
        return (2*Math.PI*radius*radius)+(2*Math.PI*radius*height);
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}

class reactangl01{
    private int lenght ;
    private int breadth;
    public reactangl01() {
        this.lenght =lenght;
        this.breadth=breadth;
    }

    public reactangl01(int lenght,int breadth) {
        this.lenght = lenght;
        this.breadth=breadth;

    }

    public int getBreadth() {
        return breadth;
    }

    public int getLenght() {
        return lenght;
    }
}
class sphare{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double surfaceArea(){
        return 4*Math.PI*radius*radius;
    }
    public double volume(){
        return (4*Math.PI*radius*radius*radius)/3;
    }

}


public class _44_practiceset_09 {
    public static void main(String[] args) {
 // PROBLEM 1
Scanner scanner= new Scanner(System.in);

        cylinder myCylinder= new cylinder();
        System.out.println("PLEASE ENTER THE HEIGHT");
        myCylinder.setHeight(scanner.nextInt());
        System.out.println("THE HEIGHT IS :"+myCylinder.getHeight());
        System.out.println("PLEASE ENTER THE RADIUS");
        myCylinder.setRadius(scanner.nextInt());
        System.out.println("THE RADIUS IS : "+myCylinder.getRadius());

        // PROBLEM 2
        System.out.println("THE SURFACE AREA IS :"+myCylinder.surfacearea());
        System.out.println("THE VOLUME IS : "+myCylinder.volume());
        // PROBLEM 3
        System.out.println("ENTER THE LENGTH AND BREATH");
        reactangl01 r= new reactangl01(scanner.nextInt(),scanner.nextInt());
        System.out.println("THE BREATH IS:"+r.getBreadth());
        System.out.println("THE LENGTH IS:"+r.getLenght());
        // problem 5
         sphare sp = new sphare();
        System.out.println("ENTER THE RADIUS");
         sp.setRadius(scanner.nextInt());
        System.out.println("THE SURFACE AREA IS :"+sp.surfaceArea());
        System.out.println("THE VOLUME IS :"+sp.volume());

    }
}

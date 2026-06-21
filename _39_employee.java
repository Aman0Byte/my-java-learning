
import java.util.Scanner;
class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
class CellPhone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void CallFriends(){
        System.out.println("Calling tufel ...");
    }
}
class  square{
    int Side;
     public int area(){
         return Side*Side;
     }
     public int perimeter(){
         return Side*4;
     }
}
class rectangle{
    int length;
    int bright;
    public int area(){
        return length*bright;

    }
    public int perimeter(){
        return (length+bright)*2;
    }
}
class Tommy{
    public void hit(){
        System.out.println("Hitting the Enemy ");
    }   public void run(){
        System.out.println("Running from  the Enemy ");
    } public void fire(){
        System.out.println("Firing to  the Enemy ");
    }

}
class area_of_circle{
    int radios;
    public float area(){
        return (3.14f*radios*radios);
    }
    public  float perimeter(){
        return 2*3.14f*radios;
    }
}
public class _39_employee {
    public static void main(String[] args) {
        /*
        // Problem 1
        Employee1 aman = new Employee1();
        aman.setName("AMAN_AG");
        aman.salary= 255;
        System.out.println( aman.getName());
        System.out.println( aman.getSalary());
        // Problem 2
 CellPhone moto = new CellPhone();
 moto.CallFriends();
 moto.ringing();
 moto.vibrate();
         */
        // Problem 3
   //  square sq= new square();
      Scanner sc= new Scanner(System.in);
//        sq.Side= sc.nextInt();
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());


        // Problem 4
      /*  rectangle re = new rectangle();
        re.length= sc.nextInt();
        re.bright= sc.nextInt();
        System.out.println("THE AREA OF RECTANGLE IS: "+re.area());
        System.out.println("THE AREA OF RECTANGLE IS: "+re.perimeter());
       */
        // Problem 5

      /*
        Tommy PLAYER1= new Tommy();
        PLAYER1.run();
        PLAYER1.fire();
        PLAYER1.hit();


       */
        System.out.println("Enter the string");
String st= sc.nextLine();
        System.out.println(st);

// Problem 6

/*
        area_of_circle c1= new area_of_circle();
        System.out.println("Please enter the radios ");
        c1.radios= sc.nextInt();
        System.out.println("THE AREA OF CIRCLE IS :"+c1.area());
        System.out.println("THE PERIMETER OF CIRCLE IS :" +c1.perimeter());


 */

    }
}

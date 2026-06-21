class Employee2{

   /*
    private int id;
    private   String name;
    private   int salary ;

    public String getName(){return name;}
    public void setName(String n){this.name=n;}
    public int getId(){return id;}
    public void setId(int x){this.id =x;}
    public int getSalary(){return this.salary;}
    public MyMainEmployee(){
        id= 45;
        name =" my self aman";
    }
    public MyMainEmployee( String myname ,   int myid){
        id = myid;
        name= myname;
    }
    public MyMainEmployee(String name ){
        name = "use full";
    }
    public MyMainEmployee(int a){
        salary=a;
    }

    */

    // First constructor
    Employee2(String s, int i){
        System.out.println("The name of the first employee is : " + s);
        System.out.println("The id of the first employee is : " + i);
    }
    //    Constructor overloaded
    Employee2(String s, int i, int salary){
        System.out.println("The name of the second employee is : " + s);
        System.out.println("The id of the second employee is : " + i);
        System.out.println("The salary of second employee is : " + salary);
    }
}


public class _42_constructors {
    public static void main(String[] args) {
     // MyMainEmployee Aman  = new MyMainEmployee("PROGRAMMING WITH AMAN ", 5);
      Employee2 Aman  = new Employee2( "AMAN" , 25,555555);
     // Employee2 TUFEL  = new Employee2( "LAFETU " , 2555225);
       //  Aman.setName("AMAN AGRAHARI");
       //   Aman.setId(5);
       // System.out.println(Aman.getId());
       // System.out.println(Aman.getName());
       // System.out.println(Aman.getSalary());
    }
}

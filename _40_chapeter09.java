
 class MyEmployee{
   private int id;
  private   String name;

  public String getName(){
      return name;
  }
  public void setName(String n){
      this.name=n;
  }
public int getId(){
      return id;
}
public void setId(int x){
   this.id =x;
}
 }
public class _40_chapeter09 {
    public static void main(String[] args) {
        MyEmployee aman= new MyEmployee();
      //  aman.id= 45;
     //   aman.name="AMAN_AGRAWAL"; //  Throws an error due to private access modifier
      aman.setName("AMAN_AGRAWAL");
        System.out.println(aman.getName());
        aman.setId(55);
        System.out.println(aman.getId());


    }
}
/*
 Output :
 java: id has private access in Employee
 public  class CWH {
     public static void main(String[] args) {
         Employee emp1 = new Employee();
         emp1.id = 3;
         emp1.name = "Shubham";

     }
 }

 */

 /*
class Employee {

    private int id;
    private  String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}

 public  class CWH {
     public static void main(String[] args) {
         Employee emp1 = new Employee();

         emp1.setName("Shubham");
         System.out.println(emp1.getName());
         emp1.setId(1);
         System.out.println(emp1.getId());

     }
 }

  */
 /*
 package com.company;

 class MyEmployee{
     private int id;
     private String name;

     public String getName(){
         return name;
     }
     public void setName(String n){
         this.name = n;
     }
     public void setId(int i){
         this.id = i;
     }
     public int getId(){
         return id;
     }
 }
 public class cwh_40_ch9 {
     public static void main(String[] args) {
         MyEmployee harry = new MyEmployee();
         // harry.id = 45;
         // harry.name = "CodeWithHarry"; --> Throws an error due to private access modifier
         harry.setName("CodeWithHarry");
         System.out.println(harry.getName());
         harry.setId(234);
         System.out.println(harry.getId());
     }
 }

  */
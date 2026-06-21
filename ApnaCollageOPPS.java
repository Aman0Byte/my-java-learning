public class ApnaCollageOPPS {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        /*
Pen01 P1 = new Pen01();
//     P1.SetColor("BLUE");
        P1.setColor("Blue");
        System.out.println(P1.getColor());
//        System.out.println(P1.color);
//        P1.SetTip(5);
        P1.setTip(5);
//        System.out.println(P1.tip);
        System.out.println(P1.getTip());
//        P1.color = "Blake";
//        System.out.println(P1.color);

         */
    //    Student s1= new Student();
//        Student s2= new Student("Aman");
//        Student s3= new Student(123);
//        s1.name="aman";
//        s1.roll= 06;
//        s1.password= "abcd";
//        s1.marks[0]= 100;
//        s1.marks[1]= 90;
//        s1.marks[2]= 80;
//        for (int element: s1.marks){
//            System.out.print(element+" ");
//        }
//        Student s2 = new Student(s1);
//        s1.marks[2]= 100;
//           s2.password= "xyz";
////        System.out.println(s2.password);
////        System.out.println(s1.password);
//    for (int i = 0 ; i<3;i++){
//        System.out.print(s2.marks[i]);
//    }
//        for (int element: s1.marks){
//            System.out.print(element+" ");
//        }
//        Shark shark= new Shark();
//        shark.eat();
      //  Mustang myHorse = new Mustang();
        String s = new String("Aman");
        s = s.toUpperCase();
        System.out.println(s);

    }
}
class Pen01{
 private    int tip;
  private   String color;

    public String getColor() {
        return color;
    }

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }

    public void setColor(String color) {
        this.color = color;
    }


    }
class Student{
    String name;
    int roll;
    String password;
    int marks[];
    Student(){
        marks = new int[3];
        System.out.println("I am Constructor ");
    }
    // sallow copy constructor
//    Student(Student s1){
//        marks = new int[3];
//        this.name = s1.name;
//        this.password= s1.password;
//        this.roll= s1.roll;
//        this.marks= s1.marks;
//
//    }
    // deep  constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.password= s1.password;
        this.roll= s1.roll;
        for (int i = 0 ; i<marks.length;i++){
            this.marks[i]= s1.marks[i] ;
        }


    }
    Student (String name){
        marks = new int[3];
        this.name= name;
    }
    Student (int roll){
        marks = new int[3];
        this.roll= roll;
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breaths(){
        System.out.println("breaths");
    }
}
class Shark extends Animal{
    int fins;
    void swim(){
        System.out.println("Shark is swimming");
    }
}
abstract class Animal01{
    Animal01(){
        System.out.println("Constructor of Animal");
    }
    void eat(){
        System.out.println("Animal eats ");
    }
    abstract void walk();
}
class Horse extends Animal01{
    Horse(){
        System.out.println("Constructor of Horse");
    }
    void walk(){
        System.out.println("Walk on 4 legs ");

    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Constructor of Mustang");
    }
}
class Chicken extends Animal01{
    void walk(){
        System.out.println("Walk on 2 legs");
    }
}



/*
class Bank{
   public String userName;
   private String password;
   public void SetPss(String pwd){
       this.password= pwd;
   }
}
 */

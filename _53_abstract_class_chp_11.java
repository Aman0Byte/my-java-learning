 abstract class  Phone1{
    public Phone1(){
        System.out.println("mai ek constructor ho phone 1 ka ");
    }
    public void on(){
        System.out.println("PHONE IS ON....");
    }
    abstract public void ring();
}
class SmartPhone1 extends Phone1{     // <----CONCRETE CLASS
    @Override
    public void ring(){
        System.out.println("PHONE IS RINGING...");
    }
    @Override
    public void on(){
        System.out.println("SmartPHONE IS ON....");
    }
    public void Camara(){
        System.out.println("PHOTO CHECK");
    }
}
 abstract class NewSmartPhone extends Phone1{
    public void Ring(){
        System.out.println("THIS IS NEW RING ");

    }
}

public class _53_abstract_class_chp_11 {
    public static void main(String[] args) {
        SmartPhone1 sp = new SmartPhone1();
       //  Phone1 PH= new Phone();----> error throw
        //NewSmartPhone nsp= new NewSmartPhone(); error throw

    }
}


/*
 public abstract class phone Model {
     abstract void switch off ();
              || more code
 }
 abstract class Phone{
  abstract void on();
}
class SmartPhone extends Phone{
void run(){
System.out.println("Turning on...");
}
public static void main(String args[]){
 Phone obj = new SmartPhone();
 obj.on();
}
}  package com.company;

abstract class Parent2{
    public Parent2(){
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}
public class cwh_53_abstract {
    public static void main(String[] args) {
        //Parent2 p = new Parent2(); -- error
        Child2 c = new Child2();
        //Child3 c3 = new Child3(); -- error
    }
}

 */
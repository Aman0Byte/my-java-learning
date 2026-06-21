class  Phone{
    public void greet(){
        System.out.println("HEY GOOD MORNING");
    }
    public void on(){
        System.out.println("PHONE IS TURNING ON...");
    }
}
class SmartPhone extends Phone{
    public void namstay(){
        System.out.println("HEY GOOD NIGHT");
    }
    @Override
    public void  on(){
        System.out.println("SMART PHONE IS TURNING ON ....");
    }
}
public class _49_Dynamic_method_dispatch {
    public static void main(String[] args) {
   //  Phone obj= new Phone(); // ALLOWED
    // SmartPhone smobj= new SmartPhone();ALLOWED
    // obj.name();
        Phone obj = new SmartPhone();// YES IT IS ALLOWED
      //  SmartPhone obj2= new Phone(); // THIS IS NOT ALLOWED
        obj.greet();
        obj. on();
        //obj.namstay();// THIS IS NOT ALLOWED 
    }
}

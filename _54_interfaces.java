interface  Bicycle{
    int a= 12;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

class AvonCycle implements Bicycle, HornCycle {
    int speed=7;
   public void applyBrake(int decrement){
        speed= speed-decrement;
        System.out.println("Applying brake  ");

    }
    public void  speedUp(int increment){
       speed= speed+increment;
        System.out.println("Applying speed ");
    }
   public void blowHorn3k(){
        System.out.println("SAB TERA ");
    }
   public void blowHorn_mai_hu_na(){
        System.out.println("MAI TENU SAMJHANWA KI ");
    }

}
interface HornCycle{
    void blowHorn3k();
    void blowHorn_mai_hu_na();
}



public class _54_interfaces {
    public static void main(String[] args) {
        AvonCycle amanay= new AvonCycle();
amanay.applyBrake(1);
// You can Create Properties in Interfaces
        System.out.println(amanay.a);
        // You cannot Modify the properties in interfaces as they are final
      //  amanay.a= 546;
      //  System.out.println(amanay.a);
        amanay.blowHorn3k();
        amanay.blowHorn_mai_hu_na();

    }
}

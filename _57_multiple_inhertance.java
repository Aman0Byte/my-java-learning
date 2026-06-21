interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void Greet(){
        System.out.println("Good morning");
    }
  default   void Record4KVideo(){
        Greet();
      System.out.println("Recording in 4K ");
  }

}
interface MyWifi{
    String [] getNetwork();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi,MyCamera{
     public void takeSnap(){
         System.out.println("Taking Snap");
     }
   public void recordVideo(){
        System.out.println("Taking video");
    }
   public String [] getNetwork(){
       System.out.println("Connecting to network ");
       String [] networkList = { "Harry" , "Jio", "WODAPHONE ", "Arital"};
       return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
//   public void Record4KVideo(){
//        System.out.println(" Take Snap and Recording in 4K ");
//    }

}
public class _57_multiple_inhertance {
    public static void main(String[] args) {
MySmartPhone MS = new MySmartPhone();
String [ ] arr= MS.getNetwork();
for(String item : arr){
    System.out.println(item);
}
MS.Record4KVideo();
//MS.Greet(); Throws an error

    }
}

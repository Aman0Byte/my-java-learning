interface MyCamera2{
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
interface MyWifi2{
    String [] getNetwork();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    void callNumber(String phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements MyWifi2,MyCamera2{
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
    public void SampleMeth(){
        System.out.println("I am Method");
    }

}

public class _59_polymorphism {
    public static void main(String[] args) {
MyCamera2 cam1 = new MySmartPhone2(); // This is a smart phone use it as a camera
cam1.Record4KVideo();
MyWifi2 wifi1= new MySmartPhone2();
wifi1.getNetwork();
wifi1.connectToNetwork("Jio");
//cam1.getNetwork();---> Not Allow
//cam1.SampleMeth();---> Not Allow

        MySmartPhone2 sm = new MySmartPhone2();
        sm.SampleMeth();
     sm.getNetwork();
     sm.Record4KVideo();
     sm.callNumber("9793679104");

    }
}

abstract class Pen{
    abstract void write();
    abstract void refill();

}
class FountainPen extends Pen{
    void write(){
        System.out.println("Writing");
    }
    void refill(){
        System.out.println("Refill");
    }
    void ChangNib(){
        System.out.println("Changing the Nib ");
    }
}
class monkey{
    void  jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
}
interface  BasicAnimal{
    void eat();
    void sleep();
}
class Human extends monkey implements BasicAnimal{
    void Speak(){
        System.out.println("Hello sir!");
    }
    @Override
  public   void eat(){
      System.out.println("Eating");
  }
  @Override
    public void sleep(){
        System.out.println("Good night !,  I AM going to sleep");
    }
}
abstract class TalePhone{
    abstract void ring();
    abstract void lift();
    abstract void disConnect();
}
interface  Camera1{
    void takeSnap();
    void recordVideo();

}
interface Network{
    void connectToNetwork();
    void disConnectToNetwork();
}
interface gps{
    void find();
}
class SmartPhone01 extends TalePhone implements Camera1, Network ,gps{
   public void WellCome(){
       System.out.println("WellCome to ");
   }
   public void openLock(){
       System.out.println("Opening the lock of SmartPhone");
   }
   public void ring(){
        System.out.println("Ringing...");
    }
  public   void lift(){
        System.out.println("Please pick Phone ");
    }
    public void disConnect(){
        System.out.println("Signal DisConnect");
    }
  public   void takeSnap(){
      System.out.println("Taking Snap ");
  }
   public void recordVideo(){
       System.out.println("Recording Video");
   }
  public void   connectToNetwork(){
      System.out.println("Connecting to Network");
  }
     public void disConnectToNetwork(){
         System.out.println("DisConnecting to Network ");
     }
    public void find(){
        System.out.println("Finding the Location");
    }

}
interface TVRemote{
    void OnTV();
    void OffTV();
    void VolumeUp();
    void VolumeDown();
    void Change();
}
interface SmartTVRemote extends TVRemote{
    String [] getMenu();
    void  startGame();
    int[] showNumberPad();
}
class Tv implements TVRemote, SmartTVRemote {
    public void OnTV() {
        System.out.println("TV ON");
    }

    public void OffTV() {
        System.out.println("TV OFF");
    }

    public void VolumeUp() {
        System.out.println("Volume is increasing ");
    }

    public void VolumeDown() {
        System.out.println("Volume is Deceasing ");
    }

    public void Change() {
        System.out.println("Changing the Signal ");
    }

    public void startGame() {
        System.out.println("Start Game");
    }

    public int[] showNumberPad() {
        System.out.println("Showing Number Pad");
        int[] pad = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        return pad;

    }
    public String [] getMenu(){
        System.out.println("Connecting to network ");
        String [] menu = { "Youtube" , "Delete Chanel", "OPEN GAME ", "OPEN MUSIC","Restore"};
        return menu;
    }
}



public class _60_practice_chap11 {
    public static void main(String[] args) {

        // Question 1 and 2
        FountainPen fp = new FountainPen();
        fp.ChangNib();
        fp.refill();
        // Question 3
        Human Hu = new Human();
        Hu.sleep();

        // Question 5
        monkey m1 = new Human();
        m1.bite();
        m1.jump();
        // m1.speak(); Throw an error --> Cannot use speak method because the reference is monkey does not have speak method
        BasicAnimal Lavish = new Human();
        Lavish.eat();
        Lavish.sleep();
        //  Lavish.speak();Throw an error

        // Question 4
        gps G = new SmartPhone01();
        G.find();  //--> Here We can only use find Method in GPS
        Network nt = new SmartPhone01();
        nt.disConnectToNetwork();
        // nt.takeSnap(); ---> WE cannot use takeSnap method because the reference is Network and Snap method is not available in Network


        // Question 6
        SmartTVRemote str= new Tv();
        str.VolumeUp();
        TVRemote tr = new Tv();
        tr.OnTV();

    }
}

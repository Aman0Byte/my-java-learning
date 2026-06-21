class  Problem1 extends Thread {

    @Override
    public void run(){
        while (true) {
            System.out.println("GOOD MORNING");
        }
    }
}
class Problem1b extends  Thread{
    @Override
    public void run(){
        while (true){
            try{
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("WELCOME");
        }

    }
}


public class _76_Thread_practice {
    public static void main(String[] args) {
       Problem1 P1 = new Problem1();
       Problem1b P2 = new Problem1b();
      // P1.setPriority(6);
      // P2.setPriority(9);
        System.out.println(P1.getPriority());
        System.out.println(P2.getPriority());
    //   P1.start();
      // P2.start();
    }
}


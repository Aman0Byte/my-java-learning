class  MyThreadRunnable1 implements  Runnable{
    @Override
    public void run() {
        int i =0;
        while(i<300){
            System.out.println("MY Self Thread 1");
            i++;

        }

    }
}
class  MyThreadRunnable2 implements  Runnable{
    @Override
    public void run() {
        int i =0;
        while(i<300){
            System.out.println("MY Self Thread 2");
            i++;

        }

    }
}
public class _71_Thread_meth2 {
    public static void main(String[] args) {
;
     MyThreadRunnable1 m1 = new MyThreadRunnable1();
     MyThreadRunnable2 m2 = new MyThreadRunnable2();
        Thread T1 = new Thread(m1);
        Thread T2 = new Thread(m2);
     T1.start();
     T2.start();


    }
}

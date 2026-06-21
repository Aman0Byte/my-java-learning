class  MyThread1 extends Thread{
    @Override
    public void run() {
        int i =0;
        while (i<300) {
            System.out.println("MY CODING THREAD IS RUNNING ");
            System.out.println("I AM HAPPY ");
        i++;

        }
        }
}
class  MyThread2 extends Thread{
    @Override
    public void run() {
        int i =0;
        while (i<300) {
            System.out.println("MY GAMING THREAD IS RUNNING ");
            System.out.println("I AM NERVOUS ");
            i++;
        }
    }
}




public class _70_creat_thread_1 {
    public static void main(String[] args) {
        MyThread1 TH1= new MyThread1();
        MyThread2 TH2 = new MyThread2();
        TH1.start();
        TH2.start();

    }
}

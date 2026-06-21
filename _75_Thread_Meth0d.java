class  MyNewthre1 extends Thread{
    @Override
    public void run() {
        int i =0;
        while (true) {
            System.out.println("THANK YOU " );
            i++;
            try {
                Thread.sleep(4555);

            } catch (InterruptedException e) {
               e.printStackTrace();
            }


        }
    }
}
class MyNewthre2 extends Thread{
    @Override
    public void run() {
        int i =0;
        while (i< 300) {
            System.out.println("THANK YOU 2 " );

            i++;
        }
    }
}






public class _75_Thread_Meth0d {
    public static void main(String[] args) {
MyNewthre1 t1 = new MyNewthre1();
        MyNewthre2 t2 = new MyNewthre2();
t1.start();
//try {
//    t1.join();
//} catch (Exception e) {
//    System.out.println(e);
//}
t2.start();

    }
}

class  MyThr extends  Thread{
    public MyThr(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("I AM A THREAD ");
    }
}

public class _73_Constructor_thread {
    public static void main(String[] args) {
        MyThr t = new MyThr("AMAN");
        MyThr t2 = new MyThr("SANJANA");
        t.start();
        t2.start();
        System.out.println(t.threadId());
        System.out.println(t2.threadId());
        System.out.println(t.getName());
        System.out.println(t2.getName());



    }
}










class  Mythre extends Thread{
   public Mythre(String name){
       super(name);

   }

    @Override
    public void run() {
       int i =0;
       while (i< 300) {
           System.out.println("THANK YOU " +this.getName());
           i++;
       }

    }

}


public class _74_Thread_Priorities {
    public static void main(String[] args) {
        Mythre mythre1 = new Mythre("AMAN");
        Mythre mythre2 = new Mythre("TUFEL");
        Mythre mythre3 = new Mythre("AKASH");
        Mythre mythre4 = new Mythre("VIKASH");
        Mythre mythre5 = new Mythre("AMAN JI (MY SELF)");
        mythre5.setPriority(Thread.MAX_PRIORITY);
        mythre1.setPriority(Thread. MIN_PRIORITY);
        mythre3.setPriority(Thread.MIN_PRIORITY);
        mythre2.setPriority(Thread.MIN_PRIORITY);
        mythre4.setPriority(Thread.NORM_PRIORITY);
        mythre1.start();
        mythre2.start();
        mythre3.start();
        mythre4.start();
        mythre5.start();

    }
}

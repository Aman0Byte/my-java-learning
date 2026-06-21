class  A{
    public int a;
    public int aman(){
        return 50;
    }
    public void meth2(){
        System.out.println("HEY I AM METHOD 2 OF THE CLASS A ");
    }
}
 class B extends A{
     @Override
     public void meth2(){
         System.out.println("HEY I AM METHOD 2 OF THE CLASS B");
     }
    public void meth3(){
        System.out.println("HEY I AM METHOD 3 OF THE CLASS B ");
    }
 }


public class _48_method_overriding {
    public static void main(String[] args) {
        A  a= new A();
     B b = new B();
     a.meth2();
     b.meth2();
    }
}

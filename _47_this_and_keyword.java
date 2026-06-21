class EkClass{
int a;
EkClass(int a){
   this.a = a;
}
public int returnone(){
    return 1;
}

    public int getA() {
        return a;
    }
}
 class DoClass extends EkClass{

    DoClass(int c){
        super(c);
        System.out.println("I AM A CONSTRUCTOR ");
    }

 }
public class _47_this_and_keyword {
    public static void main(String[] args) {
EkClass  ek = new EkClass(5);
DoClass d = new DoClass(8);
        System.out.println(ek.getA());
    }
}

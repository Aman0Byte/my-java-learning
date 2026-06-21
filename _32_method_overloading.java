import java.util.Scanner;

public class _32_method_overloading {
    static void change2(int [] arr){
        arr[0]= 90;
    }
    static void change(int a){
        a= 90;
    }
    static void tellJoke(){
        System.out.println("पप्पू- मंदिर में पुरुष ही पुजारी क्यों होते हैं?\n गप्पू ने दिया दिमाग घूमा देने वाला जवाब");
    }
    static void foo(){
        System.out.println("Good Morning bro ");
    }
    static void foo(int a){ // Parameter
        System.out.println("Good Morning " + a +" bro");
    }

    public static void main(String[] args) {
        // tellJoke();
         int [] marks= { 52,34,5,55,66};
         // ch
         // CASE : Changing the Integer
      //  int x=45;
      //  change(x);
      //  System.out.println("The value of x after running change is:" + x);
        // CASE : Changing the Array
       // change2(marks);
       // System.out.println("The value of x after running change is:" + marks[0]);

        // Method overloading
        Scanner sc= new Scanner(System.in);
        foo();
        int b= sc.nextInt();
        foo( b); // Argument

    }
}

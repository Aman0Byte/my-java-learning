import java.util.Scanner;

class MyNegativeException extends  Exception{
    @Override
    public String getMessage() {
        return "Radios can not be negative ";
    }

    @Override
    public String toString() {
        return "Radios can not be negative";
    }
}
public class _84_Throw_Throws {
    public static int divide(int a , int b) throws ArithmeticException {
        int result = a/b;
        return  result;

    }
    public static double area(int r) throws MyNegativeException{
       if (r<0) {
           throw new MyNegativeException();
       }
        double result = Math.PI*r*r;
        return result;
    }







    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int c , b, a;
//        System.out.println("ENTER THE A AND B");
//        try {
//            c= divide(a= sc.nextInt(), b= sc.nextInt());
//            System.out.println("THE RESULT IS :"+c);
//        } catch (ArithmeticException e) {
//            System.out.println("YOUR INPUT PRODUCE AN EXCEPTION");
//        }
        int r;
try {
    double ar = area(r= sc.nextInt());
    System.out.println(ar);
}catch (Exception e){
    System.out.println("Sorry you enter  wrong radios  ");
}




    }
}

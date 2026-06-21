import java.util.Scanner;

public class _34_recursion_ {
    //    static int fact(int a){
//        if (a==0){
//            return 1;
//        }
//        else {
//            return a*fact(a-1);
//        }
//    }
  public   static void fibonacci(int x) {
       int [] num= new int[x];
       num[0]= 0;
       num[1]=1;
        System.out.printf("%d %d ",num[0],num[1]);
        for (int i=2;i<x;i++){
            num[i]=num[i-1]+num[i-2];
            System.out.printf("%d ",num[i]);
        }
    }
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
        System.out.println("Hey Dear enter n  ");
     int n= sc.nextInt();
//        int result= fact(x);
//        System.out.println("HERE IS YOUR ANSWER -->"+" "+result);
        fibonacci(n);
    }
}

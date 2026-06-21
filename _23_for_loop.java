import java.awt.*;
import java.awt.desktop.PrintFilesEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class _23_for_loop {
    public static void pattern01(int n){
        for (int i =1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern02(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern03(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern04(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void pattern05(int n) {
        for (int i = 1; i <= n; i++) {
         for (int j=1; j<=(n-i+1);j++){
             System.out.print("*");
         }
            System.out.println();
        }
    }
    public static void pattern06(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j=1; j<=(n-i+1);j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern07(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j=0; j<n-i-1;j++){
                System.out.print(" ");
            }

            // star
           for (int j=0; j<2*i+1;j++){
               System.out.print("*");
           }

            for (int j=0; j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();

            // space
        }
    }
    public static void pattern08(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j=0; j<i;j++){
                System.out.print(" ");
            }

            // star
            for (int j=0; j<2*n-(2*i+1);j++){
                System.out.print("*");
            }


            // space
            for (int j=0; j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern10(int n){
        for (int i=1;i<=2*n-1;i++){
            int star =i;
            if (i>n) star= 2*n-i;
            for (int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
public static void pattern11(int n){
        int start=1;
        for (int i=0 ;i<n;i++){
            if (i%2==0) start=1;
            else start=0;
            for (int j=0;j<=i;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
}
public static void pattern12(int n){
        int space = 2*(n-1);
        for (int i=1;i<=n;i++){
            // number
            for (int j =1;j<=i;j++){
                System.out.print(j);
            }

            // space
            for (int j=1;j<=space;j++){
                System.out.print(" ");
            }

            // number
            for (int j =i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            space-=2;
        }
}
public static void pattern13(int n){
        int count=1;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(count+++" ");
        }
        System.out.println();
    }
}
    public static void pattern14(int n){
        for (int i = 1; i < n; i++) {
         for (char c= 'A'; c<'A'+i;c++){
             System.out.print(c);
         }
            System.out.println();
        }
    }
    public static void pattern15(int n){
        for (int i = 0; i < n; i++) {
            for (char c= 'A'; c<='A'+(n-i-1);c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void pattern16(int n){
        for (int i = 0; i < n; i++) {
            char c = (char) ('A'+i);
            for (int j=0;j<=i;j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
public static void fun(int i, int n){
        if (i>n) return;
        fun(i+1,n);
    System.out.println(i);
}
public static boolean fun1(int i, String st){
        if (i>=st.length()/2) return true;
        if (st.charAt(i)!=st.charAt(st.length()-i-1)) return false;
        return fun1(i+1, st);

}
  public static void PrintSub(int i, List<Integer> list, int arr[], int n ){
        if (i==n){
                System.out.print(list);
            System.out.println();
            return;
        }
      PrintSub(i+1, list, arr,n);
            list.add(arr[i]);
      PrintSub(i+1, list, arr,n);
            list.removeLast();

        }
public static void patternButter(int n){
        for (int i=1 ; i<=n;i++){
            // Star
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            // Space
            for(int k= 1; k<=2*(n-i);k++){
                System.out.print(" ");
            }
            // Star
            for (int l= 1; l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    for (int i=n; i>=1;i--){
        // Star
        for (int j=1;j<=i;j++){
            System.out.print("*");
        }
        // Space
        for(int k= 1; k<=2*(n-i);k++){
            System.out.print(" ");
        }
        // Star
        for (int l= 1; l<=i;l++){
            System.out.print("*");
        }
        System.out.println();
    }

}


    public static void main(String[] args) {
    // pattern01(5);
   // pattern02(5);
//    pattern03(5);
//   pattern07(5);
//  pattern08(5);
       // pattern11(5);
//        pattern16(5);
//        Scanner scanner = new Scanner(System.in);
//        int n= scanner.nextInt();
//        int digit = (int)Math.log10(n)+1;
//        System.out.println(digit);
//        fun(1,3);
//        System.out.println(fun1(0,"111"));
//        List<Integer> list = new ArrayList<>();
//        int arr[]= {3,1,2};
//        PrintSub(0,list,arr,3);
//
        patternButter(4);







    }
}


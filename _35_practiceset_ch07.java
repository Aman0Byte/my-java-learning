import java.util.Scanner;
public class _35_practiceset_ch07 {
  /*  static void multiplication(int x){
        for (int i=1 ; i<=10;i++){
            System.out.printf("%d X %d = %d\n",x,i,x*i);
        }
    }
    static void pattern1(int x){
        for (int i=1; i<=x;i++){
            for (int j=1; j<=i;j++){
                System.out.printf("* ");
            }
            System.out.printf("\n");
        }
    }*/
    static int sumrec(int a){
        if (a==1)
            return 1;
        else
            return a+sumrec(a-1);
    }
    static void pattern2(int x){
        for (int i=1; i<=x;i++){
            for (int j=i; j<=x;j++){
                System.out.printf("* ");
            }
            System.out.printf("\n");
        }
    }
    static int fib(int x){
        /*if (x==1){
            return 0;
        } else if (x==2) {
            return 1;
        }*/
        if (x==1  || x==2)
            return x-1;
        else
            return fib(x-1)+fib(x-2);
    }
    static  double average(double...numbers){
        if (numbers.length==0){
            return 0.0;
        }
        double sum=0;
        for(double number: numbers){
           sum +=number;
        }
        return  sum/ numbers.length;
    }
    static void pattern_rec(int x){
        if (x>0){
            for (int i=1; i<=x;i++){
                System.out.print("*");
            }
            System.out.println();
            pattern_rec(x-1);
        }
    }
    static void pattern_rec2(int x){
        if (x>0){
            pattern_rec2(x-1);
            for (int i=0; i<x;i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static int sumnatural(int x){
        int sum=0 ;
        for (int i=1;i<=x;i++){
            sum +=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        // Problem 1
        Scanner sc= new Scanner(System.in);
     //  System.out.println("Which numbers of Table you want ");
        System.out.println("Please enter the number ");
        int n= sc.nextInt();
        //multiplication(n);

        // Problem 2
       // pattern1(n);

        // Problem 3
     //  int result= sumrec(n);
      //  System.out.println(result);

        // problem 4
//pattern2(n);

// Problem 5
      //  int result = fib(n);
      //  System.out.println(result);
        // Problem 6
     //    System.out.println("The avg of 1,2,3,4,5 is:  " + average(1,2,3,4,5));
       //  System.out.println("The avg of 1,2,3,4,5,6 is:" + average(1,2,3,4,5,6));
         //System.out.println("The avg of " + average(2,3,4,5));

// Problem 7
       // pattern_rec(n);
//    Problem 8
        // pattern_rec2(n);
        // Problem 9
//        System.out.println("ENTER THE CELSIUS ");
//        int C= sc.nextInt();
//        float f = (C*(9/5.f))+32;
//        System.out.println(f);
        // Problem 10
        int result = sumnatural(n);
        System.out.println(result);

    }
}

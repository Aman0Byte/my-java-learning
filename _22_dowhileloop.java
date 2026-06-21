import java.util.Scanner;

public class _22_dowhileloop {
    public static void main(String[] args) {
//        int i =1 ;
//        do{
//            System.out.println(i);
//            i++;
//        }while (i<5);
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=1;
        do{
            System.out.println(b);
            b++;
        }while (b<=a);

    }
}

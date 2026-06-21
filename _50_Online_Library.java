import java.util.Arrays;
import java.util.Scanner;

class  Check{
            public int Find(int [] arr){
                int n = arr.length;
                Arrays.sort(arr);
      return arr[n-2];
            }
        }
public class _50_Online_Library {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int n;
        System.out.println("ENTER THE SIZE OF ARRAY");
       n= sc.nextInt();
       int []  arr= new int [n];
        System.out.println("ENTER THE ELEMENT OF ARRAY ");
       for (int i =0 ; i<n;i++){
           arr[i]= sc.nextInt();

       }

       Check ck= new Check();
        System.out.println("SECOND LARGE NUMBER IS " + +ck.Find(arr));

    }
}

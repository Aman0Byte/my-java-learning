import java.util.Scanner;

public class _81_Spefic_Exception {
    public static void main(String[] args) {
        int mark[] = new int[3];
        mark[0] = 5;
        mark[1] = 5;
        mark[2] = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Index of Array ");
        int index = sc.nextInt();
        System.out.println("Enter the number you want to divide with the value ");
        int num = sc.nextInt();
        try {
            System.out.println("The value of array index is "+index);
            System.out.println("The result of the divide of arr- index / number is: "+mark[index]/num);
        } catch (   ArithmeticException e) {
            System.out.println(" ArithmeticException Occurred ");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Occurred");
        }
        catch (Exception e){
            System.out.println("ANY OTHER EXCEPTION OCCURRED ");
        }
    } 
}
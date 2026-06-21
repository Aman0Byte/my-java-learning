import java.util.Scanner;

public class _82_nested_try
{
    public static void main(String[] args) {
        int mark[] = new int[3];
        mark[0] = 5;
        mark[1] = 5;
        mark[2] = 5;
        Scanner sc = new Scanner(System.in);
int ind ;
        boolean take = true;
        while (take) {
            System.out.println("GIVE THE INDEX AGAIN ");
             ind =  sc.nextInt();
            try {
                System.out.println("WELCOME TO VIDEO NUMBER 82 ");
                try {
                    System.out.println(mark[ind]);
                    take = false;

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("SORRY THIS INDEX DOES NOT EXIST ");
                    System.out.println("Exception in level 2 ");
                }

            }   catch (Exception e) {
                System.out.println("Exception in level 1");
            }

        }
        System.out.println("THANKS FOR USING THIS PROGRAM ");

    }
}

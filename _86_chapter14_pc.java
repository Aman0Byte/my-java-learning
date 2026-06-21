import java.util.Scanner;
class  MaxRiseException extends Exception {
    @Override
    public String getMessage() {
        return "ERROR";
        
    }

    @Override
    public String toString() {
        System.out.println("error");
        return "error";
    }
}

public class _86_chapter14_pc {
    public static int area(int a , int b){
        int result = a+b;
        return result;
    }
    public static void throwexception(int i) throws  MaxRiseException {
        if (i>=5){
            throw new  MaxRiseException();
        }
    }
    public static void main(String[] args) {
        // int a = 5 ---->SYNTAX ERROR
//        int area =  area(4,5); // ----> Logical error , here we calculate area but we use the add sin on the place of multiply
//        System.out.println(5/0); //---- runtime error

        // here we are  going to create exception

        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter the value of a and a b");
//        int a = sc.nextInt();
//        int b= sc.nextInt();
//        try{
//            System.out.println(a/b);
//        }catch (ArithmeticException e){
//            System.out.println("HAHA");
//        }catch (IllegalArgumentException e){
//            System.out.println("HEHE");
//        }
            int [] arr = new int[5];
        System.out.println("Please enter the element of array ");
      for (int a :arr){
          arr[a]=sc.nextInt();
      }
      int index;
      boolean flage = true;
      int i= 1;
      while (flage && i<6){
          try {
              System.out.println("Please enter the value of index ");
              index = sc.nextInt();
              System.out.println("The value of arr[index] is :" +arr[index]);
              flage = false;
          }catch (Exception e){
              System.out.println("Invalid Input ");
              i++;
          }
      }
//        if (i>=5)
//            System.out.println("Error");

        // Question 4

//      if (i>=5)
//          try {
//              throw new MaxRiseException();
//          }catch (Exception e){
//              System.out.println("ERROR DUE TO INVALID INDEX");
//          }

        if(i>=5){
            try{
                throwexception(i);
            }
            catch(MaxRiseException e){
                System.out.println("\n"+e.getMessage());
            }
        }


    }
}

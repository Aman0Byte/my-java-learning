import java.util.Scanner;

class MyException extends  Exception{
    @Override
    public String getMessage() {
        return "I am getMessage()";
    }

    @Override
    public String toString() {
        return "I am toString()";
    }
}

class MyException1 extends  Exception{
    @Override
    public String getMessage() {
        return "Make sure that the value of age correct ";
    }

    @Override
    public String toString() {
        return "Age cannot be grater then 125";
    }
}



public class _83_Exception_class {
    public static void main(String[] args) {
        System.out.println(args);
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        if (a<10){
            try {
                throw new  MyException();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }
        }
        int age = scanner.nextInt();
        if (age>125 &age<0){
            try {
                throw new MyException1();
            }catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
            }
        }
        else {
            System.out.println("YOU ARE ELIGIBLE :");
        }
        }
}
public class _85_finally
{
    public static int divide(){
        int a= 5;
        int b= 2, c;
        try {
            c = a/b;

return c;
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("I AM A FINALLY BLOCK IN FUNCTION ");
        }
        return 0;
    }





    public static void main(String[] args) {
   int k =    divide();
   int b = 9;
   int a = 27;
        System.out.println(k);
        while (true){
            try {
                System.out.println(a/b);
            }catch (Exception e){
                System.out.println(e);
                break;
            }
  finally {
                System.out.println("I AM  FINALLY BLOCK WITH VALUE OF B" +b);
            }
            b--;
        }
        try {
            System.out.println(50/0);
        }
        finally {
            System.out.println("I am finally ");
        }
    }
}

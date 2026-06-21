public class _80_Try_Catch {
    public static void main(String[] args) {
//        String invalidStr = "abc";
//        try {
//            int num = Integer.parseInt(invalidStr);
//            System.out.println(num);
//        } catch (NumberFormatException e) {
//            System.out.println("Invalid input: " + e.getMessage());
//        }
// Output: Invalid input: For input string: "abc"
        String s = "12345";

        // Convert the string to an integer
        // using Integer.parseInt()
        int n = Integer.parseInt(s);

        System.out.println("" + n);

         int a = 5000;
         int w = 0;
         try {
             int result = a / w;
             System.out.println("The Result is " + result);
         } catch (RuntimeException e) {
             System.out.println("We failed to Divide Reason  :");
             System.out.println(e);
         }
        System.out.println("End of code ");
    }

}

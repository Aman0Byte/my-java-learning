import java.util.HashSet;

public class DecToBin {
//    public static void DecToBinary(int dec){
//        int myNum= dec;
//        int power=0;
//        int bin= 0;
//        while (dec>0){
//            int rem = dec%2;
//            bin = bin+ (rem *(int)Math.pow(10, power));
//            power++;
//            dec= dec/2;
//        }
//        System.out.println("The Binary of "+myNum +"= "+bin);
//    }

//    public static void hollow_rectangle(int totRow , int totcol){
//        for (int i = 1; i<=totRow ; i++){
//            for (int j= 1; j<= totcol; j++){
//                if (i==1|| i==totRow || j==1 || j==totcol)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
    //}
//
//    public static  void inverted_half_pyramid(int n){
//        for (int i= 1; i<=n ; i++){
//            for (int j= 1; j<=(n-i);j++){
//                System.out.print(" ");
//            }
//            for (int j= 1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    //    public static  void inverted_half_numPyramid(int n){
//        for (int i= 1; i<=n ; i++){
//            for (int j= 1; j<=(n-i+1);j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//public static  void floyds(int n){
//    int count = 1;
//    for (int i= 1; i<=n ; i++){
//        for (int j= 1; j<=i;j++){
//            System.out.print(count++ +" ");
//        }
//        System.out.println();
//    }
//}
//public static  void zero_one_pattern(int n){
//    for (int i= 1; i<=n ; i++){
//        for (int j= 1; j<=i;j++){
//           if((i+j)%2==0)
//               System.out.print("1");
//           else
//               System.out.print("0");
//        }
//        System.out.println();
//    }
//}
//    public static void butterfly(int n) {
//        for (int i = 1; i <= n; i++) {
//            // star -i
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            // spaces - 2*(n-i)
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print(" ");
//            }
//            // Star -i
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = n; i >= 1; i--) {
//            // star -i
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            // spaces - 2*(n-i)
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print(" ");
//            }
//            // Star -i
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    public static  void solidRhombus(int n){
//        for (int i= 1; i<=n ;i++){
//            for (int j= 1 ; j<=n-i ;j++){
//                System.out.print(" ");
//            }
//            for (int j =1 ;j <=n;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//    }
//    public  static  void hollow_Rhombus(int n){
//        for (int i= 1; i<=n ;i++) {
//            // Spaces n-i
//            for (int j = 1; j <= (n - i); j++) {
//                System.out.print(" ");
//            }
//            // hollow Rectangle
//            for (int j= 1; j<=n;j++){
//                if (i==1|| i==n|| j==1 ||j==n)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
    public static void pattern(int n){
        for(int i = 1;i<=n;i++){
            // space (n-1-i)
            for(int j = 1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k= 1;k<=n;k++){
                System.out.print("$");
            }
            System.out.println();
        }
    }
//    public  static void diamond(int n){
//        for (int i = 1 ; i<=n;i++){
//            // space (n-i)
//            for (int j= 1 ;j<=(n-i); j++){
//                System.out.print(" ");
//            }
//            // star i
//            for (int j= 1 ; j<=2*i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = n ; i>=1;i--){
//            // space (n-i)
//            for (int j= 1 ;j<=(n-i); j++){
//                System.out.print(" ");
//            }
//            // star i
//            for (int j= 1 ; j<=2*i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//public  static void palindromic(int n){
//    for (int i = 1; i<=n; i++){
//        // space n-i
//        for (int j = 1; j<=n-i;j++){
//            System.out.print(" ");
//        }
//        // decending
//        for (int j = i ; j>=1;j--){
//            System.out.print(j);
//        }
//        // acceding
//        for (int j = 2 ; j<=i;j++){
//            System.out.print(j);
//        }
//        System.out.println();
//    }
//}
    public static boolean containsDuplicate(int [] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
if (set.contains(nums[i]))
    return true;
else
    set.add(nums[i]);

        }
return false;
    }
    public static void main(String[] args) {
//DecToBinary(7);
        // hollow_rectangle(4,4);
        //   inverted_half_pyramid(5);
        //  inverted_half_numPyramid(5);
        //   floyds(5);
        //   zero_one_pattern(5);
      //  butterfly(4);
      //  solidRhombus(5);
       // hollow_Rhombus(5);
     //   diamond(5);
     //   palindromic(5);
//        int nums[ ] ={1,2,3,1};
        pattern(5);
//        System.out.println(nums.length);
//        System.out.println(containsDuplicate(nums));
    }

}
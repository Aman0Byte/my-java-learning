import java.util.Arrays;

public class _String {
    // Check the Given String is Palindrome or not
    public static boolean isPalindrome(String string){
        int n = string.length();
        for (int i= 0 ;i<string.length();i++){
            if (string.charAt(i)!=string.charAt(n-1-i))
                return false;
        }
        return true;
    }
     public static float getShortPath(String path){
        int x =0 , y=0 ;
        for (int i =0 ;i<path.length();i++){
            char dir = path.charAt(i);
            if (dir=='W')
                x--;
            else if (dir=='E')
                x++;
            else if (dir=='N')
                y++;
            else
                y--;
        }
        int X2 = x*x;
        int Y2= y*y;
        return (float) Math.sqrt(X2+Y2);
     }
     // Printing the subString
    public static String subStrint(String  string, int si , int ei){
     String subString = "";
        for (int i =si;i<ei;i++){
            subString+= string.charAt(i);
        }
        return subString;

    }

public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i =1 ; i<str.length();i++){
            if (str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else
                sb.append(str.charAt(i));
        }
        return sb.toString();
}
public static String compressed(String str){
        StringBuilder sb = new StringBuilder("");
        for (int i =0 ; i<str.length();i++){
            Integer count =1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
}
public static int countVowel(String string){
        int count =0;
        for (int i =0 ; i<string.length();i++){
            if (string.charAt(i)=='a'||string.charAt(i)=='e'||string.charAt(i)=='i'||string.charAt(i)=='o'||string.charAt(i)=='u')
                count++;
        }
        return count;
}
 public static boolean anagram(String string1, String string2){
        string1 = string1.toUpperCase();
        string2 = string2.toUpperCase();
        if (string1.length()==string2.length()){
            char [] str1Array  = string1.toCharArray();
            char [] str2Array = string2.toCharArray();
            Arrays.sort(str1Array);
            Arrays.sort(str2Array);
            boolean result = Arrays.equals(str1Array,str2Array);
            if (result){
                System.out.println("The "+string1+"And "+string2+" Both are Anagram");
                return true;
            }
            else {
                System.out.println("The String " + string1+" and " + string2 + " are Not Anagram");
                return false;
            }
        }
        else {
            System.out.println("The String "+string1+" and "+string2+" are Not Anagram");
            return false;
        }
 }
    public static void main(String[] args) {
        // Strings are immutable
        // Concatenate
//        String  str = "AMAN";
//        String str1 = " AGRAHARI";
//        str1 = str +" "+str1;
//        System.out.println(str1);
//
//        System.out.println(str1.substring(0,2));
//        System.out.println(isPalindrome("noon"));
     //  float path=   getShortPath("WNEENESENNN");
        //System.out.println(path);
       // System.out.println( subStrint(str,0,3 ));
        //  Largest String Printing
        // time complexity is O(X*n)
//        String fruits[] = { "apple", "mango","banana"};
//        String laegrst = fruits[0];
//        for (int i = 1; i<fruits.length;i++){
//            if (laegrst.compareToIgnoreCase(fruits[i])<0){
//                laegrst = fruits[i];
//            }
//        }
//        System.out.println(laegrst);
//        String s = "hi, my name is aman";
//        System.out.println(toUpperCase(s));
//        String string = "aaabbbccc";
//        System.out.println(compressed(string));
       // System.out.println(countVowel("aman"));
        System.out.println(anagram("race", "care"));
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _BitManipulation {
    public static void oddOrEven(int n ){
        int bitMask = 1;
        if ((n&bitMask)==0){
            System.out.println("Even");
        }
        else
            System.out.println("Odd");
    }
    public  static int getIthBit(int num , int i){
        int Bitmask = 1<<i;
        if ((num&Bitmask)==0) return 0;
        else return 1;
    }
    public static int setIthBit(int num ,int i ){
        int Bitmask = 1<<i;
        return num | Bitmask;
    }
    public static int clearIthBit(int num ,int i){
        int Bitmask = ~(1<<i);
        return num & Bitmask;
    }
    public static int updateIthBit(int n, int i , int NewBit){
//        if (NewBit==1) return setIthBit(n,i);
//        else return clearIthBit(n,i);
        n = clearIthBit(n,i);
        int Bitmask = NewBit<<i;
        return  n| Bitmask;

    }
    public static boolean isPowerOfTwo(int n){
        return  (n&(n-1))==0;
    }
    public static int countSetBits(int n){
        int count = 0;
        while (n>0){
            if ((n&1)==1){
        count++;
    }
    n= n>>1;
}
        return count;
    }
public static int fastExponentiation(int a, int n){
    int ans =1;
    while (n>0){
        if ((n&1)==1){
            ans = ans*a;
        }
        a= a*a;
        n=n>>1;
    }
    return ans;
}
public  static int one_Ap(int arr[]){
        int n = arr.length;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i=0; i<n;i++){
        int key= arr[i];
        int freq= 0;
        if (map.containsKey(key))freq= map.get(key);
        freq++;
        map.put(key,freq);
    }
    for (Map.Entry<Integer, Integer> integerEntry: map.entrySet()){
        if (integerEntry.getValue()==1) return integerEntry.getKey();
    }
    return -1;
}
    public  static int one_Ap1(int arr[]){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> integerEntry: map.entrySet()){
            if (integerEntry.getValue()==1) return integerEntry.getKey();
        }
        return -1;
    }


    public static void main(String[] args) {
       // oddOrEven(3);
//        System.out.println(getIthBit(10,2));
//        System.out.println(setIthBit(10,2));
//        System.out.println(clearIthBit(10,1));
//        System.out.println(updateIthBit(10,1,1));
//        System.out.println(isPowerOfTwo(8));
        //System.out.println(countSetBits(10));
//        System.out.println(fastExponentiation(5,3));
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please Enter A Number ");
//        int n = scanner.nextInt();
//        System.out.println(n+"+"+1+"is"+-~n);
//        for (char ch = 'A'; ch<='Z' ; ch++){
//            System.out.println((char) (ch  & '_'));
//        }
        int arr[]= { 1,1,2,3,3,4,4};
      int b=  one_Ap1(arr);
        System.out.println(b);
    }
}

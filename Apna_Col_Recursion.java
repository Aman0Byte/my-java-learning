import javax.lang.model.element.Element;
import java.util.*;

public class Apna_Col_Recursion {
    public static void printDec(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDec(n-1);
    }
    public static void printInc(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.println(n);

    }
    public static int fact(int n){
        if (n==1|| n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static int   calSum(int n){
        if (n==1){
            return 1;
        }
        return n+calSum(n-1);
    }
    public static int fib(int n){
        if (n==1 || n==0){
            return  n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static boolean isSorted(int a[], int i){
        if (i==a.length-1){
            return true;
        }
        if (a[i]>a[i+1]){
            return false;
        }
        return isSorted(a, i+1);
    }
    public static int firstOcc(int a[], int Key, int i){
        if (i==a.length) return -1;
        if (a[i]==Key) return i;
        return firstOcc(a, Key, i+1);
    }
    public static int lastOcc(int a[], int Key, int i) {
        if (i == a.length) return -1;
        int IsFound = lastOcc(a, Key,i+1 );
        if (IsFound==-1 && a[i]==Key) return i;

        return IsFound;

    }
    public static int power(int a, int n){
        if (n==0) return  1;
        return a*power(a, n-1);
    }
    public static int optimizedPower(int a, int n){
        if (n==0) return  1;
        int halfPower= optimizedPower(a, n/2);
        int halfPowerSq= halfPower*halfPower;
        if (n%2!=0) halfPowerSq = a*halfPowerSq;
        return halfPowerSq;
    }
    public static int tillingProblem(int n){
      // Base case
        if (n==0 || n==1) return 1;
        // Work
        // Vertically place
        int fnm1 =  tillingProblem(n-1);
        // Horizontal place
        int fnm2 = tillingProblem(n-2);
        // ways
        int ways = fnm1+fnm2;

        return ways;


    }
    public static void  removeDub(String str, int index, StringBuilder newString,boolean [] map )
    {
        if (index==str.length()){
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(index);
        if (map[currentChar - 'a']==true){
            removeDub(str, index+1, newString, map);
        }
        else {
            map[currentChar-'a']=true;
            newString.append(currentChar);
            removeDub(str, index+1, newString, map);
        }
    }
    public static int friendsParing(int n){
        if (n==1|| n==2){
            return n;
        }
        // kaaam
        // Single
        int fnm1= friendsParing(n-1);
        // pair
        int fnm2= friendsParing(n-2);
        int pairChoice = (n-1)*fnm2;
        int totalWays =  fnm1 +pairChoice;
       return totalWays;
    }
    public static void printBinStrings(int n, int lastPlace, String str){
        if (n==0){
            System.out.println(str);
            return;
        }
        printBinStrings(n-1, 0, str+"0");
        if (lastPlace==0){
            printBinStrings(n-1, 1, str+"1");
        }
    }
public static void question1(int []arr, int index , int key){
        if (index==arr.length) return;
        if (arr[index]==key)
            System.out.print(index+" ");
        question1(arr, index+1, key);

}
static  String [] digit = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void question2(int num){
        if (num==0) return;
        int lastDigit= num%10;
        question2(num/10);
        System.out.print(digit[lastDigit]);
    }
    public static int question(String str){
        if (str.length()==0) return 0;
        return question(str.substring(1))+1;
    }
    public static void printFun(int n){
        if (n<1){
            return;
        }
        System.out.println(n);
        printFun(n-1);
    }
    public static void reversArray(int[] array, int l,int r){
    while (l<=(array.length)/2){
        int temp= array[l];
        array[l]= array[array.length-l-1];
        array[array.length-l-1]= temp;
        l++;
    }
    }
    public static void printSub(int ind, ArrayList<Integer> arrayList, int arr[],int n,int sum){
        if (ind>=n){

            System.out.println(arrayList+"-->"+sum);
            return;

        }
        // Take or pick the particular element in subsequences
        arrayList.addLast(arr[ind]);
        printSub(ind+1,arrayList,arr,n,sum+arr[ind]);
        arrayList.removeLast();
        // Not Take or Not pick the particular element in subsequences
       printSub(ind+1,arrayList,arr,n,sum);
    }
    public static boolean printAnySub(int ind, ArrayList<Integer> arrayList, int arr[],int n,int sum,int k){
        if (ind==n){
            // Condition Satisfied
            if (sum==k){
                System.out.println(arrayList);
                return true;}
            // condition not satisfied
            else
                return false;

        }
        // Take or pick the particular element in subsequences
        arrayList.addLast(arr[ind]);
        sum +=arr[ind];
        if(printAnySub(ind+1,arrayList,arr,n,sum,k)==true) return true;
        arrayList.removeLast();
        sum -=arr[ind];
        // Not Take or Not pick the particular element in subsequences
        if(printAnySub(ind+1,arrayList,arr,n,sum,k)==true) return true;

        return false;
    }
    public static void printSunSub(int ind, ArrayList<Integer> arrayList, int arr[],int n,int sum,int k){
        if (ind==n){
            // Condition Satisfied
            if (sum==k){
                System.out.println(arrayList);
                return;
            }
            return;
            // condition not satisfied
        }
        // Take or pick the particular element in subsequences
        arrayList.addLast(arr[ind]);
        sum +=arr[ind];
       printSunSub(ind+1,arrayList,arr,n,sum,k);
        arrayList.removeLast();
        sum -=arr[ind];
        // Not Take or Not pick the particular element in subsequences
        printSunSub(ind+1,arrayList,arr,n,sum,k);

    }
    public static int printSubCount(int ind, int arr[],int n,int sum,int k){
        if (ind==n){
            // Condition Satisfied
            if (sum==k){
                return 1;}
            // condition not satisfied
            else
                return 0;

        }
        // Take or pick the particular element in subsequences
        sum +=arr[ind];
        int l=printSubCount(ind+1,arr,n,sum,k);
        sum -=arr[ind];
        // Not Take or Not pick the particular element in subsequences
       int r= printSubCount(ind+1,arr,n,sum,k);

        return l+r;
    }
    public static void quickSort(int arr[], int low, int high){
        if (low<high){
            int pivot= partison(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }
    public static int partison(int arr[], int low, int high){
        int Pivot= arr[low];
        int i= low;
        int j= high;
        while (i<j) {
            while (arr[i] <=Pivot && i <= high-1) i++;
            while (arr[j] >Pivot && j >= low+1) j--;
            if (i < j){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }
        int Temp= arr[low];
        arr[low]= arr[j];
        arr[j]= Temp;
        return j;
    }
    public static void findCombination(int ind, int arr[], int target,List<List<Integer>> ans, List<Integer>ds ){
        if (ind==arr.length){
            if (target==0){
                ans.add(new ArrayList<>());
                System.out.print(ds);
            }
            return;
        }
        if (arr[ind]<=target){
            ds.add(arr[ind]);
            findCombination(ind,arr,target-arr[ind],ans,ds);
            ds.remove(ds.size()-1);
        }
        findCombination(ind+1,arr,target,ans,ds);

    }
    public static List<List<Integer>> combination(int []candidates, int target){
        List<List<Integer>> ans= new ArrayList<>();
        findCombination(0,candidates,target,ans,new ArrayList<>());
        return ans;

    }
    public static void funSum(int ind,int sum,ArrayList<Integer> arr, ArrayList<Integer> ans ){
        if(ind==arr.size()){
            ans.add(sum);
            return;
        }
        funSum(ind+1,sum+arr.get(ind),arr,ans);
        funSum(ind+1,sum,arr,ans);
    }
    public static ArrayList<Integer> subSet1(ArrayList<Integer> arr){
        ArrayList<Integer> ans= new ArrayList<>();
        funSum(0,0,arr,ans);
        Collections.sort(arr);
        return ans;
    }
    public static void main(String[] args) {
      /*
         printDec(5);
        printInc(5);
        System.out.println(calSum(5));
         System.out.println(fact(5));
               System.out.println(fib(5));
               int a[] = {1,2,3,4,0};
             //  System.out.println(isSorted(a,0));
               System.out.println(lastOcc(a, 3, 0));
       */
        Scanner scanner= new Scanner(System.in);
//        String string = "appnacollege";
//        boolean [] map = new boolean[26];
//        removeDub(string ,0, new StringBuilder(""),map);
//        printBinStrings(3, 0, "");
//        int arr[]= {3,2, 4, 5, 6,7 ,2,2};
//        question1(arr, 0,2);
//        System.out.println( question("aman"));
       int array[]={3,1,4};
//       List<List<Integer>> list= new ArrayList<>();
//      combination(array,7);
      /* quickSort(array,0,array.length-1);
       for (int element:array){
            System.out.print(element+" ");
        }*/
//   ;   int  n=3,sum=0,k=2;
        ArrayList<Integer> arrayList= new ArrayList<>();
       // printSub(0,arrayList,array,3,0);
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(4);
        arrayList.add(5);
        subSet1(arrayList);
        System.out.println(arrayList);
//        int i=printSubCount(0,array,n, sum,k);
//        System.out.println(i);
//printSunSub(0,arrayList,array,array.length,0,8);
//       for (int i=0;i<array.length;i++){
//           array[i]=scanner.nextInt();
//       }
//       reversArray(array,0,array.length-1);
//        for (int i=0;i<array.length;i++){
//            System.out.print(array[i]+" ");
//        }
    }
}

import java.sql.Array;
import java.util.*;

public class ArrayQuestion {
//    public static int linearSearch(int array [] , int key){
//        for (int i= 0 ; i<array.length ; i++){
//            if (array[i]==key){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static int getLargest(int array []){
//        int largest = Integer.MIN_VALUE;
//        int smallest = Integer.MAX_VALUE;
//        for (int i= 0 ; i<array.length ; i++){
//            if (array[i] >largest){
//                largest= array[i];
//
//            }
//            if (array[i]<smallest)
//                smallest= array[i];
//
//        }
//        System.out.println("The smallest number is :"+smallest);
//        return largest;
//    }
//    public static int binarySearch(int array [ ], int key ){
//        int start= 0, end = array.length-1;
//        while (start<=end){
//            int mid = (start+end)/2;
//            if (array[mid] == key){
//                return  mid;
//            } else if (array[mid] <key) {
//                start = mid+1;
//            }
//            else
//                end= mid-1;
//        }
//        return -1;
//    }
//    public static void reverse(int array [ ]){
//        int start = 0 , end = array.length-1;
//        while (start<end){
//            int temp = array[end];
//            array[end]= array[start];
//            array[start] = temp;
//            start++;
//            end--;
//
//        }
//    }
//public static void reverse(int array [ ]){
//    int mid = (array.length)/2;
//    int j = array.length -1;
//    for (int i= 0 ;i<mid;i++){
//        int tem = array[i];
//        array[i]= array[j];
//        array[j]= tem;
//        j--;
//    }
//}
//    public static void printPairs(int [] array){
//        for (int i = 0 ;i<array.length; i++){
//            for (int j = i+1 ; j<array.length; j++){
//                System.out.print("(" +array[i]+","+array[j]+")");
//            }
//            System.out.println();
//        }
//    }
//    public  static void printSubArray(int array[]){
//        for (int i = 0 ; i<array.length; i++){
//            for (int j = i ; j<array.length; j++){
//                for (int k = i ; k<=j; k++){
//                    System.out.print(array[k]+" ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//    }
    public static int  SecondLargest(int []arr){
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i =1; i<arr.length;i++){
            if (arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i]<largest && arr[i]>secondLargest) {
                secondLargest= arr[i];
            }
        }
        return secondLargest;

    }
    public static int  SecondSmallest(int []arr){
        int Smallest = arr[0];
        int secondSmallest = Integer.MIN_VALUE;
        for (int i =1; i<arr.length;i++){
            if (arr[i]<Smallest){
                secondSmallest = Smallest;
               Smallest = arr[i];
            } else if (arr[i]!=Smallest && arr[i]<secondSmallest) {
                secondSmallest= arr[i];
            }
        }
        return secondSmallest;

    }
    public static int removeDuplicate(int[] array){
        int i =0 ;
        for (int j=1 ;j<array.length;j++){
            if (array[i]!=array[j]){
                array[i+1]= array[j];
                i++;
            }
        }
        return (i+1);
    }

    public  static void maxSubArraySum(int array[]){
        int currSum =  0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0 ; i<array.length; i++){
            for (int j = i ; j<array.length; j++){
                currSum= 0;
                for (int k = i ; k<=j; k++){
                  //  System.out.print(array[k]+" ");
                    currSum += array[k];
                }
                System.out.println(currSum);
             if (maxSum<currSum){
                 maxSum = currSum;
             }
            }

        }
        System.out.println("THR MaxSum of SunArray IS :"+maxSum);
    }
    public static int buyAndSellStock(int price[]){
        int maxProfit= 0;
        int buyPrice = Integer.MAX_VALUE;
        for (int i = 0 ; i<price.length ; i++){
            if (buyPrice<price[i]){
                int profit = price[i]- buyPrice;
                maxProfit = Math.max(maxProfit , profit);
            }
            else
                buyPrice = price[i];
        }
        return  maxProfit;

    }

//public static void printAllSubarrays(int[] arr) {
//    int n = arr.length;
//
//    // Outer loop to pick the starting point of the subArray
//    for (int i = 0; i < n; i++) {
//        // Middle loop to pick the ending point of the subarray
//        for (int j = i; j < n; j++) {
//            // Inner loop to print the subarray from 'i' to 'j'
//            System.out.print("[");
//            for (int k = i; k <= j; k++) {
//                System.out.print(arr[k]);
//                if (k < j) { // Add comma and space if it's not the last element
//                    System.out.print(", ");
//                }
//            }
//            System.out.println("]");
//        }
//
//    }
//}
public  static void maxSubArraySumPrefix(int array[]){
    int currSum =  0;
    int maxSum = Integer.MIN_VALUE;
    int prefix [] = new int[array.length];
    prefix[0] = array[0];
    for (int i= 1;i<prefix.length;i++ ){
        prefix [i] = prefix [ i-1]+ array[i];
    }
    for (int i = 0 ; i<array.length; i++){
        for (int j = i ; j<array.length; j++){
                //  System.out.print(array[k]+" ");
                currSum = i==0 ? prefix[j]:prefix[j] - prefix[i-1];
        }
            System.out.println(currSum);
            if (maxSum<currSum){
                maxSum = currSum;
            }
        }
    System.out.println("THR MaxSum of SunArray IS :"+maxSum);
    }
    public static void kadane_s(int number []){
        int maxSum = Integer.MIN_VALUE;
        int cs = 0;
        for (int i =0 ; i<number.length; i++){
            cs = cs + number[i];
            if (cs<0){
                cs =0;
            }
            maxSum = Math.max(cs, maxSum);
        }
        System.out.println("The maxSum of  subArray Is:"+maxSum);
    }
public  static int trappedWater(int height[] ){
        int n = height.length;
        // Calculating tha left helper array
        int leftMax [] = new  int[n];
        leftMax[0] = height[0];
        for (int i =1 ;i<n ; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        // Calculating the right array max(height[i], right[i+1])
        int rightMax [] = new int[n];
        rightMax [n-1] = height[n-1];
        for (int i = n-2 ;i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        // Calculating the waterLevel min of (left , right )
        int trappedWater = 0;
        for (int i = 0; i<n;i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
}
public static ArrayList<Integer> union(int a[], int b[]){
        ArrayList<Integer> union = new ArrayList<>();
        int m = a.length;
        int n= b.length;
        int i = 0;
        int j =0;
        while (i<m && j<n){
            if (i>0 && a[i-1]==a[i]){
                i++;
                continue;
            }
            if (j>0 && b[j-1]==b[j]){
                j++;
                continue;
            }
            if (a[i]<b[j]){
               union.add(a[i]);
               i++;
            }
          else   if (a[i]>b[j]){
                union.add(b[j]);
                j++;
            }
          else {
              union.add(a[i]);
              i++;
              j++;
            }

        }
        while (i<m){
            if (i>0 && a[i-1]==a[i]){
                i++;
                continue;
            }
            union.add(a[i]);
            i++;
        }
    while (j<n){
        if (j>0 && b[j-1]==b[j]){
            j++;
            continue;
        }
        union.add(b[i]);
        j++;
    }
    return union;



}
public static ArrayList<Integer> findUnion(int a[], int[] b) {
    ArrayList<Integer> union = new ArrayList<>();
    int n = a.length;
    int m = b.length;
    int i = 0, j = 0;
    while (i < n && j < m) {
        if (a[i] <= b[j]) {
            if (union.size() == 0 || !(union.contains(a[i]))) {
                union.add(a[i]);
            }
            i++;
        } else {
            if (union.size() == 0 || !(union.contains(b[j]))) {
                union.add(b[j]);
            }
            j++;
        }
    }
    while (i < n) {
            if (union.size() == 0 || !(union.contains(a[i]))) {
                union.add(a[i]);
            }
            i++;
        }
        while (j < m) {
                if (union.size() == 0 || !(union.contains(b[j]))) {
                    union.add(b[j]);
                }
                j++;
        }

    return union;
}
public static ArrayList<Integer> intersection(int a[], int b[]){
     ArrayList<Integer> ans = new ArrayList<>();
        int n= a.length;
        int m = b.length;
        int vis [] = new int[m];
        for (int element : vis){
           vis[element]= 0;
        }

        for (int i =0 ;i<n ;i++){
            for (int j = 0 ; j<m;j++){
                if (a[i]==b[j] && vis[j]==0  ){
                    ans.add(a[i]);
                    vis[j]= 1;
                    break;
                }
                if (b[j]>a[i]) break;
            }
        }
        return ans;
}
public static ArrayList<Integer> findIntersection(int a[] ,int b[]){
        ArrayList<Integer> inter = new ArrayList<>();
        int n = a.length;
       int i =0, j=0;
        int m = b.length;
        while (i<n && j<m){
            if (a[i]<b[j]){
                i++;
            } else if (b[j]<a[i]) {
                j++;

            }
            else {
                inter.add(a[i]);
                i++;
                j++;
            }
        }
        return inter;
}
public static int missingNumber(int a[]){
        for (int i = 1 ; i<a.length+1;i++){
            int flag = 0;
            for (int j= 0 ; j<a.length;j++){
                if (a[j]==i){
                    flag=1;
                    break;
                }
            }
            if (flag==0){
                return i;
            }
        }
        return -1;
}
public static int findMissingNumber(int a[], int n){
   int count [] = new int[n +1];
   for (int element : count){
       count[element] = 0;
   }
   for (int i = 0 ; i<n-1;i++){
       count[a[i]]++;
   }
   for (int i = 1 ; i<=n;i++){
       if (count[i]==0) return i;
   }
   return -1;

}
public static int FindMiss(int a[] , int n){
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 0 ; i<a.length-1 ;i++){
            xor1 = xor1^(i+1);
            xor2 = xor2^a[i];
        }
        xor1 = xor1^(n-1);
        int miss = xor1^xor2;
    return miss;

}
public static int maxConsecutiveOnes(int a[]){
        int max = 0;
        int count = 0;
        for (int i = 0 ; i<a.length;i++){
            if (a[i]==1){
                count++;
                max = Math.max(max, count);
            }
            else {
                count = 0;
            }
        }
        return max;
}
public static int count(int a[]){
        int n = a.length;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for (int i =0 ; i<n ;i++){
            int value = mpp.getOrDefault(a[i],0);
            mpp.put(a[i], value+1);
        }
         for (Map.Entry<Integer,Integer> it : mpp.entrySet()){
            if (it.getValue()==1) return it.getKey();

         }
        return -1;
}
public static int AMAN(int a[]){
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0 ; i<a.length;i++){
            int value = mpp.getOrDefault(a[i],0);
            mpp.put(a[i], value+1);
        }
        for (Map.Entry<Integer, Integer> IT : mpp.entrySet()){
            if (IT.getValue()==1) return IT.getKey();
        }
        return -1;
}
    public static void rotateByD(int a[] , int d){
        d = d%a.length;
        List<Integer> tem = new ArrayList<>();
        for (int i =0 ; i<d ; i++){
            tem.add(a[i]);
        }
        for (int i =d ; i<a.length;i++){
            a[i-d] = a[i];
        }
        for (int i = a.length -d ; i<a.length ; i++){
            a[i] = tem.get(i-(a.length-d));
        }
        for (int i = 0 ; i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
    public static int getLongestSum(int a[], int k){
    HashMap<Long, Integer> preSumMap = new HashMap<>();
    long sum = 0;
    int maxLen= 0;
    for (int i = 0; i<a.length;i++){
        sum+= a[i];
        if (sum==k){
            maxLen = Math.max(maxLen, i+1);
        }
        long rem = sum-k;
        if (preSumMap.containsKey(rem)){
            int len = i- preSumMap.get(rem);
            maxLen= Math.max(maxLen, len);
        }
        if (!preSumMap.containsKey(sum)){
            preSumMap.put(sum, i);
        }
    }
    return maxLen;
    }
    public static int maxSumOfArray(int a[], int k){
        int n = a.length;
        int left = 0 , right=0;
         long sum =0;
         int maxLen = 0;
         while (right<n){
             while (left<=right && sum>k){
                 sum -=a[left];
                 left--;
             }
             if (sum==k){
                 maxLen= Math.max(maxLen, right-left+1);
             }
             right++;
             if (right <n )
                 sum+=a[right];
         }
         return maxLen;
    }
    public static boolean twoSum(int a[], int tar){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i =0;i<a.length;i++){
            int first = a[i];
            int more = tar-a[i];
            if (hashMap.containsKey(more)){
                return true;
            }
            hashMap.put(a[i],i);
        }
        return false;
    }

    public static void main (String[]args){
//        int array [] = {2,4,6,8,10,12,14,16};
//        int key = 10;
//        int index = linearSearch(array, key);
//        if (index== -1){
//            System.out.println("Key Is Not Present");
//        }
//        else
//            System.out.println("The Index of key is :"+index);
//        int array []= { 1, 2,6, 3, 5};
//        System.out.println("The Laegest element in the array is :"+getLargest(array));
//        int array [] = {2,4,6,8,10,12,14,16};
//        int key = 10;
//        int index = binarySearch(array, key);
//        if (index==-1){
//            System.out.println("Key Is Not Present");
//        }
//        else
//           System.out.println("The Index of key is :"+index);
//        int array [] = {2,4,6,8,10,12,14,16};
//        reverse(array);
//        for (int Elements :array){
//            System.out.print(Elements+" ");
//        }
        //int[] array = {1 , -2 , 6 , -1, 3};
     //   printSubArray(array);
     //   printPairs(array);
//        int[] numbers = {1, 2, 3, 4};
//        System.out.println("All subarrays:");
//        printAllSubarrays(numbers);
      //  maxSubArraySum(array);
      //  maxSubArraySumPrefix(array);
      //  kadane_s(array);
//int height [] = {4,2,0,6,3,2,5};
   //     System.out.println(trappedWater(height));
//
        // int[] a = {1, 1, 2, 2, 2, 4};
      //  int[] b = {2, 2, 4, 4};
       // List<Integer> res = findUnion(a,b);
        //List<Integer> res = intersection(a,b);
       // List<Integer> res = findIntersection(a,b);
       // for (int x : res) {
            //System.out.print(x + " ");
      //  }
      //  System.out.println("THE PROFIT IS :"+buyAndSellStock(price));
//        int a []  = { 1,2,4,5};
//        int mis ;
       // System.out.println(mis=missingNumber(a));
        //System.out.println(mis= findMissingNumber(a,5));
//        System.out.println(mis=FindMiss(a,5));
//int a[] = { 1,1,0,1,1,1,0,1,1};
        //System.out.println(maxConsecutiveOnes(a));
        int a[] = { 1,2,1,3,4,4};
        int b [] = { 1 , 2 ,3,4,5,6,7};
        //rotateByD(b,3);
       System.out.println(count(a));

    }
}


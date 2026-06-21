public class Apna_Divide_conquer {
    public static void printArray(int arr[]){
        for (int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void margSort(int arr [], int si, int ed){
       // base condition
        if (si>=ed) return;

        // yha ham bade array ko chote part me divide karenge
        int mid = si+(ed-si)/2;
        margSort(arr, si, mid);
        margSort(arr, mid+1, ed);
        marg(arr,si, mid, ed);

    }
    public static void marg(int arr[], int si, int mid , int ed){
       // left(0-3)=4 element and right(4-6)=3 element that why we take size of temp is ed-si+1
        int temp [] = new int[ed-si+1];
        int i = si;// idx for first and left sorted part
        int j = mid+1;// icx for second or right sorted part
        int k= 0;// idx for tem arr
        while (i<=mid && j<=ed){
            if (arr[i]<arr[j]){
                temp[k]= arr[i];
                i++; k++;
            }else {
                temp[k] = arr[j];
                j++; k++;
            }
        }
        while (i<=mid){
            temp[k++]= arr[i++];
        }
        while (j<=ed){
            temp[k++] = arr[j++];
        }
        // here we copy the temp array in original array
        for (k=0, i=si; k< temp.length;k++, i++){
            arr[i]= temp[k];
        }
    }
    public static void quickSort(int arr[], int si , int end){
        // base condition
        if (si>=end) return;
        // kaam
        int pIdx= partition(arr, si, end);
        quickSort(arr, si,pIdx-1); // Left
        quickSort(arr, pIdx+1, end);// Right
    }
    public static int partition(int arr[], int si, int end)
    {
     int pivot = arr[end];
     int i = si-1; // to make space for element smaller the pivot
        for (int j = si; j<end;j++){
            if (arr[j]<pivot) {
                i++;
                int temp = arr[j];
                arr[j]= arr[i];
                arr[i]= temp;
            }

        }
        i++;
        int temp = pivot;
        arr[end]= arr[i];
        arr[i]= temp;
        return i;
    }
    public static int Search(int arr[], int target, int si , int end){
        while (si<end) {
            int mid = si + (end - si) / 2;
            if (arr[mid] == target) return mid ;
            // CASE 1 L1
            if (arr[si] <= arr[mid]) {
                //case a:Left
                if (arr[si] <= target && target <= arr[mid]) {
                    end = mid - 1;
                    if (arr[mid] == target) return mid ;

                }
                // case b right
                else {
                    si = mid + 1;
                    if (arr[mid] == target) return mid;
                }
            }
            // Case 2 L2
            else {
                // case c : right
                if (arr[mid] <= target && target <= arr[end]) {
                    si = mid + 1;
                    if (arr[mid] == target) return mid;
                }
                // case d: left
                end = mid - 1;
                if (arr[mid] == target) return mid;
            }
        }
        return -1;

        }

    public static int search(int arr[] ,int target, int si, int end){

        // base
        if (si>end) return -1;
        // Work
        int mid = si +(end-si)/2;
        if (arr[mid]==target) return mid;
        // CASE 1 L1
        if (arr[si]<=arr[mid]){
            //case a:Left
            if (arr[si]<=target && target<=arr[mid]){
               return search(arr,target,si,mid-1);
            }
            // case b right
            else {
              return   search(arr,target,mid+1,end);
            }
        }
        // Case 2 L2
        else {
            // case c : right
            if (arr[mid]<=target && target<=arr[end]){
                return search(arr, target, mid+1, end);
            }
            // case d: left
            return search(arr, target,si,mid-1 );
        }
    }
    public static void main(String[] args) {
        //int arr []= { 6,3,9,5,2,8};
       // margSort(arr, 0, arr.length-1);
//        quickSort(arr, 0,arr.length-1);
//        printArray(arr);
        int arr [] = { 4,5,6,7,0,1,2};
        int target = 6;
       // Tidx=  search(arr, target, 0, arr.length-1);
       int Tidx=  Search(arr, target, 0, arr.length-1);

        System.out.println(Tidx);
    }
}

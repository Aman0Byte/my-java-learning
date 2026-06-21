public class _Sorting {

    public static void bubbleSort(int array []){
        int c=0;
        for (int i = 0 ; i<array.length-1 ; i++){
            for (int j = 0 ; j<array.length-1-i ; j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]= temp;
                    c = c +1;
                }
            }

        }
        if (c==0){
            System.out.println("This Array is Already sorted");
        }
    }
    public static void BubbleSort(int array []){
        for (int  i =1 ; i<array.length ;i++){
            for (int j = 0 ; j<= array.length -1-i;j++){
                    if (array[j]>array[j+1]){
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1]= temp;
                }
            }
        }
    }
    public static void selectionSort(int arr[]){
        for (int i =0 ; i<arr.length-1;i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j])
                    minPos = j;
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
   public static  void insertionSort(int array []){
        for (int i =1 ; i<array.length ;i++){
            int temp = array[i];
            int j =i -1;
            while (j>=0 && array[j]>temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1]= temp;
        }
   }
   public static  void countingSort(int array[ ]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0 ; i<array.length;i++){
            largest = Math.max(largest, array[i]);
        }
        int count[] = new int [ largest+1];
        for (int i = 0 ; i<array.length; i++){
            count[array[i]]++;
        }
        // Sorting
       int j =0;
       for (int i =count.length-1; i>=0; i--){
           while (count[i]>0){
               array[j] = i;
               j++;
               count[i]--;
           }
       }
   }

    public  static void printArray(int array []){
        for (int elements : array){
            System.out.print(elements+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
int array [] = {5,4,3,2,1};
//BubbleSort(array);
      //  selectionSort(array);
       // insertionSort(array);
        countingSort(array);
printArray(array);
    }
}

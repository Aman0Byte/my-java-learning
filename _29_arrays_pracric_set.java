import java.util.Scanner;

public class _29_arrays_pracric_set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Practice problem 1
      /*  System.out.println("ENTER THE SIZE OF ARRAY");
        int size = sc.nextInt();

       float []marks= new float[size];
        float sum =0;
        for (int i=0 ; i<size;i++){
            marks[i]= sc.nextFloat();
            sum = sum+ marks[i];
        }
        System.out.println("THE SUM OF ALL NUMBERS ARE:" + "-->"+sum);*/


// Practice problem 2
      /*  System.out.println("ENTER THE SIZE OF ARRAY");
        int size = sc.nextInt();
        int []marks= new int[size];
        System.out.println("ENTER THE ELEMENT OF ARRAY");
        for (int i=0 ; i<size;i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("HEY DEAR PLEASE ENTER SEARCHING ELEMENT ");
        int num = sc.nextInt();
         boolean isInArray = false;
        for (int element : marks){
           if(num==element){
               isInArray=true;
               break;
        }
    }
        if (isInArray){
            System.out.println("The Number is present in the array ");
        }
        else {
            System.out.println("The Number is not present in the array ");
        }
        */


        // PROBLEM 3
       /* System.out.println("HOW MANY SUBJECT YOU HAVE ");
        int size = sc.nextInt();
        int []marks= new int[size];
        System.out.println("ENTER THE ALL ACHIEVE NUMBER IN RESPECTIVE SUBJECT ");
        for (int i=0 ; i<size;i++) {
            marks[i] = sc.nextInt();
        }
        int sum = 0;
        for (int element: marks){
            sum +=element;
        }
        System.out.println("THE AVERAGE MARKS OF ALL SUBJECT IS"+"-->"+(sum/ marks.length));*/

        // PRACTICE PROBLEM 4
    /*    int s1= 2;
        int s2 =3;
        int [][]m1= new int[s1][s2];
        int [][]m2= new int[s1][s2];
        int[][] m3= new int[s1][s2];

        System.out.println("PLEASE ENTER THE ELEMENT OF FIRST MATRIX");
        for (int i=0; i<s1;i++){
            for (int j=0 ; j<s2;j++){
                m1[i][j]= sc.nextInt();
            }
        }
        System.out.println("PLEASE ENTER THE ELEMENT OF SECOND MATRIX");
        for (int i=0; i<s1;i++){
            for (int j=0 ; j<s2;j++){
                m2[i][j]= sc.nextInt();
            }
        }
      for(int i= 0 ; i<s1;i++){
            for (int j= 0 ; j<s2;j++){
                m3[i][j]= m1[i][j]+m2[i][j];

            }
        }
        System.out.println("THE ADDITION OF TWO MATRIX IS :");
        for (int i=0; i<s1;i++){
            for (int j=0;j<s2; j++){
                System.out.print(m3[i][j]+" ");
            }
            System.out.printf("\n");
        }
*/

        // Problem no 5
      /*  System.out.println("Please Enter the Size of Array");
        int size = sc.nextInt();
        int []arr= new int[size];
        System.out.println("Please Enet The Element of Array");
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        int l= arr.length;
        int n= Math.floorDiv(arr.length, 2);
        for (int i=0;i<n;i++){
            // Swap of  two Number
            int tem= arr[i];
            arr[i] = arr[(l-1)-i];
            arr[(l-1)-i]=tem;
        }
        for (int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
*/
         // Problem no 6

      /*  System.out.println("Please Enter the Size of Array");
        int size = sc.nextInt();
        int []arr1= new int[size];
        System.out.println("Please Enet The Element of Array");
        for (int i=0;i<size;i++){
            arr1[i]= sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for (int element: arr1){
            if (element>max){
                max=element;
            }
        }
        System.out.println("THE MAXIMUM NUMBER OF THE ARRAY IS -->"+" "+max);
        */
        // Problem No 7 Find The Minimum Number Of Array

      /*  System.out.println("Please Enter the Size of Array");
        int size = sc.nextInt();
        int []arr1= new int[size];
        System.out.println("Please Enet The Element of Array");
        for (int i=0;i<size;i++){
            arr1[i]= sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        for (int element: arr1){
            if (element<min){
                min=element;
            }
        }
        System.out.println("THE MINIMUM NUMBER OF THE ARRAY IS -->"+" "+min);
*/

        // PROBLEM NO 8

        System.out.println("Please Enter the Size of Array");
        int size = sc.nextInt();
        int []arr1= new int[size];
        System.out.println("Please Enet The Element of Array");
        for (int i=0;i<size;i++){
            arr1[i]= sc.nextInt();
        }
        boolean isSortrd=true;
        for (int i=0 ;i<size;i++){
            if (arr1[i]>arr1[i+1]){
                isSortrd= false;
                break;
            }
        }
        if (isSortrd){
            System.out.println("YES THE ARRAY IS  SORTED ");
        }
        else {
            System.out.println(" NO THE  ARRAY IS NOT SORTED ");
        }





    }
}

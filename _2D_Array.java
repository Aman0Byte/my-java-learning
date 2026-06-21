import javax.lang.model.element.Element;
import java.awt.*;
import java.util.*;
import java.util.List;

public class _2D_Array {
    public static boolean print2DArray(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key is found at index (" + i + "," + j + " )");
                    return true;
                }
//                System.out.print("|"+matrix[i][j]+"|");
            }
            //   System.out.println();
        }
        return false;
    }

    public static void spiralMatrix(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            // Top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // bottom

            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");

            }

            // left

            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol)
                    break;
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;

        }
        System.out.println();
    }

    public static int sumDaio(int matrix[][]) {
        int sum = 0;
//        for (int i = 0; i<matrix.length;i++){
//            for (int j =0 ;j<matrix[0].length;j++){
//                if (i==j)
//                    sum = sum+ matrix[i][j];
//                else if ( (i +j)== matrix.length-1)
//                    sum+= matrix[i][j];
//            }
//        }
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }

        return sum;
    }

    public static boolean searchInMatrix(int matrix[][], int key) {
        // StairCase Searching
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Key is Found at (" + row + "," + col + ")" + "Index");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else if (key > matrix[row][col]) {
                row++;
            }


        }
        System.out.println("Key Not Found ");
        return false;
    }

    public static boolean SearchInRow(int mat[][], int target, int row) {
        int start = 0, end = mat[0].length - 1;
        while (start <= end) {
            int mid = start + (start - end) / 2;
            if (target == mat[row][mid]) {
                return true;
            } else if (target < mat[row][mid]) {
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return false;
    }

    public static boolean binarySearchIn2d(int mat[][], int target) {
        int n = mat.length, m = mat[0].length;
        int startRow = 0, endRow = n - 1;
        while (startRow <= endRow) {
            int midRow = startRow + (endRow - startRow) / 2;
            if (target >= mat[midRow][0] && target <= mat[midRow][m - 1]) {
                return SearchInRow(mat, target, midRow);
            } else if (target <= mat[midRow][0]) {
                endRow = midRow - 1;
            } else {
                startRow = midRow + 1;

            }
        }
        return false;
    }

    public static boolean SearchInCol(int mat[][], int col, int tar) {
        int start = 0, end = mat.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mat[mid][col] == tar) {
                return true;
            } else if (tar < mat[mid][col]) {
                end = mid - 1;

            } else
                start = mid + 1;
        }
        return false;
    }

    public static boolean binarySearchInCol(int mat[][], int tar) {
        int n = mat.length, m = mat[0].length;
        int startCol = 0, endCol = m - 1;
        while (startCol <= endCol) {
            int midCol = startCol + (endCol - startCol) / 2;
            if (tar >= mat[0][midCol] && tar < mat[n - 1][midCol]) {
                return SearchInCol(mat, midCol, tar);
            } else if (tar <= mat[0][midCol]) {
                endCol = midCol - 1;
            }
            startCol = midCol + 1;
        }
        return false;
    }

    public static void rotateByD(int[] arr, int d) {
        List<Integer> temp = new ArrayList<>();
        // ---> Time complexity of this code O(n+d)
        d = d % arr.length;
        // --- Coping the D= 3 element of arr in temp
        for (int i = 0; i < d; i++) {
            temp.add(arr[i]);
        }
        // - then put the element which start from d from 0 index
        for (int i = d; i < arr.length; i++) {
            arr[i - d] = arr[i];
        }
        // Putting back the temp element in arr
        // the index of temp arr start from 0 to d
        // and the element in arr are putted to d then the next loop start to n-d and goes to end
        for (int i = arr.length - d; i < arr.length; i++) {
            arr[i] = temp.get(i - (arr.length - d));
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    // Reverse Method for array
    public static void Reverse(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Rotate  by D Optimal Solution
    public static void rotateByDOpt(int arr[], int d) {
        Reverse(arr, 0, d - 1);
        Reverse(arr, d, arr.length - 1);
        Reverse(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static boolean rowWiseSearch(int[] matrix, int target) {
        int start = 0, end = matrix.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (matrix[mid] == target) {
                return true;
            } else if (target < matrix[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return false;
    }

    public static void searchRow(int[][] mat, int tar) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            if (rowWiseSearch(mat[i], tar)) {
                System.out.println("the element is present at " + i + "th row");
            }
        }
    }

    public static int noOf7(int matrix[][]) {
        int coOf7 = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 7) {
                    coOf7++;
                }
            }
        }
        return coOf7;
    }

    public static void sumOF2Row(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            sum = sum + matrix[1][i];
        }
        System.out.println("The sum of second row is:" + sum);
    }

    public static void transpose(int mat[][]) {
        int trense[][] = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                trense[i][j] = mat[j][i];
            }
        }
        printMatrix(trense);
    }

    public static void printMatrix(int[][] mat1) {

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                System.out.print(mat1[i][j]);
            }
            System.out.println();
        }
    }

    public static void rightRotate1D(int arr[]) {
        int n = arr.length;
        int temp = arr[n - 1];
        for (int i = n - 1; i >= 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rightRotateByD(int arr[], int d) {
        int n = arr.length;
        int temp[] = new int[d];
        // Here we copy the element of arr in temp
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i + (n - d)];
        }
        // Then Right Shifting of Element d to n-1
        for (int i = n - 1; i >= d; i--) {
            arr[i] = arr[i - d];
        }
        // Putting Back the Copied element into real array
        for (int i = 0; i < d; i++) {
            arr[i] = temp[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Right Rotate Optimal Solution
    public static void rightRotateOpt(int arr[], int d) {
        Reverse(arr, 0, d);
        Reverse(arr, d + 1, arr.length - 1);
        Reverse(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int matrix[][] = new int[4][4];
//        int m = matrix.length, n = matrix[0].length;
//        System.out.println("Enter the Element of Matrix");
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                matrix[i][j] = scanner.nextInt();
//            }
//        }
        //int matrix [][] = { {4 ,7,8},{8,8,7},{10 ,5,9}};
        // spiralMatrix(matrix);
        // int sum = sumDaio(matrix);
        // System.out.println(sum);
        // print2DArray(matrix,9);
        // searchInMatrix(matrix, 33);
        // System.out.println( binarySearchIn2d(matrix , 33));
        // searchRow(matrix,33);
        // sumOF2Row(matrix);
        //  System.out.println(noOf7(matrix));
        //  transpose(matrix);
        //int arr [] = { 1,2,3,4,5,6,7};
        // ---> Time complexity of this code O(n+d)
        // ----> the extra space use in this code is o(d)
        // rotateByD(arr,3);
        //rotateByDOpt(arr,3);
        // rightRotate1D(arr);
        // rightRotateByD(arr,3);
//        rightRotateOpt(arr,3);
//        System.out.println();
//        System.out.println(5&6);
//        int n=scanner.nextInt();
//        int arr1[]= new int[n];
//        for (int e: arr1){
//            arr1[e]=scanner.nextInt();
//            String  c= scanner.next();
//
//        }
//        int n= scanner.nextInt();
//        int arr[]= new int[n];
//       for (int i=0;i<n;i++){
//           arr[i]= scanner.nextInt();
//       }
//        int hash[]= new  int[13];
//        for (int i=0;i<n;i++){
//            hash[arr[i]]+=1;
//        }
//        System.out.println("Kitne number ki apperance janna hai ");
//        int q= scanner.nextInt();
//        while (q--!=0){
//
//            int number;
//            number= scanner.nextInt();
//            System.out.println(hash[number]);
//        }
//        String string = scanner.next();
//        // precompute
//        int hash[]= new int[26];
//        for (int i=0;i<string.length();i++){
//            hash[string.charAt(i)-'a']+=1;
//        }
//        System.out.println("Kitne number ki apperance janna hai ");
//        int q= scanner.nextInt();
//        while (q-->0){
//
//            char c= scanner.next().charAt(0);
//
//            System.out.println(hash[c-'a']);
//        }
//        String string = scanner.next();
//        // precompute
//        int hash[]= new int[256];
//        for (int i=0;i<string.length();i++){
//            hash[string.charAt(i)]+=1;
//        }
//        System.out.println("Kitne number ki apperance janna hai ");
//        int q= scanner.nextInt();
//        while (q-->0){
//
//            char c= scanner.next().charAt(0);
//
//            System.out.println(hash[c]);
//        }
        int n= scanner.nextInt();
        int arr[]= new int[n];
       for (int i=0;i<n;i++){
           arr[i]= scanner.nextInt();
       }
        HashMap<Integer, Integer> MP = new HashMap<>();
        for (int i=0;i<n;i++){
          int key = arr[i];
          int free= 0;
          if (MP.containsKey(key)) free=MP.get(key);
            free++;
            MP.put(key, free);
        }
        System.out.println("Kitne number ki apperance janna hai ");
        int q= scanner.nextInt();
        while (q--!=0){

            int number;
            number= scanner.nextInt();
            if (MP.containsKey(number))System.out.println(MP.get(number));
            else System.out.println(0);
        }
        int maxFreq =0, maxEle=0;
        for (Map.Entry<Integer, Integer> entry : MP.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();

            if (count > maxFreq) {
                maxFreq = count;
                maxEle = element;
            }
             }
        System.out.println(maxFreq);
        System.out.println(maxEle);
//
//            boolean[] visited = new boolean[n]; // To track which elements are already processed
//            int maxFreq = 0, minFreq = n;       // Frequency bounds initialization
//            int maxEle = 0, minEle = 0;         // Elements with max and min frequency
//
//            for (int i = 0; i < n; i++) {
//
//                // If element already processed, skip
//                if (visited[i])
//                    continue;
//
//                // Count how many times arr[i] occurs
//                int count = 1;
//                for (int j = i + 1; j < n; j++) {
//                    if (arr[i] == arr[j]) {
//                        visited[j] = true; // Mark as counted
//                        count++;
//                    }
//                }
//
//                // Update max frequency and corresponding element
//                if (count > maxFreq) {
//                    maxEle = arr[i];
//                    maxFreq = count;
//                }
//
//                // Update min frequency and corresponding element
//                if (count < minFreq) {
//                    minEle = arr[i];
//                    minFreq = count;
//                }
//            }
//
//            // Print final results
//            System.out.println("The highest frequency element is: " + maxEle);
//            System.out.println("The lowest frequency element is: " + minEle);
//        Map<Integer, Integer> map = new HashMap<>(); // Stores element -> frequency
//
//        // Count frequencies
//        for (int i = 0; i < n; i++) {
//            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//        }
//
//      //  int maxFreq = 0, minFreq = n;
//       // int maxEle = 0, minEle = 0;
//
//        // Traverse map to find min and max frequency elements
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            int element = entry.getKey();
//            int count = entry.getValue();
//
//            if (count > maxFreq) {
//                maxFreq = count;
//                maxEle = element;
//            }
//
//            if (count < minFreq) {
//                minFreq = count;
//                minEle = element;
//            }
//        }
//
//        // Print results
//        System.out.println("The highest frequency element is: " + maxEle);
//        System.out.println("The lowest frequency element is: " + minEle);
//
//            int n = scanner.nextInt();
//            int arr[] = new int[n];
//            System.out.println("Enter the Element of array ");
//            for (int i = 0; i < n; i++) {
//                arr[i] = scanner.nextInt();
//            }
//            countFre2(arr, n);


        }

        public static void countFre ( int arr[], int n){
            boolean visit[] = new boolean[n];
            for (int i = 0; i < n; i++) {
                if (visit[i])
                    continue;
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        visit[j] = true;
                        count++;
                    }
                }
                System.out.println(arr[i] + " " + count);
            }
        }
        public static void countFre2 ( int arr[], int n){
            boolean visit[] = new boolean[n];
            int maxFre = 0, minFre = n;
            int maxEle = 0, minEle = 0;
            for (int i = 0; i < n; i++) {
                if (visit[i])
                    continue;
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        visit[j] = true;
                        count++;
                    }
                }
                if (count > maxFre) {
                    maxFre = count;
                    maxEle = arr[i];
                }
                if (count < minFre) {
                    minFre = count;
                    minEle = arr[i];
                }

            }
            System.out.println("The Maximum Frequency Element is :" + maxEle);
            System.out.println("The Minimum Frequency Element is :" + minEle);
        }
        public static void freHash ( int arr[], int n){
            HashMap<Integer, Integer> mp = new HashMap<>();
            for (int i = 0; i < n; i++) {
                mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
            }
            int maxFre = 0, minFre = n;
            int maxEle = 0, minEle = 0;
            for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
                int element = entry.getKey();
                int count = entry.getValue();

                if (count > maxFre) {
                    maxFre = count;
                    maxEle = element;
                }

                if (count < minFre) {
                    minFre = count;
                    minEle = element;
                }
            }
        }
    }







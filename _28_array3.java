public class _28_array3 {
    public static void main(String[] args) {
int [] marks ; // A 1-D Array
        int [][]flats ; // A 2-D ARRAY
        flats = new int[2][3];
        flats [0][0]= 101;
        flats [0][1]= 102;
        flats [0][2]= 103;
        flats [1][0]= 201;
        flats [1][1]= 202;
        flats [1][2]= 203;
        // Calculate the length of 2-D
        System.out.println(flats.length);
        // Displaying 2-D Array Using (for loop)
        System.out.println("Printing a 2-D array using for loop");
for (int i= 0; i< flats.length;i++){
    for (int j=0;j<3;j++){
        System.out.printf("%d ",flats[i][j]);
    }
    System.out.printf("\n");
}


    }
}

public class _27_arrays2_ {
    public static void main(String[] args) {
        int []marek3 = {100, 44, 55 ,444 ,44};
         float [] marks =  {100.5f, 44.6f, 55.3f ,444.5f ,44.6f};
        System.out.println(marks[0]);
        System.out.println(marks.length);
        String [ ] students = { "AMAN ", " ABHI ", " TUFEL "};
        System.out.println(students[0]);
        System.out.println(students.length);
        int []marks1 = {100, 44, 55 ,444 ,44};
int l= marks1.length;
        System.out.println(l);
        System.out.println(marks1[0]);
        System.out.println(marks1.length);
      //  Displaying an arrays ( Naive way)
        System.out.println(marks1[0]);
        System.out.println(marks1[1]);
        System.out.println(marks1[2]);
        System.out.println(marks1[3]);
        System.out.println(marks1[4]);
     //    Displaying an arrays  ( for loop)
      for (int i=0; i< marks1.length;i++){
       System.out.printf("the element of index %d is %d\n ",i,marks[i]);

        }
        // QUICK QUIZ
        // Displaying an arrays in revers order
        /*for (int j = (marks.length -1); j>=0; j--){
            System.out.println(marks[j]);

        }
        System.out.println("Printing the elements of arrays using for each loop");
         for (int element: marks) {
             System.out.println(element);
         }*/
    }
}

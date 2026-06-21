import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.Stream;

public class _92_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(5);
        l2.add(9);
       //// l1.addAll(l2);
      //  System.out.println(l1.clone());
       // System.out.println(l1.getFirst());
        //System.out.println(l1.iterator());
     //   Stream<Integer> integerStream = l1.parallelStream();
       // l1.spliterator();
        // l1.remove(5);
        l1.addFirst(500);
        l1.addLast(66);

       // l1.removeIf(n->(n%5==0));
        System.out.println(l1.contains(5));
        System.out.println(l1.indexOf(6));
        System.out.println(  l1.toArray());
        for (int i = 0 ; i< l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(" ");
        }
    }
}

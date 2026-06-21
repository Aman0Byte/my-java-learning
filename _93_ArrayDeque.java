import java.util.ArrayDeque;

public class _93_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> l1 = new ArrayDeque<>();
        ArrayDeque<Integer> l2 = new ArrayDeque<>();
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
       // System.out.println(l1.contains(5));

     //   System.out.println(  l1.toArray());
      
    }
}

import java.util.ArrayDeque;
import java.util.HashSet;

public class _95_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> l1 = new   HashSet<>();
        HashSet<Integer> l2 = new   HashSet<>();
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
        System.out.println(l1);
    }
}

import java.util.ArrayList;
import java.util.List;

public class learnList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list.add(20);
        list.add(50);
        list.add(10);
        list1.add(55);
        list1.add(54);
        list1.add(59);

        System.out.println(list);
        list.set(1 ,555);
        list.add(2, 88);
//        System.out.println(list.size());
//        System.out.println(list.contains(50));
//        //list.remove(1);
//        list.remove(Integer.valueOf(10));
       // list.addAll(list1);
      //  list.removeAll(list1);

//
//Object a[] = list.toArray();
//for (Object e : a){
//    Integer temp= (Integer) e;
//    System.out.println(e);
//}
        System.out.println(list);

    }
}

package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

        ArrayList list2 = new ArrayList(list1.subList(1,4));    // subList(a,b) b는 포함 안됨
        print(list1, list2);

        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(2, "A");  // 인덱스 2에 추가하면 기존 인덱스 2의 값들은 뒤로 밀림
        print(list1, list2);

        list2.set(2, "AA");
        print(list1, list2);

        System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
        print(list1, list2);

//        for(int i= list2.size()-1; i >= 0; i--) {
//            if(list1.contains(list2.get(i)))
//                list2.remove(i);
//        }
        for(int i = 0; i <= list2.size()-1; i++) {
            if(list1.contains(list2.get(i)))
                list2.remove(i);    // 0번째 값 가져왔는데, 포함되니까 삭제하면 1번째 값이 0번째가 되어 조건에 걸리지 않고 생략되어 2가 남는 문제 발생
        }
        print(list1, list2);
    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println();
    }
}

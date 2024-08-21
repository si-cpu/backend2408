package etc.api.lang.util.collection.list;

import java.util.LinkedList;
import java.util.List;

public class linkesdListExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        //추가
        list.add("Hong Gil Dong");
        list.add("Kim Chul Soo");
        list.add("Park yeong hee");

        list.addFirst("First");
        list.addLast("Last");
        System.out.println(list);

        System.out.println(list.get(3));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.remove("First");
        System.out.println(list);

        System.out.println("====================================================================");

        //LIFO -> Last IN, Last Out -> Stack
        // push, pop, peek
        list.push("chunsick");
        System.out.println(list);// 앞에서부터 추가

        // 삭제하면서 데이터를 얻기
        System.out.println(list.pop());
        System.out.println(list);

        // 삭제하지 않으면서 참조
        System.out.println(list.peek());
        System.out.println(list);

        // FiFo -> First In, First Out -> Queue
        // offer, poll, peek

        list.offer("a");
        list.offer("b");
        list.offer("c"); // 뒤에서부터 추가
        System.out.println(list);

        System.out.println(list.poll());
        System.out.println(list);

        System.out.println(list.peek());
        System.out.println(list);




    }
}

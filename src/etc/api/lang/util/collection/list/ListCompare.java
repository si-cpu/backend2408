package etc.api.lang.util.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCompare {
/*
    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();
        List<Integer> linked = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            array.add(i);
            linked.add(i);
        }

        long start, end;
        // 배열리스트 데이터 제어
        start = System.currentTimeMillis();
        for (int i = 0; i < array.size() ; i++) {
            array.remove(0);
        }
        end = System.currentTimeMillis();

        System.out.printf("배열리스트의 소요시간 : %dms \n",end - start);



        start = System.currentTimeMillis();
        for (int i = 0; i < linked.size() ; i++) {
            linked.remove(0);
        }
        end = System.currentTimeMillis();

        System.out.printf("배열리스트의 소요시간 : %dms \n",end - start);


    }

*/

    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();
        List<Integer> linked = new LinkedList<>();

        for (int i = 0; i < 100000000; i++) {
            array.add(i);
            linked.add(i);
        }

        long start, end;
        // 배열리스트 데이터 제어
        start = System.currentTimeMillis();
        for (int i = 0; i < array.size() ; i++) {
            array.get(i);
        }
        end = System.currentTimeMillis();

        System.out.printf("배열리스트의 소요시간 : %dms \n",end - start);



        start = System.currentTimeMillis();
        for (int i = 0; i < linked.size() ; i++) {
            linked.get(i);
        }
        end = System.currentTimeMillis();

        System.out.printf("배열리스트의 소요시간 : %dms \n",end - start);


    }
}

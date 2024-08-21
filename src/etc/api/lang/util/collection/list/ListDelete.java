package etc.api.lang.util.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListDelete {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> kakao = new ArrayList<>();
        Collections.addAll(kakao, "Muzi", "neo", "appeach", "lion", "jajy", "choonsick");
        System.out.println("현재 저장된 친구들" + kakao);
        System.out.println("삭제할 친구를 입력하세요:");
        String name =sc.next();


        // if(kakao.indexOf(name) ! = -1)   -->  존재하지 않는다는 것이다.
        if (kakao.contains(name)){
           kakao.remove(name);
            System.out.println(kakao);
        }else {
            System.out.println("제대로 입력하세요");
        }
        sc.close();
        /*
        -입력받은 이름을 리스트 내에서 삭제하세요.
        삭제후 결과도 출력하세요
        - 없으면 없는 이름이라고 출력해주세요.
        */



            /*
            for (String s : kakao) {
            if (s.equals(kakao)){
                kakao.remove(s);
            }
        }
        -for each(항상 for문)을 사용하여 반복문을 순회할 때
        리스트의 클기를 마음대로 줄이거나 늘릴 수 없습니다.
        -항상 for문은 반복문ㅇ르 시작할때 구조적으로 컬렉션의 크기 및 사용가능한
        요소들의 개수를 항상 파악하고 있기 때문에 값의 변경이 일어나면 예외를 발생시키도록 설계 되어 있습니다.
         */





    }
}

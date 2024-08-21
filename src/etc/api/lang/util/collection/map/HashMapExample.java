package etc.api.lang.util.collection.map;

import java.lang.invoke.StringConcatException;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        /*
        #Map
        -Key와 Value가 한세트를 이루는 자료구조
        -Key값을 통해 Value를 참조하는 방식(인덱스 x)
        -Key는 중복저장을 허용하지 않음.
         */

        Map<String, String >map = new HashMap<>();

        //Map에 데이터를 추가 : put(key, value)

        map. put("멍멍이", "김철수");
        map. put("야옹이", "홍길동");
        map. put("짹쨱이", "박영희");

        // Key를 중복 사용하는 경우
        // 기존 Key에 맵핑된 Value가 수정됨.
        map.put("멍멍이", "김춘식"); // Key 중복
        map.put("어흥이", "홍길동"); // value 중복
        System.out.println(map);

        
//        map에서 Key들만 추출하는 메서든 KeySet()
//        모든 Key들을 Set에 담아서 변환합니다. -> for-each문 이용


//        Map의 객체를 삭제 : remove(Key)
//        Key를 주시면 value도 함께 제거됩니다.
        map.remove("야옹이");
        System.out.println(map);

        map.clear();
        // Collection의 메서드는 Collection ㅇ니터페이스 탕비을 전달받기 떄문에
        // Map사용이 힘듭니다.











    }
}

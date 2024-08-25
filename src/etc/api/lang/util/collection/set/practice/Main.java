package etc.api.lang.util.collection.set.practice;

public class Main {
    public static void main(String[] args) {

        // 당첨 번호를 고정하세요.


        // 보너스 번호도 하나 고정하세요.


        int paper = 0; // 로또 구매 장수
        long cost = 0; // 로또 구매 금액

        while (true) {

            // 등수 확인 메서드를 호출하세요. 1등에 당첨될 때 까지 프로그램은 계속됩니다.

            if (prize1 == 1) {
                System.out.println("축하합니다! 1등에 당첨되셨습니다.");
                System.out.printf("누적 당첨 횟수\n2등: %d회\n3등: %d회\n4등: %d회\n5등: %d회\n꽝: %d회\n"
                        , prize2, prize3, prize4, prize5, failCnt);

                System.out.println("로또 구입한 장수: " + paper + "장");
                System.out.println("로또 구입한 총 금액: " + cost + "원");

                break; // 1등 당첨이 한 번이라도 된다면 반복문 종료.
            } else {
                System.out.println("로또 " + paper + "장 째 구매 중...");
            }

        }


    }

}


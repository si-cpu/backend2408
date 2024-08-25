import java.util.*;

public class LottoSimulator {

    public static int prize1 = 0; // 1등 당첨 횟수를 기억할 변수.
    public static int prize2 = 0; // 2등 당첨 횟수를 기억할 변수.
    public static int prize3 = 0; // 3등 당첨 횟수를 기억할 변수.
    public static int prize4 = 0; // 4등 당첨 횟수를 기억할 변수.
    public static int prize5 = 0; // 5등 당첨 횟수를 기억할 변수.
    public static int failCnt = 0; // 미당첨 횟수를 기억할 변수.


    public static String createLotto() {
        /*
			 - 1~45 범위의 난수 6개를 생성하셔서
			  컬렉션 자료형에 모아서 리턴해 주세요.
			  무엇을 쓰든 상관하지 않겠습니다.
			  중복이 발생하면 안됩니다.
		 */
        for (int i = 1; i <= 45; i++) {
            HashSet<Object> lotto = new HashSet<>();
            lotto.add(i);

        }


        // 보너스 번호를 생성하는 메서드
        public static int createBonusNum ( ??win){
            // 당첨번호를 매개값으로 받아주세요.
            // 1 ~ 45 사이의 난수 중 당첨번호가 아닌 하나의 난수를 리턴하면 됩니다.
        }

        // 당첨 등수를 알려주는 메서드
        public static void checkLottoNumber ( ???){
            /*
			 매개값으로 당첨번호집합, 구매한 로또 번호집합, 보너스번호를 받습니다.
			 내 로또 번호와 당첨번호를 비교하여
			 일치하는 횟수를 세 주신 후 등수를 판단하세요.
			 판단된 등수에 해당하는 static 변수의 값을 올려 주시면 됩니다.
			 6개 일치 -> 1등
			 5개 일치 + 보너스번호 일치 -> 2등
			 5개 일치 -> 3등
			 4개 일치 -> 4등
			 3개 일치 -> 5등
			 나머지 -> 꽝
		 */

        }
    }
}

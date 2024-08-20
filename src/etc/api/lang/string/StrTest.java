package etc.api.lang.string;

public class StrTest {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
//
//        String str = "a";
//        for (int i = 0; i < 500000; i++) {
//            str += "a";
//        }

        // 속도가 무지무지하게 빠르기 떄문에 코딩테스트 간에 사용해야한다.
        StringBuilder sb = new StringBuilder("a");
        for (int i = 0; i < 500000; i++) {
            sb.append("a");
        }


        long end = System.currentTimeMillis();

        System.out.println("실행 결과: " + (end-start) * 0.001 + "초");


        // 3.14159265 -> 314.159264 -> 314 -> 3.14
        // 3141.59265 -> 3142 -> 3.142
        double pi = 3.14159265;
        long result = Math.round(pi); // 무조건 정수를 return
        System.out.println("result = " + result);



    }
}

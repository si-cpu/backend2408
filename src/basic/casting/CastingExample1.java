package basic.casting;

public class CastingExample1 {

    public static void main(String[] args) {

        /*
		 - 크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 변환할 때는
		  자바 가상 머신 (JVM)이 자동으로 타입을 올려서 변환해 줍니다.
		  (promotion, UpCasting)
		*/

        byte b = 10;
        int i = b; // byte -> int로 변환한 후 대입 연산 진행.
        System.out.println("i = " + i);
        
        char c = '가';
        int j = c; // char -> int
        System.out.println("'가'의 문자 번호: " + j);

        int k = 500;
        double d = k; // int -> double
        System.out.println("d = " + d);

    }
}



















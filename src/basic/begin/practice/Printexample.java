package basic.begin.practice;

public class Printexample {
    public static void main(String[] args) {
//            출력 방식은 크게 3가지 방식이다.
        System.out.println(); // s+o+u+t+tab을 누르면 표출할수있다.
        System.out.print("");
        System.out.printf(""); // s+o+u+f+tab를 누르면 바로 표출이 가능하다.
        System.out.println("args = " + args);// s+o+u+t+v+tab을 누르면 형식을 갖추어 표출이 가능하다.
        /*
        여기서 중요 포인트는 println 은 개행이 포함되어 있고 print 는 포함이 되어 있지 않다는 것이다.
        사실 활용도가 높은 출력방식은
              System.out.printf(""); 이것인데
              예를 들어 System.out.printf("%d개의 %s가 존재한다.", int num, strings man);
              으로 사용이 가능하다.
             # 포맷팅 서식 문자 종류
             %d: 부호가 있는 정수 데이터 (decimal)
             %f: 실수 데이터 (floation point)
             %s: 문자열 (String)



         */
    }
}

package etc.inner;

public class Main {

    // 내부 클래스(inner class) or 중첩 클래스
    // 작업중인 클래스와 밀접한 연관이  있는 경우 클래스 내에서 클래스를 선언.
    // 일반 class는 private(x) 클래스 안에서 클래스를 선언 하면 private 가능.
    // static -> 메모리 효율을 높이기 위해 선언. (바깥쪽 클래스 호출시마다 재생성되는 것을 방지)
    // └객체가 소멸할때 안쪽의 객체가 여전히 남아있는 경우가 발생한다.

    private static class SubCalculator implements Calculator{

        @Override
        public int operate(int n1, int n2) {
            return n1 + n2;
        }
    }

    public static void main(String[] args) {

//        Outer outer = new Outer();
//        Outer.Inner inner = new Outer.Inner();

        Calculator cal;
        cal = new AddCalculator();

        int r1 = cal.operate(10, 20);
        System.out.println(r1);

        cal = new SubCalculator();
        int r2 = cal.operate(40, 27);
        System.out.println(r2);


        // 익명 클래스
        cal = new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1*n2;
            }
        };

        int r3 = cal.operate(10, 4);
        System.out.println(r3);

         int r4 = new Calculator(){
            @Override
            public int operate(int n1, int n2) {
                return n1 % n2;
            }
        }.operate(23,4);

         //람다식(1.8버젼부터 사용가능)
        // 사용전제조건
        //-> 반드시 인터페이스 안에 추상메서드가 1개여야 한다.
        /*
        Calculator 인터페이스는 추상메서드가 1개.
        굳이 이름을 언급하지 않겠다는 것.
        오버라이딩 하는 함수 블록에 포함된 코드가 1줄이고,
        그 1줄이 return문이라면 괄호와 return 생략이 가능.
         */
        cal = (n1,n2) -> n1/n2;

        int r5 = cal.operate(20, 5);
        System.out.println("r5 = " + r5);






    }

}

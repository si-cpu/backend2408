package etc.inner;

public class Main {

    // 내부 클래스(inner class) or 중첩 클래스
    // 작업중인 클래스와 밀접한 연관이  있는 경우 클래스 내에서 클래스를 선언.
    // 일반 class는 private(x) 클래스 안에서 클래스를 선언 하면 private 가능.
    // static -> 메모리 효율을 높이기 위해 선언. (바깥쪽 클래스 호출시마다 재생성되는 것을 방지)
    // └객체가 소멸할때 안쪽의 객체가 여전히 남아있는 경우가 발생한다.

    private static class SubCalculator implements Calculator{

        @Override
        public int operater(int n1, int n2) {
            return n1 + n2;
        }
    }

    public static void main(String[] args) {

//        Outer outer = new Outer();
//        Outer.Inner inner = new Outer.Inner();

        Calculator cal;
        cal = new AddCalculator();

        int r1 = cal.operater(10, 20);
        System.out.println(r1);

        cal = new SubCalculator();
        int r2 = cal.operater(40, 27);
        System.out.println(r2);


        // 익명 클래스
        cal = new Calculator() {
            @Override
            public int operater(int n1, int n2) {
                return n1*n2;
            }
        };

        int r3 = cal.operater(10, 4);
        System.out.println(r3);


    }

}

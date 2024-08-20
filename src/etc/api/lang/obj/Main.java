package etc.api.lang.obj;

public class Main {

    public static void main(String[] args) {

        Person kim = new Person("김춘식", 30);
        Person hong = new Person("홍길동", 25);

        // toString(): 객체의 정보 (필드)를 문자열 형태로 리턴.
        // 객체 타입의 변수를 출력하거나 값을 얻응ㄹ 때는
        // 뒤에 자동으로 .toString()이 붙어서 진행됩니다. (Object가 물려주는 메서드)
        System.out.println(kim.toString());
        System.out.println(hong);

        System.out.println(kim.equals(hong));
        System.out.println(hong.hashCode());
        System.out.println(kim.hashCode());

//         finalize는 gc를 호출하는 순서가 보장되지 않기 떄문에
//        사용이 권장되지 않습니다. (객체가 소멸하는 시점을 정확히 판단하기 어려움)
//        kim = null;
//        hong = null;
//        System.gc();



    }
}

package etc.enum_;

public enum Language {

    JAVA("자바",true),
    Python("파이썬", false),
    CPP("C++", true),
    JAVASCRIPT("자바스크립트",false),
    C("C", true);

    //상수와 연결시킬 데이터를 담을 필드선언.
    private final String name;
    private final boolean isCompileLang;

    public String getName() {
        return this.name;
    }

    public boolean isCompileLang() {
        return this.isCompileLang;
    }

    // 외부에서 enum타입의 상수를 사용하면 enum객체가 생성됨.
    // 위의 상수에 선언한  방식에 생성자 호출문을 통해 연관 문자가 매개값으로 전달되면서 필드를 초기화.
    private Language(final String name, final boolean isCompileLang) {
        this.name = name;
        this.isCompileLang = isCompileLang;

    }


}


package etc.enum_;

public enum Kbo {

    Kia("기아타이거즈", "광주"),
    Samsung("삼성라이온즈","대구"),
    LG("엘지트윈스","서울(잠실)"),
    DooSan("두산베어스","서울(잠실)"),
    SSG("SSG렌더스","인천"),
    KT("KT위저스","수원"),
    HanWha("한화이글스","대전"),
    Lotte("롯데자이언츠","부산"),
    NC("NC다이노스","창원"),
    KiWoom("키움히어로즈","서울(고척)");

    private final String fullName;
    private final String home;

    Kbo(final String fullName, final String home) {
        this.fullName = fullName;
        this.home = home;
    }

}

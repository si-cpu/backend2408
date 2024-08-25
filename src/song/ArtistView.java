package song;

public class ArtistView {

    private static ArtistRepository ar;

    static {
        ar = new ArtistRepository();
    }

    // 메인 실행 기능 (Main 클래스에서 호출되는 프로그램의 시작 부분입니다.)
    public static void start() {

        // 세이브 파일 로드
        ar.loadData();

        while (true) {
            System.out.println("\n\n****** 음악 관리 프로그램 ******");
            System.out.println("# 1. 노래 등록하기");
            System.out.println("# 2. 노래 정보 검색");
            System.out.println("# 3. 현재까지의 데이터 저장하기");
            System.out.println("# 4. 프로그램 종료");
            makeLine();

            System.out.println("\n원하시는 메뉴의 번호를 입력하세요!");
            String menuNum = input(">> ");

            switch (menuNum) {
                case "1":
                    insertProcess();
                    break;
                case "2":
                    searchProcess();
                    break;
                case "3":
                    ar.saveData();
                    break;
                case "4":
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0); // 프로그램 강제 종료.
                    break;
                default:
                    System.out.println("# 메뉴를 잘못 선택하셨습니다.");
            }

        }

    }

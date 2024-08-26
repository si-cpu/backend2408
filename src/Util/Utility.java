package Util;

import java.util.Scanner;

public class Utility {

    public static final String File_Path;
    public static Scanner sc;

    static {
        File_Path = "C:\\Users\\playdata\\Desktop\\backend2408/save.sav";
        sc = new Scanner(System.in);
    }
    //단순 줄을 긋는 메소드
    public static void makeLine(){
        System.out.println("=======================================================");
    }


    // 입력받기 전 전달된 메세지를 출력합니다. 그 후 입력값을 리턴합니다.
    public static String input(String message){
        System.out.println(message);
        return sc.nextLine();
    }


}

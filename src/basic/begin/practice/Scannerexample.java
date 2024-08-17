package basic.begin.practice;

import java.util.Scanner;

public class Scannerexample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner api를 가져온것임.
        int name = sc.nextInt();
        String name1 = sc.next();
        /*
             3. Scanner의 함수들을 이용하여 데이터를 입력받을 수 있습니다.
             - next(): 공백이 없는 문자열을 입력받습니다.
             - nextLine(): 공백을 포함한 문자를 입력받습니다.
             - next + 기본타입이름(): 해당 타입에 맞는 데이터를 입력받습니다.
             ex)
             nextInt(): 정수 데이터를 입력받습니다.
             nextDouble(): 실수 데이터를 입력받습니다.
		*/
        sc.close(); // Scanner api를 반납한것임.


    }
}

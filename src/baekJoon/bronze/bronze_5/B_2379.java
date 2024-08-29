package baekJoon.bronze.bronze_5;

import java.util.Scanner;

public class B_2379 {

    public static void main(String[] args) {
//        N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
        for (int i = 1; i < 10 ; i++) {
            System.out.printf("%d * %d = %d \n", a, i, a*i);
        }


    }

}

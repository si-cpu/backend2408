package oop.inter.good;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IBoardService sv;

        Scanner sc = new Scanner(System.in);
        System.out.println("진행할 번호를 입력");
        System.out.println("1. 글쓰기| 2. 글 조회| 3. 글 수정| 4. 글 삭제");
        int menu = sc.nextInt();

        if (menu == 1){
            sv = new BoardWrite();
        } else if (menu == 2) {
            sv = new BoardUpdate();
        } else if (menu == 3) {
            sv = new BoardDelete();
        }else{
            sv = new BoardList();
        }



    }
}

package oop.encap.practice.bank;

import java.util.Scanner;

public class BankAccount {

    private int balance; // 계좌 잔액
    private int accountNumber;// 계좌번호
    private int accountHoler;//계좌 주인의 이름

    Scanner sc = new Scanner(System.in);
    int withdraw_money = sc.nextInt();

    public void balance_check(){

    }

    public void Deposit(){

    }
    public void withDrawl(){

        if(balance <= withdraw_money ){
            System.out.println("출금액이 옳지 않습니다.");
            return;
        }else{
            balance -= withdraw_money;
            System.out.println("현재 계좌 잔액 = " + balance);
        }

    }



}

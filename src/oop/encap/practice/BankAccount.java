package oop.encap.practice;

public class BankAccount {

    private long balance; // 계좌 잔액
    private String accountNumber; // 계좌번호
    private String accountHoler; //계좌 주인의 이름

    // 대부분 필드 선언 후 생성자를 생성한다. -> 불문율이라고 생각하자.
    public BankAccount(String accountNumber, String accountHoler, long balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHoler = accountHoler;
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(int money){
        if (money < 0){
            System.out.println("입금액이 올바르지 않습니다.");
            return;
        }
        this.balance += money;
    }

    public void withdraw(int money){
        if(money < 0 || money > this.balance){
            System.out.println("잔액이 부족하거나 잘못된 출금액 입니다.");
            return;
        }
        this.balance -= money;
    }

}


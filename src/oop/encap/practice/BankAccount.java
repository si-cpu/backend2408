package oop.encap.practice;

public class BankAccount{

    private int myAccount;
    private int balance; // 계좌 잔액
    private String accountNumber;// 계좌번호
    private String accountHoler;//계좌 주인의 이름


    public int getMyAccount(String accountNumber, String accountHoler, int balance) {

        this.accountNumber = accountNumber;
        this.accountHoler = accountHoler;
        this.balance = balance;




        return myAccount;
    }

    public int getBalance() {

        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHoler() {
        return accountHoler;
    }

    public void setAccountHoler(String accountHoler) {
        this.accountHoler = accountHoler;
    }


    public int deposit(int money) {
        balance += money;
        return balance;
    }

    public int withdraw(int money) {
        balance -= money;
        return balance;
    }

}

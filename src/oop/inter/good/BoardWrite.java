package oop.inter.good;

public class BoardWrite implements IBoardService{
    @Override
    public void execute() {
        System.out.println("글쓰기로직 동작!");
    }
}

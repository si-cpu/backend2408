package oop.inter.good;

public class BoardUpdate implements IBoardService {

    @Override
    public void execute() {
        System.out.println("글수정 로직 등장!");
    }
}

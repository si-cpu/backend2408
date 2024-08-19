package oop.poly.player;

public class Hunter extends Player {

    String pet;

    public Hunter(String nickName, String pet) {
        super(nickName);
        this.pet = pet;
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("#pet name :" + pet);
    }
}

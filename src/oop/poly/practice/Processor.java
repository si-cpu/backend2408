package oop.poly.practice;

public class Processor extends ComputerPart {
    public Processor(String partName, int partPrice) {
        super(partName, partPrice);
    }

    @Override
    public void describePart() {
        System.out.println("partName = " + partName);
        System.out.println("partPrice = " + partPrice);
    }
}

package ООП.Seminar.Seminar_1.HomeTask;

public class Fish extends Animal{
    public Fish(String name) {
        super(name);
    }

    @Override
    protected void fly() {
        System.out.printf("%s %s can not fly!%n", type, name);
    }

    @Override
    protected void toGo() {
        System.out.printf("%s %s can not go!%n", type, name);
    }
}


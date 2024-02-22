package ООП.Seminar.Seminar_1.HomeTask;

public class Fish implements Opportunity{
    @java.lang.Override
    public void action() {
        fly();
        swim();
        toGo();
    }
    public void fly(){
        System.out.println("I can not fly! Because i am fish");
    }
    public void toGo(){

        System.out.println("I can not to go!");
    }

    public void swim(){
        System.out.println("I can swim");
    }
}


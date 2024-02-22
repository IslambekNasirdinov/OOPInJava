package ООП.Seminar.Seminar_1.HomeTask;

public class Duck implements Opportunity{
    @java.lang.Override
    public void action() {
        fly();
        toGo();
        swim();
    }
    public void fly(){
        System.out.println("I can fly!");
    }
    public void toGo(){

        System.out.println("I can to go!");
    }

    public void swim(){
        System.out.println("I can swim");
    }

}


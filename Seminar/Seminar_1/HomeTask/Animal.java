package ООП.Seminar.Seminar_1.HomeTask;

public class Animal {
    protected String name;
    protected String owner;

    public Animal(java.lang.String name, java.lang.String owner) {
        this.name = name;
        this.owner = owner;
    }

    public java.lang.String getName() {
        return name;
    }

    public java.lang.String getOwner() {
        return owner;
    }

    public void toGo(){

        System.out.println("I can to go!");
    }

    public void swim(){
        System.out.println("I can swim");
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "Animal{" +
                "name=" + name +
                ", owner=" + owner +
                '}';
    }
}

interface Opportunity{
    void action();
}



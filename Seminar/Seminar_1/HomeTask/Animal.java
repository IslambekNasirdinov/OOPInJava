package ООП.Seminar.Seminar_1.HomeTask;

public class Animal {
    protected String name;
    protected String type;

    public Animal(String name) {
        this.name = name;
        this.type = getClass().getSimpleName();
    }

    protected void fly(){
        System.out.printf("%s %s fly!%n", type, name);
    }
    protected void toGo(){
        System.out.printf("%s %s to go!%n", type, name);
    }
    protected void swim(){
        System.out.printf("%s %s swim!%n", type, name);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return String.format("%s name = %s", type, name);
    }
}




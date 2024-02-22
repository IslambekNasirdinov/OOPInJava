package ООП.Seminar.Seminar_1;
import java.util.List;
import java.time.LocalDate;

public class Animal {
    protected String name;
    protected LocalDate birthDay;
    protected List<String> vaccinations;
    protected String illness;
    protected String owner;

    public Animal(java.lang.String name, LocalDate birthDay, List<String> vaccinations, java.lang.String illness, java.lang.String owner) {
        this.name = name;
        this.birthDay = birthDay;
        this.vaccinations = vaccinations;
        this.illness = illness;
        this.owner = owner;
    }

    public java.lang.String getName() {
        return name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public java.lang.String getIllness() {
        return illness;
    }

    public java.lang.String getOwner() {
        return owner;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Animal{" +
                "name=" + name +
                ", birthDay=" + birthDay +
                ", vaccinations=" + vaccinations +
                ", illness=" + illness +
                ", owner=" + owner +
                '}';
    }

    private void wakeUp(){
        System.out.println("Animal id wakeUP!!");
    }

    private void wakeUp(int time){
        System.out.println("Animal id wakeup in "+time);
    }
    private void eat(){
        System.out.println("Animal ate ");
    }
    private void play(){
        System.out.println("Animal played");
    }
    private void sleep(){
        System.out.println("Animal sleeping");
    }
    public void lifeCycle(){
        wakeUp();
        eat();
        play();
        sleep();
    }

}

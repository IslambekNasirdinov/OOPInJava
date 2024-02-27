package ООП.Seminar.Seminar_1;
import java.util.List;
import java.time.LocalDate;

public class Eagle extends Animal implements  Flyable, Goable{

    public Eagle(String name, LocalDate birthDay, List<String> vaccinations, String illness, String owner) {
        super(name, birthDay, vaccinations, illness, owner);
    }

    @Override
    public double fly() {
        System.out.printf("%s flying%n", type);
        return 40;

    }


    public double run() {
        System.out.printf("%s going%n", type);
        return 10;
    }


/*
    @Override
    public void lifeCycle() {

    }
*/

}

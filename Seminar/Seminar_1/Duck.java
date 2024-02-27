package ООП.Seminar.Seminar_1;

import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal implements Goable, Flyable, Swimable{
    public Duck(String name, LocalDate birthDay, List<String> vaccinations, String illness, String owner) {
        super(name, birthDay, vaccinations, illness, owner);
    }

    @Override
    public double fly() {
        System.out.printf("%s flying%n", type);
        return 20;
    }

    @Override
    public double run() {
        System.out.printf("%s going%n", type);
        return 11;
    }

    @Override
    public double swim() {
        System.out.printf("%s swiming%n", type);
        return 30;
    }
}

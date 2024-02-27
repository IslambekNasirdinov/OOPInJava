package ООП.Seminar.Seminar_1;

import java.time.LocalDate;
import java.util.List;

public class Fish extends Animal implements Swimable{
    public Fish(String name, LocalDate birthDay, List<String> vaccinations, String illness, String owner) {
        super(name, birthDay, vaccinations, illness, owner);
    }

    @Override
    public double swim() {
        System.out.printf("%s swiming%n", type);
        return 50;
    }
}

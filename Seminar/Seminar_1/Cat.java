package ООП.Seminar.Seminar_1;
import java.util.List;
import java.time.LocalDate;

public class Cat extends Animal{
    private int legsCount;
    public Cat(java.lang.String name, LocalDate birthDay, List<String> vaccinations, java.lang.String illness, java.lang.String owner, int legsCount) {
        super(name, birthDay, vaccinations, illness, owner);
        this.legsCount = legsCount;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Cat{" +
                "legsCount=" + legsCount +
                ", name=" + name +
                ", birthDay=" + birthDay +
                ", vaccinations=" + vaccinations +
                ", illness=" + illness +
                ", owner=" + owner +
                '}';
    }
}

import ООП.Seminar.Seminar_1.Animal;
import ООП.Seminar.Seminar_1.Cat;
import ООП.Seminar.Seminar_1.Employee;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Seminar_1 {

    public static void main(String[] args) {
       // Employee ivan = new Employee("Иван Птерович", 700);
       // System.out.println(ivan);
       // System.out.println(ivan.getName());
        Cat barsik = new Cat("Барс",LocalDate.of(2012,5,4),new ArrayList<>(),"rak","Коля",3);
       // System.out.println(barsik);

        Animal eagle = new Animal("Шума",LocalDate.of(2012,4,4),new ArrayList<>(),"rak","Nik");
        List<Animal> animals = new ArrayList<>();
       // animals.add(barsik);

       // animals.add(eagle);

        //System.out.println(animals);

        System.out.println("____________-");
        barsik.lifeCycle();

    }
}
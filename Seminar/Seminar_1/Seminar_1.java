package ООП.Seminar.Seminar_1;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;


public class Seminar_1 {

    public static void main(String[] args) {

        Cat barsik = new Cat("Барс",LocalDate.of(2012,5,4),new ArrayList<>(),"rak","Коля",3);

        Fish fish = new Fish("Немо",LocalDate.of(2016,5,4),new ArrayList<>(),"rak","Океан");
        Duck duck = new Duck("Дональд",LocalDate.of(206,5,4),new ArrayList<>(),"rak","Дисней");
        VeterenarClinic clinic = new VeterenarClinic();
        Eagle eagle = new Eagle("Шума",LocalDate.of(2012,4,4),new ArrayList<>(),"rak","Nik");
        List<Animal> animals = new ArrayList<>();
       // animals.add(barsik);
        clinic.addPathents(barsik,fish,duck,eagle);
      //  System.out.println(clinic.getPathents());
       //System.out.println(clinic.getGoable());
        //System.out.println("----------");
        //System.out.println(clinic.getFlyable());
        //System.out.println("----------");
       // System.out.println(clinic.getSwimable());




    }
}
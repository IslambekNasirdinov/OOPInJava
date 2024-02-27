package ООП.Seminar.Seminar_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VeterenarClinic {
   private List<Animal> pathents = new ArrayList<>();
   public void addPathent(Animal animal){
       pathents.add(animal);
   }

   public void addPathents(Animal...animals){
       Collections.addAll(pathents, animals);
   }
   public List<Goable> getGoable(){
       List<Goable> result = new ArrayList<>(pathents.size());
       for (Animal animal : pathents){
           if(animal instanceof Goable)
               result.add((Goable) animal);
       }
       return result;
   }
    public List<Flyable> getFlyable(){
        List<Flyable> result = new ArrayList<>(pathents.size());
        for (Animal animal : pathents){
            if(animal instanceof Flyable)
                result.add((Flyable) animal);
        }
        return result;
    }
    public List<Swimable> getSwimable(){
        List<Swimable> result = new ArrayList<>(pathents.size());
        for (Animal animal : pathents){
            if(animal instanceof Swimable)
                result.add((Swimable) animal);
        }
        return result;
    }

    public List<Animal> getPathents() {
        return pathents;
    }
}

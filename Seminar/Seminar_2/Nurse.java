package ООП.Seminar.Seminar_2;

public class Nurse extends Personal{
    public Nurse(String name, int experience,String speciality) {
        super(name, experience,speciality);
    }
    private void treatsMethod(){
        System.out.println("Доктор поставиль диагноз");
        System.out.println("Медсестра приступает к лечению подциента");
    }
    public void treats(){
        treatsMethod();
    }
}

package ООП.Seminar.Seminar_2;

public class Doctor extends Personal {


    public Doctor(String name, int experience,String speciality) {
        super(name, experience,speciality);
    }
    private void inspection(){
        System.out.println("Доктор осматривает пациента");
    }
    private void result(){
        System.out.println("Доктор поставиль диагноз");
    }
    public void inspect(){
        inspection();
        result();
    }
}

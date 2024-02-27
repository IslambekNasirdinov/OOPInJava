package ООП.Seminar.Seminar_2;

public class Personal {
    protected String name;
    protected int experience;
    protected String speciality;

    public Personal(String name, int experience,String speciality) {
        this.name = name;
        this.experience = experience;
        this.speciality = speciality;

    }

    @Override
    public String toString() {
        return "Personal{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", speciality=" + speciality +
                '}';
    }
}

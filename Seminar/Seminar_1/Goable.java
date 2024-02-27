package ООП.Seminar.Seminar_1;

public interface Goable {
    double run();
    default double acceleration() {
        return 0;
    }
}

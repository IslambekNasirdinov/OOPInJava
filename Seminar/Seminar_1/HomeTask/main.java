import ООП.Seminar.Seminar_1.HomeTask.Animal;
import ООП.Seminar.Seminar_1.HomeTask.Duck;
import ООП.Seminar.Seminar_1.HomeTask.Fish;
import ООП.Seminar.Seminar_1.HomeTask.Strok;

/* Доброго времени суток я не смог выполнить задание с наследование на с Animals. Пока что я думаю это не возможно для меня.
* Я вас прошу поделиться с литературами пожалуйста*/
public class main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.action();

        Strok stork = new Strok();
        stork.action();

        Fish fish = new Fish();
        fish.action();

    }

     /*
    1) Добавить в класс Animal методы двигаться(toGo), летать(fly), плавать(swim).
2) Создать по два класса
наследника Animal, умеющих летать, плавать, бегать(животное может как уметь что-то одно, так и все сразу).
3) В main добиться того, чтобы при вызове метода действия, которое конкретное животное не умеет, оно этого не делало (кошки не летают, рыбы не ходят)
4) В файле readme.md в репозитории гитхаб описать
какие проблемы в таком проектировании Вы увидели,
а также там же написать возникшие при выполнении дз вопросы
(если они есть)
     */
}
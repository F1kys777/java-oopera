import java.util.ArrayList;
import java.util.Objects;

public class Theatre {
    public static void main(String[] args) {

        Actor actor1 = new Actor("Андрей", "Гавриенко", Gender.MALE, 152);
        Actor actor2 = new Actor("Белла", "Дмитриенко", Gender.FEMALE, 169);
        Actor actor3 = new Actor("Валерий", "Евтухов", Gender.MALE, 167);

        Director director1 = new Director("Женева", "Измайлова", Gender.FEMALE, 1);
        Director director2 = new Director("Захар", "Йобс", Gender.MALE, 1);

        Show ordinaryShow = new Show("Шоу", 152, director1, new ArrayList<>());
        Opera opera = new Opera("Опера", 167, director2, new ArrayList<>(),
                "Людвиг ван Бетховен", "Либретто оперы ", 21);
        Person choreographerPerson = new Person("Сергей", "Шестеперов", Gender.MALE);
        Ballet ballet = new Ballet("Балет", 169, director1, new ArrayList<>(),
                "Пётр Чайковский", "Либретто балета ", choreographerPerson);

        ordinaryShow.addActor(actor1);
        ordinaryShow.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        System.out.println("\n Информация о режиссёрах:");
        ordinaryShow.printDirectorInfo();
        opera.printDirectorInfo();
        ballet.printDirectorInfo();

        System.out.println("\n Обычный спектакль:");
        ordinaryShow.printActorsList();
        System.out.println("\n Опера:");
        opera.printActorsList();
        System.out.println("\n Балет:");
        ballet.printActorsList();

        System.out.println("\n Замена актёра в опере:");
        opera.replaceActor("Евтухов", actor1);
        opera.printActorsList();

        System.out.println("\n Попытка замены несуществующего актёра в опере:");
        opera.replaceActor("Йобс", actor1);

        System.out.println("Либретто оперы:");
        opera.printLibretto();
        System.out.println("Либретто балета:");
        ballet.printLibretto();
    }
}
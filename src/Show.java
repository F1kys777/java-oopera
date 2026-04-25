import java.util.ArrayList;


public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor>listOfActors){
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printLibretto(){
        System.out.println( );
    }

    public void printDirectorInfo() {
        System.out.println(director.getName() + " " + director.getSurname() + ", работ:" + director.getNumberOfShows());
    }

    public void printActorsList() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.getName() + " " + actor.getSurname() + " (" + actor.getHeight() + ")");
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр уже в спектакле.");
        } else {
            listOfActors.add(actor);
        }
    }

    public void replaceActor(String surname, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Актёр " + surname + " не найден.");
    }

}
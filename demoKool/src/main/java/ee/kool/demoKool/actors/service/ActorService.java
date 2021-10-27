package ee.kool.demoKool.actors.service;
import ee.kool.demoKool.actors.dto.Actor;
import ee.kool.demoKool.films.dto.Film;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ActorService
{
    public List<Actor> mockActors()
    {
        ArrayList<Actor> actors = new ArrayList<>();
        Actor actor1 = new Actor();
        actor1.setId(0);
        actor1.setFirstName("Satoshi");
        actor1.setLastName("Nakamoto");
        Film film1 = new Film();
        film1.setId(0);
        film1.setTitle("Hea Film");
        ArrayList<Film> films = new ArrayList<>();
        films.add(film1);
        actor1.setFilmList(films);
        return actors;
    }
    public List<Actor> mockOneActor(int id)
    {
        ArrayList<Actor> actors = new ArrayList<>();
        Actor actor = new Actor();
        actor.setId(id);
        actors.add(actor);
        return actors;
    }
    public Actor MockCreateActor() {
        Actor actor = new Actor();

        return null;
    }
    public Actor MockEditActor() {
        Actor actor = new Actor();

        return null;
    }
    public Actor MockDeleteActor() {
        Actor actor = new Actor();

        return null;
    }
}

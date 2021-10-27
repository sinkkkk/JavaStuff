package ee.kool.demoKool.films.service;
import ee.kool.demoKool.actors.dto.Actor;
import ee.kool.demoKool.films.dto.Film;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class FilmService
{
    public List<Film> mockMovies()
    {
        List<Film> films = new ArrayList<>();
        Film film1 = new Film();
        film1.setId(0);
        film1.setTitle("Hea Film");
        Actor actor1 = new Actor();
        actor1.setFirstName("Joe");
        actor1.setLastName("Biden");
        actor1.setId(1);
        List<Actor> actors = new ArrayList<>();
        actors.add(actor1);
        film1.setActorList(actors);
        films.add(film1);
        return films;
    }
    public Film mockOneMovie(Integer id)
    {

        Film film = new Film();
        film.setId(id);
        film.setTitle("Teine Film");
        return film;
    }
    public Film MockCreateMovie(int id) {

        Film film = new Film();
        film.setId(id);
        film.setTitle("Teine Film");
        return film;
    }
    public Film MockEditMovie() {

        ArrayList<Film> films = new ArrayList<>();
        Film film = new Film();

        return null;
    }
    public Film MockDeleteMovie() {
        Film film = new Film();

        return null;
    }
}

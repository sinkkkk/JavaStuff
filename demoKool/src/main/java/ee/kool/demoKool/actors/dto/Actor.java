package ee.kool.demoKool.actors.dto;

import ee.kool.demoKool.films.dto.Film;
import lombok.Data;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Data
public class Actor {

    private int id;
    private String firstName;
    private String lastName;
    private List<Film> filmList;


}

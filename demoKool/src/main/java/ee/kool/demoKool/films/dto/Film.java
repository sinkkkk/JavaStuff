package ee.kool.demoKool.films.dto;

import ee.kool.demoKool.actors.dto.Actor;
import lombok.Data;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Data
public class Film{

        private int id;
        private String title;
        private int rating;
        private List<Actor> ActorList;

}

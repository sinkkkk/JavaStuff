package ee.kool.demoKool.actors.controller;

import ee.kool.demoKool.actors.dto.Actor;
import ee.kool.demoKool.actors.service.ActorService;
import ee.kool.demoKool.films.dto.Film;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class ActorsController {

    @Autowired
    ActorService actorService;

    @GetMapping("/v1/actors")
    List<Actor> findAll(){
        return actorService.mockActors();
    }
    @GetMapping("v1/actors/{id}")
    Actor one(@PathVariable Integer id) {
        return (Actor) actorService.mockOneActor(id);
    }
    @PostMapping("v1/actors")
    Actor addOne(@PathVariable Integer id) {
        return (Actor) actorService.MockCreateActor();

    }
    @PutMapping("v1/actors/{id}")
    Actor editOne(@PathVariable Integer id){

        return (Actor) actorService.MockEditActor();
    }
    @DeleteMapping("v1/actors/{id}")
    Actor deleteOne(@PathVariable Integer id) {
        return (Actor) actorService.MockDeleteActor();
    }
}

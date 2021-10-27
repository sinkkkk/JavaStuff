package ee.kool.demoKool.films.controller;

import ee.kool.demoKool.films.dto.Film;
import ee.kool.demoKool.films.service.FilmService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class FilmsController {

    @Autowired
    FilmService filmService;

    @GetMapping("/v1/films")
    List<Film> all() {
        return filmService.mockMovies();
    }
    @GetMapping("v1/films/{id}")
    Film oneFilm(@PathVariable Integer id) {
        return (Film) filmService.mockOneMovie(id);
    }

    @PostMapping("v1/films")
        Film addOne(@PathVariable Integer id) {
        return (Film) filmService.MockCreateMovie(id);

    }
    @PutMapping("v1/films/{id}")
        Film editOne(@PathVariable Integer id){
        return (Film) filmService.MockEditMovie();
    }
    @DeleteMapping("v1/films/{id}")
        Film deleteOne(@PathVariable Integer id) {
        return (Film) filmService.MockDeleteMovie();
    }


    @GetMapping("v1/films/?actor={id}&ratingGt={lowest}&ratingLt={highest}")
        Film findByRating(@RequestParam Integer id, @RequestParam int lowest, @RequestParam int highest) {
        return null;
    }

}

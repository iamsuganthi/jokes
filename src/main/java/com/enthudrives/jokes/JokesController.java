package com.enthudrives.jokes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class JokesController {

    @GetMapping("/api/jokes")
    List<String> getJokes() {
        List<String> jokes = new ArrayList<>();
        jokes.add("How you doing buddy!");
        jokes.add("Bazinga");

        return jokes;
    }
}

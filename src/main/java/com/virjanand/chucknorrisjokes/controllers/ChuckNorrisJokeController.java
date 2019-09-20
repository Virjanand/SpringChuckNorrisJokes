package com.virjanand.chucknorrisjokes.controllers;

import com.virjanand.chucknorrisjokes.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChuckNorrisJokeController {

    private JokeService jokeService;

    public ChuckNorrisJokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/")
    public String getChuckNorrisJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }
}

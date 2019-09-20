package com.virjanand.chucknorrisjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService{

    private final ChuckNorrisQuotes quoteGenerator;

    public JokeServiceImpl() {
        this.quoteGenerator = new ChuckNorrisQuotes();
    }

    public String getJoke() {
        return quoteGenerator.getRandomQuote();
    }
}

package alisson.springframework.joke.jokeapp.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Configuration
public class ChuckConfiguration
{
    @Bean
    public ChuckNorrisQuotes chuckNorrisQuuotes()
    {
        return new ChuckNorrisQuotes();
    }
}

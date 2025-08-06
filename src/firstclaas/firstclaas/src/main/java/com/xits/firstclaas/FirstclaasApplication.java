package com.xits.firstclaas;

import com.xits.firstclaas.Movies.MovieRepository;
import com.xits.firstclaas.Movies.movies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstclaasApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(FirstclaasApplication.class, args);
		MovieRepository movieRepository=context.getBean(MovieRepository.class);

		movies movies=new movies();
		movies.setId(1);
		movies.setMovname("puspa");
		movies.setGenr("Action");

		movieRepository.save(movies);


		movies movies1=new movies();
		movies1.setId(2);
		movies1.setMovname("Golmaal");
		movies1.setGenr("Comedy");

		movieRepository.save(movies1);

	}

}

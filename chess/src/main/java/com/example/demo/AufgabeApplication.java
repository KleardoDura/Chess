package com.example.demo;

import com.example.demo.models.Chat;
import com.example.demo.models.Game;
import com.example.demo.models.User;
import com.example.demo.repos.ChatRepos;
import com.example.demo.repos.GameRepo;
import com.example.demo.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class AufgabeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AufgabeApplication.class, args);
	}
	@Bean
	CommandLineRunner run(UserRepo userRepo, GameRepo gameRepo, ChatRepos chatRepos) {

		BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
		return args ->{
			User user1=new User(1,"Henry","Henry","henry@henry.com",2000,passwordEncoder.encode("henry123"),500);
			userRepo.save(user1);
			User user2=new User(2,"John","John","henry@henry.com",2000,passwordEncoder.encode("John123"),500);
			userRepo.save(user2);

			Game game1=new Game(1,"FirstGame",1,2,10);
			gameRepo.save(game1);
			Game game2=new Game(2,"SecondGame",1,2,10);
			gameRepo.save(game2);

			Chat chat1=new Chat(1,1,2,"Hello my friend!");
			chatRepos.save(chat1);
		};
	}

}

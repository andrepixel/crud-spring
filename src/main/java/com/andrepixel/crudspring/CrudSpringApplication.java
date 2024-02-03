package com.andrepixel.crudspring;

import com.andrepixel.crudspring.entities.GameEntity;
import com.andrepixel.crudspring.repositories.GameRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

  public static void main(String[] args) {
    SpringApplication.run(CrudSpringApplication.class, args);
  }

  @Bean
  CommandLineRunner initDatabase(GameRepository repository) {
    return args -> {
      repository.deleteAll();

      GameEntity gameEntity = new GameEntity();
     
      gameEntity.setId(1L);
      gameEntity.setName("Halo");
      gameEntity.setCompany("MS");
      gameEntity.setCategory("Action");

      repository.save(gameEntity);
    };
  }
}

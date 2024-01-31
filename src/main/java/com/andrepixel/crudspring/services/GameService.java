package com.andrepixel.crudspring.services;

import com.andrepixel.crudspring.dtos.GameDTO;
import com.andrepixel.crudspring.entities.GameEntity;
import com.andrepixel.crudspring.repositories.GameRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class GameService {

  private final GameRepository repository;

  public GameService(GameRepository repository) {
    this.repository = repository;
  }

  public List<GameDTO> getAllGames() {
    List<GameEntity> gamesListDatabase = repository.findAll();

    return gamesListDatabase
      .stream()
      .map(game ->
        new GameDTO(
          game.getId(),
          game.getName(),
          game.getCompany(),
          game.getCategory()
        )
      )
      .collect(Collectors.toList());
  }
}

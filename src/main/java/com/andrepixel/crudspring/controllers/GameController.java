package com.andrepixel.crudspring.controllers;

import com.andrepixel.crudspring.entities.GameEntity;
import com.andrepixel.crudspring.services.GameService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/games")
public class GameController {

  private final GameService service;

  public GameController(GameService service) {
    this.service = service;
  }

  @GetMapping
  public List<GameEntity> getAllGames() {
    return this.service.getAllGames();
  }
}

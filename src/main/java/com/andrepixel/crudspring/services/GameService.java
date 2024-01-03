package com.andrepixel.crudspring.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.andrepixel.crudspring.entities.GameEntity;
import com.andrepixel.crudspring.repositories.GameRepository;

@Service
public class GameService {
    private final GameRepository repository;

    public GameService(GameRepository repository) {
        this.repository = repository;
    }

    public List<GameEntity> getAllGames() {
        return repository.findAll();
    }
}

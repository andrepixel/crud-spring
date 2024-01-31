package com.andrepixel.crudspring.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class GameEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 100, nullable = false)
  private String name;

  @Column(length = 100, nullable = false)
  private String company;

  @Column(length = 100, nullable = false)
  private String category;
}

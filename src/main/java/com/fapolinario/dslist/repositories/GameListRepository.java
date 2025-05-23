package com.fapolinario.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fapolinario.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}

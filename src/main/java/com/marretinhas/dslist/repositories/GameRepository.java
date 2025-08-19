package com.marretinhas.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.marretinhas.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}

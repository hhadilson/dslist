package com.marretinhas.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.marretinhas.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}

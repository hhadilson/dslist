package com.marretinhas.dslist.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.marretinhas.dslist.dto.GameDTO;
import com.marretinhas.dslist.dto.GameMinDTO;
import com.marretinhas.dslist.entities.Game;
import com.marretinhas.dslist.repositories.GameRepository;

@Service
public class GameService {

  @Autowired
  private GameRepository gameRepository;


  @Transactional(readOnly = true)
  public List<GameMinDTO> findAll() {
    return gameRepository.findAll().stream().map(x -> new GameMinDTO(x)).toList();
  }

  @Transactional(readOnly = true)
  public GameDTO findById(Long id) {

    Optional<Game> game = gameRepository.findById(id);
    if (game.isPresent()) {
      return new GameDTO(game.get());
    }
    return null;
  }

}

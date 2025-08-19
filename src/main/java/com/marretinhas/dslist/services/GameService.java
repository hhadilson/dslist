package com.marretinhas.dslist.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.marretinhas.dslist.dto.GameMinDTO;
import com.marretinhas.dslist.repositories.GameRepository;

@Service
public class GameService {

  @Autowired
  private GameRepository gameRepository;

  public List<GameMinDTO> findAll() {
    return gameRepository.findAll().stream().map(x -> new GameMinDTO(x)).toList();
  }

}

package com.marretinhas.dslist.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.marretinhas.dslist.dto.GameListDTO;
import com.marretinhas.dslist.repositories.GameListRepository;

@Service
public class GameListService {

  @Autowired
  private GameListRepository gameListRepository;

  public List<GameListDTO> findAll() {
    return gameListRepository.findAll().stream().map(x -> new GameListDTO(x)).toList();
  }



}

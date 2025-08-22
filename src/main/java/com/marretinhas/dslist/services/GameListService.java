package com.marretinhas.dslist.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.marretinhas.dslist.dto.GameListDTO;
import com.marretinhas.dslist.projections.GameMinProjection;
import com.marretinhas.dslist.repositories.GameListRepository;
import com.marretinhas.dslist.repositories.GameRepository;

@Service
public class GameListService {

  @Autowired
  private GameListRepository gameListRepository;

  @Autowired
  private GameRepository gameRepository;

  public List<GameListDTO> findAll() {
    return gameListRepository.findAll().stream().map(x -> new GameListDTO(x)).toList();
  }

  @Transactional
  public void move(Long listId, int sourceIndex, int destinationIndex) {
    List<GameMinProjection> list = gameRepository.searchByList(listId);
    GameMinProjection obj = list.remove(sourceIndex);
    list.add(destinationIndex, obj);
    int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
    int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;
    for (int i = min; i <= max; i++) {
      gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
    }
  }
}

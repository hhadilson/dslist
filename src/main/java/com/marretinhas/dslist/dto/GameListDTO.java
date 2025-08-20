package com.marretinhas.dslist.dto;

import org.springframework.beans.BeanUtils;
import com.marretinhas.dslist.entities.GameList;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class GameListDTO {

  private Long id;

  private String name;


  public GameListDTO(GameList entity) {
    BeanUtils.copyProperties(entity, this);
  }



}

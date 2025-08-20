package com.marretinhas.dslist.dto;

import org.springframework.beans.BeanUtils;
import com.marretinhas.dslist.entities.Game;

public class GameMinDTO {

  private Long id;

  private String title;

  private Integer year;

  private String imgUrl;

  private String shortDescription;

  public GameMinDTO() {

  }

  public GameMinDTO(Game entity) {
    BeanUtils.copyProperties(entity, this);
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public String getTitle() {
    return title;
  }

  public Integer getYear() {
    return year;
  }

  public String getImgUrl() {
    return imgUrl;
  }

  public String getShortDescription() {
    return shortDescription;
  }



}

package com.abuelink.lottery.model.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_FOOTBALL_USER_BET_REL")
public class FootballUserBetRel implements java.io.Serializable{

  @Id
  @Column(name = "ID")
  private String id;

  @Column(name = "USER_BETS_ID")
  private String userBetsId;

  @Column(name = "FOOTBALL_BET_ID")
  private String footballBetId;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUserBetsId() {
    return userBetsId;
  }

  public void setUserBetsId(String userBetsId) {
    this.userBetsId = userBetsId;
  }

  public String getFootballBetId() {
    return footballBetId;
  }

  public void setFootballBetId(String footballBetId) {
    this.footballBetId = footballBetId;
  }
}

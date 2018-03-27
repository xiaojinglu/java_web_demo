package com.abuelink.lottery.model.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_FOOTBALL_TEAM")
public class FootballTeam implements java.io.Serializable{

  @Id
  @Column(name = "ID")
  private String id;

  @Column(name = "NAME")
  private String name;

  @Column(name = "WANGYI_TEAM_ID")
  private String wangyiTeamId;

  @Column(name = "FOOTBALL_LEAGUE_ID")
  private String footballLeagueId;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getWangyiTeamId() {
    return wangyiTeamId;
  }

  public void setWangyiTeamId(String wangyiTeamId) {
    this.wangyiTeamId = wangyiTeamId;
  }

  public String getFootballLeagueId() {
    return footballLeagueId;
  }

  public void setFootballLeagueId(String footballLeagueId) {
    this.footballLeagueId = footballLeagueId;
  }
}

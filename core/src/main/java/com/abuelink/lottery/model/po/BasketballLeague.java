package com.abuelink.lottery.model.po;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_BASKETBALL_LEAGUE")
public class BasketballLeague implements java.io.Serializable{

  @Id
  @Column(name = "ID")
  private String id;

  @Column(name = "LEAGUE_NAME")
  private String leagueName;

  @Column(name = "LEAGUE_COLOR")
  private String leagueColor;

  @Column(name = "WANGYI_LEAGUE_ID")
  private String wangyiLeagueId;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getLeagueName() {
    return leagueName;
  }

  public void setLeagueName(String leagueName) {
    this.leagueName = leagueName;
  }

  public String getLeagueColor() {
    return leagueColor;
  }

  public void setLeagueColor(String leagueColor) {
    this.leagueColor = leagueColor;
  }

  public String getWangyiLeagueId() {
    return wangyiLeagueId;
  }

  public void setWangyiLeagueId(String wangyiLeagueId) {
    this.wangyiLeagueId = wangyiLeagueId;
  }
}

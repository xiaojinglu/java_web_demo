package com.abuelink.lottery.model.po;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_BASKETBALL_MATCH")
public class BasketballMatch implements java.io.Serializable{

  @Id
  @Column(name = "ID")
  private String id;

  @Column(name = "GUEST_ID")
  private String guestId;

  @Column(name = "HOST_ID")
  private String hostId;

  @Column(name = "START_TIME")
  private String startTime;

  @Column(name = "END_TIME")
  private String endTime;

  @Column(name = "IS_STOP")
  private String isStop;

  @Column(name = "LEAGUE_ID")
  private String leagueId;

  @Column(name = "GUEST_SCORE")
  private String guestScore;

  @Column(name = "HOST_SCORE")
  private String hostScore;

  @Column(name = "OUTCOME")
  private String outcome;

  @Column(name = "MATCH_CODE")
  private String matchCode;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getGuestId() {
    return guestId;
  }

  public void setGuestId(String guestId) {
    this.guestId = guestId;
  }

  public String getHostId() {
    return hostId;
  }

  public void setHostId(String hostId) {
    this.hostId = hostId;
  }

  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public String getIsStop() {
    return isStop;
  }

  public void setIsStop(String isStop) {
    this.isStop = isStop;
  }

  public String getLeagueId() {
    return leagueId;
  }

  public void setLeagueId(String leagueId) {
    this.leagueId = leagueId;
  }

  public String getGuestScore() {
    return guestScore;
  }

  public void setGuestScore(String guestScore) {
    this.guestScore = guestScore;
  }

  public String getHostScore() {
    return hostScore;
  }

  public void setHostScore(String hostScore) {
    this.hostScore = hostScore;
  }

  public String getOutcome() {
    return outcome;
  }

  public void setOutcome(String outcome) {
    this.outcome = outcome;
  }

  public String getMatchCode() {
    return matchCode;
  }

  public void setMatchCode(String matchCode) {
    this.matchCode = matchCode;
  }
}

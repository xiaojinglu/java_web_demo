package com.abuelink.lottery.model.po;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_FOOTBALL_MATCH")
public class FootballMatch implements java.io.Serializable{

  @Id
  @Column(name = "ID")
  private String id;

  @Column(name = "HOST_TEAM_ID")
  private String hostTeamId;

  @Column(name = "GUEST_TEAM_ID")
  private String guestTeamId;

  @Column(name = "START_TIME")
  private String startTime;

  @Column(name = "END_TIME")
  private String endTime;

  @Column(name = "")
  private String is_stop;
  private String league_id;
  private String host_score;
  private String guest_score;
  private String outcome;
  private String goal_nums;
  private String fumble_nums;
  private String match_code;
  private String match_num_cn;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getHostTeamId() {
    return hostTeamId;
  }

  public void setHostTeamId(String hostTeamId) {
    this.hostTeamId = hostTeamId;
  }

  public String getGuestTeamId() {
    return guestTeamId;
  }

  public void setGuestTeamId(String guestTeamId) {
    this.guestTeamId = guestTeamId;
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

  public String getIs_stop() {
    return is_stop;
  }

  public void setIs_stop(String is_stop) {
    this.is_stop = is_stop;
  }

  public String getLeague_id() {
    return league_id;
  }

  public void setLeague_id(String league_id) {
    this.league_id = league_id;
  }

  public String getHost_score() {
    return host_score;
  }

  public void setHost_score(String host_score) {
    this.host_score = host_score;
  }

  public String getGuest_score() {
    return guest_score;
  }

  public void setGuest_score(String guest_score) {
    this.guest_score = guest_score;
  }

  public String getOutcome() {
    return outcome;
  }

  public void setOutcome(String outcome) {
    this.outcome = outcome;
  }

  public String getGoal_nums() {
    return goal_nums;
  }

  public void setGoal_nums(String goal_nums) {
    this.goal_nums = goal_nums;
  }

  public String getFumble_nums() {
    return fumble_nums;
  }

  public void setFumble_nums(String fumble_nums) {
    this.fumble_nums = fumble_nums;
  }

  public String getMatch_code() {
    return match_code;
  }

  public void setMatch_code(String match_code) {
    this.match_code = match_code;
  }

  public String getMatch_num_cn() {
    return match_num_cn;
  }

  public void setMatch_num_cn(String match_num_cn) {
    this.match_num_cn = match_num_cn;
  }
}

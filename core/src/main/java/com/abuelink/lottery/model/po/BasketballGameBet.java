package com.abuelink.lottery.model.po;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_BASKETBALL_GAME_BET")
public class BasketballGameBet implements java.io.Serializable{

  @Id
  @Column(name = "id")
  private String id;

  @Column(name = "BASKETBALL_LOTTERY_ID")
  private String basketballLotteryId;

  @Column(name = "PAGE_ODDS")
  private String pageOdds;

  @Column(name = "ACTUAL_ODDS")
  private String actualOdds;

  @Column(name = "WIN_FLAG")
  private String winFlag;

  @Column(name = "LOTTERY_TIME")
  private String lotteryTime;

  @Column(name = "BASKETBALL_GAME_ID")
  private String basketballGameId;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getBasketballLotteryId() {
    return basketballLotteryId;
  }

  public void setBasketballLotteryId(String basketballLotteryId) {
    this.basketballLotteryId = basketballLotteryId;
  }

  public String getPageOdds() {
    return pageOdds;
  }

  public void setPageOdds(String pageOdds) {
    this.pageOdds = pageOdds;
  }

  public String getActualOdds() {
    return actualOdds;
  }

  public void setActualOdds(String actualOdds) {
    this.actualOdds = actualOdds;
  }

  public String getWinFlag() {
    return winFlag;
  }

  public void setWinFlag(String winFlag) {
    this.winFlag = winFlag;
  }

  public String getLotteryTime() {
    return lotteryTime;
  }

  public void setLotteryTime(String lotteryTime) {
    this.lotteryTime = lotteryTime;
  }

  public String getBasketballGameId() {
    return basketballGameId;
  }

  public void setBasketballGameId(String basketballGameId) {
    this.basketballGameId = basketballGameId;
  }
}

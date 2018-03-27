package com.abuelink.lottery.model.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_BASKETBALL_USER_BETS")
public class BasketballUserBets implements java.io.Serializable{

  @Id
  @Column(name = "ID")
  private String id;

  @Column(name = "BUY_TIME")
  private String buyTime;

  @Column(name = "BUY_WAY")
  private String buyWay;

  @Column(name = "USER_ID")
  private String userId;

  @Column(name = "WIN_FLAG")
  private String winFlag;

  @Column(name = "PAGE_ODDS")
  private String pageOdds;

  @Column(name = "ACTUAL_ODDS")
  private String actualOdds;

  @Column(name = "MULTIPLE_NUMS")
  private String multipleNums;

  @Column(name = "BET_NUMS")
  private String betNums;

  @Column(name = "PER_AMOUNT")
  private String perAmount;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getBuyTime() {
    return buyTime;
  }

  public void setBuyTime(String buyTime) {
    this.buyTime = buyTime;
  }

  public String getBuyWay() {
    return buyWay;
  }

  public void setBuyWay(String buyWay) {
    this.buyWay = buyWay;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getWinFlag() {
    return winFlag;
  }

  public void setWinFlag(String winFlag) {
    this.winFlag = winFlag;
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

  public String getMultipleNums() {
    return multipleNums;
  }

  public void setMultipleNums(String multipleNums) {
    this.multipleNums = multipleNums;
  }

  public String getBetNums() {
    return betNums;
  }

  public void setBetNums(String betNums) {
    this.betNums = betNums;
  }

  public String getPerAmount() {
    return perAmount;
  }

  public void setPerAmount(String perAmount) {
    this.perAmount = perAmount;
  }
}

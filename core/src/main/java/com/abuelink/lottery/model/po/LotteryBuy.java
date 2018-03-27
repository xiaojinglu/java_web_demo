package com.abuelink.lottery.model.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_LOTTERY_BUY")
public class LotteryBuy implements java.io.Serializable{

  @Id
  @Column(name = "ID")
  private String id;

  @Column(name = "USER_ID")
  private String userId;

  @Column(name = "LOTTERY_ID")
  private String lotteryId;

  @Column(name = "BUY_TIME")
  private String buyTime;

  @Column(name = "BUY_CODE")
  private String buyCode;

  @Column(name = "BUY_MULTIPLE")
  private String buyMultiple;

  @Column(name = "REWARD_AMOUNT")
  private String rewardAmount;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getLotteryId() {
    return lotteryId;
  }

  public void setLotteryId(String lotteryId) {
    this.lotteryId = lotteryId;
  }

  public String getBuyTime() {
    return buyTime;
  }

  public void setBuyTime(String buyTime) {
    this.buyTime = buyTime;
  }

  public String getBuyCode() {
    return buyCode;
  }

  public void setBuyCode(String buyCode) {
    this.buyCode = buyCode;
  }

  public String getBuyMultiple() {
    return buyMultiple;
  }

  public void setBuyMultiple(String buyMultiple) {
    this.buyMultiple = buyMultiple;
  }

  public String getRewardAmount() {
    return rewardAmount;
  }

  public void setRewardAmount(String rewardAmount) {
    this.rewardAmount = rewardAmount;
  }
}

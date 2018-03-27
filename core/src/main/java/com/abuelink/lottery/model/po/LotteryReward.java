package com.abuelink.lottery.model.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_LOTTERY_REWARD")
public class LotteryReward implements java.io.Serializable{

  @Id
  @Column(name = "ID")
  private String id;

  @Column(name = "TIME")
  private String time;

  @Column(name = "LOTTERY_ID")
  private String lotteryId;

  @Column(name = "REWARD_CODE")
  private String rewardCode;

  @Column(name = "PERIOD")
  private String period;

  @Column(name = "FIRST_PRIZE")
  private String firstPrize;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public String getLotteryId() {
    return lotteryId;
  }

  public void setLotteryId(String lotteryId) {
    this.lotteryId = lotteryId;
  }

  public String getRewardCode() {
    return rewardCode;
  }

  public void setRewardCode(String rewardCode) {
    this.rewardCode = rewardCode;
  }

  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }

  public String getFirstPrize() {
    return firstPrize;
  }

  public void setFirstPrize(String firstPrize) {
    this.firstPrize = firstPrize;
  }
}

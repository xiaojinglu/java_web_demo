package com.abuelink.lottery.model.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_BANK_CARD")
public class BankCard implements java.io.Serializable{

  @Id
  @Column(name = "ID")
  private String id;

  @Column(name = "USER_ID")
  private String userId;

  @Column(name = "BIND_TIME")
  private String bindTime;

  @Column(name = "CARD_TYPE")
  private String cardType;

  @Column(name = "CARD_OWNER_NAME")
  private String cardOwnerName;

  @Column(name = "CARD_OWNER_SFZH")
  private String cardOwnerSfzh;

  @Column(name = "CARD_OWNER_PHONE")
  private String cardOwnerPhone;

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

  public String getBindTime() {
    return bindTime;
  }

  public void setBindTime(String bindTime) {
    this.bindTime = bindTime;
  }

  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public String getCardOwnerName() {
    return cardOwnerName;
  }

  public void setCardOwnerName(String cardOwnerName) {
    this.cardOwnerName = cardOwnerName;
  }

  public String getCardOwnerSfzh() {
    return cardOwnerSfzh;
  }

  public void setCardOwnerSfzh(String cardOwnerSfzh) {
    this.cardOwnerSfzh = cardOwnerSfzh;
  }

  public String getCardOwnerPhone() {
    return cardOwnerPhone;
  }

  public void setCardOwnerPhone(String cardOwnerPhone) {
    this.cardOwnerPhone = cardOwnerPhone;
  }
}

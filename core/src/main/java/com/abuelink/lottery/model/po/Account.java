package com.abuelink.lottery.model.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_ACCOUNT")
public class Account implements java.io.Serializable{

  @Id
  @Column(name = "ID")
  private String id;

  @Column(name = "USER_ID")
  private String userId;

  @Column(name = "ACCOUNT_REMAIND")
  private String accountRemaind;

  @Column(name = "VIRTUAL_CURRENCY_REMAIND")
  private String virtualCurrencyRemaind;

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

  public String getAccountRemaind() {
    return accountRemaind;
  }

  public void setAccountRemaind(String accountRemaind) {
    this.accountRemaind = accountRemaind;
  }

  public String getVirtualCurrencyRemaind() {
    return virtualCurrencyRemaind;
  }

  public void setVirtualCurrencyRemaind(String virtualCurrencyRemaind) {
    this.virtualCurrencyRemaind = virtualCurrencyRemaind;
  }
}

package com.abuelink.lottery.model.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_WITHDRAW")
public class Withdraw implements java.io.Serializable{

  @Id
  @Column(name = "ID")
  private String id;

  @Column(name = "TIME")
  private String time;

  @Column(name = "SOURCE_ACCOUNT")
  private String sourceAccount;

  @Column(name = "TARGET_ACCOUNT")
  private String targetAccount;

  @Column(name = "AMOUNT")
  private String amount;

  @Column(name = "ACCOUNT_ID")
  private String accountId;

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

  public String getSourceAccount() {
    return sourceAccount;
  }

  public void setSourceAccount(String sourceAccount) {
    this.sourceAccount = sourceAccount;
  }

  public String getTargetAccount() {
    return targetAccount;
  }

  public void setTargetAccount(String targetAccount) {
    this.targetAccount = targetAccount;
  }

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }
}

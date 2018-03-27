package com.abuelink.lottery.model.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_RECHARGE")
public class Recharge implements java.io.Serializable{

  @Id
  @Column(name = "ID")
  private String id;

  @Column(name = "ACCOUNT_ID")
  private String accountId;

  @Column(name = "SOURCE")
  private String source;

  @Column(name = "TIME")
  private String time;

  @Column(name = "AMOUNT")
  private String amount;

  @Column(name = "SOURCE_ID")
  private String sourceId;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }
}

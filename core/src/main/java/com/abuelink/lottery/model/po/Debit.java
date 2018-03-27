package com.abuelink.lottery.model.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_DEBIT")
public class Debit implements java.io.Serializable{

  @Id
  @Column(name = "ID")
  private String id;

  @Column(name="ACCOUNT_ID")
  private String account_id;

  @Column(name = "TIME")
  private String time;

  @Column(name = "AMOUNT")
  private String amount;

  @Column(name = "REASON")
  private String reason;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getAccount_id() {
    return account_id;
  }

  public void setAccount_id(String account_id) {
    this.account_id = account_id;
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

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }
}

package com.abuelink.lottery.model.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_PRIZE")
public class Prize implements java.io.Serializable{

  @Id
  @Column(name = "ID")
  private String id;
  @Column(name = "TIME")
  private String time;

  @Column(name = "SOURCE_ACCOUNT")
  private String source_account;

  @Column(name = "TARGET_ACCOUNT")
  private String target_account;

  @Column(name = "AMOUNT")
  private String amount;

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

  public String getSource_account() {
    return source_account;
  }

  public void setSource_account(String source_account) {
    this.source_account = source_account;
  }

  public String getTarget_account() {
    return target_account;
  }

  public void setTarget_account(String target_account) {
    this.target_account = target_account;
  }

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }
}

package com.abuelink.lottery.model.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_LOTTERY")
public class Lottery implements java.io.Serializable{

  @Id
  @Column(name = "ID")
  private String id;

  @Column(name = "KIND_NAME")
  private String kindName;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getKindName() {
    return kindName;
  }

  public void setKindName(String kindName) {
    this.kindName = kindName;
  }
}

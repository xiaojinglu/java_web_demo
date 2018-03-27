package com.abuelink.lottery.model.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_USER")
public class User implements java.io.Serializable{

  @Id
  @Column(name = "id")
  private String id;

  @Column(name = "TELLPHONE")
  private Long tellphone;

  @Column(name = "NAME")
  private String name;

  @Column(name = "SEX")
  private String sex;

  @Column(name = "NICK_NAME")
  private String nickName;

  @Column(name = "HAS_CERTIFICATE")
  private String hasCertificate;

  @Column(name = "CREDENT_NO")
  private String credentNo;

  @Column(name = "HEAD_PICTURE_URL")
  private String headPictureUrl;

  @Column(name = "ALI_PAY_ACCOUNT")
  private String aliPayAccount;

  @Column(name = "WIXIN_PAY_ACCOUNT")
  private String wixinPayAccount;

  @Column(name = "LOGIN_PASSWORD")
  private String loginPassword;

  @Column(name = "ACCOUNT_PASSWORD")
  private String accountPassword;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Long getTellphone() {
    return tellphone;
  }

  public void setTellphone(Long tellphone) {
    this.tellphone = tellphone;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public String getHasCertificate() {
    return hasCertificate;
  }

  public void setHasCertificate(String hasCertificate) {
    this.hasCertificate = hasCertificate;
  }

  public String getCredentNo() {
    return credentNo;
  }

  public void setCredentNo(String credentNo) {
    this.credentNo = credentNo;
  }

  public String getHeadPictureUrl() {
    return headPictureUrl;
  }

  public void setHeadPictureUrl(String headPictureUrl) {
    this.headPictureUrl = headPictureUrl;
  }

  public String getAliPayAccount() {
    return aliPayAccount;
  }

  public void setAliPayAccount(String aliPayAccount) {
    this.aliPayAccount = aliPayAccount;
  }

  public String getWixinPayAccount() {
    return wixinPayAccount;
  }

  public void setWixinPayAccount(String wixinPayAccount) {
    this.wixinPayAccount = wixinPayAccount;
  }

  public String getLoginPassword() {
    return loginPassword;
  }

  public void setLoginPassword(String loginPassword) {
    this.loginPassword = loginPassword;
  }

  public String getAccountPassword() {
    return accountPassword;
  }

  public void setAccountPassword(String accountPassword) {
    this.accountPassword = accountPassword;
  }
}

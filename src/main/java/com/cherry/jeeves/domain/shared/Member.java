package com.cherry.jeeves.domain.shared;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Member {
    @JsonProperty
    private int Uin;
    @JsonProperty
    private String UserName;
    @JsonProperty
    private String NickName;
    @JsonProperty
    private String HeadImgUrl;
    @JsonProperty
    private int ContactFlag;
    @JsonProperty
    private String RemarkName;
    @JsonProperty
    private int HideInputBarFlag;
    @JsonProperty
    private int Sex;
    @JsonProperty
    private String Signature;
    @JsonProperty
    private int VerifyFlag;
    @JsonProperty
    private String PYInitial;
    @JsonProperty
    private String PYQuanPin;
    @JsonProperty
    private String RemarkPYInitial;
    @JsonProperty
    private String RemarkPYQuanPin;
    @JsonProperty
    private int StarFriend;
    @JsonProperty
    private int AppAccountFlag;
    @JsonProperty
    private int SnsFlag;

    public int getUin() {
        return Uin;
    }

    public void setUin(int uin) {
        Uin = uin;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }

    public String getHeadImgUrl() {
        return HeadImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        HeadImgUrl = headImgUrl;
    }

    public int getContactFlag() {
        return ContactFlag;
    }

    public void setContactFlag(int contactFlag) {
        ContactFlag = contactFlag;
    }

    public String getRemarkName() {
        return RemarkName;
    }

    public void setRemarkName(String remarkName) {
        RemarkName = remarkName;
    }

    public int getHideInputBarFlag() {
        return HideInputBarFlag;
    }

    public void setHideInputBarFlag(int hideInputBarFlag) {
        HideInputBarFlag = hideInputBarFlag;
    }

    public int getSex() {
        return Sex;
    }

    public void setSex(int sex) {
        Sex = sex;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String signature) {
        Signature = signature;
    }

    public int getVerifyFlag() {
        return VerifyFlag;
    }

    public void setVerifyFlag(int verifyFlag) {
        VerifyFlag = verifyFlag;
    }

    public String getPYInitial() {
        return PYInitial;
    }

    public void setPYInitial(String PYInitial) {
        this.PYInitial = PYInitial;
    }

    public String getPYQuanPin() {
        return PYQuanPin;
    }

    public void setPYQuanPin(String PYQuanPin) {
        this.PYQuanPin = PYQuanPin;
    }

    public String getRemarkPYInitial() {
        return RemarkPYInitial;
    }

    public void setRemarkPYInitial(String remarkPYInitial) {
        RemarkPYInitial = remarkPYInitial;
    }

    public String getRemarkPYQuanPin() {
        return RemarkPYQuanPin;
    }

    public void setRemarkPYQuanPin(String remarkPYQuanPin) {
        RemarkPYQuanPin = remarkPYQuanPin;
    }

    public int getStarFriend() {
        return StarFriend;
    }

    public void setStarFriend(int starFriend) {
        StarFriend = starFriend;
    }

    public int getAppAccountFlag() {
        return AppAccountFlag;
    }

    public void setAppAccountFlag(int appAccountFlag) {
        AppAccountFlag = appAccountFlag;
    }

    public int getSnsFlag() {
        return SnsFlag;
    }

    public void setSnsFlag(int snsFlag) {
        SnsFlag = snsFlag;
    }
}
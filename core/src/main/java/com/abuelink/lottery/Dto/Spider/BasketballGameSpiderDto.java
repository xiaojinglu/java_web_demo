package com.abuelink.lottery.Dto.Spider;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * \* User: xjlu@iflytek.com
 * \* Date: 2018/3/19
 * \* Time: 16:58
 * \* Description:
 * \
 */
public class BasketballGameSpiderDto {
    private String buyEndTime;
    private String gid;
    private String guestName;
    private String guestTeamURL;
    private String hid;
    private String hint;
    private String hostName;
    private String hostRankInfo;
    private String hostTeamURL;
    private boolean isMyFocusOn;
    private String leagueColor;
    private String leagueName;
    private String leagueURL;
    private String lid;
    private String matchCode;
    private String matchDate;
    private String mid;
    private ArrayList<ArrayList<String>> mixBidCounts;
    private String mixBidScore;
    private ArrayList<ArrayList<String>> mixHotCounts;
    private ArrayList<Number> mixStatus;
    private ArrayList<Number> singleMixStatus;
    private ArrayList<ArrayList<String>> spTabMix;
    private String startTime;
    private Number status;
    private String visitRankInfo;
    private String zxAnalysisURL;

    public static BasketballGameSpiderDto genBasketball(LinkedTreeMap<String, Object> source) {
        BasketballGameSpiderDto bb = null;
         Gson gson = new Gson();
        String str = gson.toJson(source);
        bb = (BasketballGameSpiderDto)gson.fromJson(str, BasketballGameSpiderDto.class);
        return bb;
    }

    @Override
    public String toString() {
        return "BasketballGameSpiderDto{" +
                "buyEndTime='" + buyEndTime + '\'' +
                ", gid='" + gid + '\'' +
                ", guestName='" + guestName + '\'' +
                ", guestTeamURL='" + guestTeamURL + '\'' +
                ", hid='" + hid + '\'' +
                ", hint='" + hint + '\'' +
                ", hostName='" + hostName + '\'' +
                ", hostRankInfo='" + hostRankInfo + '\'' +
                ", hostTeamURL='" + hostTeamURL + '\'' +
                ", isMyFocusOn=" + isMyFocusOn +
                ", leagueColor='" + leagueColor + '\'' +
                ", leagueName='" + leagueName + '\'' +
                ", leagueURL='" + leagueURL + '\'' +
                ", lid='" + lid + '\'' +
                ", matchCode='" + matchCode + '\'' +
                ", matchDate='" + matchDate + '\'' +
                ", mid='" + mid + '\'' +
                ", mixBidCounts=" + mixBidCounts +
                ", mixBidScore='" + mixBidScore + '\'' +
                ", mixHotCounts=" + mixHotCounts +
                ", mixStatus=" + mixStatus +
                ", singleMixStatus=" + singleMixStatus +
                ", spTabMix=" + spTabMix +
                ", startTime='" + startTime + '\'' +
                ", status=" + status +
                ", visitRankInfo='" + visitRankInfo + '\'' +
                ", zxAnalysisURL='" + zxAnalysisURL + '\'' +
                '}';
    }

    public String getBuyEndTime() {
        return (new SimpleDateFormat("yyyy-MM-dd[HH:mm:ss]")).format(new Date(Long.parseLong(this.buyEndTime)));
    }

    public void setBuyEndTime(String buyEndTime) {
        this.buyEndTime = buyEndTime;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getGuestTeamURL() {
        return guestTeamURL;
    }

    public void setGuestTeamURL(String guestTeamURL) {
        this.guestTeamURL = guestTeamURL;
    }

    public String getHid() {
        return hid;
    }

    public void setHid(String hid) {
        this.hid = hid;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getHostRankInfo() {
        return hostRankInfo;
    }

    public void setHostRankInfo(String hostRankInfo) {
        this.hostRankInfo = hostRankInfo;
    }

    public String getHostTeamURL() {
        return hostTeamURL;
    }

    public void setHostTeamURL(String hostTeamURL) {
        this.hostTeamURL = hostTeamURL;
    }

    public boolean isMyFocusOn() {
        return isMyFocusOn;
    }

    public void setMyFocusOn(boolean myFocusOn) {
        isMyFocusOn = myFocusOn;
    }

    public String getLeagueColor() {
        return leagueColor;
    }

    public void setLeagueColor(String leagueColor) {
        this.leagueColor = leagueColor;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueURL() {
        return leagueURL;
    }

    public void setLeagueURL(String leagueURL) {
        this.leagueURL = leagueURL;
    }

    public String getLid() {
        return lid;
    }

    public void setLid(String lid) {
        this.lid = lid;
    }

    public String getMatchCode() {
        return matchCode;
    }

    public void setMatchCode(String matchCode) {
        this.matchCode = matchCode;
    }

    public String getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(String matchDate) {
        this.matchDate = matchDate;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public ArrayList<ArrayList<String>> getMixBidCounts() {
        return mixBidCounts;
    }

    public void setMixBidCounts(ArrayList<ArrayList<String>> mixBidCounts) {
        this.mixBidCounts = mixBidCounts;
    }

    public String getMixBidScore() {
        return mixBidScore;
    }

    public void setMixBidScore(String mixBidScore) {
        this.mixBidScore = mixBidScore;
    }

    public ArrayList<ArrayList<String>> getMixHotCounts() {
        return mixHotCounts;
    }

    public void setMixHotCounts(ArrayList<ArrayList<String>> mixHotCounts) {
        this.mixHotCounts = mixHotCounts;
    }

    public ArrayList<Number> getMixStatus() {
        return mixStatus;
    }

    public void setMixStatus(ArrayList<Number> mixStatus) {
        this.mixStatus = mixStatus;
    }

    public ArrayList<Number> getSingleMixStatus() {
        return singleMixStatus;
    }

    public void setSingleMixStatus(ArrayList<Number> singleMixStatus) {
        this.singleMixStatus = singleMixStatus;
    }

    public ArrayList<ArrayList<String>> getSpTabMix() {
        return spTabMix;
    }

    public void setSpTabMix(ArrayList<ArrayList<String>> spTabMix) {
        this.spTabMix = spTabMix;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Number getStatus() {
        return status;
    }

    public void setStatus(Number status) {
        this.status = status;
    }

    public String getVisitRankInfo() {
        return visitRankInfo;
    }

    public void setVisitRankInfo(String visitRankInfo) {
        this.visitRankInfo = visitRankInfo;
    }

    public String getZxAnalysisURL() {
        return zxAnalysisURL;
    }

    public void setZxAnalysisURL(String zxAnalysisURL) {
        this.zxAnalysisURL = zxAnalysisURL;
    }
}
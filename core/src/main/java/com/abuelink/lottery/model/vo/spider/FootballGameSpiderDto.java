package com.abuelink.lottery.model.vo.spider;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * \* User: xjlu
 * \* Date: 2018/3/19
 * \* Time: 16:59
 * \* Description:
 * \
 */
public class FootballGameSpiderDto {
    private String isStop;
    private String matchCode;
    private String matchnumcn;
    private Date startTime;
    private Date endTime;
    private String hostName;
    private String guestName;
    private String leagueID;
    private String hostTeamID;
    private String hostInt;
    private String visitTeamID;
    private String visitInt;
    private String matchID;
    private String leagueName;
    private String cls;
    private ArrayList<String> rq0;
    private ArrayList<String> rq1;
    private ArrayList<String> halfOrFull;
    private ArrayList<ArrayList<String>> score1;
    private ArrayList<String> score2;

    public FootballGameSpiderDto() {
        this.rq0 = new ArrayList();
        this.rq1 = new ArrayList();
        this.halfOrFull = new ArrayList();
        this.score1 = new ArrayList();
        this.score2 = new ArrayList();
    }

    public FootballGameSpiderDto(FootballGameSpiderDto fbg1, FootballGameSpiderDto fbg2) {
        this.isStop = fbg1.isStop;
        this.matchCode = fbg1.matchCode;
        this.matchnumcn = fbg1.matchnumcn;
        this.startTime = fbg1.startTime;
        this.endTime = fbg1.endTime;
        this.hostName = fbg1.hostName;
        this.guestName = fbg1.guestName;
        this.leagueID = fbg1.leagueID;
        this.hostTeamID = fbg1.hostTeamID;
        this.hostInt = fbg1.hostInt;
        this.visitTeamID = fbg1.visitTeamID;
        this.visitInt = fbg1.visitInt;
        this.matchID = fbg1.matchID;
        this.leagueName = fbg1.leagueName;
        this.cls = fbg1.cls;
        this.rq0 = new ArrayList(fbg1.rq0);
        this.rq1 = new ArrayList(fbg1.rq1);
        this.halfOrFull = new ArrayList(fbg2.getHalfOrFull());
        this.score1 = new ArrayList(fbg2.getScore1());
        this.score2 = new ArrayList(fbg2.getScore2());
    }

    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd[HH:mm:ss]");
        return "FootballGameSpiderDto{" +
                "isStop='" + isStop + '\'' +
                ", matchCode='" + matchCode + '\'' +
                ", matchnumcn='" + matchnumcn + '\'' +
                ", startTime=" + df.format(this.startTime) +
                ", endTime=" + df.format(this.endTime) +
                ", hostName='" + hostName + '\'' +
                ", guestName='" + guestName + '\'' +
                ", leagueID='" + leagueID + '\'' +
                ", hostTeamID='" + hostTeamID + '\'' +
                ", hostInt='" + hostInt + '\'' +
                ", visitTeamID='" + visitTeamID + '\'' +
                ", visitInt='" + visitInt + '\'' +
                ", matchID='" + matchID + '\'' +
                ", leagueName='" + leagueName + '\'' +
                ", cls='" + cls + '\'' +
                ", rq0=" + rq0 +
                ", rq1=" + rq1 +
                ", halfOrFull=" + halfOrFull +
                ", score1=" + score1 +
                ", score2=" + score2 +
                '}';
    }

    public String getIsStop() {
        return isStop;
    }

    public void setIsStop(String isStop) {
        this.isStop = isStop;
    }

    public String getMatchCode() {
        return matchCode;
    }

    public void setMatchCode(String matchCode) {
        this.matchCode = matchCode;
    }

    public String getMatchnumcn() {
        return matchnumcn;
    }

    public void setMatchnumcn(String matchnumcn) {
        this.matchnumcn = matchnumcn;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getLeagueID() {
        return leagueID;
    }

    public void setLeagueID(String leagueID) {
        this.leagueID = leagueID;
    }

    public String getHostTeamID() {
        return hostTeamID;
    }

    public void setHostTeamID(String hostTeamID) {
        this.hostTeamID = hostTeamID;
    }

    public String getHostInt() {
        return hostInt;
    }

    public void setHostInt(String hostInt) {
        this.hostInt = hostInt;
    }

    public String getVisitTeamID() {
        return visitTeamID;
    }

    public void setVisitTeamID(String visitTeamID) {
        this.visitTeamID = visitTeamID;
    }

    public String getVisitInt() {
        return visitInt;
    }

    public void setVisitInt(String visitInt) {
        this.visitInt = visitInt;
    }

    public String getMatchID() {
        return matchID;
    }

    public void setMatchID(String matchID) {
        this.matchID = matchID;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getCls() {
        return cls;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }

    public ArrayList<String> getRq0() {
        return rq0;
    }

    public void setRq0(ArrayList<String> rq0) {
        this.rq0 = rq0;
    }

    public ArrayList<String> getRq1() {
        return rq1;
    }

    public void setRq1(ArrayList<String> rq1) {
        this.rq1 = rq1;
    }

    public ArrayList<String> getHalfOrFull() {
        return halfOrFull;
    }

    public void setHalfOrFull(ArrayList<String> halfOrFull) {
        this.halfOrFull = halfOrFull;
    }

    public ArrayList<ArrayList<String>> getScore1() {
        return score1;
    }

    public void setScore1(ArrayList<ArrayList<String>> score1) {
        this.score1 = score1;
    }

    public ArrayList<String> getScore2() {
        return score2;
    }

    public void setScore2(ArrayList<String> score2) {
        this.score2 = score2;
    }
}
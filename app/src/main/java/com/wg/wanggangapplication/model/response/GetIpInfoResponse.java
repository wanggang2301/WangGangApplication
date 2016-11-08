package com.wg.wanggangapplication.model.response;

import com.wg.wanggangapplication.model.TeamInfo;

/**
 * Created by asus1 on 2016/3/22.
 */
public class GetIpInfoResponse  {

    public String result;

    public String liveStatus;

    public String matchType2;

    public String matchType1;

    public String matchStatus;

    public TeamInfo homeTeamInfo;

    public TeamInfo guestTeamInfo;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getLiveStatus() {
        return liveStatus;
    }

    public void setLiveStatus(String liveStatus) {
        this.liveStatus = liveStatus;
    }

    public String getMatchType2() {
        return matchType2;
    }

    public void setMatchType2(String matchType2) {
        this.matchType2 = matchType2;
    }

    public String getMatchType1() {
        return matchType1;
    }

    public void setMatchType1(String matchType1) {
        this.matchType1 = matchType1;
    }

    public String getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
    }

    public TeamInfo getHomeTeamInfo() {
        return homeTeamInfo;
    }

    public void setHomeTeamInfo(TeamInfo homeTeamInfo) {
        this.homeTeamInfo = homeTeamInfo;
    }

    public TeamInfo getGuestTeamInfo() {
        return guestTeamInfo;
    }

    public void setGuestTeamInfo(TeamInfo guestTeamInfo) {
        this.guestTeamInfo = guestTeamInfo;
    }
}

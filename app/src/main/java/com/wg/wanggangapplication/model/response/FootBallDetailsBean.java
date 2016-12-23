package com.wg.wanggangapplication.model.response;

import java.util.List;

/**
 * @author: Wangg
 * @Name：FootBallDetailsBean
 * @Description:
 * @Created on:2016/12/23  12:00.
 */

public class FootBallDetailsBean {
    /**
     * result : 200
     * liveStatus : -1
     * matchType2 : 联赛
     * matchType1 : 葡超
     * homeTeamInfo : {"id":999,"name":"查维斯","url":"http://pic.13322.com/icons/teams/100/999.png","gas":7,"rc":0,"yc":2,"corner":10,"score":1,"halfScore":0,"danger":48,"shot":3,"aside":8,"trapping":0,"columnals":0,"foul":0,"freeHit":0,"lineOut":0,"offSide":0,"lineUp":[{"name":"Ricardo"},{"name":"Nelson"},{"name":"Freire"},{"name":"Paulinho"},{"name":"Braga"},{"name":"Assis"},{"name":"R. Battaglia"},{"name":"Ponck"},{"name":"Willian"},{"name":"Perdigão"},{"name":"Fábio Martins"}],"attackCount":89}
     * matchStatus : -1
     * matchInfo : {"keepTime":null,"matchLive":[{"msgId":689,"time":"5588286","msgText":"主裁判终场哨音吹响,下半场比赛结束了!全场比分 1:0","msgPlace":1,"code":3,"showId":0,"cancelEnNum":null,"fontStyle":4,"enNum":907,"state":-1,"homeScore":1,"guestScore":0,"playInfo":null,"eventReNum":null},{"msgId":688,"time":"5582784","msgText":"球出边线,客队掷界外球","msgPlace":2,"code":2078,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":905,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":687,"time":"5571223","msgText":"客队中场组织进攻","msgPlace":2,"code":2048,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":904,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":686,"time":"5570086","msgText":"客队后场控球","msgPlace":2,"code":2075,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":903,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":685,"time":"5568841","msgText":"主队攻到对方禁区前沿","msgPlace":1,"code":1026,"showId":0,"cancelEnNum":null,"fontStyle":1,"enNum":902,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":684,"time":"5565545","msgText":"主队中场组织进攻","msgPlace":1,"code":1024,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":900,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":683,"time":"5551528","msgText":"球出边线,主队掷界外球","msgPlace":1,"code":1054,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":898,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":682,"time":"5548542","msgText":"主队后场控球","msgPlace":1,"code":1051,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":897,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":681,"time":"5545063","msgText":"客队中场组织进攻","msgPlace":2,"code":2048,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":896,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":680,"time":"5544381","msgText":"客队后场控球","msgPlace":2,"code":2075,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":895,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":679,"time":"5540901","msgText":"主队中场组织进攻","msgPlace":1,"code":1024,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":894,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":678,"time":"5534240","msgText":"客队后场控球","msgPlace":2,"code":2075,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":893,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":677,"time":"5532600","msgText":"主队中场组织进攻","msgPlace":1,"code":1024,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":892,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":676,"time":"5513565","msgText":"球出边线,主队掷界外球","msgPlace":1,"code":1054,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":890,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":675,"time":"5512341","msgText":"主队后场控球","msgPlace":1,"code":1051,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":889,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":674,"time":"5507983","msgText":"客队中场组织进攻","msgPlace":2,"code":2048,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":888,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":673,"time":"5498219","msgText":"球出底线,客队球门球","msgPlace":2,"code":2077,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":886,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":672,"time":"5496224","msgText":"客队后场控球","msgPlace":2,"code":2075,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":885,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":671,"time":"5473981","msgText":"区域信息","msgPlace":0,"code":262,"showId":1,"cancelEnNum":"882","fontStyle":0,"enNum":883,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":670,"time":"5472726","msgText":"球出底线,主队获得角球","msgPlace":1,"code":1025,"showId":0,"cancelEnNum":null,"fontStyle":4,"enNum":882,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null}],"matchTimeLive":[{"time":111046,"code":"1025","isHome":1,"state":1,"playInfo":null},{"time":377820,"code":"1025","isHome":1,"state":1,"playInfo":null},{"time":676278,"code":"2049","isHome":0,"state":1,"playInfo":null},{"time":1084443,"code":"1034","isHome":1,"state":1,"playInfo":"Paulinho"},{"time":1445205,"code":"2058","isHome":0,"state":1,"playInfo":"Dankler"},{"time":2009800,"code":"1025","isHome":1,"state":1,"playInfo":null},{"time":2087841,"code":"2049","isHome":0,"state":1,"playInfo":null},{"time":2482422,"code":"1034","isHome":1,"state":1,"playInfo":"Assis"},{"time":2598099,"code":"1025","isHome":1,"state":1,"playInfo":null},{"time":2737619,"code":"2049","isHome":0,"state":1,"playInfo":null},{"time":2823699,"code":"1","isHome":1,"state":2,"playInfo":null},{"time":2742821,"code":"1025","isHome":1,"state":3,"playInfo":null},{"time":2940887,"code":"1025","isHome":1,"state":3,"playInfo":null},{"time":3082439,"code":"2049","isHome":0,"state":3,"playInfo":null},{"time":3198783,"code":"1025","isHome":1,"state":3,"playInfo":null},{"time":3265032,"code":"2079","isHome":0,"state":3,"playInfo":"27:71"},{"time":3480787,"code":"2058","isHome":0,"state":3,"playInfo":"Mattheus"},{"time":3541302,"code":"1025","isHome":1,"state":3,"playInfo":null},{"time":4045103,"code":"1029","isHome":1,"state":3,"playInfo":"Fábio Martins"},{"time":4112478,"code":"2079","isHome":0,"state":3,"playInfo":"14:18"},{"time":4569924,"code":"1055","isHome":1,"state":3,"playInfo":"9:99"},{"time":5004442,"code":"1025","isHome":1,"state":3,"playInfo":null},{"time":5099404,"code":"1055","isHome":1,"state":3,"playInfo":"3:10"},{"time":5279862,"code":"2079","isHome":0,"state":3,"playInfo":"11:8"},{"time":5310763,"code":"1055","isHome":1,"state":3,"playInfo":"4:25"},{"time":5372022,"code":"2049","isHome":0,"state":3,"playInfo":null},{"time":5472726,"code":"1025","isHome":1,"state":3,"playInfo":null}]}
     * guestTeamInfo : {"id":486,"name":"埃斯托里尔","url":"http://pic.13322.com/icons/teams/100/486.png","gas":4,"rc":0,"yc":2,"corner":5,"score":0,"halfScore":0,"danger":30,"shot":4,"aside":1,"trapping":0,"columnals":0,"foul":0,"freeHit":0,"lineOut":0,"offSide":0,"lineUp":[{"name":"Moreira"},{"name":"Dankler"},{"name":"O. Diakhite"},{"name":"João Afonso"},{"name":"Joel"},{"name":"Diogo Amado"},{"name":"Matheus Índio"},{"name":"Eduardo"},{"name":"Alisson Farias"},{"name":"K. Bazelyuk"},{"name":"Bruno Gomes"}],"attackCount":85}
     */

    private String result;
    private String liveStatus;
    private String matchType2;
    private String matchType1;
    private HomeTeamInfoBean homeTeamInfo;
    private int matchStatus;
    private MatchInfoBean matchInfo;
    private GuestTeamInfoBean guestTeamInfo;

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

    public HomeTeamInfoBean getHomeTeamInfo() {
        return homeTeamInfo;
    }

    public void setHomeTeamInfo(HomeTeamInfoBean homeTeamInfo) {
        this.homeTeamInfo = homeTeamInfo;
    }

    public int getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(int matchStatus) {
        this.matchStatus = matchStatus;
    }

    public MatchInfoBean getMatchInfo() {
        return matchInfo;
    }

    public void setMatchInfo(MatchInfoBean matchInfo) {
        this.matchInfo = matchInfo;
    }

    public GuestTeamInfoBean getGuestTeamInfo() {
        return guestTeamInfo;
    }

    public void setGuestTeamInfo(GuestTeamInfoBean guestTeamInfo) {
        this.guestTeamInfo = guestTeamInfo;
    }

    public static class HomeTeamInfoBean {
        /**
         * id : 999
         * name : 查维斯
         * url : http://pic.13322.com/icons/teams/100/999.png
         * gas : 7
         * rc : 0
         * yc : 2
         * corner : 10
         * score : 1
         * halfScore : 0
         * danger : 48
         * shot : 3
         * aside : 8
         * trapping : 0
         * columnals : 0
         * foul : 0
         * freeHit : 0
         * lineOut : 0
         * offSide : 0
         * lineUp : [{"name":"Ricardo"},{"name":"Nelson"},{"name":"Freire"},{"name":"Paulinho"},{"name":"Braga"},{"name":"Assis"},{"name":"R. Battaglia"},{"name":"Ponck"},{"name":"Willian"},{"name":"Perdigão"},{"name":"Fábio Martins"}]
         * attackCount : 89
         */

        private int id;
        private String name;
        private String url;
        private int gas;
        private int rc;
        private int yc;
        private int corner;
        private int score;
        private int halfScore;
        private int danger;
        private int shot;
        private int aside;
        private int trapping;
        private int columnals;
        private int foul;
        private int freeHit;
        private int lineOut;
        private int offSide;
        private int attackCount;
        private List<LineUpBean> lineUp;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getGas() {
            return gas;
        }

        public void setGas(int gas) {
            this.gas = gas;
        }

        public int getRc() {
            return rc;
        }

        public void setRc(int rc) {
            this.rc = rc;
        }

        public int getYc() {
            return yc;
        }

        public void setYc(int yc) {
            this.yc = yc;
        }

        public int getCorner() {
            return corner;
        }

        public void setCorner(int corner) {
            this.corner = corner;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getHalfScore() {
            return halfScore;
        }

        public void setHalfScore(int halfScore) {
            this.halfScore = halfScore;
        }

        public int getDanger() {
            return danger;
        }

        public void setDanger(int danger) {
            this.danger = danger;
        }

        public int getShot() {
            return shot;
        }

        public void setShot(int shot) {
            this.shot = shot;
        }

        public int getAside() {
            return aside;
        }

        public void setAside(int aside) {
            this.aside = aside;
        }

        public int getTrapping() {
            return trapping;
        }

        public void setTrapping(int trapping) {
            this.trapping = trapping;
        }

        public int getColumnals() {
            return columnals;
        }

        public void setColumnals(int columnals) {
            this.columnals = columnals;
        }

        public int getFoul() {
            return foul;
        }

        public void setFoul(int foul) {
            this.foul = foul;
        }

        public int getFreeHit() {
            return freeHit;
        }

        public void setFreeHit(int freeHit) {
            this.freeHit = freeHit;
        }

        public int getLineOut() {
            return lineOut;
        }

        public void setLineOut(int lineOut) {
            this.lineOut = lineOut;
        }

        public int getOffSide() {
            return offSide;
        }

        public void setOffSide(int offSide) {
            this.offSide = offSide;
        }

        public int getAttackCount() {
            return attackCount;
        }

        public void setAttackCount(int attackCount) {
            this.attackCount = attackCount;
        }

        public List<LineUpBean> getLineUp() {
            return lineUp;
        }

        public void setLineUp(List<LineUpBean> lineUp) {
            this.lineUp = lineUp;
        }

        public static class LineUpBean {
            /**
             * name : Ricardo
             */

            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }

    public static class MatchInfoBean {
        /**
         * keepTime : null
         * matchLive : [{"msgId":689,"time":"5588286","msgText":"主裁判终场哨音吹响,下半场比赛结束了!全场比分 1:0","msgPlace":1,"code":3,"showId":0,"cancelEnNum":null,"fontStyle":4,"enNum":907,"state":-1,"homeScore":1,"guestScore":0,"playInfo":null,"eventReNum":null},{"msgId":688,"time":"5582784","msgText":"球出边线,客队掷界外球","msgPlace":2,"code":2078,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":905,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":687,"time":"5571223","msgText":"客队中场组织进攻","msgPlace":2,"code":2048,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":904,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":686,"time":"5570086","msgText":"客队后场控球","msgPlace":2,"code":2075,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":903,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":685,"time":"5568841","msgText":"主队攻到对方禁区前沿","msgPlace":1,"code":1026,"showId":0,"cancelEnNum":null,"fontStyle":1,"enNum":902,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":684,"time":"5565545","msgText":"主队中场组织进攻","msgPlace":1,"code":1024,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":900,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":683,"time":"5551528","msgText":"球出边线,主队掷界外球","msgPlace":1,"code":1054,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":898,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":682,"time":"5548542","msgText":"主队后场控球","msgPlace":1,"code":1051,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":897,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":681,"time":"5545063","msgText":"客队中场组织进攻","msgPlace":2,"code":2048,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":896,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":680,"time":"5544381","msgText":"客队后场控球","msgPlace":2,"code":2075,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":895,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":679,"time":"5540901","msgText":"主队中场组织进攻","msgPlace":1,"code":1024,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":894,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":678,"time":"5534240","msgText":"客队后场控球","msgPlace":2,"code":2075,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":893,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":677,"time":"5532600","msgText":"主队中场组织进攻","msgPlace":1,"code":1024,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":892,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":676,"time":"5513565","msgText":"球出边线,主队掷界外球","msgPlace":1,"code":1054,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":890,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":675,"time":"5512341","msgText":"主队后场控球","msgPlace":1,"code":1051,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":889,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":674,"time":"5507983","msgText":"客队中场组织进攻","msgPlace":2,"code":2048,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":888,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":673,"time":"5498219","msgText":"球出底线,客队球门球","msgPlace":2,"code":2077,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":886,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":672,"time":"5496224","msgText":"客队后场控球","msgPlace":2,"code":2075,"showId":0,"cancelEnNum":null,"fontStyle":2,"enNum":885,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":671,"time":"5473981","msgText":"区域信息","msgPlace":0,"code":262,"showId":1,"cancelEnNum":"882","fontStyle":0,"enNum":883,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null},{"msgId":670,"time":"5472726","msgText":"球出底线,主队获得角球","msgPlace":1,"code":1025,"showId":0,"cancelEnNum":null,"fontStyle":4,"enNum":882,"state":3,"homeScore":null,"guestScore":null,"playInfo":null,"eventReNum":null}]
         * matchTimeLive : [{"time":111046,"code":"1025","isHome":1,"state":1,"playInfo":null},{"time":377820,"code":"1025","isHome":1,"state":1,"playInfo":null},{"time":676278,"code":"2049","isHome":0,"state":1,"playInfo":null},{"time":1084443,"code":"1034","isHome":1,"state":1,"playInfo":"Paulinho"},{"time":1445205,"code":"2058","isHome":0,"state":1,"playInfo":"Dankler"},{"time":2009800,"code":"1025","isHome":1,"state":1,"playInfo":null},{"time":2087841,"code":"2049","isHome":0,"state":1,"playInfo":null},{"time":2482422,"code":"1034","isHome":1,"state":1,"playInfo":"Assis"},{"time":2598099,"code":"1025","isHome":1,"state":1,"playInfo":null},{"time":2737619,"code":"2049","isHome":0,"state":1,"playInfo":null},{"time":2823699,"code":"1","isHome":1,"state":2,"playInfo":null},{"time":2742821,"code":"1025","isHome":1,"state":3,"playInfo":null},{"time":2940887,"code":"1025","isHome":1,"state":3,"playInfo":null},{"time":3082439,"code":"2049","isHome":0,"state":3,"playInfo":null},{"time":3198783,"code":"1025","isHome":1,"state":3,"playInfo":null},{"time":3265032,"code":"2079","isHome":0,"state":3,"playInfo":"27:71"},{"time":3480787,"code":"2058","isHome":0,"state":3,"playInfo":"Mattheus"},{"time":3541302,"code":"1025","isHome":1,"state":3,"playInfo":null},{"time":4045103,"code":"1029","isHome":1,"state":3,"playInfo":"Fábio Martins"},{"time":4112478,"code":"2079","isHome":0,"state":3,"playInfo":"14:18"},{"time":4569924,"code":"1055","isHome":1,"state":3,"playInfo":"9:99"},{"time":5004442,"code":"1025","isHome":1,"state":3,"playInfo":null},{"time":5099404,"code":"1055","isHome":1,"state":3,"playInfo":"3:10"},{"time":5279862,"code":"2079","isHome":0,"state":3,"playInfo":"11:8"},{"time":5310763,"code":"1055","isHome":1,"state":3,"playInfo":"4:25"},{"time":5372022,"code":"2049","isHome":0,"state":3,"playInfo":null},{"time":5472726,"code":"1025","isHome":1,"state":3,"playInfo":null}]
         */

        private Object keepTime;
        private List<MatchLiveBean> matchLive;
        private List<MatchTimeLiveBean> matchTimeLive;

        public Object getKeepTime() {
            return keepTime;
        }

        public void setKeepTime(Object keepTime) {
            this.keepTime = keepTime;
        }

        public List<MatchLiveBean> getMatchLive() {
            return matchLive;
        }

        public void setMatchLive(List<MatchLiveBean> matchLive) {
            this.matchLive = matchLive;
        }

        public List<MatchTimeLiveBean> getMatchTimeLive() {
            return matchTimeLive;
        }

        public void setMatchTimeLive(List<MatchTimeLiveBean> matchTimeLive) {
            this.matchTimeLive = matchTimeLive;
        }

        public static class MatchLiveBean {
            /**
             * msgId : 689
             * time : 5588286
             * msgText : 主裁判终场哨音吹响,下半场比赛结束了!全场比分 1:0
             * msgPlace : 1
             * code : 3
             * showId : 0
             * cancelEnNum : null
             * fontStyle : 4
             * enNum : 907
             * state : -1
             * homeScore : 1
             * guestScore : 0
             * playInfo : null
             * eventReNum : null
             */

            private int msgId;
            private String time;
            private String msgText;
            private int msgPlace;
            private int code;
            private int showId;
            private Object cancelEnNum;
            private int fontStyle;
            private int enNum;
            private int state;
            private int homeScore;
            private int guestScore;
            private Object playInfo;
            private Object eventReNum;

            public int getMsgId() {
                return msgId;
            }

            public void setMsgId(int msgId) {
                this.msgId = msgId;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getMsgText() {
                return msgText;
            }

            public void setMsgText(String msgText) {
                this.msgText = msgText;
            }

            public int getMsgPlace() {
                return msgPlace;
            }

            public void setMsgPlace(int msgPlace) {
                this.msgPlace = msgPlace;
            }

            public int getCode() {
                return code;
            }

            public void setCode(int code) {
                this.code = code;
            }

            public int getShowId() {
                return showId;
            }

            public void setShowId(int showId) {
                this.showId = showId;
            }

            public Object getCancelEnNum() {
                return cancelEnNum;
            }

            public void setCancelEnNum(Object cancelEnNum) {
                this.cancelEnNum = cancelEnNum;
            }

            public int getFontStyle() {
                return fontStyle;
            }

            public void setFontStyle(int fontStyle) {
                this.fontStyle = fontStyle;
            }

            public int getEnNum() {
                return enNum;
            }

            public void setEnNum(int enNum) {
                this.enNum = enNum;
            }

            public int getState() {
                return state;
            }

            public void setState(int state) {
                this.state = state;
            }

            public int getHomeScore() {
                return homeScore;
            }

            public void setHomeScore(int homeScore) {
                this.homeScore = homeScore;
            }

            public int getGuestScore() {
                return guestScore;
            }

            public void setGuestScore(int guestScore) {
                this.guestScore = guestScore;
            }

            public Object getPlayInfo() {
                return playInfo;
            }

            public void setPlayInfo(Object playInfo) {
                this.playInfo = playInfo;
            }

            public Object getEventReNum() {
                return eventReNum;
            }

            public void setEventReNum(Object eventReNum) {
                this.eventReNum = eventReNum;
            }
        }

        public static class MatchTimeLiveBean {
            /**
             * time : 111046
             * code : 1025
             * isHome : 1
             * state : 1
             * playInfo : null
             */

            private int time;
            private String code;
            private int isHome;
            private int state;
            private Object playInfo;

            public int getTime() {
                return time;
            }

            public void setTime(int time) {
                this.time = time;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public int getIsHome() {
                return isHome;
            }

            public void setIsHome(int isHome) {
                this.isHome = isHome;
            }

            public int getState() {
                return state;
            }

            public void setState(int state) {
                this.state = state;
            }

            public Object getPlayInfo() {
                return playInfo;
            }

            public void setPlayInfo(Object playInfo) {
                this.playInfo = playInfo;
            }
        }
    }

    public static class GuestTeamInfoBean {
        /**
         * id : 486
         * name : 埃斯托里尔
         * url : http://pic.13322.com/icons/teams/100/486.png
         * gas : 4
         * rc : 0
         * yc : 2
         * corner : 5
         * score : 0
         * halfScore : 0
         * danger : 30
         * shot : 4
         * aside : 1
         * trapping : 0
         * columnals : 0
         * foul : 0
         * freeHit : 0
         * lineOut : 0
         * offSide : 0
         * lineUp : [{"name":"Moreira"},{"name":"Dankler"},{"name":"O. Diakhite"},{"name":"João Afonso"},{"name":"Joel"},{"name":"Diogo Amado"},{"name":"Matheus Índio"},{"name":"Eduardo"},{"name":"Alisson Farias"},{"name":"K. Bazelyuk"},{"name":"Bruno Gomes"}]
         * attackCount : 85
         */

        private int id;
        private String name;
        private String url;
        private int gas;
        private int rc;
        private int yc;
        private int corner;
        private int score;
        private int halfScore;
        private int danger;
        private int shot;
        private int aside;
        private int trapping;
        private int columnals;
        private int foul;
        private int freeHit;
        private int lineOut;
        private int offSide;
        private int attackCount;
        private List<LineUpBeanX> lineUp;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getGas() {
            return gas;
        }

        public void setGas(int gas) {
            this.gas = gas;
        }

        public int getRc() {
            return rc;
        }

        public void setRc(int rc) {
            this.rc = rc;
        }

        public int getYc() {
            return yc;
        }

        public void setYc(int yc) {
            this.yc = yc;
        }

        public int getCorner() {
            return corner;
        }

        public void setCorner(int corner) {
            this.corner = corner;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getHalfScore() {
            return halfScore;
        }

        public void setHalfScore(int halfScore) {
            this.halfScore = halfScore;
        }

        public int getDanger() {
            return danger;
        }

        public void setDanger(int danger) {
            this.danger = danger;
        }

        public int getShot() {
            return shot;
        }

        public void setShot(int shot) {
            this.shot = shot;
        }

        public int getAside() {
            return aside;
        }

        public void setAside(int aside) {
            this.aside = aside;
        }

        public int getTrapping() {
            return trapping;
        }

        public void setTrapping(int trapping) {
            this.trapping = trapping;
        }

        public int getColumnals() {
            return columnals;
        }

        public void setColumnals(int columnals) {
            this.columnals = columnals;
        }

        public int getFoul() {
            return foul;
        }

        public void setFoul(int foul) {
            this.foul = foul;
        }

        public int getFreeHit() {
            return freeHit;
        }

        public void setFreeHit(int freeHit) {
            this.freeHit = freeHit;
        }

        public int getLineOut() {
            return lineOut;
        }

        public void setLineOut(int lineOut) {
            this.lineOut = lineOut;
        }

        public int getOffSide() {
            return offSide;
        }

        public void setOffSide(int offSide) {
            this.offSide = offSide;
        }

        public int getAttackCount() {
            return attackCount;
        }

        public void setAttackCount(int attackCount) {
            this.attackCount = attackCount;
        }

        public List<LineUpBeanX> getLineUp() {
            return lineUp;
        }

        public void setLineUp(List<LineUpBeanX> lineUp) {
            this.lineUp = lineUp;
        }

        public static class LineUpBeanX {
            /**
             * name : Moreira
             */

            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}

package com.abuelink.lottery;

import com.abuelink.lottery.model.vo.spider.BasketballGameSpiderDto;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/**
 * \* User: xjlu@iflytek.com
 * \* Date: 2018/3/19
 * \* Time: 17:16
 * \* Description:
 * \
 */
public class BasketballSpider {
    String gameId;
    String gameEn;
    Object matchList;
    String isDispJclqSingleFix;
    public BasketballSpider() {
    }
    public void parse(String date) throws MalformedURLException, IOException {
        String urlStr = "http://caipiao.163.com/order/preBet_jclqNewMixAllAjax.html?cache=" + (new Date()).getTime() + "&betDate=";
        urlStr = urlStr + date;
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        InputStreamReader isr = new InputStreamReader(conn.getInputStream(), "utf-8");
        BufferedReader input = new BufferedReader(isr);
        Gson gson = new Gson();
        BasketballSpider bs = (BasketballSpider)gson.fromJson(input, BasketballSpider.class);
        this.gameEn = bs.gameEn;
        this.gameId = bs.gameId;
        this.isDispJclqSingleFix = bs.isDispJclqSingleFix;
        this.matchList = bs.matchList;
        conn.disconnect();
        input.close();
        isr.close();
    }

    public ArrayList<BasketballGameSpiderDto> castData() {
        ArrayList bbArray = new ArrayList();
        LinkedTreeMap matchListTemp = (LinkedTreeMap)this.matchList;
        Iterator iterator = matchListTemp.entrySet().iterator();

        while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            LinkedTreeMap bbMap = (LinkedTreeMap)entry.getValue();
            bbArray.add(BasketballGameSpiderDto.genBasketball(bbMap));
        }

        return bbArray;
    }
}
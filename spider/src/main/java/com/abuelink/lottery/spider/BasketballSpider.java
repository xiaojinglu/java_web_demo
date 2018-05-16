package com.abuelink.lottery.spider;

import com.abuelink.lottery.model.vo.spider.BasketballGameSpiderDto;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/**
 * \* User: xjlu
 * \* Date: 2018/3/19
 * \* Time: 17:16
 * \* Description:
 * \
 */
@Component("basketballSpider")
public class BasketballSpider {
    private String gameId;
    private String gameEn;
    private Object matchList;
    private String isDispJclqSingleFix;

    public void parse(String date) throws IOException {
        String urlStr = "http://caipiao.163.com/order/preBet_jclqNewMixAllAjax.html?cache=" + (new Date()).getTime() + "&betDate=";
        urlStr = urlStr + date;
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        InputStreamReader isr = new InputStreamReader(conn.getInputStream(), "utf-8");
        BufferedReader input = new BufferedReader(isr);
        Gson gson = new Gson();
        BasketballSpider basketballSpider = gson.fromJson(input, BasketballSpider.class);
        this.gameEn = basketballSpider.gameEn;
        this.gameId = basketballSpider.gameId;
        this.isDispJclqSingleFix = basketballSpider.isDispJclqSingleFix;
        this.matchList = basketballSpider.matchList;
        conn.disconnect();
        input.close();
        isr.close();
    }

    public ArrayList<BasketballGameSpiderDto> castData() {
        ArrayList basketballArray = new ArrayList();
        LinkedTreeMap matchListTemp = (LinkedTreeMap) this.matchList;
        Iterator iterator = matchListTemp.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            LinkedTreeMap basketballMap = (LinkedTreeMap) entry.getValue();
            basketballArray.add(BasketballGameSpiderDto.genBasketball(basketballMap));
        }

        return basketballArray;
    }
}
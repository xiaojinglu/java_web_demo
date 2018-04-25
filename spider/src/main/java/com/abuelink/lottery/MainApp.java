package com.abuelink.lottery;

import com.abuelink.lottery.model.vo.spider.BasketballGameSpiderDto;
import com.abuelink.lottery.model.vo.spider.FootballGameSpiderDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * A Camel Application
 */
public class MainApp {


    private static Logger logger = LoggerFactory.getLogger(MainApp.class);

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {


        FootballSpider ex = new FootballSpider();
        ex.parse("");
        Iterator bs = ex.flist.iterator();

        while (bs.hasNext()) {
            FootballGameSpiderDto bbArrayList = (FootballGameSpiderDto) bs.next();

        }

        BasketballSpider bs1 = new BasketballSpider();
        try {
            bs1.parse("");
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
        ArrayList bbArrayList1 = new ArrayList(bs1.castData());
        Iterator var6 = bbArrayList1.iterator();

        while (var6.hasNext()) {
            BasketballGameSpiderDto bb = (BasketballGameSpiderDto) var6.next();

        }
    }

}


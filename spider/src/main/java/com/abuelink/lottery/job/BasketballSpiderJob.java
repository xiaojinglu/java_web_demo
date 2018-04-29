package com.abuelink.lottery.job;

import com.abuelink.lottery.spider.BasketballSpider;
import com.abuelink.lottery.model.vo.spider.BasketballGameSpiderDto;
import com.abuelink.lottery.service.definition.IBasketBallBetInfoService;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * \* User: xjlu
 * \* Date: 2018/4/29
 * \* Time: 13:47
 * \* Description:
 * \
 */
public class BasketballSpiderJob extends QuartzJobBean{

    private Logger logger= LoggerFactory.getLogger(BasketballSpiderJob.class);

    @Autowired
    private IBasketBallBetInfoService basketBallBetInfoService;

    @Autowired
    private BasketballSpider basketballSpider;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("--------------篮球比赛信息爬虫挖掘开始----------------");
        try {
            basketballSpider.parse("");
        } catch (IOException e) {
            logger.error(e.getMessage(),e);
        }
        //挖掘到的信息入库
        ArrayList basketballList=basketballSpider.castData();
        Iterator basketballIter=basketballList.iterator();
        while(basketballIter.hasNext()){
            BasketballGameSpiderDto basketballGameSpiderDto=(BasketballGameSpiderDto) basketballIter.next();
            basketBallBetInfoService.saveBasketballSpiderInfo(basketballGameSpiderDto);
        }
    }
}
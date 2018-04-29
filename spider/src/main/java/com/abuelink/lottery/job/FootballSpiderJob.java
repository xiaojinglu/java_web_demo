package com.abuelink.lottery.job;

import com.abuelink.lottery.spider.FootballSpider;
import com.abuelink.lottery.model.vo.spider.FootballGameSpiderDto;
import com.abuelink.lottery.service.definition.IFootBallBetInfoService;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Iterator;

/**
 * \* User: xjlu
 * \* Date: 2018/4/29
 * \* Time: 13:48
 * \* Description:
 * \
 */
public class FootballSpiderJob extends QuartzJobBean{

    private Logger logger= LoggerFactory.getLogger(FootballSpiderJob.class);

    @Autowired
    private IFootBallBetInfoService footBallBetInfoService;

    @Autowired
    private FootballSpider footballSpider;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("--------------足球比赛信息爬虫挖掘开始----------------");
        footballSpider.parse("");
        Iterator footballIter=footballSpider.getFlist().iterator();
        //爬虫获取到的信息入库
        while(footballIter.hasNext()){
            FootballGameSpiderDto footballGameSpiderDto=(FootballGameSpiderDto) footballIter.next();
            footBallBetInfoService.saveFootballSpiderInfo(footballGameSpiderDto);
        }
    }
}
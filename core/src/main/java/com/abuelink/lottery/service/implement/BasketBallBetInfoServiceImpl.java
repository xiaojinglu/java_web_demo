package com.abuelink.lottery.service.implement;

import com.abuelink.lottery.model.dao.definition.IBasketballLeagueDao;
import com.abuelink.lottery.model.vo.spider.BasketballGameSpiderDto;
import com.abuelink.lottery.service.definition.IBasketBallBetInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * \* User: xjlu
 * \* Date: 2018/3/28
 * \* Time: 23:00
 * \* Description:
 * \
 */
@Service("basketBallBetInfoService")
public class BasketBallBetInfoServiceImpl implements IBasketBallBetInfoService{

    private Logger logger= LoggerFactory.getLogger(BasketBallBetInfoServiceImpl.class);

    @Autowired
    IBasketballLeagueDao basketballLeagueDao;

    @Override
    public String saveBasketballSpiderInfo(BasketballGameSpiderDto basketballGameSpiderDto) {
       /* return basketballLeagueDao.insertSpiderInfo(basketballGameSpiderDto);*/
       logger.info("篮球定时任务。。。");
        return null;
    }
}
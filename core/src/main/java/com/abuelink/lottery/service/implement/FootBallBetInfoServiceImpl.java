package com.abuelink.lottery.service.implement;

import com.abuelink.lottery.model.dao.definition.IAccountDao;
import com.abuelink.lottery.model.vo.spider.FootballGameSpiderDto;
import com.abuelink.lottery.service.definition.IFootBallBetInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * \* User: xjlu@iflytek.com
 * \* Date: 2018/3/26
 * \* Time: 17:09
 * \* Description:
 * \
 */
@Service("footBallBetInfoService")
public class FootBallBetInfoServiceImpl implements IFootBallBetInfoService {

    @Autowired
    private IAccountDao accountDao;
    @Override
    public String insertAccountTest() {
        accountDao.insertTest();
        return null;
    }

    @Override
    public void saveFootballSpiderInfo(FootballGameSpiderDto footballGameSpiderDto) {

    }
}
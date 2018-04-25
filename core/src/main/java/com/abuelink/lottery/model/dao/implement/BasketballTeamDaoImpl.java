package com.abuelink.lottery.model.dao.implement;

import com.abuelink.lottery.model.dao.GenericHibernateDao;
import com.abuelink.lottery.model.dao.definition.IBasketballTeamDao;
import com.abuelink.lottery.model.po.BasketballTeam;
import com.abuelink.lottery.model.vo.spider.BasketballGameSpiderDto;
import org.springframework.stereotype.Repository;

/**
 * \* User: xjlu@iflytek.com
 * \* Date: 2018/4/25
 * \* Time: 21:30
 * \* Description:
 * \
 */
@Repository("basketballTeamDao")
public class BasketballTeamDaoImpl extends GenericHibernateDao<BasketballTeam,String> implements IBasketballTeamDao{
    @Override
    public String insertSpiderInfo(BasketballGameSpiderDto basketballGameSpiderDto) {
        return null;
    }
}
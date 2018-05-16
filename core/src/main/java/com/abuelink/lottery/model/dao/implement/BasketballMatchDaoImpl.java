package com.abuelink.lottery.model.dao.implement;

import com.abuelink.lottery.model.dao.GenericHibernateDao;
import com.abuelink.lottery.model.dao.definition.IBasketballMatchDao;
import com.abuelink.lottery.model.po.BasketballMatch;
import com.abuelink.lottery.model.vo.spider.BasketballGameSpiderDto;
import org.springframework.stereotype.Repository;

/**
 * \* User: xjlu
 * \* Date: 2018/4/25
 * \* Time: 21:21
 * \* Description:
 * \
 */
@Repository("basketballMatchDao")
public class BasketballMatchDaoImpl extends GenericHibernateDao<BasketballMatch,String> implements IBasketballMatchDao {
    @Override
    public void insertSpiderInfo(BasketballGameSpiderDto basketballGameSpiderDto) {

    }

    @Override
    public void updateMatchResultInfo() {

    }
}
package com.abuelink.lottery.model.dao.definition;

import com.abuelink.lottery.model.dao.GenericDao;
import com.abuelink.lottery.model.po.BasketballLeague;
import com.abuelink.lottery.model.vo.spider.BasketballGameSpiderDto;

/**
 * \* User: xjlu@iflytek.com
 * \* Date: 2018/4/25
 * \* Time: 21:27
 * \* Description:
 * \
 */
public interface IBasketballLeagueDao extends GenericDao<BasketballLeague,String>{

    /**
     * 爬虫获取的信息入库
     * @param basketballGameSpiderDto
     * @return 联盟id
     */
    public String insertSpiderInfo(BasketballGameSpiderDto basketballGameSpiderDto);
}
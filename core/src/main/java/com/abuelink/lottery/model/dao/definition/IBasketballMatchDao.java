package com.abuelink.lottery.model.dao.definition;/**
 * Copyright 2017 IFlyTek. All rights reserved.<br>
 * Package: ${package_name}
 * FileName: ${file_name}
 *
 * @version
 * @created 2018/4/25 21:17
 * @author xjlu
 */

import com.abuelink.lottery.model.dao.GenericDao;
import com.abuelink.lottery.model.po.BasketballMatch;
import com.abuelink.lottery.model.vo.spider.BasketballGameSpiderDto;

/**
 \* User: xjlu
 \* Date: 2018/4/25
 \* Time: 21:17
 \* Description: 
 \*/
public interface IBasketballMatchDao extends GenericDao<BasketballMatch,String>{

    /**
     * 爬虫获取的比赛基本信息入库
     * @param basketballGameSpiderDto
     */
    public void insertSpiderInfo(BasketballGameSpiderDto basketballGameSpiderDto);

    /**
     * 爬虫获取的比赛结束信息入库
     */
    public void updateMatchResultInfo();
}

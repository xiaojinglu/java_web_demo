package com.abuelink.lottery.model.dao.definition;/**
 * Copyright 2017 IFlyTek. All rights reserved.<br>
 * Package: ${package_name}
 * FileName: ${file_name}
 *
 * @version
 * @created 2018/4/25 21:23
 * @author xjlu
 */

import com.abuelink.lottery.model.dao.GenericDao;
import com.abuelink.lottery.model.po.BasketballTeam;
import com.abuelink.lottery.model.vo.spider.BasketballGameSpiderDto;

/**
 \* User: xjlu
 \* Date: 2018/4/25
 \* Time: 21:23
 \* Description: 
 \*/
public interface IBasketballTeamDao extends GenericDao<BasketballTeam,String>{

    /**
     * 爬虫获取到的信息入库
     * @param basketballGameSpiderDto
     * @return 队伍id
     */
    public String insertSpiderInfo(BasketballGameSpiderDto basketballGameSpiderDto);
}

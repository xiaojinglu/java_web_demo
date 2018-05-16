package com.abuelink.lottery.service.definition;/**
 * Copyright 2017 IFlyTek. All rights reserved.<br>
 * Package: ${package_name}
 * FileName: ${file_name}
 *
 * @version
 * @created 2018/3/26 17:08
 * @author xjlu
 */

import com.abuelink.lottery.model.vo.spider.FootballGameSpiderDto;

/**
 \* User: xjlu
 \* Date: 2018/3/26
 \* Time: 17:08
 \* Description: 
 \*/
public interface IFootBallBetInfoService {

    public String insertAccountTest();

    public void saveFootballSpiderInfo(FootballGameSpiderDto footballGameSpiderDto);
}

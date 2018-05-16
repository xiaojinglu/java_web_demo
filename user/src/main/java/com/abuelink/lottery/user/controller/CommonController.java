package com.abuelink.lottery.user.controller;

import com.abuelink.lottery.model.vo.spider.BasketballGameSpiderDto;
import com.abuelink.lottery.service.definition.IBasketBallBetInfoService;
import com.abuelink.lottery.service.definition.IFootBallBetInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * \* User: xjlu
 * \* Date: 2018/3/25
 * \* Time: 9:16
 * \* Description:
 * \
 */
@Controller
public class CommonController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CommonController.class);

    @Autowired
    private IFootBallBetInfoService footBallBetInfoService;

    @Autowired
    private IBasketBallBetInfoService basketBallBetInfoService;

    @RequestMapping(value="/helloworld.do",method= RequestMethod.POST)
    public String helloworld(HttpServletRequest request){
        LOGGER.info("index start....");
        return "index";
    }

    @RequestMapping("/index.do")
    public Model indexPage(Model model) {
        return model;
    }

    @ResponseBody
    @RequestMapping(value = "/test.do",method = RequestMethod.POST)
    public String insertData(BasketballGameSpiderDto b){
        return basketBallBetInfoService.toString();
    }
}
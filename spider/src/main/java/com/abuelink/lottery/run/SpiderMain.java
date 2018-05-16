package com.abuelink.lottery.run;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * \* User: xjlu
 * \* Date: 2018/4/29
 * \* Time: 15:47
 * \* Description:
 * \
 */
public class SpiderMain {

    private static Logger logger= LoggerFactory.getLogger(SpiderMain.class);

    /**
     * 启动服务
     * @param args
     */
    public static void main(String[] args) {
        logger.info("loading applicationContext...");
        final AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        /**
         * 系统中断处理
         */
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                logger.error("准备停止系统...");
                applicationContext.close();
            }
        });
    }
}
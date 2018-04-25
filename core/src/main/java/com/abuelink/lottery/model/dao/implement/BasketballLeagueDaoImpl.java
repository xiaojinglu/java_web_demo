package com.abuelink.lottery.model.dao.implement;

import com.abuelink.lottery.model.dao.GenericHibernateDao;
import com.abuelink.lottery.model.dao.definition.IBasketballLeagueDao;
import com.abuelink.lottery.model.po.BasketballLeague;
import com.abuelink.lottery.model.vo.spider.BasketballGameSpiderDto;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * \* User: xjlu@iflytek.com
 * \* Date: 2018/4/25
 * \* Time: 21:29
 * \* Description:
 * \
 */
@Repository("basketballLeagueDao")
public class BasketballLeagueDaoImpl extends GenericHibernateDao<BasketballLeague,String> implements IBasketballLeagueDao{
    @Override
    public String insertSpiderInfo(BasketballGameSpiderDto basketballGameSpiderDto) {
        //查看数据库中是否有这个联盟，没有的话入库
        Map<String, String> conditionMap = new HashMap<String, String>();
        String sql="select * from t_basketball_league t where t.WANGYI_LEAGUE_ID=:wangyiLeagueId and t.LEAGUE_NAME=:leagueName";
        String[] values={basketballGameSpiderDto.getLid(),basketballGameSpiderDto.getLeagueName()};
       /* conditionMap.put("wangyiLeagueId",basketballGameSpiderDto.getLid());
        conditionMap.put("leagueName",basketballGameSpiderDto.getLeagueName());*/
        this.find(sql,values);
        return null;
    }
}
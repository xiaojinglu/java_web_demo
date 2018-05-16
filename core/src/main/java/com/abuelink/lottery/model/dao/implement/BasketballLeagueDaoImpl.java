package com.abuelink.lottery.model.dao.implement;

import com.abuelink.lottery.model.dao.GenericHibernateDao;
import com.abuelink.lottery.model.dao.definition.IBasketballLeagueDao;
import com.abuelink.lottery.model.po.BasketballLeague;
import com.abuelink.lottery.model.vo.spider.BasketballGameSpiderDto;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * \* User: xjlu
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
      /*  String sql="from BasketballLeague t where t.wangyiLeagueId=? and t.leagueName=?";
        String[] values={basketballGameSpiderDto.getLid(),basketballGameSpiderDto.getLeagueName()};
        List result=this.find(sql,values);
        return result.get(0).toString();*/
        String sql="select t.ID as id,t.LEAGUE_COLOR as leagueColor,t.LEAGUE_NAME as leagueName from t_basketball_league t where t.LEAGUE_NAME=:LEAGUE_NAME and t.WANGYI_LEAGUE_ID=:WANGYI_LEAGUE_ID";
        conditionMap.put("LEAGUE_NAME","111222");
        conditionMap.put("WANGYI_LEAGUE_ID","111222");
        List<BasketballLeague> result=this.findBySql(sql,conditionMap,BasketballLeague.class);
        return result.get(0).toString();
    }
}
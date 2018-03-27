package com.abuelink.lottery.model.dao.implement;

import com.abuelink.lottery.model.dao.GenericHibernateDao;
import com.abuelink.lottery.model.dao.definition.IAccountDao;
import com.abuelink.lottery.model.po.Account;
import org.springframework.stereotype.Repository;

/**
 * \* User: xjlu@iflytek.com
 * \* Date: 2018/3/26
 * \* Time: 18:26
 * \* Description:
 * \
 */
@Repository("accountDao")
public class AccountDaoImpl extends GenericHibernateDao<Account,String> implements IAccountDao{

    @Override
    public void insertTest() {
        String sql=" insert into t_account VALUES ('test1','test1','test1','test1')";
        Account account=new Account();
        account.setId("test2");
        account.setAccountRemaind("test2");
        account.setUserId("test2");
        account.setVirtualCurrencyRemaind("test2");
        this.saveOrUpdate(account);
    }
}
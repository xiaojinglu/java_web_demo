package com.abuelink.lottery.model.dao.definition;

import com.abuelink.lottery.model.dao.GenericDao;
import com.abuelink.lottery.model.po.Account;

/**
 * \* User: xjlu
 * \* Date: 2018/3/26
 * \* Time: 18:26
 * \* Description:
 * \
 */
public interface IAccountDao extends GenericDao<Account,String>{

    public void insertTest();
}
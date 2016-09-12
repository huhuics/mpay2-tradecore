/**
 * Beijing Jiaotong University
 * Copyright (c) 1896-2016 All Rights Reserved.
 */
package org.tradecore.repository.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.tradecore.dao.TempDAO;
import org.tradecore.dao.domain.Temp;
import org.tradecore.repository.TempRepository;

/**
 * 交易仓储实现类
 * @author HuHui
 * @version $Id: TradeRepositoryImpl.java, v 0.1 2016年9月11日 下午12:48:08 HuHui Exp $
 */
@Repository
public class TempRepositoryImpl implements TempRepository {

    @Resource
    private TempDAO tempDAO;

    @Override
    public Temp selectById(String id) {
        return tempDAO.selectByPrimaryKey(id);
    }

}

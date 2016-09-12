/**
 * Beijing Jiaotong University
 * Copyright (c) 1896-2016 All Rights Reserved.
 */
package org.tradecore.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.tradecore.dao.domain.Temp;
import org.tradecore.repository.TempRepository;
import org.tradecore.service.TempService;

import cn.fesc.facade.common.util.LogUtil;

/**
 * 交易服务实现类
 * @author HuHui
 * @version $Id: TradeServiceImpl.java, v 0.1 2016年9月10日 下午2:21:53 HuHui Exp $
 */
@Service
public class TempServiceImpl implements TempService {

    /** 日志 */
    private static final Logger logger = LoggerFactory.getLogger(TempServiceImpl.class);

    @Resource
    private TempRepository      tempRepository;

    @Override
    public Temp selectById(String id) {

        LogUtil.info(logger, "收到查询请求,id={0}", id);

        Temp temp = tempRepository.selectById(id);

        LogUtil.info(logger, "查询结果:{0}", temp);

        return temp;
    }

}

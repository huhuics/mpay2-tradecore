/**
 * Beijing Jiaotong University
 * Copyright (c) 1896-2016 All Rights Reserved.
 */
package org.tradecore.test.facade;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tradecore.test.base.BaseTest;

import cn.fesc.facade.api.TempFacade;
import cn.fesc.facade.common.Result;
import cn.fesc.facade.common.util.LogUtil;
import cn.fesc.facade.dto.TempDTO;

/**
 * 测试TradeQueryFacade
 * @author HuHui
 * @version $Id: TradeQueryFacadeTest.java, v 0.1 2016年9月11日 下午1:55:56 HuHui Exp $
 */
public class TradeQueryFacadeTest extends BaseTest {

    private static final Logger logger = LoggerFactory.getLogger(TradeQueryFacadeTest.class);

    @Resource
    private TempFacade          tempFacade;

    @Test
    public void testQueryById() {

        Assert.assertNotNull(tempFacade);

        String id = "1";

        Result<TempDTO> result = tempFacade.getById(id);

        LogUtil.info(logger, "查询结果:result={0}", result);

        Assert.assertNotNull(result);
        Assert.assertTrue(StringUtils.equals(id, result.getResultObj().getId()));
    }

}

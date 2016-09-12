/**
 * Beijing Jiaotong University
 * Copyright (c) 1896-2016 All Rights Reserved.
 */
package org.tradecore.test.trade;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tradecore.dao.domain.Temp;
import org.tradecore.service.TempService;
import org.tradecore.test.base.BaseTest;

/**
 * 
 * @author HuHui
 * @version $Id: TradeServiceTest.java, v 0.1 2016年9月10日 下午3:24:46 HuHui Exp $
 */
public class TradeServiceTest extends BaseTest {

    private static final Logger logger = LoggerFactory.getLogger(TradeServiceTest.class);

    @Resource
    private TempService         tempService;

    @Test
    public void testSelectById() {

        Assert.assertNotNull(tempService);

        String id = "1";
        Temp temp = tempService.selectById(id);

        Assert.assertNotNull(temp);
        Assert.assertTrue(StringUtils.equals(id, temp.getId()));

    }
}

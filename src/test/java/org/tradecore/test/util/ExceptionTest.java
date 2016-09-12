/**
 * Beijing Jiaotong University
 * Copyright (c) 1896-2016 All Rights Reserved.
 */
package org.tradecore.test.util;

import java.sql.SQLException;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tradecore.enums.ErrorDetailEnum;
import org.tradecore.enums.ErrorScenarioEnum;
import org.tradecore.exception.TradeCoreException;
import org.tradecore.util.ResultUtil;

import cn.fesc.facade.common.Result;
import cn.fesc.facade.common.util.LogUtil;

/**
 * 测试TradeCoreException
 * @author HuHui
 * @version $Id: ExceptionTest.java, v 0.1 2016年9月12日 下午8:09:48 HuHui Exp $
 */
public class ExceptionTest {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionTest.class);

    @Test
    public void testTradeCoreException() {
        Result<Void> result = new Result<Void>();
        try {
            throw new TradeCoreException(ErrorDetailEnum.DATABASE_ERROR, "oracle报错", new SQLException("主键冲突"));
        } catch (Exception e) {
            ResultUtil.buildErrorResult(result, ErrorScenarioEnum.TRADE_PUBLISH, e);
            System.out.println(result);
            LogUtil.error(e, logger, "操作失败");
        }
    }

}

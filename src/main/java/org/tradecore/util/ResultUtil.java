/**
 * Beijing Jiaotong University
 * Copyright (c) 1896-2016 All Rights Reserved.
 */
package org.tradecore.util;

import org.tradecore.enums.ErrorDetailEnum;
import org.tradecore.enums.ErrorScenarioEnum;
import org.tradecore.exception.TradeCoreException;

import cn.fesc.facade.common.Result;
import cn.fesc.facade.response.ErrorContext;

/**
 * 返回结果工具类
 * @author HuHui
 * @version $Id: ResultUtil.java, v 0.1 2016年9月12日 下午4:02:54 HuHui Exp $
 */
public class ResultUtil {

    /**
     * 组装错误结果对象
     * @param result    结果对象
     * @param scenario  错误场景
     * @param e         异常
     */
    public static void buildErrorResult(Result<?> result, ErrorScenarioEnum scenario, Exception e) {

        TradeCoreException ex = null;

        if (e instanceof TradeCoreException) {
            ex = (TradeCoreException) e;
        } else {
            ex = new TradeCoreException(ErrorDetailEnum.UNKNOWN_EXCEPTION);
        }

        result.setSuccess(false);
        result.setErrorContext(createErrorContext(scenario, ex));
    }

    /**
     * 内部方法, 创建ErrorContext
     * @return   ErrorContext
     */
    private static ErrorContext createErrorContext(ErrorScenarioEnum scenario, TradeCoreException e) {

        ErrorContext context = new ErrorContext();
        context.setCode(e.getCode().getCode());
        context.setMsg(e.getCode().getDesc());
        context.setScenarioCode(scenario.getCode());
        context.setScenarioDesc(scenario.getDesc());
        context.setExpMsg(e.getMessage());

        return context;
    }

}

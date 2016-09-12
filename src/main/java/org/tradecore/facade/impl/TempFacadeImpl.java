/**
 * Beijing Jiaotong University
 * Copyright (c) 1896-2016 All Rights Reserved.
 */
package org.tradecore.facade.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.tradecore.convertor.TempConvertor;
import org.tradecore.dao.domain.Temp;
import org.tradecore.service.TempService;

import cn.fesc.facade.api.TempFacade;
import cn.fesc.facade.common.Result;
import cn.fesc.facade.common.util.LogUtil;
import cn.fesc.facade.dto.TempDTO;

/**
 * TradeQueryFacade实现类
 * @author HuHui
 * @version $Id: TradeQueryFacadeImpl.java, v 0.1 2016年9月11日 下午1:32:16 HuHui Exp $
 */
@Service("tempFacade")
public class TempFacadeImpl implements TempFacade {

    /** 日志 */
    private Logger      logger = LoggerFactory.getLogger(TempFacadeImpl.class);

    @Resource
    private TempService tradeService;

    @Override
    public Result<TempDTO> getById(String id) {

        LogUtil.info(logger, "收到通过id查询请求,id={0}", id);

        Result<TempDTO> result = new Result<TempDTO>();

        try {
            Temp payOrder = tradeService.selectById(id);

            TempDTO dto = TempConvertor.convert2DTO(payOrder);
            result.setResultObj(dto);
            result.setSuccess(Boolean.TRUE);
        } catch (Exception e) {
            // TODO: handle exception
            LogUtil.error(e, logger, "通过id查询异常, id={0}, result={1}", id, result);
        }

        LogUtil.info(logger, "通过id查询结果:result={0}", result);

        return result;
    }

}

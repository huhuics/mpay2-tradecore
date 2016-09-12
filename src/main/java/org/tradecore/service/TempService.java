/**
 * Beijing Jiaotong University
 * Copyright (c) 1896-2016 All Rights Reserved.
 */
package org.tradecore.service;

import org.tradecore.dao.domain.Temp;

/**
 * 交易服务
 * @author HuHui
 * @version $Id: TradeService.java, v 0.1 2016年9月10日 下午2:21:21 HuHui Exp $
 */
public interface TempService {

    Temp selectById(String id);

}

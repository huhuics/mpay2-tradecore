/**
 * Beijing Jiaotong University
 * Copyright (c) 1896-2016 All Rights Reserved.
 */
package org.tradecore.repository;

import org.tradecore.dao.domain.Temp;

/**
 * 交易仓储
 * @author HuHui
 * @version $Id: TradeRepository.java, v 0.1 2016年9月10日 下午2:09:06 HuHui Exp $
 */
public interface TempRepository {

    Temp selectById(String id);

}

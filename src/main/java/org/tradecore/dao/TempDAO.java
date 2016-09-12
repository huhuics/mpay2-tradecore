package org.tradecore.dao;

import org.tradecore.dao.domain.Temp;

public interface TempDAO {

    Temp selectByPrimaryKey(String id);

    int insert(Temp record);

    int insertSelective(Temp record);
}
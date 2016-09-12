/**
 * Beijing Jiaotong University
 * Copyright (c) 1896-2016 All Rights Reserved.
 */
package org.tradecore.convertor;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.tradecore.dao.domain.Temp;

import cn.fesc.facade.dto.TempDTO;

/**
 * 提供静态方法,BizAlipayPayOrder领域对象与BizAlipayPayOrderDTO转换工具
 * @author HuHui
 * @version $Id: AlipayPayOrderConvertor.java, v 0.1 2016年9月11日 下午1:40:26 HuHui Exp $
 */
public final class TempConvertor {

    public static TempDTO convert2DTO(Temp temp) {
        if (temp == null) {
            return null;
        }

        TempDTO dto = new TempDTO();
        //此处为示例，只转换少数几个属性
        dto.setId(temp.getId());
        dto.setUserName(temp.getUserName());
        dto.setUserAge(temp.getUserAge());

        return dto;
    }

    public static List<TempDTO> convert2DTOs(List<Temp> bizAlipayPayOrders) {
        if (CollectionUtils.isEmpty(bizAlipayPayOrders)) {
            return null;
        }

        List<TempDTO> dtos = new ArrayList<TempDTO>();
        for (Temp temp : bizAlipayPayOrders) {
            TempDTO dto = convert2DTO(temp);
            dtos.add(dto);
        }

        return dtos;
    }

}

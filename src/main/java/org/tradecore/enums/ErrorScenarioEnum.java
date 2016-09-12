/**
 * Beijing Jiaotong University
 * Copyright (c) 1896-2016 All Rights Reserved.
 */
package org.tradecore.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * 错误场景枚举
 * @author HuHui
 * @version $Id: ErrorScenarioEnum.java, v 0.1 2016年9月12日 下午4:47:07 HuHui Exp $
 */
public enum ErrorScenarioEnum {

    /** 创建订单 */
    TRADE_PUBLISH("00", "创建订单"),

    /** 撤销订单 */
    TRADE_CANCEL("01", "撤销订单"),

    /** 订单查询 */
    TRADE_QUERY("04", "订单查询"),

    /** 订单分页查询 */
    ITEM_ORDER_PAGE_QUERY("08", "订单分页查询"),

    /** 未知场景 */
    UNKNOWN("99", "未知场景"),

    ;

    private final String code;

    private final String desc;

    private ErrorScenarioEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**

     * 根据代码获取枚举，如果code对应的枚举不存在，则返回null

     * @param code 枚举代码

     * @return     对应的枚举对象

     */
    public static ErrorScenarioEnum getByCode(String code) {
        for (ErrorScenarioEnum eachValue : ErrorScenarioEnum.values()) {
            if (StringUtils.equals(code, eachValue.getCode())) {
                return eachValue;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}

/**
 * Beijing Jiaotong University
 * Copyright (c) 1896-2016 All Rights Reserved.
 */
package org.tradecore.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * 错误编码枚举
 * @author HuHui
 * @version $Id: ErrorDetailEnum.java, v 0.1 2016年9月12日 下午3:11:13 HuHui Exp $
 */
public enum ErrorDetailEnum {

    //=======================================================================//
    //                        公共类错误码[40000-40099]                       //
    //=======================================================================//

    /** 其它未知异常 */
    UNKNOWN_EXCEPTION("40000", "其它未知异常"),

    /** 远程调用异常 */
    REMOTE_EXCEPTION("40001", "远程调用异常"),

    /** 数据库错误 */
    DATABASE_ERROR("40002", "数据库错误"),

    /** 唯一性表约束冲突 */
    MUTEX_ERROR("40003", "唯一性表约束冲突"),

    /** 请求参数非法 */
    ILLEGAL_PARAMETER("40004", "请求参数非法"),

    /** 配置错误 */
    CONFIG_ERROR("40005", "配置错误"),

    //========================================================================//
    //                        领域模型类错误[100-199]                             //
    //========================================================================//
    /** 领域完整性校验失败 */
    INTEGRITY_FAILURE("40100", "领域完整性校验失败"),

    /** 领域状态迁移校验失败 */
    ILLEGAL_STATUS("40101", "领域状态迁移校验失败"),

    /** 领域对象一致性校验失败 */
    DOMAIN_INCONSISTENCY("40102", "领域对象一致性校验失败"),

    /** 领域对象不存在 */
    DOMAIN_NOT_FOUND("40103", "领域对象不存在"),

    /** 数据操作失败 */
    DB_OPERATE_FAIL("40104", "数据操作失败"),

    //========================================================================//
    //                        业务错误[200-299]                                //
    //========================================================================//

    /** 发行交易不存在 */
    TRADE_NOT_EXIST("200", "发行交易不存在"),

    /** 交易状态不合法 */
    TRADE_STATUS_INVALID("201", "交易状态不合法"),

    /** 交易订单状态不合法 */
    ORDER_STATUS_INVALID("202", "交易订单状态不合法"),

    //========================================================================//
    //                        外部返回失败[300-399]                            //
    //========================================================================//

    ;

    private final String code;

    private final String desc;

    private ErrorDetailEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**

     * 根据代码获取枚举，如果code对应的枚举不存在，则返回null

     * @param code 枚举代码

     * @return     对应的枚举对象

     */
    public static ErrorDetailEnum getByCode(String code) {
        for (ErrorDetailEnum eachValue : ErrorDetailEnum.values()) {
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

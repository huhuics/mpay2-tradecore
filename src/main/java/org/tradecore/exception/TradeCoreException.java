/**
 * Beijing Jiaotong University
 * Copyright (c) 1896-2016 All Rights Reserved.
 */
package org.tradecore.exception;

import org.tradecore.enums.ErrorDetailEnum;

/**
 * 交易核心自定义异常
 * @author HuHui
 * @version $Id: TradeCoreException.java, v 0.1 2016年9月12日 上午11:26:38 HuHui Exp $
 */
public class TradeCoreException extends RuntimeException {

    /** uid */
    private static final long serialVersionUID = 6672674830259275441L;

    /** 异常错误代码 */
    private ErrorDetailEnum   code             = ErrorDetailEnum.UNKNOWN_EXCEPTION;

    /**
     * 创建一个<code>TradeCoreException</code>
     * @param code  错误码
     */
    public TradeCoreException(ErrorDetailEnum code) {
        super(code.getDesc());
        this.code = code;
    }

    /**
     * 创建一个<code>TradeCoreException</code>
     * @param code          错误码
     * @param errorMessage  错误描述
     */
    public TradeCoreException(ErrorDetailEnum code, String errorMessage) {
        super(errorMessage);
        this.code = code;
    }

    /**
     * 创建一个<code>TradeCoreException</code>
     * @param code   错误码
     * @param cause  异常
     */
    public TradeCoreException(ErrorDetailEnum code, Throwable cause) {
        super(code.getDesc(), cause);
        this.code = code;
    }

    /**
     * 创建一个<code>TradeCoreException</code>
     * @param code          错误码
     * @param errorMessage  错误描述
     * @param cause         异常
     */
    public TradeCoreException(ErrorDetailEnum code, String errorMessage, Throwable cause) {
        super(errorMessage, cause);
        this.code = code;
    }

    @Override
    public final String toString() {
        String s = getClass().getName();
        String message = getLocalizedMessage();
        return s + ": " + code.getCode() + "[" + message + "].";
    }

    public ErrorDetailEnum getCode() {
        return code;
    }

    public void setCode(ErrorDetailEnum code) {
        this.code = code;
    }

}

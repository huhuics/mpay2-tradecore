/**
 * Beijing Jiaotong University
 * Copyright (c) 1896-2016 All Rights Reserved.
 */
package org.tradecore.request;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.tradecore.util.AssertUtil;

/**
 * 抽象请求类
 * @author HuHui
 * @version $Id: BaseRequest.java, v 0.1 2016年7月8日 下午3:31:41 HuHui Exp $
 */
public abstract class BaseRequest implements Serializable {

    /**  */
    private static final long serialVersionUID = -7977401051608913047L;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    /**
     * 参数校验
     * <p>使用断言{@link AssertUtil}进行参数校验</P>
     */
    public abstract void validate();

}
